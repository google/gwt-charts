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
 * The user interaction that causes the tooltip to be displayed.
 */
public enum CrosshairTrigger {
	/**
	 * The tooltip will be displayed when the user hovers or selects an element.
	 */
	BOTH("both"),
	/**
	 * The tooltip will be displayed when the user hovers over an element.
	 */
	FOCUS("focus"),
	/**
	 * The tooltip will be displayed when the user selects the element.
	 */
	SELECTION("selection");
	
	/**
	 * Get a CrosshairTrigger by providing its name.
	 * 
	 * @param name the CrosshairTrigger name.
	 * @return a CrosshairTrigger corresponding to the provided name.
	 */
	public static CrosshairTrigger findByName(String name) {
		for (CrosshairTrigger crosshairTrigger : CrosshairTrigger.values()) {
			if (crosshairTrigger.getName().equals(name)) {
				return crosshairTrigger;
			}
		}
		return null;
	}

	private final String name;

	private CrosshairTrigger(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the CrosshairTrigger.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
