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
 * You can initialize a DataTable by passing a JavaScript string literal object into the data parameter. We'll call this
 * object the data object. You can code this object by hand, according to the description below, or you can use a helper
 * Python library if you know how to use Python, and your site can use it. However, if you want to construct the object
 * by hand, this section will describe the syntax.
 * 
 * @see <a href="http://developers.google.com/chart/interactive/docs/reference.html#dataparam">Format of the
 *      Constructor&quot;s JavaScript Literal</a>
 */
public class DataLiteral extends JavaScriptObject {

	protected DataLiteral() {
	}

	/**
	 * Sets an array of objects describing the ID and type of each column.
	 * 
	 * @param cols an array of objects describing the ID and type of each column.
	 */
	public final native void setCols(JsArray<DataColumn> cols) /*-{
		return this.cols = cols;
	}-*/;

	/**
	 * The table-level p property is a map of custom values applied to the whole DataTable. If your visualization
	 * supports any datatable-level properties, it will describe them; otherwise, this property will be ignored.
	 * 
	 * @param p a map of custom values applied to the whole DataTable.
	 */
	public final native void setP(Properties p) /*-{
		return this.p = p;
	}-*/;

	/**
	 * Sets holds an array of row objects.
	 * 
	 * @param rows an array of row objects.
	 */
	public final native void setRows(JsArray<DataRow> rows) /*-{
		return this.rows = rows;
	}-*/;
}
