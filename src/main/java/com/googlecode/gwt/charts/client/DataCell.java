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
 * Represents a cell object for adding to a DataTable.
 * 
 * @see <a href="http://developers.google.com/chart/interactive/docs/reference.html#cell_object">Cell Objects</a>
 */
public class DataCell extends JavaScriptObject {

	/**
	 * Default static constructor
	 * 
	 * @return a new object
	 */
	public static DataCell create() {
		return createObject().cast();
	}

	protected DataCell() {
	}

	/**
	 * A string version of the v value, formatted for display. The visualization will not use this value for
	 * calculation, only as a label for display. If omitted, a string version of v will be used.
	 * 
	 * @param f a string version of the v value
	 */
	public final native void setF(String f) /*-{
		this.f = f;
	}-*/;

	/**
	 * An object that is a map of custom values applied to the cell. These values can be of any JavaScript type. If your
	 * visualization supports any cell-level properties, it will describe them; otherwise, this property will be
	 * ignored.
	 * 
	 * @param p a map of custom values applied to the cell.
	 */
	public final native void setP(Properties p) /*-{
		this.p = p;
	}-*/;

	/**
	 * Sets the cell value. The data type should match the column data type.
	 * 
	 * @param v the cell value
	 */
	public final native void setVBoolean(boolean v) /*-{
		this.v = v;
	}-*/;

	/**
	 * Sets the cell value. The data type should match the column data type.
	 * 
	 * @param v the cell value
	 */
	public final void setVDate(Date v) {
		setVObject(DateHelper.getJsDate(v));
	}

	/**
	 * Sets the cell value. The data type should match the column data type.
	 * 
	 * @param v the cell value
	 */
	public final native void setVNumber(double v) /*-{
		this.v = v;
	}-*/;

	/**
	 * Clears the cell value. The whole object should be empty and have neither v nor f properties.
	 */
	public final native void setVNull() /*-{
		delete this.v;
	}-*/;

	/**
	 * Sets the cell value. The data type should match the column data type.
	 * 
	 * @param v the cell value
	 */
	public final native void setVObject(JavaScriptObject v) /*-{
		this.v = v;
	}-*/;

	/**
	 * Sets the cell value. The data type should match the column data type.
	 * 
	 * @param v the cell value
	 */
	public final native void setVString(String v) /*-{
		this.v = v;
	}-*/;

	/**
	 * Sets the cell value. The data type should match the column data type.
	 * 
	 * @param v the cell value
	 */
	public final native void setVTimeOfDay(TimeOfDay v) /*-{
		this.v = v;
	}-*/;

}
