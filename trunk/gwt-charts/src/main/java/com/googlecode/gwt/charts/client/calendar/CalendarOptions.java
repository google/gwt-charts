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
package com.googlecode.gwt.charts.client.calendar;

import com.googlecode.gwt.charts.client.options.CellColor;
import com.googlecode.gwt.charts.client.options.Options;
import com.googlecode.gwt.charts.client.options.TextStyle;

/**
 * Configuration options for {@link Calendar}.
 */
public class CalendarOptions extends Options {
	public static CalendarOptions create() {
		CalendarOptions calendarOptions = (CalendarOptions) createObject().cast();
		calendarOptions.initialize();
		return calendarOptions;
	}

	protected CalendarOptions() {
		initialize();
	}

	/**
	 * This option lets you customize the border of the calendar day squares.
	 * 
	 * @param cellColor
	 */
	public final native void setCellColor(CellColor cellColor) /*-{
		this.calendar.cellColor = cellColor;
	}-*/;

	/**
	 * Sets the size of the calendar day squares.
	 * 
	 * @param cellSize default value is 16
	 */
	public final native void setCellSize(int cellSize) /*-{
		this.calendar.cellSize = cellSize;
	}-*/;

	/**
	 * Controls the font style of the week labels at the top of the chart.
	 * 
	 * @param textStyle an object that specifies the text style.
	 */
	public final native void setDayOfWeekLabel(TextStyle textStyle) /*-{
		this.calendar.dayOfWeekLabel = textStyle;
	}-*/;

	/**
	 * Sets the distance between the right edge of the week labels and the left edge of the chart day squares.
	 * 
	 * @param dayOfWeekRightSpace
	 */
	public final native void setDayOfWeekRightSpace(String dayOfWeekRightSpace) /*-{
		this.calendar.dayOfWeekRightSpace = dayOfWeekRightSpace;
	}-*/;

	/**
	 * The single-letter labels to use for Sunday through Saturday.
	 * 
	 * @param daysOfWeek default is "SMTWTFS"
	 */
	public final native void setDaysOfWeek(String daysOfWeek) /*-{
		this.calendar.daysOfWeek = daysOfWeek;
	}-*/;

	/**
	 * When the user focuses (say, by hovering) over a day square, calendar charts will highlight the square.
	 * 
	 * @param focusedCellColor
	 */
	public final native void setFocusedCellColor(CellColor focusedCellColor) /*-{
		this.calendar.focusedCellColor = focusedCellColor;
	}-*/;

	/**
	 * Draws the chart inside an inline frame. (Note that on IE8, this option is ignored; all IE8 charts are drawn in
	 * i-frames.)
	 * 
	 * @param forceIFrame true for drawing inside an inline frame
	 */
	public final native void setForceIFrame(boolean forceIFrame) /*-{
		this.forceIFrame = forceIFrame;
	}-*/;

	/**
	 * Sets the style for style for the month labels
	 * 
	 * @param textStyle an object that specifies the text style.
	 */
	public final native void setMonthLabel(TextStyle textStyle) /*-{
		this.calendar.monthLabel = textStyle;
	}-*/;

	/**
	 * Months with data values are delineated from others using a border in this style.
	 * 
	 * @param monthOutlineColor
	 */
	public final native void setMonthOutlineColor(CellColor monthOutlineColor) /*-{
		this.calendar.monthOutlineColor = monthOutlineColor;
	}-*/;

	/**
	 * Calendar charts use a striped diagonal pattern to indicate that there is no data for a particular day.
	 * 
	 * @param backgroundColor
	 * @param color
	 */
	public final native void setNoDataPattern(String backgroundColor, String color) /*-{
		this.noDataPattern = {};
		this.noDataPattern.backgroundColor = backgroundColor;
		this.noDataPattern.color = color;
	}-*/;

	/**
	 * Sets the number of pixels between the bottom of the month labels and the top of the day squares.
	 * 
	 * @param underMonthSpace
	 */
	public final native void setUnderMonthSpace(String underMonthSpace) /*-{
		this.calendar.underMonthSpace = underMonthSpace;
	}-*/;

	/**
	 * Sets the number of pixels between the bottom-most year label and the bottom of the chart.
	 * 
	 * @param underYearSpace
	 */
	public final native void setUnderYearSpace(String underYearSpace) /*-{
		this.calendar.underYearSpace = underYearSpace;
	}-*/;

	/**
	 * Months with data values are delineated from others using a border in this style.
	 * 
	 * @param unusedMonthOutlineColor
	 */
	public final native void setUnusedMonthOutlineColor(CellColor unusedMonthOutlineColor) /*-{
		this.calendar.unusedMonthOutlineColor = unusedMonthOutlineColor;
	}-*/;

	private final native void initialize() /*-{
		this.calendar = {};
	}-*/;
}
