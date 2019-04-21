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
package com.googlecode.gwt.charts.client;

/**
 * A definition of currently available chart types.
 */
public enum ChartType {
	/**
	 * Annotation chart.
	 */
	ANNOTATION("Annotation"),
	/**
	 * Area chart.
	 */
	AREA("AreaChart"),
	/**
	 * Bar chart.
	 */
	BAR("BarChart"),
	/**
	 * Bubble chart.
	 */
	BUBBLE("BubbleChart"),
	/**
	 * Annotation chart.
	 */
	CALENDAR("Calendar"),
	/**
	 * Candlestick chart.
	 */
	CANDLESTICK("CandlestickChart"),
	/**
	 * Column chart.
	 */
	COLUMN("ColumnChart"),
	/**
	 * Combo chart, a mix of lines, bars, and area charts.
	 */
	COMBO("ComboChart"),
	/**
	 * Gauge chart.
	 */
	GAUGE("Gauge"),
	/**
	 * Geo chart.
	 */
	GEO_CHART("GeoChart"),
	/**
	 * Histogram.
	 */
	HISTOGRAM("Histogram"),
	/**
	 * Line chart.
	 */
	LINE("LineChart"),
	/**
	 * Map.
	 */
	MAP("Map"),
	/**
	 * Org chart.
	 */
	ORGCHART("OrgChart"),
	/**
	 * Pie chart.
	 */
	PIE("PieChart"),
	/**
	 * Sankey chart.
	 */
	SANKEY("Sankey"),
	/**
	 * Scatter chart.
	 */
	SCATTER("ScatterChart"),
	/**
	 * Stepped area chart.
	 */
	STEPPED_AREA("SteppedAreaChart"),
	/**
	 * Table.
	 */
	TABLE("Table"),
	/**
	 * Timeline.
	 */
	TIMELINE("Timeline"),
	/**
	 * Tree map.
	 */
	TREE_MAP("TreeMap");

	/**
	 * Get a ChartType by providing its name.
	 * 
	 * @param name the ChartType name.
	 * @return a ChartType corresponding to the provided name.
	 */
	public static ChartType findByName(String name) {
		for (ChartType chartType : ChartType.values()) {
			if (chartType.getName().equals(name)) {
				return chartType;
			}
		}
		return null;
	}

	private final String name;

	private ChartType(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the ChartType.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
