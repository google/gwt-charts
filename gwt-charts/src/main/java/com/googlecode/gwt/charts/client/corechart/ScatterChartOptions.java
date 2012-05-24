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
package com.googlecode.gwt.charts.client.corechart;

import com.google.gwt.core.client.JsArray;

import com.googlecode.gwt.charts.client.options.CoreOptions;
import com.googlecode.gwt.charts.client.options.CurveType;
import com.googlecode.gwt.charts.client.util.ArrayHelper;

/**
 * Configuration options for {@link ScatterChart}.
 */
public class ScatterChartOptions extends CoreOptions {
	public static ScatterChartOptions create() {
		return createObject().cast();
	}

	protected ScatterChartOptions() {
	}

	public final void setCurveType(CurveType curveType) {
		setCurveType(curveType.getName());
	}

	public final native void setCurveType(String curveType) /*-{
		this.curveType = curveType;
	}-*/;

	/**
	 * Defines data line width in pixels. Use zero to hide all lines and show only the points. You can override values
	 * for individual series using {@link #setSeries(JsArray)}.
	 * 
	 * @param lineWidth data line width in pixels
	 */
	public final native void setLineWidth(int lineWidth) /*-{
		this.lineWidth = lineWidth;
	}-*/;

	/**
	 * Sets diameter of displayed points in pixels. Use zero to hide all points. You can override values for individual
	 * series using {@link #setSeries(JsArray)}.
	 * 
	 * @param pointSize diameter of displayed points in pixels
	 */
	public final native void setPointSize(int pointSize) /*-{
		this.pointSize = pointSize;
	}-*/;

	/**
	 * Sets series options with an array of objects, each describing the format of the corresponding series in the
	 * chart.
	 * 
	 * @param series an array of the corresponding series objects
	 */
	public final void setSeries(ScatterChartSeries... series) {
		setSeries(ArrayHelper.createArray(series));
	}

	/**
	 * Sets series options by index for describing the format of the corresponding series in the chart
	 * 
	 * @param index the series index
	 * @param series an object definining the series format
	 */
	public final native void setSeries(int index, ScatterChartSeries series) /*-{
		if (!this.series) {
			this.series = {};
		}
		this.series[index] = series;
	}-*/;

	/**
	 * An array of objects, each describing the format of the corresponding series in the chart. To use default values
	 * for a series, specify an empty object {}. If a series or a value is not specified, the global value will be used.
	 * 
	 * @param series
	 */
	private final native void setSeries(JsArray<ScatterChartSeries> series) /*-{
		this.series = series;
	}-*/;

}
