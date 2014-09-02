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
package com.googlecode.gwt.charts.client.map;

import com.googlecode.gwt.charts.client.options.MapType;
import com.googlecode.gwt.charts.client.options.Options;

/**
 * Configuration options for {@link Map}.
 * 
 * @see <a href="https://developers.google.com/chart/interactive/docs/gallery/map#Configuration_Options">Map
 *      Configuration Options</a>
 */
public class MapOptions extends Options {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static MapOptions create() {
		return createObject().cast();
	}

	protected MapOptions() {
	}

	/**
	 * If set to true, enables zooming in and out using the mouse scroll wheel.
	 * 
	 * @param enableScrollWheel
	 */
	public final native void setEnableScrollWheel(boolean enableScrollWheel) /*-{
		this.enableScrollWheel = enableScrollWheel;
	}-*/;

	/**
	 * If showLine is true, defines the line color. For example: '#800000'.
	 * 
	 * @param lineColor
	 */
	public final native void setLineColor(String lineColor) /*-{
		this.lineColor = lineColor;
	}-*/;

	/**
	 * If showLine is true, defines the line width (in pixels).
	 * 
	 * @param lineWidth
	 */
	public final native void setLineWidth(String lineWidth) /*-{
		this.lineWidth = lineWidth;
	}-*/;

	/**
	 * The type of map to show.
	 * 
	 * @param mapType
	 */
	public final void setMapType(MapType mapType) {
		setMapType(mapType.getName());
	}

	/**
	 * If set to true, shows a Google Maps polyline through all the points.
	 * 
	 * @param showLine
	 */
	public final native void setShowLine(boolean showLine) /*-{
		this.showLine = showLine;
	}-*/;

	/**
	 * If set to true, shows the location description as a tooltip when the mouse is positioned above a point marker.
	 * 
	 * @param showTip
	 */
	public final native void setShowTip(boolean showTip) /*-{
		this.showTip = showTip;
	}-*/;

	/**
	 * Show a map type selector that enables the viewer to switch between [map, satellite, hybrid, terrain]. When
	 * useMapTypeControl is false (default) no selector is presented and the type is determined by the mapType option.
	 * 
	 * @param useMapTypeControl
	 */
	public final native void setUseMapTypeControl(boolean useMapTypeControl) /*-{
		this.useMapTypeControl = useMapTypeControl;
	}-*/;

	/**
	 * An integer indicating the initial zoom level of the map.
	 * 
	 * @param zoomLevel 0 is completely zoomed out (whole world) and 19 is the maximum zoom level.
	 */
	public final native void setZoomLevel(int zoomLevel) /*-{
		this.zoomLevel = zoomLevel;
	}-*/;

	private final native void setMapType(String mapType) /*-{
		this.mapType = mapType;
	}-*/;
}
