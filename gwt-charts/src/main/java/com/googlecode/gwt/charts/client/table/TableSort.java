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
package com.googlecode.gwt.charts.client.table;

/**
 * If and how to sort columns when the user clicks a column heading. If sorting is enabled, consider setting the
 * sortAscending and sortColumn properties as well.
 */
public enum TableSort {
	/**
	 * Users can click on column headers to sort by the clicked column. When users click on the column header, the rows
	 * will be automatically sorted, and a 'sort' event will be triggered.
	 */
	ENABLE("enable"),
	/**
	 * When users click on the column header, a 'sort' event will be triggered, but the rows will not be automatically
	 * sorted. This option should be used when the page implements its own sort. See the TableQueryWrapper example for
	 * an example of how to handle sorting events manually.
	 */
	EVENT("event"),
	/**
	 * Clicking a column header has no effect.
	 */
	DISABLE("disable");

	/**
	 * Get a TableSort by providing its name.
	 * 
	 * @param name the TableSort name.
	 * @return a TableSort corresponding to the provided name.
	 */
	public static TableSort findByName(String name) {
		for (TableSort tableSort : TableSort.values()) {
			if (tableSort.getName().equals(name)) {
				return tableSort;
			}
		}
		return null;
	}

	private final String name;

	private TableSort(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the TableSort.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
