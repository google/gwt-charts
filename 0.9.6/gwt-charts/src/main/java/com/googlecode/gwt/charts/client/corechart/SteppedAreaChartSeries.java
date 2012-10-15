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

public class SteppedAreaChartSeries extends JavaScriptObject {
	/**
	 * Default constructor
	 * 
	 * @return a new object instance
	 */
	public static SteppedAreaChartSeries create() {
		return createObject().cast();
	}

	protected SteppedAreaChartSeries() {
	}

	/**
	 * Overrides the global areaOpacity for this series.
	 * 
	 * @param opacity a value from 0.0 (fully transparent) to 1.0 (fully opaque)
	 */
	public final native void setAreaOpacity(double opacity) /*-{
		this.areaOpacity = opacity;
	}-*/;

	/**
	 * The color to use for this series.
	 * 
	 * @param color a valid HTML color string
	 */
	public final native void setColor(String color) /*-{
		this.color = color;
	}-*/;

	/**
	 * Which axis to assign this series to, where 0 is the default axis, and 1 is the opposite axis. Default value is 0;
	 * set to 1 to define a chart where different series are rendered against different axes. At least one series much
	 * be allocated to the default axis. You can define a different scale for different axes.
	 * 
	 * @param index the axis index for this series
	 */
	public final native void setTargetAxisIndex(int index) /*-{
		this.targetAxisIndex = index;
	}-*/;

	/**
	 * Defines if this series should have a legend entry.
	 * 
	 * @param visibleInLegend true if visible, false if not
	 */
	public final native void setVisibleInLegend(boolean visibleInLegend) /*-{
		this.visibleInLegend = visibleInLegend;
	}-*/;
}
