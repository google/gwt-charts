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
 * An object with members to configure the gridlines on the horizontal axis.
 * This option is only supported for a continuous axis.
 */
public class Gridlines extends JavaScriptObject {
	/**
	 * Default constructor
	 * 
	 * @return a new object instance
	 */
	public static Gridlines create() {
		return createObject().cast();
	}
	
	protected Gridlines() {
	}

	/**
	 * Sets the color of the horizontal gridlines inside the chart area. 
	 * @param color specify a valid HTML color string.
	 */
	public final native void setColor(String color) /*-{
		this.color = color;
	}-*/;

	/**
	 * Sets the number of horizontal gridlines inside the chart area. 
	 * @param count minimum value is 2.
	 */
	public final native void setCount(int count) /*-{
		this.count = count;
	}-*/;

}
