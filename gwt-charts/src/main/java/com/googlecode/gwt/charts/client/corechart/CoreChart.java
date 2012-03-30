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
package com.googlecode.gwt.charts.client.corechart;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.RequiresResize;
import com.google.gwt.user.client.ui.Widget;

import com.googlecode.gwt.charts.client.ChartObject;
import com.googlecode.gwt.charts.client.DataSource;
import com.googlecode.gwt.charts.client.Selection;
import com.googlecode.gwt.charts.client.event.AnimationFinishEvent;
import com.googlecode.gwt.charts.client.event.AnimationFinishHandler;
import com.googlecode.gwt.charts.client.event.ErrorEvent;
import com.googlecode.gwt.charts.client.event.ErrorHandler;
import com.googlecode.gwt.charts.client.event.Event;
import com.googlecode.gwt.charts.client.event.EventHandler;
import com.googlecode.gwt.charts.client.event.HandlerRef;
import com.googlecode.gwt.charts.client.event.OnMouseOutEvent;
import com.googlecode.gwt.charts.client.event.OnMouseOutHandler;
import com.googlecode.gwt.charts.client.event.OnMouseOverEvent;
import com.googlecode.gwt.charts.client.event.OnMouseOverHandler;
import com.googlecode.gwt.charts.client.event.ReadyEvent;
import com.googlecode.gwt.charts.client.event.ReadyHandler;
import com.googlecode.gwt.charts.client.event.SelectEvent;
import com.googlecode.gwt.charts.client.event.SelectHandler;
import com.googlecode.gwt.charts.client.options.Options;

public abstract class CoreChart extends Widget implements RequiresResize {
	protected ChartObject chartObject;
	private DataSource data;
	private Options options;

	public CoreChart() {
		super();
		Element chartDiv = DOM.createDiv();
		chartObject = createChartObject(chartDiv);
		setElement(chartDiv);
	}

	public final HandlerRef addAnimationFinishHandler(AnimationFinishHandler handler) {
		return addHandler(handler, AnimationFinishEvent.NAME);
	}

	public final HandlerRef addErrorHandler(ErrorHandler handler) {
		return addHandler(handler, ErrorEvent.NAME);
	}

	public final HandlerRef addOnMouseOutHandler(OnMouseOutHandler handler) {
		return addHandler(handler, OnMouseOutEvent.NAME);
	}

	public final HandlerRef addOnMouseOverHandler(OnMouseOverHandler handler) {
		return addHandler(handler, OnMouseOverEvent.NAME);
	}

	public final HandlerRef addReadyHandler(ReadyHandler handler) {
		return addHandler(handler, ReadyEvent.NAME);
	}

	public final HandlerRef addSelectHandler(SelectHandler handler) {
		return addHandler(handler, SelectEvent.NAME);
	}

	public final void clearChart() {
		chartObject.clearChart();
	}

	public final void draw(DataSource data) {
		this.data = data;
		chartObject.draw(data);
	}

	public final void fireEvent(Event event) {
		chartObject.trigger(event.getEventName(), event.getProperties());
	}

	public final JsArray<Selection> getSelection() {
		return chartObject.getSelection();
	}

	@Override
	public void onResize() {
		draw(data, options);
	}

	public final void removeAllHandlers() {
		chartObject.removeAllListeners();
	}

	public final void removeHandler(HandlerRef handlerRegistration) {
		chartObject.removeListener(handlerRegistration);
	}

	public final void setSelection(JsArray<Selection> selection) {
		chartObject.setSelection(selection);
	}

	protected final <H extends EventHandler> HandlerRef addHandler(H handler, String eventName) {
		return chartObject.addListener(eventName, handler);
	}

	protected abstract ChartObject createChartObject(Element parent);

	protected final void draw(DataSource data, Options options) {
		this.data = data;
		this.options = options;
		chartObject.draw(data, options);
	}
}
