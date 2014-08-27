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
 * The type of map to show. 
 */
public enum MapType {
	/**
	 * Normal map
	 */
	NORMAL("normal"),
	/**
	 * Terrain (elevation) map
	 */
	TERRAIN("terrain"),
	/**
	 * Satellite imagery
	 */
	SATELLITE("satellite"),
	/**
	 * A mix of normal and satellite imagery
	 */
	HYBRID("hybrid");

	/**
	 * Get a MapType by providing its name.
	 * 
	 * @param name the MapType name.
	 * @return a MapType corresponding to the provided name.
	 */
	public static MapType findByName(String name) {
		for (MapType mapType : MapType.values()) {
			if (mapType.getName().equals(name)) {
				return mapType;
			}
		}
		return null;
	}

	private final String name;

	private MapType(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the MapType.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
