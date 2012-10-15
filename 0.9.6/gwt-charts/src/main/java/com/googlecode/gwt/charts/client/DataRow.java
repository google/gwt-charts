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
import com.google.gwt.core.client.JsArray;

/**
 * Represents a row object for adding to a DataTable.
 * Each row object has one required property called c, which is an array of cells in that row. It also has an optional p
 * property that defines a map of arbitrary custom values to assign to the whole row. If your visualization supports any
 * row-level properties it will describe them; otherwise, this property will be ignored.
 * 
 * @see <a href="http://developers.google.com/chart/interactive/docs/reference.html#rowsproperty">Cell Objects</a>
 */
public class DataRow extends JavaScriptObject {

	/**
	 * Default static constructor
	 * 
	 * @return a new object
	 */
	public static DataRow create() {
		return createObject().cast();
	}

	protected DataRow() {
	}

	/**
	 * Sets an array of cells in this row.
	 * 
	 * @param c an array of cells in this row.
	 */
	public final native void setC(JsArray<DataCell> c) /*-{
		this.c = c;
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

}
