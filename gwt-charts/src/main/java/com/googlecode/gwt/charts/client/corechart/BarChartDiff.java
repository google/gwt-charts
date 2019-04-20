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
package com.googlecode.gwt.charts.client.corechart;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Options for Bar Diff charts.
 */
public abstract class BarChartDiff extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static BarChartDiff create() {
		return createObject().cast();
	}

	protected BarChartDiff() {
	}

	/**
	 * Change the size of inner bar.
	 * 
	 * @param widthFactor a value from 0.0 to 1.0
	 */
	public final native void setRadiusFactor(double widthFactor) /*-{
		if (!this.newData) {
			this.newData = {};
		}
		this.newData.widthFactor = widthFactor;
	}-*/;

}
