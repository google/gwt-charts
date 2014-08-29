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
 * State configuration options for {@link DateRangeFilter}.
 */
public class DateRangeFilterState extends ControlState {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static DateRangeFilterState create() {
		return createObject().cast();
	}

	protected DateRangeFilterState() {
		// Default constructor.
	}

	/**
	 * Whether the higher thumb of the slider is locked at the maximum allowed range.
	 * 
	 * @return true for locked, false otherwise
	 */
	public final native boolean getHighThumbAtMaximum() /*-{
		return this.highThumbAtMaximum;
	}-*/;

	/**
	 * Returns the higher extent of the selected range, inclusive.
	 * 
	 * @return The higher extent of the selected range
	 */
	public final native double getHighValue() /*-{
		return this.highValue;
	}-*/;

	/**
	 * Whether the lower thumb of the slider is locked at the minimum allowed range.
	 * 
	 * @return true for locked, false otherwise
	 */
	public final native boolean getLowThumbAtMinimum() /*-{
		return this.lowThumbAtMinimum;
	}-*/;

	/**
	 * Returns the lower extent of the selected range, inclusive.
	 * 
	 * @return lower extent of the selected range
	 */
	public final native double getLowValue() /*-{
		return this.lowValue;
	}-*/;

	/**
	 * Locks the higher thumb of the slider at the maximum allowed range. Ooverrides highValue.
	 * 
	 * @param highThumbAtMaximum
	 */
	public final native void setHighThumbAtMaximum(boolean highThumbAtMaximum) /*-{
		this.highThumbAtMaximum = highThumbAtMaximum;
	}-*/;

	/**
	 * Sets the higher extent of the selected range, inclusive.
	 * 
	 * @param highValue
	 */
	public final native void setHighValue(double highValue) /*-{
		this.highValue = highValue;
	}-*/;

	/**
	 * Locks the lower thumb of the slider at the minimum allowed range. Overrides lowValue.
	 * 
	 * @param lowThumbAtMinimum
	 */
	public final native void setLowThumbAtMinimum(boolean lowThumbAtMinimum) /*-{
		this.lowThumbAtMinimum = lowThumbAtMinimum;
	}-*/;

	/**
	 * Sets the lower extent of the selected range, inclusive.
	 * 
	 * @param lowValue
	 */
	public final native void setLowValue(double lowValue) /*-{
		this.lowValue = lowValue;
	}-*/;
}
