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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;

import com.googlecode.gwt.charts.client.TimeOfDay;
import com.googlecode.gwt.charts.client.util.DateHelper;

import java.util.Date;

/**
 * An object representing a selected range.
 */
public class ChartRangeFilterStateRange extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static ChartRangeFilterStateRange create() {
		return createObject().cast();
	}

	protected ChartRangeFilterStateRange() {
	}

	/**
	 * Returns selected range end in date format.
	 * 
	 * @return range end in date format
	 */
	public final Date getEndDate() {
		return DateHelper.getDate(getEndJsDate());
	}

	/**
	 * Returns selected range end in number format.
	 * 
	 * @return range end in number format
	 */
	public final native double getEndNumber() /*-{
		this.end = end;
	}-*/;

	/**
	 * Returns selected range end in timeofday format.
	 * 
	 * @return range end in timeofday format
	 */
	public final native TimeOfDay getEndTimeOfDay() /*-{
		this.end = end;
	}-*/;

	/**
	 * Returns selected range start in date format.
	 * 
	 * @return range start in date format
	 */
	public final Date getStartDate() {
		return DateHelper.getDate(getStartJsDate());
	}

	/**
	 * Returns selected range start in number format.
	 * 
	 * @return range start in number format
	 */
	public final native double getStartNumber() /*-{
		return this.start;
	}-*/;

	/**
	 * Returns selected range start in timeofday format.
	 * 
	 * @return range start in timeofday format
	 */
	public final native TimeOfDay getStartTimeOfDay() /*-{
		return this.start;
	}-*/;

	/**
	 * Sets the selected range end.
	 * 
	 * @param end
	 */
	public final void setEnd(Date end) {
		setEnd(DateHelper.getJsDate(end));
	}

	/**
	 * Sets the selected range end.
	 * 
	 * @param end
	 */
	public final native void setEnd(double end) /*-{
		this.end = end;
	}-*/;

	/**
	 * Sets the selected range end.
	 * 
	 * @param end
	 */
	public final native void setEnd(TimeOfDay end) /*-{
		this.end = end;
	}-*/;

	/**
	 * Sets the selected range start.
	 * 
	 * @param start
	 */
	public final void setStart(Date start) {
		setStart(DateHelper.getJsDate(start));
	}

	/**
	 * Sets the selected range start.
	 * 
	 * @param start
	 */
	public final native void setStart(double start) /*-{
		this.start = start;
	}-*/;

	/**
	 * Sets the selected range start.
	 * 
	 * @param start
	 */
	public final native void setStart(TimeOfDay start) /*-{
		this.start = start;
	}-*/;

	private final native JsDate getEndJsDate() /*-{
		return this.end;
	}-*/;

	private final native JsDate getStartJsDate() /*-{
		return this.start;
	}-*/;

	private final native JsDate setEnd(JavaScriptObject end) /*-{
		this.end = end;
	}-*/;

	private final native JsDate setStart(JavaScriptObject start) /*-{
		this.start = start;
	}-*/;
}
