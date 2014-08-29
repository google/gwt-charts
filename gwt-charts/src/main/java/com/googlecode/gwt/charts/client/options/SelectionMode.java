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
 * Defines the selection mode.
 */
public enum SelectionMode {
	/**
	 * Restricts to single data point selection.
	 */
	SINGLE("single"),
	/**
	 * Allow multiple data point selections.
	 */
	MULTIPLE("multiple");

	/**
	 * Get a SelectionMode by providing its name.
	 * 
	 * @param name the SelectionMode name.
	 * @return a SelectionMode corresponding to the provided name.
	 */
	public static SelectionMode findByName(String name) {
		for (SelectionMode selectionMode : SelectionMode.values()) {
			if (selectionMode.getName().equals(name)) {
				return selectionMode;
			}
		}
		return null;
	}

	private final String name;

	private SelectionMode(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the SelectionMode.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
