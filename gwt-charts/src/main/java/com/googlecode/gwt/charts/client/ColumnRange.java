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
 * Represents the minimal and maximal values of values in a specified column.
 */
public class ColumnRange extends JavaScriptObject {

	protected ColumnRange() {
		// Default constructor.
	}

	/**
	 * Returns the maximum existing value.
	 * 
	 * @return the maximum existing value
	 */
	public final native boolean getMaxBoolean() /*-{
		return this.max;
	}-*/;

	/**
	 * Returns the maximum existing value.
	 * 
	 * @return the maximum existing value
	 */
	public final Date getMaxDate() {
		JsDate jsDate = getMaxObject().cast();
		return DateHelper.getDate(jsDate);
	}

	/**
	 * Returns the maximum existing value.
	 * 
	 * @return the maximum existing value
	 */
	public final native double getMaxNumber() /*-{
		return this.max;
	}-*/;

	/**
	 * Returns the maximum existing value.
	 * 
	 * @return the maximum existing value
	 */
	public final native JavaScriptObject getMaxObject() /*-{
		return this.max;
	}-*/;

	/**
	 * Returns the maximum existing value.
	 * 
	 * @return the maximum existing value
	 */
	public final native String getMaxString() /*-{
		return this.max;
	}-*/;

	/**
	 * Returns the maximum existing value.
	 * 
	 * @return the maximum existing value
	 */
	public final native TimeOfDay getMaxTimeOfDay() /*-{
		return this.max;
	}-*/;

	/**
	 * Returns the minimum existing value.
	 * 
	 * @return the minimum existing value
	 */
	public final native boolean getMinBoolean() /*-{
		return this.min;
	}-*/;

	/**
	 * Returns the minimum existing value.
	 * 
	 * @return the minimum existing value
	 */
	public final Date getMinDate() {
		JsDate jsDate = getMinObject().cast();
		return DateHelper.getDate(jsDate);
	}

	/**
	 * Returns the minimum existing value.
	 * 
	 * @return the minimum existing value
	 */
	public final native double getMinNumber() /*-{
		return this.min;
	}-*/;

	/**
	 * Returns the minimum existing value.
	 * 
	 * @return the minimum existing value
	 */
	public final native JavaScriptObject getMinObject() /*-{
		return this.min;
	}-*/;

	/**
	 * Returns the minimum existing value.
	 * 
	 * @return the minimum existing value
	 */
	public final native String getMinString() /*-{
		return this.min;
	}-*/;

	/**
	 * Returns the minimum existing value.
	 * 
	 * @return the minimum existing value
	 */
	public final native TimeOfDay getMinTimeOfDay() /*-{
		return this.min;
	}-*/;

	/**
	 * Checks if max is null.
	 * 
	 * @return true if null, false otherwise
	 */
	public final native boolean isMaxNull() /*-{
		return this.max == null;
	}-*/;

	/**
	 * Checks if min is null.
	 * 
	 * @return true if null, false otherwise
	 */
	public final native boolean isMinNull() /*-{
		return this.min == null;
	}-*/;
}
