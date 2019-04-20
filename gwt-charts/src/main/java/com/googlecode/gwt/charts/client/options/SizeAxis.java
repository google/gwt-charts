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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * An object with members to configure how values are associated with bubble size.
 */
public class SizeAxis extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object
	 */
	public static SizeAxis create() {
		return createObject().cast();
	}

	protected SizeAxis() {
	}

	/**
	 * Sets the maximum radius of the largest possible bubble, in pixels.
	 * 
	 * @param maxSize maximum radius of the largest possible bubble, in pixels
	 */
	public final native void setMaxSize(int maxSize) /*-{
		this.maxSize = maxSize;
	}-*/;

	/**
	 * Sets the size value (as appears in the chart data) to be mapped to sizeAxis.maxSize.
	 * Larger values will be cropped to this value.
	 * 
	 * @param maxValue
	 */
	public final native void setMaxValue(double maxValue) /*-{
		this.maxValue = maxValue;
	}-*/;

	/**
	 * Sets the minimum radius of the smallest possible bubble, in pixels.
	 * 
	 * @param minSize minimum radius of the smallest possible bubble, in pixels
	 */
	public final native void setMinSize(int minSize) /*-{
		this.minSize = minSize;
	}-*/;

	/**
	 * Sets the size value (as appears in the chart data) to be mapped to sizeAxis.minSize. Smaller values will be
	 * cropped to this value.
	 * 
	 * @param minValue
	 */
	public final native void setMinValue(double minValue) /*-{
		this.minValue = minValue;
	}-*/;

}
