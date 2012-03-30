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
 * A definition of currently available chart types
 */
public enum ChartType {
	/**
	 * 
	 */
	AREA("AreaChart"),
	/**
	 * 
	 */
	BAR("BarChart"),
	/**
	 * 
	 */
	BUBBLE("BubbleChart"),
	/**
	 * 
	 */
	CANDLESTICK("CandlestickChart"),
	/**
	 * 
	 */
	COLUMN("ColumnChart"),
	/**
	 * 
	 */
	COMBO("ComboChart"),
	/**
	 * 
	 */
	LINE("LineChart"),
	/**
	 * 
	 */
	PIE("PieChart"),
	/**
	 * 
	 */
	SCATTER("ScatterChart"),
	/**
	 * 
	 */
	STEPPED_AREA("SteppedAreaChart"),
	/**
	 * 
	 */
	GAUGE("Gauge"),
	/**
	 * 
	 */
	GEO_CHART("GeoChart"),
	/**
	 * 
	 */
	TABLE("Table"),
	/**
	 * 
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
