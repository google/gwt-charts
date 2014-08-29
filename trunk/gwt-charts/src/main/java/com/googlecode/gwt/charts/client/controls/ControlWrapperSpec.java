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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.DOM;

/**
 * Full configuration specification for {@link ControlWrapper}.
 * 
 * @param <O> the control options type
 * @param <S> the control state type
 */
public class ControlWrapperSpec<O extends ControlOptions<?>, S extends ControlState> extends JavaScriptObject {
	/**
	 * Default constructor.
	 * @param controlType the control type
	 * @return configuration specification
	 */
	public static ControlWrapperSpec<?, ?> create(ControlType controlType) {
		ControlWrapperSpec<?, ?> controlWrapperSpec = createObject().cast();
		controlWrapperSpec.setControlType(controlType);
		controlWrapperSpec.setContainerId(DOM.createUniqueId());
		return controlWrapperSpec;
	}

	protected ControlWrapperSpec() {
	}

	/**
	 * Returns the ID of the containing DOM element.
	 * 
	 * @return the ID of the containing DOM element.
	 */
	public final native String getContainerId() /*-{
		return this.containerId;
	}-*/;

	/**
	 * Sets the ID of the containing DOM element for the control.
	 * 
	 * @param containerId the ID of the containing DOM element.
	 */
	public final native void setContainerId(String containerId) /*-{
		this.containerId = containerId;
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
	 * Sets a complete options object for a control.
	 * 
	 * @param options a complete options object
	 */
	public final native void setOptions(O options) /*-{
		this.options = options;
	}-*/;

	/**
	 * Sets the control state. The state collects all the variables that the user operating the control can affect. For
	 * example, a range slider state can be described in term of the positions that the low and high thumb of the slider
	 * occupy.
	 * 
	 * @param state the control state
	 */
	public final native void setState(S state) /*-{
		this.state = state;
	}-*/;

	private final native void setControlType(String controlType) /*-{
		this.controlType = controlType;
	}-*/;

}
