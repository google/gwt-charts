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
import com.googlecode.gwt.charts.client.DataSource;

/**
 * A vertical bar chart that is rendered within the browser using SVG or VML. Displays tips when hovering over bars. For
 * a horizontal version of this chart, see the {@link BarChart}.
 */
public class ColumnChart extends CoreChartWidget<ColumnChartOptions> {

	/**
	 * Creates a new chart widget.
	 */
	public ColumnChart() {
		super();
	}

	/**
	 * Create a diff chart with two datasets to generate a third dataset representing the diff.
	 * 
	 * @param oldData a first dataset
	 * @param newData a second dataset
	 * @return a third dataset representing the diff
	 */
	public DataSource computeDiff(DataSource oldData, DataSource newData) {
		return chartObject.computeDiff(oldData, newData);
	}

	@Override
	protected native ChartObject createChartObject(Element container) /*-{
		return new $wnd.google.visualization.ColumnChart(container);
	}-*/;
}
