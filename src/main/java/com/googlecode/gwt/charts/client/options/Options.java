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
 * Common options for all charts.
 */
public abstract class Options extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static Options create() {
		return createObject().cast();
	}

	protected Options() {
	}

	/**
	 * Sets the height.
	 * 
	 * @param height value in pixels
	 */
	public final native void setHeight(int height) /*-{
		this.height = height;
	}-*/;

	/**
	 * Sets the width.
	 * 
	 * @param width value in pixels
	 */
	public final native void setWidth(int width) /*-{
		this.width = width;
	}-*/;

}
