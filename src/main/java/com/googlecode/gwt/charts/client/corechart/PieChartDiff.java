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
 * Options for Pie Diff charts.
 */
public abstract class PieChartDiff extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static PieChartDiff create() {
		return createObject().cast();
	}

	protected PieChartDiff() {
	}

	/**
	 * Change the border size of inner circle.
	 * 
	 * @param borderFactor a value from 0.0 to 1.0
	 */
	public final native void setBorderFactor(double borderFactor) /*-{
		if (!this.innerCircle) {
			this.innerCircle = {};
		}
		this.innerCircle.borderFactor = borderFactor;
	}-*/;

	/**
	 * If true, inverts the behavior so that the oldest data surrounds the newest data.
	 * 
	 * @param inCenter
	 */
	public final native void setInCenter(boolean inCenter) /*-{
		if (!this.oldData) {
			this.oldData = {};
		}
		this.oldData.inCenter = inCenter;
	}-*/;

	/**
	 * Change the opacity of the newest data.
	 * 
	 * @param opacity a value from 0.0 (fully transparent) to 1.0 (fully opaque)
	 */
	public final native void setNewDataOpacity(double opacity) /*-{
		if (!this.newData) {
			this.newData = {};
		}
		this.newData.opacity = opacity;
	}-*/;

	/**
	 * Change the opacity of the oldest data.
	 * 
	 * @param opacity a value from 0.0 (fully transparent) to 1.0 (fully opaque)
	 */
	public final native void setOldDataOpacity(double opacity) /*-{
		if (!this.oldData) {
			this.oldData = {};
		}
		this.oldData.opacity = opacity;
	}-*/;

	/**
	 * Change the size of inner circle.
	 * 
	 * @param radiusFactor a value from 0.0 to 1.0
	 */
	public final native void setRadiusFactor(double radiusFactor) /*-{
		if (!this.innerCircle) {
			this.innerCircle = {};
		}
		this.innerCircle.radiusFactor = radiusFactor;
	}-*/;

}
