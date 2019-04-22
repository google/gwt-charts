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

import com.googlecode.gwt.charts.client.controls.ControlOptions;

/**
 * Configuration options for {@link NumberRangeFilter}.
 */
public class NumberRangeFilterOptions extends ControlOptions<NumberRangeFilterUi> {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static NumberRangeFilterOptions create() {
		return createObject().cast();
	}

	protected NumberRangeFilterOptions() {
		// Default constructor.
	}

	/**
	 * Maximum allowed value for the range higher extent. If undefined, the value will be inferred from the contents of
	 * the DataTable managed by the control.
	 * 
	 * @param maxValue
	 */
	public final native void setMaxValue(double maxValue) /*-{
		this.maxValue = maxValue;
	}-*/;

	/**
	 * Minimum allowed value for the range lower extent. If undefined, the value will be inferred from the contents of
	 * the DataTable managed by the control.
	 * 
	 * @param minValue
	 */
	public final native void setMinValue(double minValue) /*-{
		this.minValue = minValue;
	}-*/;
}
