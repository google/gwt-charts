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
import com.googlecode.gwt.charts.client.options.CurveType;
import com.googlecode.gwt.charts.client.options.FocusTarget;
import com.googlecode.gwt.charts.client.options.SeriesType;
import com.googlecode.gwt.charts.client.options.VAxis;

public class ComboChartOptions extends CoreOptions {
	public static ComboChartOptions create() {
		return createObject().cast();
	}

	protected ComboChartOptions() {
	}

	public final native void setAreaOpacity(double opacity) /*-{
		this.areaOpacity = opacity;
	}-*/;

	public final void setCurveType(CurveType curveType) {
		setCurveType(curveType.getName());
	}

	public final native void setCurveType(String curveType) /*-{
		this.curveType = curveType;
	}-*/;

	public final void setFocusTarget(FocusTarget focusTarget) {
		setFocusTarget(focusTarget);
	}

	public final native void setInterpolateNulls(boolean interpolateNulls) /*-{
		this.interpolateNulls = interpolateNulls;
	}-*/;

	public final native void setIsStacked(boolean isStacked) /*-{
		this.isStacked = isStacked;
	}-*/;

	public final native void setLineWidth(int width) /*-{
		this.lineWidth = width;
	}-*/;

	public final native void setPointSize(int size) /*-{
		this.pointSize = size;
	}-*/;

	public final native void setReverseCategories(boolean reverseCategories) /*-{
		this.reverseCategories = reverseCategories;
	}-*/;

	public final native void setSeries(JsArray<ComboChartSeries> series) /*-{
		this.series = series;
	}-*/;

	public final void setSeriesType(SeriesType seriesType) {
		setSeriesType(seriesType.getName());
	}

	public final native void setVAxes(JsArray<VAxis> vAxes) /*-{
		this.vAxes = vAxes;
	}-*/;

	private final native void setFocusTarget(String focusTarget) /*-{
		this.focusTarget = focusTarget;
	}-*/;

	private final native void setSeriesType(String seriesType) /*-{
		this.seriesType = seriesType;
	}-*/;

}
