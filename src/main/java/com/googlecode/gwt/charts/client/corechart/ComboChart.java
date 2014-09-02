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

import com.google.gwt.dom.client.Element;

import com.googlecode.gwt.charts.client.ChartObject;

/**
 * A chart that lets you render each series as a different marker type from the following list: columns, lines, and area
 * lines.<br>
 * <br>
 * To assign a default marker type for series, use
 * {@link ComboChartOptions#setSeriesType(com.googlecode.gwt.charts.client.options.SeriesType)}.<br>
 * Use the {@link ComboChartOptions#setSeries(int, ComboChartSeries)} to specify properties of each series individually.
 */
public class ComboChart extends CoreChartWidget<ComboChartOptions> {

	/**
	 * Creates a new chart widget.
	 */
	public ComboChart() {
		super();
	}

	@Override
	protected native ChartObject createChartObject(Element container) /*-{
		return new $wnd.google.visualization.ComboChart(container);
	}-*/;
}
