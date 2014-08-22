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
package com.googlecode.gwt.charts.client.annotationchart;

import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.core.client.JsDate;

import com.googlecode.gwt.charts.client.options.ColoredLegendPosition;
import com.googlecode.gwt.charts.client.options.Options;
import com.googlecode.gwt.charts.client.options.ScaleType;
import com.googlecode.gwt.charts.client.util.ArrayHelper;
import com.googlecode.gwt.charts.client.util.DateHelper;

import java.util.Date;

/**
 * Configuration options for {@link AnnotationChart}.
 */
public class AnnotationChartOptions extends Options {
	public static AnnotationChartOptions create() {
		return createObject().cast();
	}

	protected AnnotationChartOptions() {
	}

	/**
	 * If set to true, any annotation text that includes HTML tags will be rendered as HTML.
	 * 
	 * @param allowHtml
	 */
	public final native void setAllowHtml(boolean allowHtml) /*-{
		this.allowHtml = allowHtml;
	}-*/;

	/**
	 * A suffix to be added to all values in the legend and tick labels in the vertical axes.
	 * 
	 * @param allValuesSuffix
	 */
	public final native void setAllValuesSuffix(String allValuesSuffix) /*-{
		this.allValuesSuffix = allValuesSuffix;
	}-*/;

	/**
	 * The width (in percent) of the annotations area, out of the entire chart area.
	 * 
	 * @param annotationsWidth must be a number in the range 5-80.
	 */
	public final native void setAnnotationsWidth(double annotationsWidth) /*-{
		this.annotationsWidth = annotationsWidth;
	}-*/;

	/**
	 * The colors to use for the chart lines and labels.
	 * 
	 * @param colors an array where each element is a string in a valid HTML color format.
	 */
	public final void setColors(String... colors) {
		setColors(ArrayHelper.createArray(colors));
	}

	/**
	 * The format used to display the date information in the top right corner.
	 * 
	 * @see <a href="http://icu-project.org/apiref/icu4j/com/ibm/icu/text/SimpleDateFormat.html">java SimpleDateFormat
	 *      class</a>
	 * @param dateFormat
	 */
	public final native void setDateFormat(String dateFormat) /*-{
		this.dateFormat = dateFormat;
	}-*/;

	/**
	 * If set to true, the chart will show annotations on top of selected values. When this option is set to true, after
	 * every numeric column, two optional annotation string columns can be added, one for the annotation title and one
	 * for the annotation text.
	 * 
	 * @param displayAnnotations default is false
	 */
	public final native void setDisplayAnnotations(boolean displayAnnotations) /*-{
		this.displayAnnotations = displayAnnotations;
	}-*/;

	/**
	 * If set to true, the chart will display a filter contol to filter annotations. Use this option when there are many
	 * annotations.
	 * 
	 * @param displayAnnotationsFilter default is false
	 */
	public final native void setDisplayAnnotationsFilter(boolean displayAnnotationsFilter) /*-{
		this.displayAnnotationsFilter = displayAnnotationsFilter;
	}-*/;

	/**
	 * Whether to display a small bar separator ( | ) between the series values and the date in the legend, where true
	 * means yes.
	 * 
	 * @param displayDateBarSeparator default is true
	 */
	public final native void setDisplayDateBarSeparator(boolean displayDateBarSeparator) /*-{
		this.displayDateBarSeparator = displayDateBarSeparator;
	}-*/;

	/**
	 * Whether to display a shortened, rounded version of the values on the top of the graph, to save space; false
	 * indicates that it may. For example, if set to false, 56123.45 might be displayed as 56.12k.
	 * 
	 * @param displayExactValues default is false
	 */
	public final native void setDisplayExactValues(boolean displayExactValues) /*-{
		this.displayExactValues = displayExactValues;
	}-*/;

	/**
	 * Whether to display dots next to the values in the legend text, where true means yes.
	 * 
	 * @param displayLegendDots default is true
	 */
	public final native void setDisplayLegendDots(boolean displayLegendDots) /*-{
		this.displayLegendDots = displayLegendDots;
	}-*/;

	/**
	 * Whether to display the highlighted values in the legend, where true means yes.
	 * 
	 * @param displayLegendValues default is true
	 */
	public final native void setDisplayLegendValues(boolean displayLegendValues) /*-{
		this.displayLegendValues = displayLegendValues;
	}-*/;

	/**
	 * Whether to show the zoom range selection area (the area at the bottom of the chart), where false means no.
	 * 
	 * The outline in the zoom selector is a log scale version of the first series in the chart, scaled to fit the
	 * height of the zoom selector.
	 * 
	 * @param displayRangeSelector default is true
	 */
	public final native void setDisplayRangeSelector(boolean displayRangeSelector) /*-{
		this.displayRangeSelector = displayRangeSelector;
	}-*/;

	/**
	 * Whether to show the zoom buttons ("1d 5d 1m" and so on), where false means no.
	 * 
	 * @param displayZoomButtons default is true
	 */
	public final native void setDisplayZoomButtons(boolean displayZoomButtons) /*-{
		this.displayZoomButtons = displayZoomButtons;
	}-*/;

	/**
	 * A number from 0—100 (inclusive) specifying the alpha of the fill below each line in the line graph. 100 means
	 * 100% opaque, and 0 means no fill at all. The fill color is the same color as the line above it.
	 * 
	 * @param fill default is 0
	 */
	public final native void setFill(int fill) /*-{
		this.fill = fill;
	}-*/;

	/**
	 * Defines where to put the colored legend
	 * 
	 * @param legendPosition
	 */
	public final void setLegendPosition(ColoredLegendPosition legendPosition) {
		setLegendPosition(legendPosition.getName());
	}

	/**
	 * The maximum value to show on the Y axis. If the maximum data point exceeds this value, this setting will be
	 * ignored, and the chart will be adjusted to show the next major tick mark above the maximum data point. This will
	 * take precedence over the Y axis maximum determined by scaleType.
	 * This is similar to maxValue in core charts.
	 * 
	 * @param max
	 */
	public final native void setMax(double max) /*-{
		this.max = max;
	}-*/;

	/**
	 * The minimum value to show on the Y axis. If the minimum data point is less than this value, this setting will be
	 * ignored, and the chart will be adjusted to show the next major tick mark below the minimum data point. This will
	 * take precedence over the Y axis minimum determined by scaleType.
	 * This is similar to minValue in core charts.
	 * 
	 * @param min
	 */
	public final native void setMin(double min) /*-{
		this.min = min;
	}-*/;

	/**
	 * Specifies the number format pattern to be used to format the values at the top of the graph.<br>
	 * If this option is specified, the displayExactValues option is ignored.
	 * 
	 * @see <a href="http://icu-project.org/apiref/icu4j/com/ibm/icu/text/DecimalFormat.html">java DecimalFormat
	 *      class</a>
	 * @param numberFormat
	 */
	public final native void setNumberFormat(String numberFormat) /*-{
		this.numberFormats = numberFormat;
	}-*/;

	/**
	 * Specifies the number format patterns to be used to format the values at the top of the graph.
	 * The keys are (zero-based) indexes of series, and the values are the patterns to be used to format the specified
	 * series.<br>
	 * You are not required to include a format for every series on the chart; any unspecified series will use the
	 * default format.<br>
	 * If this option is specified, the displayExactValues option is ignored.
	 * 
	 * @see <a href="http://icu-project.org/apiref/icu4j/com/ibm/icu/text/DecimalFormat.html">java DecimalFormat
	 *      class</a>
	 * @param index
	 * @param numberFormat
	 */
	public final native void setNumberFormat(int index, String numberFormat) /*-{
		if (!this.numberFormats) {
			this.numberFormats = {};
		}
		this.numberFormats[index] = numberFormat;
	}-*/;

	/**
	 * Specifies which values to show on the Y axis tick marks in the graph. The default is to have a single scale on
	 * the right side, which applies to both series; but you can have different sides of the graph scaled to different
	 * series values.<br>
	 * 
	 * This option takes an array of zero to three numbers specifying the (zero-based) index of the series to use as the
	 * scale value. Where these values are shown depends on how many values you include in your array:
	 * <ul>
	 * <li>If you specify an empty array, the chart will not show Y values next to the tick marks.</li>
	 * <li>If you specify one value, the scale of the indicated series will be displayed on the right side of the chart
	 * only.</li>
	 * <li>If you specify two values, a the scale for the second series will be added to the right of the chart.</li>
	 * <li>If you specify three values, a scale for the third series will be added to the middle of the chart.</li>
	 * <li>Any values after the third in the array will be ignored.</li>
	 * </ul>
	 * When displaying more than one scale, it is advisable to set the scaleType option to either 'allfixed' or
	 * 'allmaximized'.
	 * 
	 * @param scaleColumns
	 */
	public final void setScaleColumns(int... scaleColumns) {
		this.setScaleColumns(ArrayHelper.createArray(scaleColumns));
	}

	/**
	 * Number format to be used for the axis tick labels.
	 * 
	 * @see <a href="http://icu-project.org/apiref/icu4j/com/ibm/icu/text/DecimalFormat.html">java DecimalFormat
	 *      class</a>
	 * @param scaleFormat default is "#" and displays as an integer.
	 */
	public final native void setScaleFormat(String scaleFormat) /*-{
		this.scaleFormat = scaleFormat;
	}-*/;

	/**
	 * Sets the maximum and minimum values shown on the Y axis.
	 * 
	 * @param scaleType default is {@link ScaleType#FIXED}
	 */
	public final void setScaleType(ScaleType scaleType) {
		setScaleType(scaleType.getName());
	}

	/**
	 * A number from 0—10 (inclusive) specifying the thickness of the lines, where 0 is the thinnest.
	 * 
	 * @param thickness default is 0
	 */
	public final native void setThickness(int thickness) /*-{
		this.thickness = thickness;
	}-*/;

	/**
	 * Sets the end date/time of the selected zoom range.
	 * 
	 * @param zoomEndTime
	 */
	public final void setZoomEndTime(Date zoomEndTime) {
		setZoomEndTime(DateHelper.getJsDate(zoomEndTime));
	}

	/**
	 * Sets the start date/time of the selected zoom range.
	 * 
	 * @param zoomStartTime
	 */
	public final void setZoomStartTime(Date zoomStartTime) {
		setZoomStartTime(DateHelper.getJsDate(zoomStartTime));
	}

	private final native void setColors(JsArrayString colors) /*-{
		this.colors = colors;
	}-*/;

	private final native void setLegendPosition(String legendPosition) /*-{
		this.legendPosition = legendPosition;
	}-*/;

	private final native void setScaleColumns(JsArrayInteger scaleColumns) /*-{
		this.scaleColumns = scaleColumns;
	}-*/;

	private final native void setScaleType(String scaleType) /*-{
		this.scaleType = scaleType;
	}-*/;

	private final native void setZoomEndTime(JsDate zoomEndTime) /*-{
		this.zoomEndTime = zoomEndTime;
	}-*/;

	private final native void setZoomStartTime(JsDate zoomStartTime) /*-{
		this.zoomStartTime = zoomStartTime;
	}-*/;
}
