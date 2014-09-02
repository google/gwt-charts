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
 * The slider orientation.
 */
public enum CrosshairOrientation {
	/**
	 * For horizontal hairs only.
	 */
	HORIZONTAL("horizontal"),
	/**
	 * For vertical hairs only.
	 */
	VERTICAL("vertical"),
	/**
	 * For traditional crosshairs.
	 */
	BOTH("both");

	/**
	 * Get an CrosshairOrientation by providing its name.
	 * 
	 * @param name the CrosshairOrientation name.
	 * @return an CrosshairOrientation corresponding to the provided name.
	 */
	public static CrosshairOrientation findByName(String name) {
		for (CrosshairOrientation orientation : CrosshairOrientation.values()) {
			if (orientation.getName().equals(name)) {
				return orientation;
			}
		}
		return null;
	}

	private final String name;

	private CrosshairOrientation(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the CrosshairOrientation.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
