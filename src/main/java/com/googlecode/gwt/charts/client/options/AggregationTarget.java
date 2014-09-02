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
 * Defines how multiple data selections are rolled up into tooltips.
 */
public enum AggregationTarget {
	/**
	 * Group selected data by x-value.
	 */
	CATEGORY("category"),
	/**
	 * Group selected data by series.
	 */
	SERIES("series"),
	/**
	 * Group selected data by x-value if all selections have the same x-value, and by series otherwise.
	 */
	AUTO("auto"),
	/**
	 * Show only one tooltip per selection.
	 */
	NONE("none");

	/**
	 * Get an AggregationTarget by providing its name.
	 * 
	 * @param name the AggregationTarget name.
	 * @return an AggregationTarget corresponding to the provided name.
	 */
	public static AggregationTarget findByName(String name) {
		for (AggregationTarget aggregationTarget : AggregationTarget.values()) {
			if (aggregationTarget.getName().equals(name)) {
				return aggregationTarget;
			}
		}
		return null;
	}

	private final String name;

	private AggregationTarget(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the AggregationTarget.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
