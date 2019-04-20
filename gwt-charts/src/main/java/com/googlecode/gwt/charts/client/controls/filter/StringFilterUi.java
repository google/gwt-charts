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
import com.googlecode.gwt.charts.client.options.LabelStacking;

/**
 * UI configuration options for {@link StringFilter}.
 */
public class StringFilterUi extends ControlOptionsUi {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static StringFilterUi create() {
		return createObject().cast();
	}

	protected StringFilterUi() {
		// Default constructor.
	}

	/**
	 * The CSS class to assign to the control, for custom styling.
	 * 
	 * @param cssClass
	 */
	public final native void setCssClass(String cssClass) /*-{
		this.cssClass = cssClass;
	}-*/;

	/**
	 * The label to display next to the slider. If unspecified, the label of the column the control operates on will be
	 * used.
	 * 
	 * @param label
	 */
	public final native void setLabel(String label) /*-{
		this.label = label;
	}-*/;

	/**
	 * A separator string appended to the label, to visually separate the label from the slider.
	 * 
	 * @param labelSeparator
	 */
	public final native void setLabelSeparator(String labelSeparator) /*-{
		this.labelSeparator = labelSeparator;
	}-*/;

	/**
	 * Whether the label should display above (vertical stacking) or beside (horizontal stacking) the slider.
	 * 
	 * @param labelStacking
	 */
	public final void setLabelStacking(LabelStacking labelStacking) {
		setLabelStacking(labelStacking.getName());
	}

	/**
	 * Whether the control should match any time a key is pressed or only when the input field 'changes' (loss of focus
	 * or pressing the Enter key).
	 * 
	 * @param realtimeTrigger
	 */
	public final native void setRealtimeTrigger(boolean realtimeTrigger) /*-{
		this.realtimeTrigger = realtimeTrigger;
	}-*/;

	private final native void setLabelStacking(String labelStacking) /*-{
		this.labelStacking = labelStacking;
	}-*/;
}
