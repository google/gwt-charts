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
package com.googlecode.gwt.charts.client.controls.filter;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

import com.googlecode.gwt.charts.client.controls.ControlOptionsUi;

public class ChartRangeFilterUi extends ControlOptionsUi {
	public static ChartRangeFilterUi create() {
		return createObject().cast();
	}

	protected ChartRangeFilterUi() {
		// Default constructor
	}

	public final native void setChartOptions(JavaScriptObject chartOptions) /*-{
		this.chartOptions = chartOptions;
	}-*/;

	public final native void setChartType(String chartType) /*-{
		this.chartType = chartType;
	}-*/;

	public final native void setChartView(JsArrayString chartView) /*-{
		this.chartView = chartView;
	}-*/;

	public final native void setChartView(String chartView) /*-{
		this.chartView = chartView;
	}-*/;

	public final native void setMinRangeSize(double minRangeSize) /*-{
		this.minRangeSize = minRangeSize;
	}-*/;

	public final native void setMinRangeSize(int minRangeSize) /*-{
		this.minRangeSize = minRangeSize;
	}-*/;

	public final native void setSnapToData(boolean snapToData) /*-{
		this.snapToData = snapToData;
	}-*/;

}
