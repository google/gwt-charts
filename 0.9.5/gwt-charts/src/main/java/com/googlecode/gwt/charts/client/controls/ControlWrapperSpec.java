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

public class ControlWrapperSpec<T extends ControlOptions> extends JavaScriptObject {
	public static ControlWrapperSpec<?> create(ControlType controlType, String containerId) {
		ControlWrapperSpec<?> controlWrapperSpec = createObject().cast();
		controlWrapperSpec.setControlType(controlType);
		controlWrapperSpec.setContainerId(containerId);
		return controlWrapperSpec;
	}

	protected ControlWrapperSpec() {
	}

	public final native void setContainerId(String containerId) /*-{
		this.containerId = containerId;
	}-*/;

	public final void setControlType(ControlType controlType) {
		setControlType(controlType.getName());
	}

	public final native void setOptions(T options) /*-{
		this.options = options;
	}-*/;

	public final native void setState(JavaScriptObject state) /*-{
		this.state = state;
	}-*/;

	private final native void setControlType(String controlType) /*-{
		this.controlType = controlType;
	}-*/;

}
