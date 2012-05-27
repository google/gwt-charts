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
 * Represents a bar in column/bar or candlestick chart
 */
public class Bar extends JavaScriptObject {
	/**
	 * Default constructor
	 * 
	 * @return a new object
	 */
	public static Bar create() {
		return createObject().cast();
	}

	protected Bar() {
	}

	/**
	 * Sets the width of a group of bars, by an absolute value in pixels.
	 * 
	 * @param groupWidth the width of a group of bars
	 */
	public final native void setGroupWidth(int groupWidth) /*-{
		this.groupWidth = groupWidth;
	}-*/;

	/**
	 * Sets the width of a group of bars, by a percentage of the
	 * total width (e.g., '30%'). The default: the golden ratio (~61.8%)
	 * 
	 * @param groupWidth the width of a group of bars
	 */
	public final native void setGroupWidth(String groupWidth) /*-{
		this.groupWidth = groupWidth;
	}-*/;
}
