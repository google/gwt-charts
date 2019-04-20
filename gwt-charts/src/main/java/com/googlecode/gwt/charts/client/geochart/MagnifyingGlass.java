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
package com.googlecode.gwt.charts.client.geochart;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * An object with members to configure various aspects of the magnifying glass.
 */
public class MagnifyingGlass extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object
	 */
	public static MagnifyingGlass create() {
		return createObject().cast();
	}

	protected MagnifyingGlass() {
	}

	/**
	 * If true, when the user lingers over a cluttered marker, a magnifiying glass will be opened.<br>
	 * 
	 * Note: this feature is not supported in browsers that do not support SVG, i.e. Internet Explorer version 8 or
	 * earlier.
	 * 
	 * @param enable
	 */
	public final native void setEnable(boolean enable) /*-{
		this.enable = enable;
	}-*/;

	/**
	 * The zoom factor of the magnifying glass. Can be any number greater than 0.
	 * 
	 * @param zoomFactor
	 */
	public final native void setZoomFactor(double zoomFactor) /*-{
		this.zoomFactor = zoomFactor;
	}-*/;
}
