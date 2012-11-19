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
 * A scatter chart that is rendered within the browser using SVG or VML. Displays tips when hovering over points.<br>
 * <br>
 * A scatter chart is used to map correlation between sets of numbers.
 */
public class ScatterChart extends CoreChartWidget<ScatterChartOptions> {

	/**
	 * Creates a new chart widget
	 */
	public ScatterChart() {
		super();
	}

	@Override
	protected native ChartObject createChartObject(Element container) /*-{
		return new $wnd.google.visualization.ScatterChart(container);
	}-*/;
}
