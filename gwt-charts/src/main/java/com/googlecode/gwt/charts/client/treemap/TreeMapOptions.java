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
package com.googlecode.gwt.charts.client.treemap;

import com.googlecode.gwt.charts.client.options.Options;
import com.googlecode.gwt.charts.client.options.TextStyle;

/**
 * Configuration options for {@link TreeMap}.
 * 
 * @see <a href="https://developers.google.com/chart/interactive/docs/gallery/treemap#Configuration_Options">Tree map
 *      Configuration Options</a>
 */
public class TreeMapOptions extends Options {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static TreeMapOptions create() {
		return createObject().cast();
	}

	protected TreeMapOptions() {
	}

	/**
	 * Sets the text color. Specify an HTML color value.
	 * 
	 * @param fontColor
	 */
	public final native void setFontColor(String fontColor) /*-{
		this.fontColor = fontColor;
	}-*/;

	/**
	 * Sets the font family to use for all text.
	 * 
	 * @param fontFamily
	 */
	public final native void setFontFamily(String fontFamily) /*-{
		this.fontFamily = fontFamily;
	}-*/;

	/**
	 * Sets the font size for all text, in points.
	 * 
	 * @param fontSize default is 12
	 */
	public final native void setFontSize(int fontSize) /*-{
		this.fontSize = fontSize;
	}-*/;

	/**
	 * Draws the chart inside an inline frame. (Note that on IE8, this option is ignored; all IE8 charts are drawn in
	 * i-frames.)
	 * 
	 * @param forceIFrame true for drawing inside an inline frame
	 */
	public final native void setForceIFrame(boolean forceIFrame) /*-{
		this.forceIFrame = forceIFrame;
	}-*/;

	/**
	 * Sets the color of the header section for each node. Specify an HTML color value.
	 * 
	 * @param headerColor default is #988f86
	 */
	public final native void setHeaderColor(String headerColor) /*-{
		this.headerColor = headerColor;
	}-*/;

	/**
	 * Sets the height of the header section for each node, in pixels (can be zero).
	 * 
	 * @param headerHeight
	 */
	public final native void setHeaderHeight(int headerHeight) /*-{
		this.headerHeight = headerHeight;
	}-*/;

	/**
	 * Sets the color of the header of a node being hovered over. Specify an HTML color value or null; if null this
	 * value will be headerColor lightened by 35%.
	 * 
	 * @param headerHighlightColor
	 */
	public final native void setHeaderHighlightColor(String headerHighlightColor) /*-{
		this.headerHighlightColor = headerHighlightColor;
	}-*/;

	/**
	 * When maxPostDepth is greater than 1, causing nodes below the current depth to be shown, hintOpacity specifies how
	 * transparent it should be. It should be between 0 and 1; the higher the value, the fainter the node.
	 * 
	 * @param hintOpacity a value from 0.0 (fully transparent) to 1.0 (fully opaque)
	 */
	public final native void setHintOpacity(double hintOpacity) /*-{
		this.hintOpacity = hintOpacity;
	}-*/;

	/**
	 * Sets The color for a rectangle with a column 3 value of maxColorValue. Specify an HTML color value.
	 * 
	 * @param maxColor default is #00dd00
	 */
	public final native void setMaxColor(String maxColor) /*-{
		this.maxColor = maxColor;
	}-*/;

	/**
	 * Sets the maximum value allowed in column 3. All values greater than this will be trimmed to this value. If set to
	 * null, it will be set to the max value in the column.
	 * 
	 * @param maxColorValue
	 */
	public final native void setMaxColorValue(double maxColorValue) /*-{
		this.maxColorValue = maxColorValue;
	}-*/;

	/**
	 * Sets the maximum number of node levels to show in the current view. Levels will be flattened into the current
	 * plane. If your tree has more levels than this, you will have to go up or down to see them. You can additionally
	 * see maxPostDepth levels below this as shaded rectangles within these nodes.
	 * 
	 * @param maxDepth default is 1
	 */
	public final native void setMaxDepth(int maxDepth) /*-{
		this.maxDepth = maxDepth;
	}-*/;

	/**
	 * Sets the highlight color to use for the node with the largest value in column 3. Specify an HTML color value or
	 * null;
	 * If null, this value will be the value of maxColor lightened by 35%
	 * 
	 * @param maxHighlightColor
	 */
	public final native void setMaxHighlightColor(String maxHighlightColor) /*-{
		this.maxHighlightColor = maxHighlightColor;
	}-*/;

	/**
	 * Sets how many levels of nodes beyond maxDepth to show in "hinted" fashion. Hinted nodes are shown as shaded
	 * rectangles within a node that is within the maxDepth limit.
	 * 
	 * @param maxPostDepth
	 */
	public final native void setMaxPostDepth(String maxPostDepth) /*-{
		this.maxPostDepth = maxPostDepth;
	}-*/;

	/**
	 * Sets the color for a rectangle with a column 3 value midway between maxColorValue and minColorValue. Specify an
	 * HTML color value.
	 * 
	 * @param midColor
	 */
	public final native void setMidColor(String midColor) /*-{
		this.midColor = midColor;
	}-*/;

	/**
	 * Sets the highlight color to use for the node with a column 3 value near the median of minColorValue and
	 * maxColorValue. Specify an HTML color value or null; if null, this value will be the value of midColor lightened
	 * by 35%.
	 * 
	 * @param midHighlightColor
	 */
	public final native void setMidHighlightColor(String midHighlightColor) /*-{
		this.midHighlightColor = midHighlightColor;
	}-*/;

	/**
	 * Sets the color for a rectangle with the column 3 value of minColorValue. Specify an HTML color value.
	 * 
	 * @param minColor
	 */
	public final native void setMinColor(String minColor) /*-{
		this.minColor = minColor;
	}-*/;

	/**
	 * Sets the minimum value allowed in column 3. All values less than this will be trimmed to this value. If set to
	 * null,
	 * it will be calculated as the minimum value in the column.
	 * 
	 * @param minColorValue
	 */
	public final native void setMinColorValue(double minColorValue) /*-{
		this.minColorValue = minColorValue;
	}-*/;

	/**
	 * Sets the highlight color to use for the node with a column 3 value nearest to minColorValue. Specify an HTML
	 * color value or null; if null, this value will be the value of minColor lightened by 35%
	 * 
	 * @param minHighlightColor
	 */
	public final native void setMinHighlightColor(String minHighlightColor) /*-{
		this.minHighlightColor = minHighlightColor;
	}-*/;

	/**
	 * Sets the color to use for a rectangle when a node has no value for column 3, and that node is a leaf (or contains
	 * only leaves). Specify an HTML color value.
	 * 
	 * @param noColor
	 */
	public final native void setNoColor(String noColor) /*-{
		this.noColor = noColor;
	}-*/;

	/**
	 * Sets the color to use for a rectangle of "no" color when highlighted. Specify an HTML color value or null; if
	 * null,
	 * this will be the value of noColor lightened by 35%.
	 * 
	 * @param noHighlightColor
	 */
	public final native void setNoHighlightColor(String noHighlightColor) /*-{
		this.noHighlightColor = noHighlightColor;
	}-*/;

	/**
	 * Whether or not to show a color gradient scale from minColor to maxColor along the top of the chart. Specify true
	 * to show the scale.
	 * 
	 * @param showScale
	 */
	public final native void setShowScale(boolean showScale) /*-{
		this.showScale = showScale;
	}-*/;

	/**
	 * Whether to show tooltips.
	 * 
	 * @param showTooltips
	 */
	public final native void setShowTooltips(boolean showTooltips) /*-{
		this.showTooltips = showTooltips;
	}-*/;

	/**
	 * Specifies the text style, for certain charts that have text in the content area such as the treemap.
	 * 
	 * @param textStyle
	 */
	public final native void setTextStyle(TextStyle textStyle) /*-{
		this.textStyle = textStyle;
	}-*/;

	/**
	 * Text to display above the chart.
	 * 
	 * @param title
	 */
	public final native void setTitle(String title) /*-{
		this.title = title;
	}-*/;

	/**
	 * An object that specifies the title text style.
	 * 
	 * @param titleTextStyle
	 */
	public final native void setTitleTextStyle(TextStyle titleTextStyle) /*-{
		this.titleTextStyle = titleTextStyle;
	}-*/;

	/**
	 * Whether to use weighted averages for aggregation.
	 * 
	 * @param useWeightedAverageForAggregation default is false
	 */
	public final native void setUseWeightedAverageForAggregation(boolean useWeightedAverageForAggregation) /*-{
		this.useWeightedAverageForAggregation = useWeightedAverageForAggregation;
	}-*/;
}
