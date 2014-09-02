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

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.RequiresResize;
import com.google.gwt.user.client.ui.Widget;

import com.googlecode.gwt.charts.client.event.ErrorHandler;
import com.googlecode.gwt.charts.client.event.Event;
import com.googlecode.gwt.charts.client.event.HandlerRef;
import com.googlecode.gwt.charts.client.event.ReadyHandler;
import com.googlecode.gwt.charts.client.event.StateChangeHandler;

/**
 * This class is used as a widget wrapper for control wrappers.
 * Supports automatically resizing via {@link RequiresResize}, which means that all parents
 * must implement {@link com.google.gwt.user.client.ui.ProvidesResize} for this to work.
 * 
 * @param <O> the control options type
 * @param <S> the control state type
 */
public class ControlWrapper<O extends ControlOptions<?>, S extends ControlState> extends Widget implements RequiresResize {
	private ControlWrapperObject<O, S> controlWrapperObject;

	/**
	 * Creates a new ControlWrapper.
	 */
	public ControlWrapper() {
		super();
		setElement(Document.get().createDivElement());
		controlWrapperObject = ControlWrapperObject.create();
		setContainerId(DOM.createUniqueId());
	}

	/**
	 * Creates a new ControlWrapper.
	 * 
	 * @param controlWrapperSpec
	 */
	public ControlWrapper(ControlWrapperSpec<O, S> controlWrapperSpec) {
		super();
		setElement(Document.get().createDivElement());
		controlWrapperObject = ControlWrapperObject.create(controlWrapperSpec);
		getElement().setId(controlWrapperSpec.getContainerId());
	}

	/**
	 * Fired when an error occurs when attempting to render the control.
	 * 
	 * @param handler the error handler
	 * @return a reference for removing this handler
	 */
	public HandlerRef addErrorHandler(ErrorHandler handler) {
		return controlWrapperObject.addErrorHandler(handler);
	}

	/**
	 * The control is ready to accept user interaction and for external method calls. If you want to interact with the
	 * control, and call methods after you draw it, you should set up a listener for this event before you call the draw
	 * method, and call them only after the event was fired. Alternatively, you can listen for a ready event on the
	 * dashboard holding the control and call control methods only after the event was fired.
	 * 
	 * @param handler the ready handler
	 * @return a reference for removing this handler
	 */
	public HandlerRef addReadyHandler(ReadyHandler handler) {
		return controlWrapperObject.addReadyHandler(handler);
	}

	/**
	 * Fired when the user interacts with the control, affecting its state. For example, a statechange event will fire
	 * whenever you move the thumbs of a range slider control. To retrieve an updated control state after the event
	 * fired, call ControlWrapper.getState().
	 * 
	 * @param handler the state change handler
	 * @return a reference for removing this handler
	 */
	public HandlerRef addStateChangeHandler(StateChangeHandler handler) {
		return controlWrapperObject.addStateChangeHandler(handler);
	}

	/**
	 * Returns a deep copy of the control wrapper.
	 * 
	 * @return a deep copy of the control wrapper
	 */
	public ControlWrapperObject<O, S> cloneObject() {
		return controlWrapperObject.cloneObject();
	}

	/**
	 * Draws the control. Normally the dashboard holding the control takes care of drawing it. You should call draw() to
	 * force programmatic redraws of the control after you change any of its other settings, like options or state.
	 */
	public void draw() {
		controlWrapperObject.draw();
	}

	/**
	 * Fires an event to all listeners.
	 * 
	 * @param event the event object to fire
	 */
	public void fireEvent(Event event) {
		controlWrapperObject.trigger(event.getEventName(), event.getProperties());
	}

	/**
	 * The ID of the control's DOM container element.
	 * 
	 * @return container element ID
	 */
	public String getContainerId() {
		return controlWrapperObject.getContainerId();
	}

	/**
	 * Returns a reference to the control created by this ControlWrapper. This will return null until after you have
	 * called draw() on the ControlWrapper object (or on the dashboard holding it), and it throws a ready event. The
	 * returned object only exposes one method: resetControl(), which resets the control state to the one it was
	 * initialized with (like resetting an HTML form element).
	 * 
	 * @return a reference to the control created by this ControlWrapper.
	 */
	public Control getControl() {
		return controlWrapperObject.getControl();
	}

	/**
	 * Returns the control name assigned by setControlName().
	 * 
	 * @return control name
	 */
	public String getControlName() {
		return controlWrapperObject.getControlName();
	}

	/**
	 * The class name of the control. If this is a Google control, the name will not be qualified with
	 * google.visualization. So, for example, if this were a CategoryFilter control, it would return "CategoryFilter"
	 * rather than "google.visualization.CategoryFilter".
	 * 
	 * @return the class name of the control.
	 */
	public String getControlType() {
		return controlWrapperObject.getControlType();
	}

	/**
	 * Returns the underlying control wrapper object.
	 * 
	 * @return the underlying control wrapper object
	 */
	public ControlWrapperObject<O, S> getObject() {
		return controlWrapperObject;
	}

	/**
	 * Returns the specified control option value.
	 * 
	 * @param key the name of the option to retrieve. May be a qualified name, such as 'vAxis.title'.
	 * @return control option value
	 */
	public String getOption(String key) {
		return controlWrapperObject.getOption(key);
	}

	/**
	 * Returns the specified control option value.
	 * If the value is undefined or null, the specified default value will be returned.
	 * 
	 * @param key the name of the option to retrieve. May be a qualified name, such as 'vAxis.title'.
	 * @param defaultValue If the specified value is undefined or null, this value will be returned.
	 * @return control option value or default value
	 */
	public String getOption(String key, String defaultValue) {
		return controlWrapperObject.getOption(key, defaultValue);
	}

	/**
	 * Returns the options object for this control.
	 * 
	 * @return the options object for this control
	 */
	public O getOptions() {
		return controlWrapperObject.getOptions();
	}

	/**
	 * Returns the control state.
	 * 
	 * @return the control state
	 */
	public ControlState getState() {
		return controlWrapperObject.getState();
	}

	@Override
	public void onResize() {
		if (controlWrapperObject.getControl() != null) {
			draw();
		}
	}

	/**
	 * Removes all existing handlers from this chart.
	 */
	public void removeAllHandlers() {
		controlWrapperObject.removeAllListeners();
	}

	/**
	 * Removes a single handler matching the given handler reference.
	 * 
	 * @param handlerRef an handler reference
	 */
	public void removeHandler(HandlerRef handlerRef) {
		controlWrapperObject.removeListener(handlerRef);
	}

	/**
	 * Sets the ID of the containing DOM element for the control.
	 * 
	 * @param containerId the ID of the containing DOM element
	 */
	public void setContainerId(String containerId) {
		getElement().setId(containerId);
		controlWrapperObject.setContainerId(containerId);
	}

	/**
	 * Sets an arbitrary name for the control. This is not shown anywhere on the control, but is for your reference
	 * only.
	 * 
	 * @param controlName an arbitrary name for the control
	 */
	public void setControlName(String controlName) {
		controlWrapperObject.setControlName(controlName);
	}

	/**
	 * Sets the control type. Pass in the class name of the control to instantiate. If this is a Google control, do not
	 * qualify it with google.visualization. So, for example, for a range slider over a numeric column, pass in
	 * "NumberRangeFilter".
	 * 
	 * @param controlType the control type
	 */
	public void setControlType(ControlType controlType) {
		controlWrapperObject.setControlType(controlType);
	}

	/**
	 * Sets a single control option value, where key is the option name and value is the value. To unset an option, pass
	 * in null for the value. Note that key may be a qualified name, such as 'vAxis.title'
	 * 
	 * @param key the option name
	 * @param value the value
	 */
	public void setOption(String key, String value) {
		controlWrapperObject.setOption(key, value);
	}

	/**
	 * Sets a complete options object for a control.
	 * 
	 * @param options a complete options object
	 */
	public void setOptions(O options) {
		controlWrapperObject.setOptions(options);
	}

	/**
	 * Sets the control state. The state collects all the variables that the user operating the control can affect. For
	 * example, a range slider state can be described in term of the positions that the low and high thumb of the slider
	 * occupy.
	 * 
	 * @param state the control state
	 */
	public void setState(S state) {
		controlWrapperObject.setState(state);
	}

	/**
	 * Returns a string version of the JSON representation of the control.
	 * 
	 * @return JSON representation of the control
	 */
	public String toJSON() {
		return controlWrapperObject.toJSON();
	}
}
