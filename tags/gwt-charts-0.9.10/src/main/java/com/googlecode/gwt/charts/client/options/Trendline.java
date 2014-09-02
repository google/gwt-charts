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
package com.googlecode.gwt.charts.client.options;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Trendline behavior settings.
 * 
 * @see <a href="https://developers.google.com/chart/interactive/docs/gallery/trendlines">Trendlines</a>
 */
public class Trendline extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static Trendline create() {
		return createObject().cast();
	}

	protected Trendline() {
	}

	/**
	 * Sets the color to use for this trendline.
	 * 
	 * @param color a valid HTML color string
	 */
	public final native void setColor(String color) /*-{
		this.color = color;
	}-*/;

	/**
	 * Defines the degree for this trendline.
	 * 
	 * @param degree a value
	 */
	public final native void setDegree(int degree) /*-{
		this.degree = degree;
	}-*/;

	/**
	 * Changes the default legend label for this trendline.
	 * 
	 * @param labelInLegend text label
	 */
	public final native void setLabelInLegend(String labelInLegend) /*-{
		this.labelInLegend = labelInLegend;
	}-*/;

	/**
	 * Sets the lineWidth value for this trendline.
	 * 
	 * @param lineWidth line width in pixels
	 */
	public final native void setLineWidth(int lineWidth) /*-{
		this.lineWidth = lineWidth;
	}-*/;

	/**
	 * Sets the opacity for this trendline.
	 * 
	 * @param opacity a value from 0.0 (fully transparent) to 1.0 (fully opaque)
	 */
	public final native void setOpacity(double opacity) /*-{
		this.opacity = opacity;
	}-*/;

	/**
	 * Sets the point size for this trendline.
	 * 
	 * @param pointSize diameter of displayed points in pixels
	 */
	public final native void setPointSize(int pointSize) /*-{
		this.pointSize = pointSize;
	}-*/;

	/**
	 * Sets this trendline type.
	 * 
	 * @param trendlineType a trendline type
	 */
	public final void setType(TrendlineType trendlineType) {
		setType(trendlineType.getName());
	}

	/**
	 * Defines if this series should have a legend entry.
	 * 
	 * @param visibleInLegend true if visible, false if not
	 */
	public final native void setVisibleInLegend(boolean visibleInLegend) /*-{
		this.visibleInLegend = visibleInLegend;
	}-*/;

	private final native void setType(String type) /*-{
		this.type = type;
	}-*/;
}
