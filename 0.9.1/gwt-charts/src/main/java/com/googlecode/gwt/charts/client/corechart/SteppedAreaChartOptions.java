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

import com.google.gwt.core.client.JsArray;

import com.googlecode.gwt.charts.client.options.CoreOptions;
import com.googlecode.gwt.charts.client.options.FocusTarget;
import com.googlecode.gwt.charts.client.options.VAxis;

public class SteppedAreaChartOptions extends CoreOptions {
	public static SteppedAreaChartOptions create() {
		return createObject().cast();
	}

	protected SteppedAreaChartOptions() {
	}

	/**
	 * Sets the default opacity of the colored area under an area chart series. To specify opacity for an individual
	 * series, set the areaOpacity with {@link #setSeries(JsArray)}.
	 * @param areaOpacity a value from 0.0 (fully transparent) to 1.0 (fully opaque)
	 */
	public final native void setAreaOpacity(double areaOpacity) /*-{
		this.areaOpacity = areaOpacity;
	}-*/;

	public final native void setConnectSteps(boolean connectSteps) /*-{
		this.connectSteps = connectSteps;
	}-*/;

	public final void setFocusTarget(FocusTarget focusTarget) {
		setFocusTarget(focusTarget);
	}

	public final native void setIsStacked(boolean isStacked) /*-{
		this.isStacked = isStacked;
	}-*/;

	public final native void setReverseCategories(boolean reverseCategories) /*-{
		this.reverseCategories = reverseCategories;
	}-*/;

	public final native void setSeries(JsArray<SteppedAreaChartSeries> series) /*-{
		this.series = series;
	}-*/;

	/**
	 * Specifies properties for individual vertical axes, if the chart has multiple vertical axes. Each child object is
	 * a vAxis object, and can contain all the properties supported by vAxis. These property values override any global
	 * settings for the same property. To specify a chart with multiple vertical axes, first define a new axis using
	 * series.targetAxisIndex, then configure the axis using vAxes.
	 * @param vAxes
	 */
	public final native void setVAxes(JsArray<VAxis> vAxes) /*-{
		this.vAxes = vAxes;
	}-*/;

	private final native void setFocusTarget(String focusTarget) /*-{
		this.focusTarget = focusTarget;
	}-*/;

}
