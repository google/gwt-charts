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
package com.googlecode.gwt.charts.client.timeline;

import com.google.gwt.dom.client.Element;

import com.googlecode.gwt.charts.client.ChartObject;
import com.googlecode.gwt.charts.client.ChartWidget;
import com.googlecode.gwt.charts.client.event.ErrorHandler;
import com.googlecode.gwt.charts.client.event.HandlerRef;
import com.googlecode.gwt.charts.client.event.OnMouseOutHandler;
import com.googlecode.gwt.charts.client.event.OnMouseOverHandler;
import com.googlecode.gwt.charts.client.event.ReadyHandler;

/**
 * A timeline is a chart that depicts how a set of resources are used over time. If you're managing a software project
 * and want to illustrate who is doing what and when, or if you're organizing a conference and need to schedule meeting
 * rooms, a timeline is often a reasonable visualization choice. One popular type of timeline is the Gantt chart.
 */
public class Timeline extends ChartWidget<TimelineOptions> {
	/**
	 * Creates a new chart widget.
	 */
	public Timeline() {
		super();
	}

	/**
	 * Adds an handler that listens for error events.
	 * 
	 * @param handler the class to call when the event is fired
	 * @return the handler reference
	 */
	public HandlerRef addErrorHandler(ErrorHandler handler) {
		return addHandler(handler);
	}

	/**
	 * Adds an handler that listens for mouse out events.
	 * 
	 * @param handler the class to call when the event is fired
	 * @return the handler reference
	 */
	public HandlerRef addOnMouseOutHandler(OnMouseOutHandler handler) {
		return addHandler(handler);
	}

	/**
	 * Adds an handler that listens for mouse over events.
	 * 
	 * @param handler the class to call when the event is fired
	 * @return the handler reference
	 */
	public HandlerRef addOnMouseOverHandler(OnMouseOverHandler handler) {
		return addHandler(handler);
	}

	/**
	 * Adds an handler that listens for ready events.
	 * 
	 * @param handler the class to call when the event is fired
	 * @return the handler reference
	 */
	public HandlerRef addReadyHandler(ReadyHandler handler) {
		return addHandler(handler);
	}

	@Override
	protected native ChartObject createChartObject(Element container) /*-{
		return new $wnd.google.visualization.Timeline(container);
	}-*/;

}
