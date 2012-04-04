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

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.RequiresResize;
import com.google.gwt.user.client.ui.Widget;

import com.googlecode.gwt.charts.client.Properties;
import com.googlecode.gwt.charts.client.event.ErrorHandler;
import com.googlecode.gwt.charts.client.event.HandlerRef;
import com.googlecode.gwt.charts.client.event.ReadyHandler;
import com.googlecode.gwt.charts.client.event.StateChangedHandler;

public class ControlWrapper<T extends ControlOptions> extends Widget implements RequiresResize {

	private ControlWrapperObject<T> controlWrapperObject;

	public ControlWrapper() {
		super();
		setElement(DOM.createDiv());
		controlWrapperObject = ControlWrapperObject.create();
	}

	public final HandlerRef addErrorHandler(ErrorHandler handler) {
		return controlWrapperObject.addErrorHandler(handler);
	}

	public final HandlerRef addReadyHandler(ReadyHandler handler) {
		return controlWrapperObject.addReadyHandler(handler);
	}

	public final HandlerRef addStateChangedHandler(StateChangedHandler handler) {
		return controlWrapperObject.addStateChangedHandler(handler);
	}

	public final ControlWrapperObject<T> cloneObject() {
		return controlWrapperObject.cloneObject();
	}

	public final void draw() {
		controlWrapperObject.draw();
	}

	public final String getContainerId() {
		return controlWrapperObject.getContainerId();
	}

	public final Control getControl() {
		return controlWrapperObject.getControl();
	}

	public final String getControlName() {
		return controlWrapperObject.getControlName();
	}

	public final String getControlType() {
		return controlWrapperObject.getControlType();
	}

	public ControlWrapperObject<T> getObject() {
		return controlWrapperObject;
	}

	public final String getOption(String key) {
		return controlWrapperObject.getOption(key);
	}

	public final String getOption(String key, String defaultValue) {
		return controlWrapperObject.getOption(key, defaultValue);
	}

	public final T getOptions() {
		return controlWrapperObject.getOptions();
	}

	public final ControlState getState() {
		return controlWrapperObject.getState();
	}

	@Override
	public void onResize() {
		draw();
	}

	public final void removeAllHandlers() {
		controlWrapperObject.removeAllListeners();
	}

	public final void removeHandler(HandlerRef handlerRef) {
		controlWrapperObject.removeListener(handlerRef);
	}

	public final void setContainerId(String containerId) {
		getElement().setId(containerId);
		controlWrapperObject.setContainerId(containerId);
	}

	public final void setControlName(String controlName) {
		controlWrapperObject.setControlName(controlName);
	}

	public final void setControlType(ControlType controlType) {
		controlWrapperObject.setControlType(controlType);
	}

	public final void setOption(String key, String value) {
		controlWrapperObject.setOption(key, value);
	}

	public final void setOptions(T options) {
		controlWrapperObject.setOptions(options);
	}

	public final void setState(ControlState state) {
		controlWrapperObject.setState(state);
	}

	public final String toJSON() {
		return controlWrapperObject.toJSON();
	}

	public final void trigger(String eventName, Properties properties) {
		controlWrapperObject.trigger(eventName, properties);
	}
}
