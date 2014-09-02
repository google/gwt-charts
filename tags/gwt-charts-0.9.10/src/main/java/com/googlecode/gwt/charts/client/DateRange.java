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
package com.googlecode.gwt.charts.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;

import com.googlecode.gwt.charts.client.util.DateHelper;

import java.util.Date;

/**
 * Represents a date range.
 */
public class DateRange extends JavaScriptObject {

	protected DateRange() {
		// Default constructor.
	}

	/**
	 * Returns the range end date.
	 * 
	 * @return the end date
	 */
	public final Date getEndDate() {
		return DateHelper.getDate(getJsEndDate());
	}

	/**
	 * Returns the range start date.
	 * 
	 * @return the start date
	 */
	public final Date getStartDate() {
		return DateHelper.getDate(getJsStartDate());
	}

	private final native JsDate getJsEndDate() /*-{
		return this.endDate;
	}-*/;

	private final native JsDate getJsStartDate() /*-{
		return this.startDate;
	}-*/;

}
