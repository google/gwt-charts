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
 * A histogram is a chart that groups numeric data into bins, displaying the bins as segmented columns. They're used to
 * depict the distribution of a dataset: how often values fall into ranges.<br>
 * Google Charts automatically chooses the number of bins for you. All bins are equal width and have a height
 * proportional to the number of data points in the bin. In other respects, histograms are similar to column charts.
 */
public class Histogram extends CoreChartWidget<HistogramOptions> {

	/**
	 * Creates a new chart widget.
	 */
	public Histogram() {
		super();
	}

	@Override
	protected native ChartObject createChartObject(Element container) /*-{
		return new $wnd.google.visualization.Histogram(container);
	}-*/;
}
