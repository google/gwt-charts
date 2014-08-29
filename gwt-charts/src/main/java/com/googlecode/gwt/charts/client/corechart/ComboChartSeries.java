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
import com.google.gwt.core.client.JsArrayInteger;

import com.googlecode.gwt.charts.client.options.Annotations;
import com.googlecode.gwt.charts.client.options.BackgroundColor;
import com.googlecode.gwt.charts.client.options.CurveType;
import com.googlecode.gwt.charts.client.options.PointShape;
import com.googlecode.gwt.charts.client.options.PointShapeType;
import com.googlecode.gwt.charts.client.options.SeriesType;
import com.googlecode.gwt.charts.client.util.ArrayHelper;

/**
 * Describes the format of a series in the chart.
 */
public class ComboChartSeries extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static ComboChartSeries create() {
		return createObject().cast();
	}

	protected ComboChartSeries() {
	}

	/**
	 * Sets annotation display settings.
	 * 
	 * @param annotations
	 */
	public final native void setAnnotations(Annotations annotations) /*-{
		this.annotations = annotations;
	}-*/;

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
	 * Overrides the global curveType value for this series.
	 * 
	 * @param curveType the line curve type
	 */
	public final void setCurveType(CurveType curveType) {
		setCurveType(curveType.getName());
	}

	/**
	 * Sets the colors applied to falling candles.
	 * 
	 * @param fallingColor falling candles color settings
	 */
	public final native void setFallingColor(BackgroundColor fallingColor) /*-{
		this.fallingColor = fallingColor;
	}-*/;

	/**
	 * Sets the style of dashed lines.<br>
	 * The first number indicates the length of a dash, and the second indicates the gap after it. If there is a third
	 * number, that's the length of the next dash, and a fourth number, if present, is the length of the next gap.
	 * 
	 * @param lineDashStyle
	 */
	public final void setLineDashStyle(int... lineDashStyle) {
		setLineDashStyle(ArrayHelper.createArray(lineDashStyle));
	}

	/**
	 * Overrides the global lineWidth value for this series.
	 * 
	 * @param width line width in pixels
	 */
	public final native void setLineWidth(int width) /*-{
		this.lineWidth = width;
	}-*/;

	/**
	 * Sets the shape of individual data elements.
	 * 
	 * @param pointShape
	 */
	public final native void setPointShape(PointShape pointShape) /*-{
		this.pointShape = pointShape;
	}-*/;

	/**
	 * Sets the shape of individual data elements.
	 * 
	 * @param pointShape
	 */
	public final native void setPointShape(PointShapeType pointShape) /*-{
		this.pointShape = pointShape;
	}-*/;

	/**
	 * Overrides the global pointSize value for this series.
	 * 
	 * @param size diameter of displayed points in pixels
	 */
	public final native void setPointSize(int size) /*-{
		this.pointSize = size;
	}-*/;

	/**
	 * Sets the colors applied to rising candles.
	 * 
	 * @param risingColor rising candles color settings
	 */
	public final native void setRisingColor(BackgroundColor risingColor) /*-{
		this.risingColor = risingColor;
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
	 * Overrides the global seriesType value for this series.
	 * 
	 * @param type the series type
	 */
	public final void setType(SeriesType type) {
		setType(type.getName());
	}

	/**
	 * Defines if this series should have a legend entry.
	 * 
	 * @param visibleInLegend true if visible, false if not
	 */
	public final native void setVisibleInLegend(boolean visibleInLegend) /*-{
		this.visibleInLegend = visibleInLegend;
	}-*/;

	private final native void setCurveType(String curveType) /*-{
		this.curveType = curveType;
	}-*/;

	private final native void setLineDashStyle(JsArrayInteger lineDashStyle) /*-{
		this.lineDashStyle = lineDashStyle;
	}-*/;

	private final native void setType(String type) /*-{
		this.type = type;
	}-*/;
}
