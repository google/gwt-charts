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

import com.google.gwt.core.client.JsArrayString;

import com.googlecode.gwt.charts.client.util.ArrayHelper;

public abstract class CoreOptions extends Options {
	public static CoreOptions create() {
		return createObject().cast();
	}

	protected CoreOptions() {
	}

	public final native void setAnimation(Animation animation) /*-{
		this.animation = animation;
	}-*/;

	public final void setAxisTitlesPosition(AxisTitlesPosition axisTitlesPosition) {
		setAxisTitlesPosition(axisTitlesPosition.getName());
	}

	public final native void setBackgroundColor(BackgroundColor backgroundColor) /*-{
		this.backgroundColor = backgroundColor;
	}-*/;

	public final native void setBackgroundColor(String backgroundColor) /*-{
		this.backgroundColor = backgroundColor;
	}-*/;

	public final native void setChartArea(ChartArea chartArea) /*-{
		this.chartArea = chartArea;
	}-*/;

	public final void setColors(String... colors) {
		setColors(ArrayHelper.createArray(colors));
	}

	private final native void setColors(JsArrayString colors) /*-{
		this.colors = colors;
	}-*/;

	public final native void setEnableInteractivity(boolean enableInteractivity) /*-{
		this.enableInteractivity = enableInteractivity;
	}-*/;

	public final native void setFontName(String fontName) /*-{
		this.fontName = fontName;
	}-*/;

	public final native void setFontSize(double fontSize) /*-{
		this.fontSize = fontSize;
	}-*/;

	public final native void setHAxis(HAxis hAxis) /*-{
		this.hAxis = hAxis;
	}-*/;

	public final native void setLegend(Legend legend) /*-{
		this.legend = legend;
	}-*/;

	public final native void setTheme(String theme) /*-{
		this.theme = theme;
	}-*/;

	public final native void setTitle(String title) /*-{
		this.title = title;
	}-*/;

	public final void setTitlePosition(TitlePosition titlePosition) {
		setTitlePosition(titlePosition.getName());
	}

	public final native void setTitleTextStyle(TextStyle titleTextStyle) /*-{
		this.titleTextStyle = titleTextStyle;
	}-*/;

	public final native void setTooltip(Tooltip tooltip) /*-{
		this.tooltip = tooltip;
	}-*/;

	public final native void setVAxis(VAxis vAxis) /*-{
		this.vAxis = vAxis;
	}-*/;

	private final native void setAxisTitlesPosition(String axisTitlesPosition) /*-{
		this.axisTitlesPosition = axisTitlesPosition;
	}-*/;

	private final native void setTitlePosition(String titlePosition) /*-{
		this.titlePosition = titlePosition;
	}-*/;

}
