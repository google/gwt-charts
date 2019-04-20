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
package com.googlecode.gwt.charts.client.event;

import com.googlecode.gwt.charts.client.Properties;

/**
 * Called when a region is clicked. This will not be thrown for the specific country assigned in the 'region' option (if
 * a specific country was listed).
 */
public class RegionClickEvent extends Event {
	/**
	 * The event name.
	 */
	public static String NAME = "regionclick";

	/**
	 * Creates a new event.
	 * 
	 * @param properties
	 */
	public RegionClickEvent(Properties properties) {
		super(NAME, properties);
	}

	/**
	 * Returns a string in ISO-3166 format describing the region clicked.
	 * 
	 * @return a string in ISO-3166
	 */
	public String getRegion() {
		return properties.getString("region");
	}
}
