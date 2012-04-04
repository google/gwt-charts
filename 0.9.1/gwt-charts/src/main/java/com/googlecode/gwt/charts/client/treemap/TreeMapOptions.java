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

public class TreeMapOptions extends Options {
	public static TreeMapOptions create() {
		return createObject().cast();
	}

	protected TreeMapOptions() {
	}

	public final native void setFontColor(String fontColor) /*-{
		this.fontColor = fontColor;
	}-*/;

	public final native void setFontFamily(String fontFamily) /*-{
		this.fontFamily = fontFamily;
	}-*/;

	public final native void setFontSize(int fontSize) /*-{
		this.fontSize = fontSize;
	}-*/;

	public final native void setHeaderColor(String headerColor) /*-{
		this.headerColor = headerColor;
	}-*/;

	public final native void setHeaderHeight(int headerHeight) /*-{
		this.headerHeight = headerHeight;
	}-*/;

	public final native void setHeaderHighlightColor(String headerHighlightColor) /*-{
		this.headerHighlightColor = headerHighlightColor;
	}-*/;

	public final native void setMaxColor(String maxColor) /*-{
		this.maxColor = maxColor;
	}-*/;

	public final native void setMaxColorValue(double maxColorValue) /*-{
		this.maxColorValue = maxColorValue;
	}-*/;

	public final native void setMaxDepth(int maxDepth) /*-{
		this.maxDepth = maxDepth;
	}-*/;

	public final native void setMaxHighlightColor(String maxHighlightColor) /*-{
		this.maxHighlightColor = maxHighlightColor;
	}-*/;

	public final native void setMaxPostDepth(String maxPostDepth) /*-{
		this.maxPostDepth = maxPostDepth;
	}-*/;

	public final native void setMidColor(String midColor) /*-{
		this.midColor = midColor;
	}-*/;

	public final native void setMidHighlightColor(String midHighlightColor) /*-{
		this.midHighlightColor = midHighlightColor;
	}-*/;

	public final native void setMinColor(String minColor) /*-{
		this.minColor = minColor;
	}-*/;

	public final native void setMinColorValue(double minColorValue) /*-{
		this.minColorValue = minColorValue;
	}-*/;

	public final native void setMinHighlightColor(String minHighlightColor) /*-{
		this.minHighlightColor = minHighlightColor;
	}-*/;

	public final native void setNoColor(String noColor) /*-{
		this.noColor = noColor;
	}-*/;

	public final native void setNoHighlightColor(String noHighlightColor) /*-{
		this.noHighlightColor = noHighlightColor;
	}-*/;

	public final native void setShowScale(boolean showScale) /*-{
		this.showScale = showScale;
	}-*/;

	public final native void setShowTooltips(boolean showTooltips) /*-{
		this.showTooltips = showTooltips;
	}-*/;

}
