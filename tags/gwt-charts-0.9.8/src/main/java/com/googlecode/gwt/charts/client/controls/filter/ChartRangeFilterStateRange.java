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

public class ChartRangeFilterStateRange extends JavaScriptObject {
	public static ChartRangeFilterStateRange create() {
		return createObject().cast();
	}

	protected ChartRangeFilterStateRange() {
	}

	public final native void setEnd(Date end) /*-{
		this.end = @com.googlecode.gwt.charts.client.util.DateHelper::getJsDate(Ljava/util/Date;) (end);
	}-*/;

	public final native void setEnd(double end) /*-{
		this.end = end;
	}-*/;

	public final native void setEnd(TimeOfDay end) /*-{
		this.end = end;
	}-*/;

	public final native void setStart(Date start) /*-{
		this.start = @com.googlecode.gwt.charts.client.util.DateHelper::getJsDate(Ljava/util/Date;) (start);
	}-*/;

	public final native void setStart(double start) /*-{
		this.start = start;
	}-*/;

	public final native void setStart(TimeOfDay start) /*-{
		this.start = start;
	}-*/;

	public final Date getEndDate() {
		return DateHelper.getDate(getEndJsDate());
	}

	public final native double getEndNumber() /*-{
		this.end = end;
	}-*/;

	public final native TimeOfDay getEndTimeOfDay() /*-{
		this.end = end;
	}-*/;

	public final Date getStartDate() {
		return DateHelper.getDate(getStartJsDate());
	}

	public final native double getStartNumber() /*-{
		return this.start;
	}-*/;

	public final native TimeOfDay getStartTimeOfDay() /*-{
		return this.start;
	}-*/;

	private final native JsDate getEndJsDate() /*-{
		return this.end;
	}-*/;

	private final native JsDate getStartJsDate() /*-{
		return this.start;
	}-*/;
}
