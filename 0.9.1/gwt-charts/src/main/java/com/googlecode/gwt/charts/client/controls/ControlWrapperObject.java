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
package com.googlecode.gwt.charts.client.controls;

import com.googlecode.gwt.charts.client.HasListeners;
import com.googlecode.gwt.charts.client.event.ErrorEvent;
import com.googlecode.gwt.charts.client.event.ErrorHandler;
import com.googlecode.gwt.charts.client.event.HandlerRef;
import com.googlecode.gwt.charts.client.event.ReadyEvent;
import com.googlecode.gwt.charts.client.event.ReadyHandler;
import com.googlecode.gwt.charts.client.event.StateChangedEvent;
import com.googlecode.gwt.charts.client.event.StateChangedHandler;

public class ControlWrapperObject<T extends ControlOptions> extends HasListeners {
	public static native <T extends ControlOptions> ControlWrapperObject<T> create() /*-{
		return new $wnd.google.visualization.ControlWrapper();
	}-*/;

	public static native <T extends ControlOptions> ControlWrapperObject<T> create(ControlWrapperSpec<?> spec) /*-{
		return new $wnd.google.visualization.ControlWrapper(spec);
	}-*/;

	protected ControlWrapperObject() {
		// Default constructor
	}

	public final HandlerRef addErrorHandler(ErrorHandler handler) {
		return addListener(ErrorEvent.NAME, handler);
	}

	public final HandlerRef addReadyHandler(ReadyHandler handler) {
		return addListener(ReadyEvent.NAME, handler);
	}

	public final HandlerRef addStateChangedHandler(StateChangedHandler handler) {
		return addListener(StateChangedEvent.NAME, handler);
	}

	public final native ControlWrapperObject<T> cloneObject() /*-{
		this.clone();
	}-*/;

	public final native void draw() /*-{
		this.draw();
	}-*/;

	public final native String getContainerId() /*-{
		return this.getContainerId();
	}-*/;

	public final native Control getControl() /*-{
		return this.getControl();
	}-*/;

	public final native String getControlName() /*-{
		return this.getControlName();
	}-*/;

	public final native String getControlType() /*-{
		return this.getControlType();
	}-*/;

	public final native String getOption(String key) /*-{
		return this.getOption(key);
	}-*/;

	public final native String getOption(String key, String defaultValue) /*-{
		return this.getOption(key, defaultValue);
	}-*/;

	public final native T getOptions() /*-{
		return this.getOptions();
	}-*/;

	public final native ControlState getState() /*-{
		return this.getState();
	}-*/;

	public final native void setContainerId(String containerId) /*-{
		this.setContainerId(containerId);
	}-*/;

	public final native void setControlName(String controlName) /*-{
		this.setControlName(controlName);
	}-*/;

	public final void setControlType(ControlType controlType) {
		setControlType(controlType.getName());
	}

	public final native void setOption(String key, String value) /*-{
		return this.setOption(key, value);
	}-*/;

	public final native void setOptions(T options) /*-{
		return this.setOptions(options);
	}-*/;

	public final native void setState(ControlState state) /*-{
		return this.setState(state);
	}-*/;

	public final native String toJSON() /*-{
		this.toJSON();
	}-*/;

	private final native void setControlType(String controlType) /*-{
		this.setControlType(controlType);
	}-*/;
}
