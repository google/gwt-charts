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
import com.googlecode.gwt.charts.client.options.SelectedValuesLayout;

/**
 * UI configuration options for {@link CategoryFilter}.
 */
public class CategoryFilterUi extends ControlOptionsUi {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static CategoryFilterUi create() {
		return createObject().cast();
	}

	protected CategoryFilterUi() {
		// Default constructor.
	}

	/**
	 * Whether multiple values can be selected, rather than just one.
	 * 
	 * @param allowMultiple
	 */
	public final native void setAllowMultiple(boolean allowMultiple) /*-{
		this.allowMultiple = allowMultiple;
	}-*/;

	/**
	 * Whether the user is allowed not to choose any value. If false the user must choose at least one value from the
	 * available ones. During control initialization, if the option is set to false and no selectedValues state is
	 * given, the first value from the avaiable ones is automatically seleted.
	 * 
	 * @param allowNone
	 */
	public final native void setAllowNone(boolean allowNone) /*-{
		this.allowNone = allowNone;
	}-*/;

	/**
	 * Whether the user is allowed to type in a text field to narrow down the list of possible choices (via an
	 * autocompleter), or not.
	 * 
	 * @param allowTyping
	 */
	public final native void setAllowTyping(boolean allowTyping) /*-{
		this.allowTyping = allowTyping;
	}-*/;

	/**
	 * The caption to display inside the value picker widget when no item is selected.
	 * 
	 * @param caption
	 */
	public final native void setCaption(String caption) /*-{
		this.caption = caption;
	}-*/;

	/**
	 * The CSS class to assign to the control, for custom styling.
	 * 
	 * @param cssClass
	 */
	public final native void setCssClass(String cssClass) /*-{
		this.cssClass = cssClass;
	}-*/;

	/**
	 * The label to display next to the category picker.<br>
	 * If unspecified, the label of the column the control operates on
	 * will be used.
	 * 
	 * @param label
	 */
	public final native void setLabel(String label) /*-{
		this.label = label;
	}-*/;

	/**
	 * A separator string appended to the label, to visually separate the label from the category picker.
	 * 
	 * @param labelSeparator
	 */
	public final native void setLabelSeparator(String labelSeparator) /*-{
		this.labelSeparator = labelSeparator;
	}-*/;

	/**
	 * Whether the label should display above (vertical stacking) or beside (horizontal stacking) the category picker.
	 * 
	 * @param labelStacking
	 */
	public final void setLabelStacking(LabelStacking labelStacking) {
		setLabelStacking(labelStacking.getName());
	}

	/**
	 * How to display selected values, when multiple selection is allowed.
	 * 
	 * @param selectedValuesLayout
	 */
	public final void setSelectedValuesLayout(SelectedValuesLayout selectedValuesLayout) {
		setSelectedValuesLayout(selectedValuesLayout.getName());
	}

	/**
	 * Whether the values to choose from should be sorted.
	 * 
	 * @param sortValues
	 */
	public final native void setSortValues(boolean sortValues) /*-{
		this.sortValues = sortValues;
	}-*/;

	private final native void setLabelStacking(String labelStacking) /*-{
		this.labelStacking = labelStacking;
	}-*/;

	private final native void setSelectedValuesLayout(String selectedValuesLayout) /*-{
		this.selectedValuesLayout = selectedValuesLayout;
	}-*/;
}
