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
package com.googlecode.gwt.charts.client.format;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Configuration options for {@link ArrowFormat}.
 */
public class ArrowFormatOptions extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static ArrowFormatOptions create() {
		return createObject().cast();
	}

	protected ArrowFormatOptions() {
	}

	/**
	 * A number indicating the base value, used to compare against the cell value. If the cell value is higher, the cell
	 * will include a green up arrow; if the cell value is lower, it will include a red down arrow; if the same, no
	 * arrow.
	 * 
	 * @param base
	 */
	public final native void setBase(double base) /*-{
		this.base = base;
	}-*/;
}
