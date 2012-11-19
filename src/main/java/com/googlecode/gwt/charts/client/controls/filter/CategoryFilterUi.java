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
import com.googlecode.gwt.charts.client.options.SelectedValuesLayout;

public class CategoryFilterUi extends ControlOptionsUi {
	public static CategoryFilterUi create() {
		return createObject().cast();
	}

	protected CategoryFilterUi() {
		// Default constructor
	}

	public final native void setAllowMultiple(boolean allowMultiple) /*-{
		this.allowMultiple = allowMultiple;
	}-*/;

	public final native void setAllowNone(boolean allowNone) /*-{
		this.allowNone = allowNone;
	}-*/;

	public final native void setAllowTyping(boolean allowTyping) /*-{
		this.allowTyping = allowTyping;
	}-*/;

	public final native void setCaption(String caption) /*-{
		this.caption = caption;
	}-*/;

	public final native void setCssClass(String cssClass) /*-{
		this.cssClass = cssClass;
	}-*/;

	public final native void setLabel(String label) /*-{
		this.label = label;
	}-*/;

	public final native void setLabelSeparator(String labelSeparator) /*-{
		this.labelSeparator = labelSeparator;
	}-*/;

	public final native void setLabelStacking(String labelStacking) /*-{
		this.labelStacking = labelStacking;
	}-*/;

	public final void setSelectedValuesLayout(SelectedValuesLayout selectedValuesLayout) {
		setSelectedValuesLayout(selectedValuesLayout.getName());
	}

	public final native void setSortValues(boolean sortValues) /*-{
		this.sortValues = sortValues;
	}-*/;

	private final native void setSelectedValuesLayout(String selectedValuesLayout) /*-{
		this.selectedValuesLayout = selectedValuesLayout;
	}-*/;
}
