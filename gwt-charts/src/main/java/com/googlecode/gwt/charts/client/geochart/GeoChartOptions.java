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

/**
 * Configuration options for {@link GeoChart}.
 * 
 * @see <a href="https://developers.google.com/chart/interactive/docs/gallery/geochart#Configuration_Options">Geo Chart
 *      Configuration Options</a>
 */
public class GeoChartOptions extends Options {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static GeoChartOptions create() {
		return createObject().cast();
	}

	protected GeoChartOptions() {
	}

	/**
	 * Hides the legend.
	 */
	public final native void hideLegend() /*-{
		this.legend = "none";
	}-*/;

	/**
	 * The background color for the main area of the chart.
	 * 
	 * @param backgroundColor
	 */
	public final native void setBackgroundColor(BackgroundColor backgroundColor) /*-{
		this.backgroundColor = backgroundColor;
	}-*/;

	/**
	 * The background color for the main area of the chart.
	 * 
	 * @param backgroundColor an HTML color string
	 */
	public final native void setBackgroundColor(String backgroundColor) /*-{
		this.backgroundColor = backgroundColor;
	}-*/;

	/**
	 * 
	 * @param colorAxis
	 */
	public final native void setColorAxis(GeoChartColorAxis colorAxis) /*-{
		this.colorAxis = colorAxis;
	}-*/;

	/**
	 * Colors to assign to regions with no associated data.
	 * 
	 * @param datalessRegionColor
	 */
	public final native void setDatalessRegionColor(String datalessRegionColor) /*-{
		this.datalessRegionColor = datalessRegionColor;
	}-*/;

	/**
	 * Which type of geochart this is. The DataTable format must match the value specified.
	 * 
	 * @param displayMode
	 */
	public final void setDisplayMode(DisplayMode displayMode) {
		setDisplayMode(displayMode.getName());
	}

	/**
	 * If true, enable region interactivity, including focus and tool-tip elaboration on mouse hover, and region
	 * selection and firing of regionClick and select events on mouse click.<br>
	 * 
	 * The default is true in region mode, and false in marker mode.
	 * 
	 * @param enableRegionInteractivity
	 */
	public final native void setEnableRegionInteractivity(boolean enableRegionInteractivity) /*-{
		this.enableRegionInteractivity = enableRegionInteractivity;
	}-*/;

	/**
	 * If true, the geochart will be drawn at the largest size that can fit inside the chart area at its natural aspect
	 * ratio. If only one of the width and height options is specified, the other one will be calculated according to
	 * the aspect ratio.<br>
	 * 
	 * If false, the geochart will be stretched to the exact size of the chart as specified by the width and height
	 * options.
	 * 
	 * @param keepAspectRatio
	 */
	public final native void setKeepAspectRatio(boolean keepAspectRatio) /*-{
		this.keepAspectRatio = keepAspectRatio;
	}-*/;

	/**
	 * An object with members to configure various aspects of the legend, or 'none', if no legend should appear.
	 * 
	 * @param legend
	 */
	public final native void setLegend(GeoChartLegend legend) /*-{
		this.legend = legend;
	}-*/;

	/**
	 * Configure various aspects of the magnifying glass.
	 * 
	 * @param magnifyingGlass
	 */
	public final native void setMagnifyingGlass(MagnifyingGlass magnifyingGlass) /*-{
		this.magnifyingGlass = magnifyingGlass;
	}-*/;

	/**
	 * The opacity of the markers, where 0.0 is fully transparent and 1.0 is fully opaque.
	 * 
	 * @param markerOpacity
	 */
	public final native void setMarkerOpacity(double markerOpacity) /*-{
		this.markerOpacity = markerOpacity;
	}-*/;

	/**
	 * The area to display on the geochart. (Surrounding areas will be displayed as well.) Can be one of the following:
	 * <ul>
	 * <li>"world" - A geochart of the entire world.</li>
	 * <li>A continent or a sub-continent, specified by its <a
	 * href="https://developers.google.com/chart/interactive/docs/gallery/geochart#Continent_Hierarchy">3-digit
	 * code</a>, e.g., "011" for Western Africa.</li>
	 * <li>A country, specified by its <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>
	 * code, e.g., "AU" for Australia.</li>
	 * <li>A state in the United States, specified by its <a href="http://en.wikipedia.org/wiki/ISO_3166-2:US">ISO
	 * 3166-2:US</a> code, e.g., "US-AL" for Alabama. Note that the resolution option must be set to either PROVINCES or
	 * METROS.</li>
	 * 
	 * @param region
	 */
	public final native void setRegion(String region) /*-{
		this.region = region;
	}-*/;

	/**
	 * Sets the resolution of the geochart borders.
	 * 
	 * @param resolution
	 */
	public final void setResolution(Resolution resolution) {
		setResolution(resolution.getName());
	}

	/**
	 * An object with members to configure how values are associated with bubble size.
	 * 
	 * @param sizeAxis
	 */
	public final native void setSizeAxis(SizeAxis sizeAxis) /*-{
		this.sizeAxis = sizeAxis;
	}-*/;

	/**
	 * An object with members to configure various tooltip elements.
	 * 
	 * @param tooltip
	 */
	public final native void setTooltip(GeoChartTooltip tooltip) /*-{
		this.tooltip = tooltip;
	}-*/;

	private final native void setDisplayMode(String displayMode) /*-{
		this.displayMode = displayMode;
	}-*/;

	private final native void setResolution(String resolution) /*-{
		this.resolution = resolution;
	}-*/;

}
