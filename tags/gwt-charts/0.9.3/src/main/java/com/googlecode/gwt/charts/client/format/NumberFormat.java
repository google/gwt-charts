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
package com.googlecode.gwt.charts.client.format;

import com.google.gwt.core.client.JavaScriptObject;

import com.googlecode.gwt.charts.client.DataTable;

public class NumberFormat extends JavaScriptObject {
	public static native NumberFormat create(NumberFormatOptions options) /*-{
		return new $wnd.google.visualization.NumberFormat(options);
	}-*/;

	protected NumberFormat() {
	}

	public final native void format(DataTable data, int colIndex) /*-{
		this.format(data, colIndex);
	}-*/;

	public final native String formatValue(double value) /*-{
		return this.formatValue(value);
	}-*/;

	public final native String formatValue(int value) /*-{
		return this.formatValue(value);
	}-*/;
}