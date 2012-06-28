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
package com.googlecode.gwt.charts.client.controls.filter;

import com.googlecode.gwt.charts.client.controls.ControlOptionsUi;
import com.googlecode.gwt.charts.client.options.Orientation;

public class StringFilterUi extends ControlOptionsUi {
	public static StringFilterUi create() {
		return createObject().cast();
	}

	protected StringFilterUi() {
		// Default constructor
	}

	public final native void setCssClass(String cssClass) /*-{
		this.cssClass = cssClass;
	}-*/;

	public final native void setLabel(String label) /*-{
		this.label = label;
	}-*/;

	public final native void setLabelSeparator(String labelSeparator) /*-{
		this.labelSeparator = labelSeparator;
	}-*/;

	public final void setLabelStacking(Orientation labelStacking) {
		setLabelStacking(labelStacking.getName());
	}
	
	public final native void setRealtimeTrigger(boolean realtimeTrigger) /*-{
		this.realtimeTrigger = realtimeTrigger;
	}-*/;

	private final native void setLabelStacking(String labelStacking) /*-{
		this.labelStacking = labelStacking;
	}-*/;
}
