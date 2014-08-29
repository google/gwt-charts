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
package com.googlecode.gwt.charts.client.sankey;

import com.google.gwt.core.client.JavaScriptObject;

import com.googlecode.gwt.charts.client.options.TextStyle;

/**
 * Sankey node configuration options.
 */
public class SankeyNode extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static SankeyNode create() {
		return createObject().cast();
	}

	protected SankeyNode() {
	}

	/**
	 * Sets the label text style.
	 * 
	 * @param textStyle an object that specifies the text style.
	 */
	public final native void setLabel(TextStyle textStyle) /*-{
		this.label = textStyle;
	}-*/;

	/**
	 * Sets the horizontal distance between the label and the node.
	 * 
	 * @param labelPadding value in pixels
	 */
	public final native void setLabelPadding(int labelPadding) /*-{
		this.labelPadding = labelPadding;
	}-*/;

	/**
	 * Sets the vertical distance between nodes.
	 * 
	 * @param nodePadding value in pixels
	 */
	public final native void setNodePadding(int nodePadding) /*-{
		this.nodePadding = nodePadding;
	}-*/;

	/**
	 * Sets the thickness of the node.
	 * 
	 * @param width value in pixels
	 */
	public final native void setWidth(int width) /*-{
		this.width = width;
	}-*/;
}
