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
import com.google.gwt.core.client.JsArrayInteger;

import com.googlecode.gwt.charts.client.options.AggregationTarget;
import com.googlecode.gwt.charts.client.options.Annotations;
import com.googlecode.gwt.charts.client.options.CoreOptions;
import com.googlecode.gwt.charts.client.options.Crosshair;
import com.googlecode.gwt.charts.client.options.CurveType;
import com.googlecode.gwt.charts.client.options.Explorer;
import com.googlecode.gwt.charts.client.options.PointShape;
import com.googlecode.gwt.charts.client.options.PointShapeType;
import com.googlecode.gwt.charts.client.options.Trendline;
import com.googlecode.gwt.charts.client.util.ArrayHelper;

/**
 * Configuration options for {@link ScatterChart}.
 */
public class ScatterChartOptions extends CoreOptions {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static ScatterChartOptions create() {
		return createObject().cast();
	}

	protected ScatterChartOptions() {
	}

	/**
	 * How multiple data selections are rolled up into tooltips:
	 * <ul>
	 * <li>'category': Group selected data by x-value.</li>
	 * <li>'series': Group selected data by series.</li>
	 * <li>'auto': Group selected data by x-value if all selections have the same x-value, and by series otherwise.</li>
	 * <li>'none': Show only one tooltip per selection.</li>
	 * </ul>
	 * aggregationTarget will often be used in tandem with selectionMode and tooltip.trigger, e.g.:
	 * 
	 * <pre>
	 * // Allow multiple simultaneous selections.
	 * options.setSelectionMode(SelectionMode.MULTIPLE);
	 * // Trigger tooltips on selections.
	 * Tooltip tooltip = Tooltip.create();
	 * tooltip.setTrigger(TooltipTrigger.SELECTION);
	 * options.setTooltip(tooltip);
	 * // Group selections by x-value.
	 * options.setAggregationTarget(AggregationTarget.CATEGORY);
	 * 
	 * </pre>
	 * 
	 * @param aggregationTarget
	 */
	public final native void setAggregationTarget(AggregationTarget aggregationTarget) /*-{
		this.aggregationTarget = aggregationTarget;
	}-*/;

	/**
	 * Sets annotation display settings.
	 * 
	 * @param annotations
	 */
	public final native void setAnnotations(Annotations annotations) /*-{
		this.annotations = annotations;
	}-*/;

	/**
	 * Sets the crosshair properties for the chart.
	 * 
	 * @param crosshair
	 */
	public final native void setCrosshair(Crosshair crosshair) /*-{
		this.crosshair = crosshair;
	}-*/;

	/**
	 * Controls the curve of the lines when the line width is not zero.
	 * 
	 * @param curveType the line curve type
	 */
	public final void setCurveType(CurveType curveType) {
		setCurveType(curveType.getName());
	}

	/**
	 * Sets the transparency of data points, with 1.0 being completely opaque and 0.0 fully transparent. In scatter,
	 * histogram, bar, and column charts, this refers to the visible data: dots in the scatter chart and rectangles in
	 * the others. In charts where selecting data creates a dot, such as the line and area charts, this refers to the
	 * circles that appear upon hover or selection. The combo chart exhibits both behaviors.
	 * 
	 * @param dataOpacity a value from 0.0 (fully transparent) to 1.0 (fully opaque)
	 */
	public final native void setDataOpacity(double dataOpacity) /*-{
		this.dataOpacity = dataOpacity;
	}-*/;

	/**
	 * Sets diff chart options.
	 * 
	 * @param diff
	 */
	public final native void setDiff(ScatterChartDiff diff) /*-{
		this.diff = diff;
	}-*/;

	/**
	 * Sets the explorer properties for the chart.
	 * 
	 * @param explorer
	 */
	public final native void setExplorer(Explorer explorer) /*-{
		this.explorer = explorer;
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
	 * Defines data line width in pixels. Use zero to hide all lines and show only the points. You can override values
	 * for individual series using {@link #setSeries(int, ScatterChartSeries)}.
	 * 
	 * @param lineWidth data line width in pixels
	 */
	public final native void setLineWidth(int lineWidth) /*-{
		this.lineWidth = lineWidth;
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
	 * Sets diameter of displayed points in pixels. Use zero to hide all points. You can override values for individual
	 * series using {@link #setSeries(int, ScatterChartSeries)}.
	 * 
	 * @param pointSize diameter of displayed points in pixels
	 */
	public final native void setPointSize(int pointSize) /*-{
		this.pointSize = pointSize;
	}-*/;

	/**
	 * Sets series options by index for describing the format of the corresponding series in the chart.
	 * 
	 * @param index the series index
	 * @param series an object definining the series format
	 */
	public final native void setSeries(int index, ScatterChartSeries series) /*-{
		if (!this.series) {
			this.series = {};
		}
		this.series[index] = series;
	}-*/;

	/**
	 * Sets series options with an array of objects, each describing the format of the corresponding series in the
	 * chart.
	 * 
	 * @param series an array of the corresponding series objects
	 */
	public final void setSeries(ScatterChartSeries... series) {
		setSeries(ArrayHelper.createArray(series));
	}

	/**
	 * Sets a trendline by index.
	 * 
	 * @param index the data index
	 * @param trendline an object definining the trendline format
	 */
	public final native void setTrendline(int index, Trendline trendline) /*-{
		if (!this.trendlines) {
			this.trendlines = {};
		}
		this.trendlines[index] = trendline;
	}-*/;

	private final native void setCurveType(String curveType) /*-{
		this.curveType = curveType;
	}-*/;

	private final native void setLineDashStyle(JsArrayInteger lineDashStyle) /*-{
		this.lineDashStyle = lineDashStyle;
	}-*/;

	private final native void setSeries(JsArray<ScatterChartSeries> series) /*-{
		this.series = series;
	}-*/;

}
