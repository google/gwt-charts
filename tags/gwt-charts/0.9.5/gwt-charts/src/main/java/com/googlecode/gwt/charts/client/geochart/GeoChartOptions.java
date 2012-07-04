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
package com.googlecode.gwt.charts.client.geochart;

import com.googlecode.gwt.charts.client.options.BackgroundColor;
import com.googlecode.gwt.charts.client.options.DisplayMode;
import com.googlecode.gwt.charts.client.options.Options;
import com.googlecode.gwt.charts.client.options.Resolution;
import com.googlecode.gwt.charts.client.options.SizeAxis;

public class GeoChartOptions extends Options {
	public static GeoChartOptions create() {
		return createObject().cast();
	}

	protected GeoChartOptions() {
	}

	public final native void setBackgroundColor(BackgroundColor backgroundColor) /*-{
		this.backgroundColor = backgroundColor;
	}-*/;

	public final native void setBackgroundColor(String backgroundColor) /*-{
		this.backgroundColor = backgroundColor;
	}-*/;

	public final native void setColorAxis(GeoChartColorAxis colorAxis) /*-{
		this.colorAxis = colorAxis;
	}-*/;

	public final native void setDatalessRegionColor(String datalessRegionColor) /*-{
		this.datalessRegionColor = datalessRegionColor;
	}-*/;

	public final void setDisplayMode(DisplayMode displayMode) {
		setDisplayMode(displayMode.getName());
	}

	public final native void setEnableRegionInteractivity(boolean enableRegionInteractivity) /*-{
		this.enableRegionInteractivity = enableRegionInteractivity;
	}-*/;

	public final native void setKeepAspectRatio(boolean keepAspectRatio) /*-{
		this.keepAspectRatio = keepAspectRatio;
	}-*/;

	public final native void setLegend(GeoChartLegend legend) /*-{
		this.legend = legend;
	}-*/;

	public final native void setMagnifyingGlass(MagnifyingGlass magnifyingGlass) /*-{
		this.magnifyingGlass = magnifyingGlass;
	}-*/;

	public final native void setMarkerOpacity(double markerOpacity) /*-{
		this.markerOpacity = markerOpacity;
	}-*/;

	public final native void setRegion(String region) /*-{
		this.region = region;
	}-*/;

	public final void setResolution(Resolution resolution) {
		setResolution(resolution.getName());
	}

	public final native void setResolution(String resolution) /*-{
		this.resolution = resolution;
	}-*/;

	public final native void setSizeAxis(SizeAxis sizeAxis) /*-{
		this.sizeAxis = sizeAxis;
	}-*/;

	public final native void setTooltip(GeoChartTooltip tooltip) /*-{
		this.tooltip = tooltip;
	}-*/;

	private final native void setDisplayMode(String displayMode) /*-{
		this.displayMode = displayMode;
	}-*/;

}
