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

import com.googlecode.gwt.charts.client.util.DateHelper;

import java.util.Date;

/**
 * Each filter is an object with a numeric column property that
 * specifies the index of the column in the row to assess, plus one of the following:<br>
 * <ul>
 * <li>A value property with a value that must be matched exactly by the cell in the specified column. The value must be
 * the same type as the column; or</li>
 * <li>One or both of the following properties, the same type as the column being filtered:
 * <ul>
 * <li>minValue - A minimum value for the cell. The cell value in the specified column must be greater than or equal to
 * this value.</li>
 * <li>maxValue - A maximum value for the cell. The cell value in the specified column must be less than or equal to
 * this value.</li>
 * </ul>
 * </li>
 * 
 */
public class RowFilter extends JavaScriptObject {
	/**
	 * Creates an empty RowFilter
	 * @return a RowFilter object
	 */
	public static RowFilter create() {
		return createObject().cast();
	}

	protected RowFilter() {
		// Default constructor
	}

	/**
	 * Sets the column to filter
	 * 
	 * @param column the column index
	 */
	public final native void setColumn(int column) /*-{
		this.column = column;
	}-*/;

	/**
	 * A maximum value for the cell.<br>
	 * The cell value in the specified column must be less than or equal to this value.
	 * 
	 * @param maxValue
	 */
	public final native void setMaxValue(double maxValue) /*-{
		this.maxValue = maxValue;
	}-*/;

	/**
	 * A maximum value for the cell.<br>
	 * The cell value in the specified column must be less than or equal to this value.
	 * 
	 * @param maxValue
	 */
	public final native void setMaxValue(String maxValue) /*-{
		this.maxValue = maxValue;
	}-*/;

	/**
	 * A maximum value for the cell.<br>
	 * The cell value in the specified column must be less than or equal to this value.
	 * 
	 * @param maxValue
	 */
	public final native void setMaxValue(JavaScriptObject maxValue) /*-{
		this.maxValue = maxValue;
	}-*/;

	/**
	 * A maximum value for the cell.<br>
	 * The cell value in the specified column must be less than or equal to this value.
	 * 
	 * @param maxValue
	 */
	public final native void setMaxValue(TimeOfDay maxValue) /*-{
		this.maxValue = maxValue;
	}-*/;

	/**
	 * A maximum value for the cell.<br>
	 * The cell value in the specified column must be less than or equal to this value.
	 * 
	 * @param maxValue
	 */
	public final void setMaxValue(Date maxValue) {
		setMaxValue(DateHelper.getJsDate(maxValue));
	}

	/**
	 * A minimum value for the cell.<br>
	 * The cell value in the specified column must be greater than or equal to this value.
	 * 
	 * @param minValue
	 */
	public final native void setMinValue(double minValue) /*-{
		this.minValue = minValue;
	}-*/;

	/**
	 * A minimum value for the cell.<br>
	 * The cell value in the specified column must be greater than or equal to this value.
	 * 
	 * @param minValue
	 */
	public final void setMinValue(Date minValue) {
		setMinValue(DateHelper.getJsDate(minValue));
	}

	/**
	 * A minimum value for the cell.<br>
	 * The cell value in the specified column must be greater than or equal to this value.
	 * 
	 * @param minValue
	 */
	public final native void setMinValue(JavaScriptObject minValue) /*-{
		this.minValue = minValue;
	}-*/;

	/**
	 * A minimum value for the cell.<br>
	 * The cell value in the specified column must be greater than or equal to this value.
	 * 
	 * @param minValue
	 */
	public final native void setMinValue(String minValue) /*-{
		this.minValue = minValue;
	}-*/;

	/**
	 * A minimum value for the cell.<br>
	 * The cell value in the specified column must be greater than or equal to this value.
	 * 
	 * @param minValue
	 */
	public final native void setMinValue(TimeOfDay minValue) /*-{
		this.minValue = minValue;
	}-*/;

	/**
	 * A exact value for the cell.<br>
	 * The cell value in the specified column must be equal to this value.
	 * 
	 * @param value the exact value to match
	 */
	public final native void setValue(double value) /*-{
		this.value = value;
	}-*/;

	/**
	 * A exact value for the cell.<br>
	 * The cell value in the specified column must be equal to this value.
	 * 
	 * @param value the exact value to match
	 */
	public final void setValue(Date value) {
		setValue(DateHelper.getJsDate(value));
	}

	/**
	 * A exact value for the cell.<br>
	 * The cell value in the specified column must be equal to this value.
	 * 
	 * @param value the exact value to match
	 */
	public final native void setValue(JavaScriptObject value) /*-{
		this.value = value;
	}-*/;

	/**
	 * A exact value for the cell.<br>
	 * The cell value in the specified column must be equal to this value.
	 * 
	 * @param value the exact value to match
	 */
	public final native void setValue(String value) /*-{
		this.value = value;
	}-*/;

	/**
	 * A exact value for the cell.<br>
	 * The cell value in the specified column must be equal to this value.
	 * 
	 * @param value the exact value to match
	 */
	public final native void setValue(TimeOfDay value) /*-{
		this.value = value;
	}-*/;
}
