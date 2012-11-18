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
 * Defines the resolution of the map borders.
 */
public enum Resolution {
	/**
	 * Supported for all regions, except for US state regions.
	 */
	COUNTRIES("countries"),
	/**
	 * Supported only for country regions and US state regions. Not supported for all countries; please test a country
	 * to see whether this option is supported.
	 */
	PROVINCES("provinces"),
	/**
	 * Supported for the US country region and US state regions only.
	 */
	METROS("metros");

	/**
	 * Get a Resolution by providing its name.
	 * 
	 * @param name the Resolution name.
	 * @return a Resolution corresponding to the provided name.
	 */
	public static Resolution findByName(String name) {
		for (Resolution resolution : Resolution.values()) {
			if (resolution.getName().equals(name)) {
				return resolution;
			}
		}
		return null;
	}

	private final String name;

	private Resolution(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the Resolution.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
