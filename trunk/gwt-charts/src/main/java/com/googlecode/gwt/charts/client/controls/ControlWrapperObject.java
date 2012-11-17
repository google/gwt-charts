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
import com.googlecode.gwt.charts.client.event.StateChangeEvent;
import com.googlecode.gwt.charts.client.event.StateChangeHandler;

/**
 * A ControlWrapperWidget object is a wrapper around a JSON representation of a configured control instance.<br>
 * The class exposes convenience methods for defining a dashboard control, drawing it and programmatically changing its
 * state.
 * 
 * @see <a href="https://developers.google.com/chart/interactive/docs/gallery/controls#controlwrapperobject">Control
 *      Wrapper</a>
 * 
 * @param <O> the options type for this control
 * @param <S> the state type for this control
 */
public class ControlWrapperObject<O extends ControlOptions, S extends ControlState> extends HasListeners {
	/**
	 * Creates an empty control wrapper.
	 * You must set all the appropriate properties using the set... methods.
	 * 
	 * @param <O> the options type for this control
	 * @param <S> the state type for this control
	 * @return an empty control wrapper
	 */
	public static native <O extends ControlOptions, S extends ControlState> ControlWrapperObject<O, S> create() /*-{
		return new $wnd.google.visualization.ControlWrapper();
	}-*/;

	/**
	 * Creates a control wrapper with the given specification.
	 * 
	 * @param <O> the options type for this control
	 * @param <S> the state type for this control
	 * @param spec a property set for defining this wrapper
	 * @return a control wrapper
	 */
	public static native <O extends ControlOptions, S extends ControlState> ControlWrapperObject<O, S> create(
			ControlWrapperSpec<?> spec) /*-{
		return new $wnd.google.visualization.ControlWrapper(spec);
	}-*/;

	protected ControlWrapperObject() {
		// Default constructor
	}

	/**
	 * Fired when an error occurs when attempting to render the control.
	 * 
	 * @param handler the error handler
	 * @return a reference for removing this handler
	 */
	public final HandlerRef addErrorHandler(ErrorHandler handler) {
		return addListener(ErrorEvent.NAME, handler);
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
	public final HandlerRef addReadyHandler(ReadyHandler handler) {
		return addListener(ReadyEvent.NAME, handler);
	}

	/**
	 * Fired when the user interacts with the control, affecting its state. For example, a statechange event will fire
	 * whenever you move the thumbs of a range slider control. To retrieve an updated control state after the event
	 * fired, call ControlWrapperWidget.getState().
	 * 
	 * @param handler the state change handler
	 * @return a reference for removing this handler
	 */
	public final HandlerRef addStateChangeHandler(StateChangeHandler handler) {
		return addListener(StateChangeEvent.NAME, handler);
	}

	/**
	 * Returns a deep copy of the control wrapper.
	 * 
	 * @return a deep copy of the control wrapper
	 */
	public final native ControlWrapperObject<O, S> cloneObject() /*-{
		this.clone();
	}-*/;

	/**
	 * Draws the control. Normally the dashboard holding the control takes care of drawing it. You should call draw() to
	 * force programmatic redraws of the control after you change any of its other settings, like options or state.
	 */
	public final native void draw() /*-{
		this.draw();
	}-*/;

	/**
	 * The ID of the control's DOM container element.
	 * 
	 * @return container element ID
	 */
	public final native String getContainerId() /*-{
		return this.getContainerId();
	}-*/;

	/**
	 * Returns a reference to the control created by this ControlWrapper. This will return null until after you have
	 * called draw() on the ControlWrapper object (or on the dashboard holding it), and it throws a ready event. The
	 * returned object only exposes one method: resetControl(), which resets the control state to the one it was
	 * initialized with (like resetting an HTML form element).
	 * 
	 * @return a reference to the control created by this ControlWrapper.
	 */
	public final native Control getControl() /*-{
		return this.getControl();
	}-*/;

	/**
	 * Returns the control name assigned by setControlName().
	 * 
	 * @return control name
	 */
	public final native String getControlName() /*-{
		return this.getControlName();
	}-*/;

	/**
	 * The class name of the control. If this is a Google control, the name will not be qualified with
	 * google.visualization. So, for example, if this were a CategoryFilter control, it would return "CategoryFilter"
	 * rather than "google.visualization.CategoryFilter".
	 * 
	 * @return the class name of the control.
	 */
	public final native String getControlType() /*-{
		return this.getControlType();
	}-*/;

	/**
	 * Returns the specified control option value.
	 * 
	 * @param key the name of the option to retrieve. May be a qualified name, such as 'vAxis.title'.
	 * @return control option value
	 */
	public final native String getOption(String key) /*-{
		return this.getOption(key);
	}-*/;

	/**
	 * Returns the specified control option value.
	 * If the value is undefined or null, the specified default value will be returned.
	 * 
	 * @param key the name of the option to retrieve. May be a qualified name, such as 'vAxis.title'.
	 * @param defaultValue If the specified value is undefined or null, this value will be returned.
	 * @return control option value or default value
	 */
	public final native String getOption(String key, String defaultValue) /*-{
		return this.getOption(key, defaultValue);
	}-*/;

	/**
	 * Returns the options object for this control.
	 * 
	 * @return the options object for this control
	 */
	public final native O getOptions() /*-{
		return this.getOptions();
	}-*/;

	/**
	 * Returns the control state.
	 * 
	 * @return the control state
	 */
	public final native S getState() /*-{
		return this.getState();
	}-*/;

	/**
	 * Sets the ID of the containing DOM element for the control.
	 * 
	 * @param containerId the ID of the containing DOM element
	 */
	public final native void setContainerId(String containerId) /*-{
		this.setContainerId(containerId);
	}-*/;

	/**
	 * Sets an arbitrary name for the control. This is not shown anywhere on the control, but is for your reference
	 * only.
	 * 
	 * @param controlName an arbitrary name for the control
	 */
	public final native void setControlName(String controlName) /*-{
		this.setControlName(controlName);
	}-*/;

	/**
	 * Sets the control type. Pass in the class name of the control to instantiate. If this is a Google control, do not
	 * qualify it with google.visualization. So, for example, for a range slider over a numeric column, pass in
	 * "NumberRangeFilter".
	 * 
	 * @param controlType the control type
	 */
	public final void setControlType(ControlType controlType) {
		setControlType(controlType.getName());
	}

	/**
	 * Sets a single control option value, where key is the option name and value is the value. To unset an option, pass
	 * in null for the value. Note that key may be a qualified name, such as 'vAxis.title'
	 * 
	 * @param key the option name
	 * @param value the value
	 */
	public final native void setOption(String key, String value) /*-{
		return this.setOption(key, value);
	}-*/;

	/**
	 * Sets a complete options object for a control.
	 * 
	 * @param options a complete options object
	 */
	public final native void setOptions(O options) /*-{
		return this.setOptions(options);
	}-*/;

	/**
	 * Sets the control state. The state collects all the variables that the user operating the control can affect. For
	 * example, a range slider state can be described in term of the positions that the low and high thumb of the slider
	 * occupy.
	 * 
	 * @param state the control state
	 */
	public final native void setState(S state) /*-{
		return this.setState(state);
	}-*/;

	/**
	 * Returns a string version of the JSON representation of the control.
	 * 
	 * @return JSON representation of the control
	 */
	public final native String toJSON() /*-{
		this.toJSON();
	}-*/;

	private final native void setControlType(String controlType) /*-{
		this.setControlType(controlType);
	}-*/;
}
