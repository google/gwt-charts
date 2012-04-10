/*
 * Copyright 2012 Rui Afonso
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.googlecode.gwt.charts.client;

import com.google.gwt.core.client.Scheduler;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.RequiresResize;
import com.google.gwt.user.client.ui.Widget;

import com.googlecode.gwt.charts.client.event.Event;
import com.googlecode.gwt.charts.client.event.EventHandler;
import com.googlecode.gwt.charts.client.event.HandlerRef;
import com.googlecode.gwt.charts.client.options.Options;

import java.util.HashMap;

public abstract class ChartWidget<T extends Options> extends Widget implements RequiresResize {
	protected ChartObject chartObject;
	private DataSource data;
	private Options options;
	private HashMap<HandlerRef, EventHandler> eventMap;
	private boolean unloaded;

	public ChartWidget() {
		super();
		Element chartDiv = DOM.createDiv();
		chartObject = createChartObject(chartDiv);
		setElement(chartDiv);
		eventMap = new HashMap<HandlerRef, EventHandler>();
	}

	public final void clearChart() {
		chartObject.clearChart();
	}

	public final void draw(DataSource data) {
		draw(data, null);
	}

	public final void draw(DataSource data, T options) {
		this.data = data;
		this.options = options;
		// Double deferred command because of layout issues
		Scheduler.get().scheduleDeferred(new Scheduler.ScheduledCommand() {

			@Override
			public void execute() {
				Scheduler.get().scheduleDeferred(new Scheduler.ScheduledCommand() {

					@Override
					public void execute() {
						redraw();
					}
				});
			}
		});

	}

	public final void fireEvent(Event event) {
		chartObject.trigger(event.getEventName(), event.getProperties());
	}

	@Override
	public void onResize() {
		if (isVisible()) {
			redraw();
		}
	}

	public final void redraw() {
		if (data != null) {
			chartObject.draw(data, options);
		}
	}

	public final void removeAllHandlers() {
		eventMap.clear();
		chartObject.removeAllListeners();
	}

	public final void removeHandler(HandlerRef handlerRef) {
		eventMap.remove(handlerRef);
		chartObject.removeListener(handlerRef);
	}

	protected final <H extends EventHandler> HandlerRef addHandler(H handler) {
		HandlerRef handlerRef = chartObject.addListener(handler.getEventName(), handler);
		eventMap.put(handlerRef, handler);
		return handlerRef;
	}

	protected abstract ChartObject createChartObject(Element parent);

	@Override
	protected void onLoad() {
		if (!unloaded) {
			return;
		}
		unloaded = false;
		Scheduler.get().scheduleDeferred(new Scheduler.ScheduledCommand() {

			@Override
			public void execute() {
				recreate();
				redraw();
			}
		});
	}

	@Override
	protected void onUnload() {
		this.unloaded = true;
	}

	protected void recreate() {
		chartObject = createChartObject(getElement());
		for (EventHandler eventHandler : eventMap.values()) {
			chartObject.addListener(eventHandler.getEventName(), eventHandler);
		}

	}
}
