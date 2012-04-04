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

public class LineChart extends CoreChart {

	public LineChart() {
		super();
	}

	public final void draw(DataSource data, LineChartOptions options) {
		chartObject.draw(data, options);
	}

	@Override
	protected native ChartObject createChartObject(Element container) /*-{
		return new $wnd.google.visualization.LineChart(container);
	}-*/;
}
