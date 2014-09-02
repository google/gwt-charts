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
package com.googlecode.gwt.charts.client.controls.filter;

import com.googlecode.gwt.charts.client.controls.ControlState;

/**
 * State configuration options for {@link ChartRangeFilter}.
 */
public class ChartRangeFilterState extends ControlState {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static ChartRangeFilterState create() {
		return createObject().cast();
	}

	protected ChartRangeFilterState() {
		// Default constructor.
	}

	/**
	 * Return the selected range.
	 * 
	 * @return the selected range
	 */
	public final native ChartRangeFilterStateRange getRange() /*-{
		return this.range;
	}-*/;

	/**
	 * Sets the selected range.
	 * 
	 * @param range
	 */
	public final native void setRange(ChartRangeFilterStateRange range) /*-{
		this.range = range;
	}-*/;
}
