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
 * An interactive candlestick chart.<br>
 * <br>
 * A candlestick chart is used to show an opening and closing value overlaid on top of a total variance. Candlestick
 * charts are often used to show stock value behavior. In this chart, items where the opening value is less than the
 * closing value (a gain) are drawn as filled boxes, and items where the opening value is more than the closing value (a
 * loss) are drawn as hollow boxes.
 */
public class CandlestickChart extends CoreChartWidget<CandlestickChartOptions> {

	/**
	 * Creates a new chart widget.
	 */
	public CandlestickChart() {
		super();
	}

	@Override
	protected native ChartObject createChartObject(Element container) /*-{
		return new $wnd.google.visualization.CandlestickChart(container);
	}-*/;
}
