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
import com.googlecode.gwt.charts.client.options.Explorer;
import com.googlecode.gwt.charts.client.options.SizeAxis;
import com.googlecode.gwt.charts.client.util.ArrayHelper;

/**
 * Configuration options for {@link BubbleChart}.
 */
public class BubbleChartOptions extends CoreOptions {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static BubbleChartOptions create() {
		return createObject().cast();
	}

	protected BubbleChartOptions() {
	}

	/**
	 * Sets visual bubble properties.
	 * 
	 * @param bubble an object with members to configure the visual properties of the bubbles
	 */
	public final native void setBubble(Bubble bubble) /*-{
		this.bubble = bubble;
	}-*/;

	/**
	 * An object that specifies a mapping between color column values and colors or a gradient scale.
	 * 
	 * @param colorAxis
	 */
	public final native void setColorAxis(ColorAxis colorAxis) /*-{
		this.colorAxis = colorAxis;
	}-*/;

	/**
	 * Sets the explorer properties for the chart.
	 * 
	 * @param explorer
	 */
	public final native void setExplorer(Explorer explorer) /*-{
		this.explorer = explorer;
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
	 * Sets series options by index for describing the format of the corresponding series in the chart.
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

	/**
	 * Configures how values are associated with bubble size.
	 * 
	 * @param sizeAxis
	 */
	public final native void setSizeAxis(SizeAxis sizeAxis) /*-{
		this.sizeAxis = sizeAxis;
	}-*/;

	/**
	 * Defines sorting methid for the bubbles.
	 * Sorts the bubbles by size so the smaller bubbles appear above the larger bubbles or according to their order in
	 * the DataTable.
	 * 
	 * @param sortBubblesBySize true to sort by size
	 */
	public final native void setSortBubblesBySize(boolean sortBubblesBySize) /*-{
		this.sortBubblesBySize = sortBubblesBySize;
	}-*/;

	private final native void setSeries(JsArray<BubbleChartSeries> series) /*-{
		this.series = series;
	}-*/;

}
