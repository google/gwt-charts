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
package com.googlecode.gwt.charts.client.util;

import com.google.gwt.core.client.JsArrayMixed;

import com.googlecode.gwt.charts.client.ChartWrapperSpec;
import com.googlecode.gwt.charts.client.DataTable;

public class ChartHelper {

	public static final native DataTable arrayToDataTable(JsArrayMixed array) /*-{
		return $wnd.google.visualization.arrayToDataTable(array);
	}-*/;

	public static final native DataTable arrayToDataTable(JsArrayMixed array, boolean firstRowIsData) /*-{
		return $wnd.google.visualization.arrayToDataTable(array, firstRowIsData);
	}-*/;

	public static final native void drawChart(ChartWrapperSpec<?> chartWrapperSpec) /*-{
		return $wnd.google.visualization.drawChart(chartWrapperSpec);
	}-*/;

	public static final native void drawChart(String jsonLiteral) /*-{
		return $wnd.google.visualization.drawChart(jsonLiteral);
	}-*/;
}
