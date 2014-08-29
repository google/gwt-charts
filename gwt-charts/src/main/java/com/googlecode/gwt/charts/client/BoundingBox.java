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
package com.googlecode.gwt.charts.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Represents the boundaries of a box, defined by left, top, width and height.
 */
public class BoundingBox extends JavaScriptObject {

	protected BoundingBox() {
	}

	/**
	 * Returns the height of this box.
	 * 
	 * @return value in pixels
	 */
	public final native int getHeight()/*-{
		return this.height;
	}-*/;

	/**
	 * Returns the left coordinate of this box.
	 * 
	 * @return value in pixels
	 */
	public final native int getLeft()/*-{
		return this.left;
	}-*/;

	/**
	 * Returns the top coordinate of this box.
	 * 
	 * @return value in pixels
	 */
	public final native int getTop()/*-{
		return this.top;
	}-*/;

	/**
	 * Returns the width of this box.
	 * 
	 * @return value in pixels
	 */
	public final native int getWidth()/*-{
		return this.width;
	}-*/;
}
