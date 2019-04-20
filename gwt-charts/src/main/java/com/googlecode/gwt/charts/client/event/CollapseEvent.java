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
 * Fired when allowCollapse is set to true and the user double clicks on a node with children..
 */
public class CollapseEvent extends Event {
	/**
	 * The event name.
	 */
	public static String NAME = "collapse";

	/**
	 * Creates a new event.
	 * 
	 * @param properties currently should be null
	 */
	public CollapseEvent(Properties properties) {
		super(NAME, properties);
	}

	/**
	 * Returns a boolean indicating whether this is a 'collapse' or 'expand' event.
	 * 
	 * @return true for collapse, false for expand
	 */
	public boolean getCollapsed() {
		return properties.getBoolean("collapsed");
	}

	/**
	 * Returns the zero-based index of the row in the data table, corresponding to the node being clicked.
	 * 
	 * @return target row index
	 */
	public int getRow() {
		return (int) properties.getNumber("row");
	}
}
