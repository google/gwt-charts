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
import com.googlecode.gwt.charts.client.format.DateFormatOptions;
import com.googlecode.gwt.charts.client.options.LabelStacking;
import com.googlecode.gwt.charts.client.options.Orientation;

/**
 * UI configuration options for {@link DateRangeFilter}.
 */
public class DateRangeFilterUi extends ControlOptionsUi {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static DateRangeFilterUi create() {
		return createObject().cast();
	}

	protected DateRangeFilterUi() {
		// Default constructor.
	}

	/**
	 * The amount to increment for block increments of the range extents. A block increment is equivalent to using the
	 * pgUp and pgDown keys to move the slider thumbs.
	 * 
	 * @param blockIncrement
	 */
	public final native void setBlockIncrement(double blockIncrement) /*-{
		this.blockIncrement = blockIncrement;
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
	 * How to represent the date as a string.
	 * 
	 * @param format
	 */
	public final native void setFormat(DateFormatOptions format) /*-{
		this.format = format;
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
	 * The slider orientation.
	 * 
	 * @param orientation
	 */
	public final void setOrientation(Orientation orientation) {
		setOrientation(orientation.getName());
	}

	/**
	 * Whether to have labels next to the slider displaying extents of the selected range.
	 * 
	 * @param showRangeValues
	 */
	public final native void setShowRangeValues(boolean showRangeValues) /*-{
		this.showRangeValues = showRangeValues;
	}-*/;

	/**
	 * The minimum possible change when dragging the slider thumbs: can be any time unit up to "day".<br>
	 * ("month" and "year" aren't yet supported.)
	 * 
	 * @param step
	 */
	// TODO create an enum
	public final native void setStep(String step) /*-{
		this.step = step;
	}-*/;

	/**
	 * The number of ticks (fixed positions in the range bar) the slider thumbs can occupy.
	 * 
	 * @param ticks
	 */
	public final native void setTicks(int ticks) /*-{
		this.ticks = ticks;
	}-*/;

	/**
	 * The amount to increment for unit increments of the range extents. A unit increment is equivalent to using the
	 * arrow keys to move a slider thumb.
	 * 
	 * @param unitIncrement
	 */
	public final native void setUnitIncrement(double unitIncrement) /*-{
		this.unitIncrement = unitIncrement;
	}-*/;

	private final native void setLabelStacking(String labelStacking) /*-{
		this.labelStacking = labelStacking;
	}-*/;

	private final native void setOrientation(String orientation) /*-{
		this.orientation = orientation;
	}-*/;
}
