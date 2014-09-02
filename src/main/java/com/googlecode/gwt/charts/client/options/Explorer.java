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
import com.google.gwt.core.client.JsArrayString;

import com.googlecode.gwt.charts.client.util.ArrayHelper;

/**
 * The explorer option allows users to pan and zoom Google charts. explorer: {} provides the default explorer behavior,
 * enabling users to pan horizontally and vertically by dragging, and to zoom in and out by scrolling.
 * 
 * This feature is experimental and may change in future releases.
 */
public class Explorer extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static Explorer create() {
		return createObject().cast();
	}

	protected Explorer() {
	}

	/**
	 * Sets available actions.<br>
	 * We recommend using {@link ExplorerAction#RIGHT_CLICK_TO_RESET} whenever {@link ExplorerAction#DRAG_TO_ZOOM} is
	 * used.<br>
	 * See {@link #setMaxZoomIn(double)}, {@link #setMaxZoomOut(double)}, {@link #setZoomDelta(double)}, for zoom
	 * customizations.
	 * 
	 * @param actions
	 */
	public final void setActions(String... actions) {
		setActions(ArrayHelper.createArray(actions));
	}

	/**
	 * Limits explorer panning to horizontal or vertical.
	 * By default, users can pan both horizontally and vertically when the explorer option is used.
	 * 
	 * @param explorerAxis
	 */
	public final native void setAxis(ExplorerAxis explorerAxis) /*-{
		this.axis = panning;
	}-*/;

	/**
	 * By default, users can pan all around, regardless of where the data is. To ensure that users don't pan beyond the
	 * original chart set this to true.
	 * 
	 * @param keepInBounds
	 */
	public final native void setKeepInBounds(boolean keepInBounds) /*-{
		this.keepInBounds = keepInBounds;
	}-*/;

	/**
	 * The maximum that the explorer can zoom in. By default, users will be able to zoom in enough that they'll see only
	 * 25% of the original view. Setting 0.5 would let users zoom in only far enough to see half of the original view.
	 * 
	 * @param maxZoomIn default is 0.25
	 */
	public final native void setMaxZoomIn(double maxZoomIn) /*-{
		this.maxZoomIn = maxZoomIn;
	}-*/;

	/**
	 * The maximum that the explorer can zoom out. By default, users will be able to zoom out far enough that the chart
	 * will take up only 1/4 of the available space. Setting to 8 would let users zoom out far
	 * enough that the chart would take up only 1/8 of the available space.
	 * 
	 * @param maxZoomOut default is 4
	 */
	public final native void setMaxZoomOut(double maxZoomOut) /*-{
		this.maxZoomOut = maxZoomOut;
	}-*/;

	/**
	 * When users zoom in or out determines how much they zoom by. The smaller the number, the
	 * smoother and slower the zoom.
	 * 
	 * @param zoomDelta default is 1.5
	 */
	public final native void setZoomDelta(double zoomDelta) /*-{
		this.zoomDelta = zoomDelta;
	}-*/;

	private final native void setActions(JsArrayString actions) /*-{
		this.actions = actions;
	}-*/;
}
