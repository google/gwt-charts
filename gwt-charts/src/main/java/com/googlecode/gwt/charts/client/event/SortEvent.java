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

import com.google.gwt.core.client.JsArrayInteger;

import com.googlecode.gwt.charts.client.Properties;

/**
 * Triggered when users click on a column header, and the sort option is not 'disable'.
 */
public class SortEvent extends Event {
	/**
	 * The event name.
	 */
	public static String NAME = "sort";

	/**
	 * Creates a new event.
	 * 
	 * @param properties
	 */
	public SortEvent(Properties properties) {
		super(NAME, properties);
	}

	/**
	 * Returns true if the sort is ascending, false if descending.
	 * 
	 * @return true if the sort is ascending, false if descending.
	 */
	public boolean getAscending() {
		return properties.getBoolean("ascending");
	}

	/**
	 * Returns index of the column by which the table is sorted.
	 * 
	 * @return index of the column by which the table is sorted.
	 */
	public int getColumn() {
		return (int) properties.getNumber("column");
	}

	/**
	 * Returns an array of numbers, where the index in the array is the row number as sorted (in the visible table), and
	 * the value is the index of that row in the underlying (unsorted) data table.
	 * 
	 * @return an array of numbers
	 */
	public JsArrayInteger getSortedIndexes() {
		return properties.getObject("sortedIndexes").cast();
	}
}
