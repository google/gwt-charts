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
 * Fired when the user navigates back up the tree, typically by right-clicking. The row property passed into the event
 * handler is the row of the node that the user is navigating from, not the row the user is navigating to.
 */
public class RollUpEvent extends Event {
	/**
	 * The event name.
	 */
	public static String NAME = "rollup";

	/**
	 * Creates a new event.
	 * 
	 * @param properties
	 */
	public RollUpEvent(Properties properties) {
		super(NAME, properties);
	}

	/**
	 * Returns the row of the node that the user is navigating from.
	 * @return a row index
	 */
	public int getRow() {
		return (int) properties.getNumber("row");
	}
}
