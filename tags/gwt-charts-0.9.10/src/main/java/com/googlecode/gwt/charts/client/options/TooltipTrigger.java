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
public enum TooltipTrigger {
	/**
	 * The tooltip will be displayed when the user hovers over an element.
	 */
	FOCUS("focus"),
	/**
	 * The tooltip will not be displayed.
	 */
	NONE("none"),
	/**
	 * The tooltip will be displayed when the user selects the element.
	 */
	SELECTION("selection");
	
	/**
	 * Get a TooltipTrigger by providing its name.
	 * 
	 * @param name the TooltipTrigger name.
	 * @return a TooltipTrigger corresponding to the provided name.
	 */
	public static TooltipTrigger findByName(String name) {
		for (TooltipTrigger tooltipTrigger : TooltipTrigger.values()) {
			if (tooltipTrigger.getName().equals(name)) {
				return tooltipTrigger;
			}
		}
		return null;
	}

	private final String name;

	private TooltipTrigger(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the TooltipTrigger.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
