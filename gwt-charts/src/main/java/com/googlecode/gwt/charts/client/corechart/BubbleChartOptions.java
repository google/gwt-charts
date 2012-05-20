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

import com.googlecode.gwt.charts.client.options.Bubble;
import com.googlecode.gwt.charts.client.options.ColorAxis;
import com.googlecode.gwt.charts.client.options.CoreOptions;
import com.googlecode.gwt.charts.client.options.SizeAxis;
import com.googlecode.gwt.charts.client.util.ArrayHelper;

public class BubbleChartOptions extends CoreOptions {
	public static BubbleChartOptions create() {
		return createObject().cast();
	}

	protected BubbleChartOptions() {
	}

	public final native void setBubble(Bubble bubble) /*-{
		this.bubble = bubble;
	}-*/;

	public final native void setColorAxis(ColorAxis colorAxis) /*-{
		this.colorAxis = colorAxis;
	}-*/;

	/**
	 * Sets series options with an array of objects, each describing the format of the corresponding series in the
	 * chart.
	 * 
	 * @param series an array of the corresponding series objects
	 */
	public final void setSeries(BubbleChartSeries... series) {
		setSeries(ArrayHelper.createArray(series));
	}

	/**
	 * Sets series options by index for describing the format of the corresponding series in the chart
	 * 
	 * @param index the series index
	 * @param series an object definining the series format
	 */
	public final native void setSeries(int index, BubbleChartSeries series) /*-{
		if (!this.series) {
			this.series = {};
		}
		this.series[index] = series;
	}-*/;

	public final native void setSizeAxis(SizeAxis sizeAxis) /*-{
		this.sizeAxis = sizeAxis;
	}-*/;

	public final native void setSortBubblesBySize(boolean sorted) /*-{
		this.sortBubblesBySize = sorted;
	}-*/;

	private final native void setSeries(JsArray<BubbleChartSeries> series) /*-{
		this.series = series;
	}-*/;

}
