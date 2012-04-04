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

public class DataLiteral extends JavaScriptObject {

	protected DataLiteral() {
	}

	public final native void setCols(JsArray<DataColumn> cols) /*-{
		return this.cols = cols;
	}-*/;

	public final native void setP(Properties p) /*-{
		return this.p = p;
	}-*/;

	public final native void setRows(JsArray<DataCell> rows) /*-{
		return this.rows = rows;
	}-*/;
}
