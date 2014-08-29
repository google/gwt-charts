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

import com.google.gwt.core.client.JavaScriptObject;

import com.googlecode.gwt.charts.client.event.EventHandler;
import com.googlecode.gwt.charts.client.event.HandlerRef;

/**
 * This class provides event support like described in <a
 * href="https://developers.google.com/chart/interactive/docs/reference#events">Chart Events</a>.<br>
 * Most visualizations fire events to indicate something has occured. As a user of the chart, you would often want to
 * listen to these events. If you code your own visualization, you might also want to trigger such events on your own.
 */
public class HasListeners extends JavaScriptObject {

	protected HasListeners() {
		// Default constructor.
	}

	/**
	 * Call this method to register to receive events fired by a visualization hosted on your page. Note that this will
	 * not work for visualizations embedded in a gadget. You should document what event arguments, if any, will be
	 * passed to the handling function.
	 * 
	 * @param eventName The string name of the event to listen for.
	 * @param handler The event handler to call when this visualization fires the eventName event
	 * @return A listener handler for the new listener. Can be used for removing by calling
	 *         {@link #removeListener(HandlerRef)}.
	 */
	public final native HandlerRef addListener(String eventName, EventHandler handler) /*-{
		var callback = function(properties) {
			handler.@com.googlecode.gwt.charts.client.event.EventHandler::dispatch(Lcom/googlecode/gwt/charts/client/Properties;)(properties);
		};
		return $wnd.google.visualization.events.addListener(this, eventName, callback);
	}-*/;

	/**
	 * Call this method to unregister all event listeners of a specific visualization instance.
	 */
	public final native void removeAllListeners() /*-{
		$wnd.google.visualization.events.removeAllListeners(this);
	}-*/;

	/**
	 * Call this method to unregister an existing event listener.
	 * 
	 * @param handlerRef The listener handler to remove, as returned by {@link #addListener(String, EventHandler)}.
	 */
	public final native void removeListener(HandlerRef handlerRef) /*-{
		$wnd.google.visualization.events.removeListener(handlerRef);
	}-*/;

	/**
	 * Called by visualization implementers. Call this method from your visualization to fire an event with an arbitrary
	 * name and set of values.
	 * 
	 * @param eventName A string name to call the event. You can choose any string value that you want.
	 * @param properties A map of name/value pairs to pass to the receiving method.
	 */
	public final native void trigger(String eventName, Properties properties) /*-{
		$wnd.google.visualization.events.trigger(this, eventName, properties);
	}-*/;

	/**
	 * Call this method to register to receive events fired by a visualization hosted on your page. Note that this will
	 * not work for visualizations embedded in a gadget. You should document what event arguments, if any, will be
	 * passed to the handling function.
	 * 
	 * @param chartObject 
	 * @param eventName The string name of the event to listen for.
	 * @param handler The event handler to call when this visualization fires the eventName event
	 * @return A listener handler for the new listener. Can be used for removing by calling
	 *         {@link #removeListener(HandlerRef)}.
	 */
	protected final native HandlerRef addListener(ChartObject chartObject, String eventName, EventHandler handler) /*-{
		var callback = function(properties) {
			handler.@com.googlecode.gwt.charts.client.event.EventHandler::dispatch(Lcom/googlecode/gwt/charts/client/Properties;)(properties);
		};
		return $wnd.google.visualization.events.addListener(chartObject, eventName, callback);
	}-*/;

}
