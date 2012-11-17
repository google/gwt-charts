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

import com.googlecode.gwt.charts.client.controls.ControlType;
import com.googlecode.gwt.charts.client.controls.ControlWrapper;

/**
 * A slider with two thumbs to select ranges of numeric values.
 */
public class NumberRangeFilter extends ControlWrapper<NumberRangeFilterOptions, NumberRangeFilterState> {

	/**
	 * Creates a new NumberRangeFilter.
	 */
	public NumberRangeFilter() {
		super();
		setControlType(ControlType.NUMBER_RANGE_FILTER);
	}

}
