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
 * The panning orientation.
 */
public enum ExplorerAxis {
	/**
	 * Horizontal panning. 
	 */
	HORIZONTAL("horizontal"),
	/**
	 * Vertical orientation.
	 */
	VERTICAL("vertical");

	/**
	 * Get an ExplorerAxis by providing its name.
	 * 
	 * @param name the ExplorerAxis name.
	 * @return an ExplorerAxis corresponding to the provided name.
	 */
	public static ExplorerAxis findByName(String name) {
		for (ExplorerAxis explorerAxis : ExplorerAxis.values()) {
			if (explorerAxis.getName().equals(name)) {
				return explorerAxis;
			}
		}
		return null;
	}

	private final String name;

	private ExplorerAxis(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the ExplorerAxis.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
