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
package com.googlecode.gwt.charts.client.options;

/**
 * The type of marker for a series.
 */
public enum SeriesType {
	/**
	 * Lines like in LineChart.
	 */
	LINE("line"),
	/**
	 * Bars are actually vertical bars (columns).
	 */
	BARS("bars"),
	/**
	 * Area like in AreaChart.
	 */
	AREA("area"),
	/**
	 * Area like in SteppedAreaChart.
	 */
	STEPPED_AREA("steppedArea"),
	/**
	 * Candlesticks like in CandlestickChart.
	 */
	CANDLESTICK("candlesticks");

	/**
	 * Get a SeriesType by providing its name.
	 * 
	 * @param name the SeriesType name.
	 * @return a SeriesType corresponding to the provided name.
	 */
	public static SeriesType findByName(String name) {
		for (SeriesType seriesType : SeriesType.values()) {
			if (seriesType.getName().equals(name)) {
				return seriesType;
			}
		}
		return null;
	}

	private final String name;

	private SeriesType(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the SeriesType.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
