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

/**
 * A set of utility chart methods.
 * 
 * @see <a href="https://developers.google.com/chart/interactive/docs/reference#assortedmethods">Assorted Static
 *      Methods</a>
 */
public class ChartHelper {

	/**
	 * This method takes in a 2-dimensional array and converts it to a DataTable.
	 * 
	 * @param array A two-dimensional array, where each row represents a row in the data table. The first row will be
	 *        interpreted as header labels. The data types of each column are
	 *        interpreted automatically from the data given. If a cell has no value, specify a null or empty value as
	 *        appropriate.
	 * @return a new DataTable.
	 */
	public static final native DataTable arrayToDataTable(JsArrayMixed array) /*-{
		return $wnd.google.visualization.arrayToDataTable(array);
	}-*/;

	/**
	 * This method takes in a 2-dimensional array and converts it to a DataTable.
	 * 
	 * @param array A two-dimensional array, where each row represents a row in the data table. The data types of each
	 *        column are
	 *        interpreted automatically from the data given. If a cell has no value, specify a null or empty value as
	 *        appropriate.
	 * @param firstRowIsData if false, the first row will be
	 *        interpreted as header labels.
	 * @return a new DataTable.
	 */
	public static final native DataTable arrayToDataTable(JsArrayMixed array, boolean firstRowIsData) /*-{
		return $wnd.google.visualization.arrayToDataTable(array, firstRowIsData);
	}-*/;

	/**
	 * This method creates a chart in a single call. The advantage of using this method is that it requires slightly
	 * less code, and you can serialize and save visualizations as text strings for reuse. This method does not return a
	 * handle to the created chart, so you cannot assign method listeners to catch chart events.
	 * 
	 * @param chartWrapperSpec a property set for defining a chart
	 */
	public static final native void drawChart(ChartWrapperSpec<?> chartWrapperSpec) /*-{
		return $wnd.google.visualization.drawChart(chartWrapperSpec);
	}-*/;

	/**
	 * This method creates a chart in a single call. The advantage of using this method is that it requires slightly
	 * less code, and you can serialize and save visualizations as text strings for reuse. This method does not return a
	 * handle to the created chart, so you cannot assign method listeners to catch chart events.
	 * 
	 * @param jsonLiteral a String representation of a chart
	 */
	public static final native void drawChart(String jsonLiteral) /*-{
		return $wnd.google.visualization.drawChart(jsonLiteral);
	}-*/;
}
