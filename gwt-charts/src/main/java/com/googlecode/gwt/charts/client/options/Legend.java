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
 * An object with members to configure various aspects of the legend.
 */
public class Legend extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object
	 */
	public static Legend create() {
		return createObject().cast();
	}

	/**
	 * Construct with position.
	 * 
	 * @param position
	 * @return a new object
	 */
	public static Legend create(LegendPosition position) {
		Legend legend = createObject().cast();
		legend.setPosition(position);
		return legend;
	}

	protected Legend() {
	}

	/**
	 * Sets alignment of the legend.<br>
	 * The default value depends on the legend's position. For BOTTOM legends, the default is CENTER; other legends
	 * default to START.
	 * 
	 * @param alignment
	 */
	public final void setAligment(LegendAlignment alignment) {
		setAlignment(alignment.getName());
	}

	/**
	 * Maximum number of lines in the legend. Set this to a number greater than one to add lines to your legend. Note:
	 * The exact logic used to determine the actual number of lines rendered is still in flux.<br>
	 * 
	 * This option currently works only when position is TOP.
	 * 
	 * @param maxLines default is 1
	 */
	public final native void setMaxLines(int maxLines) /*-{
		this.maxLines = maxLines;
	}-*/;

	/**
	 * Sets the position of the legend.
	 * 
	 * @param position default is RIGHT
	 */
	public final void setPosition(LegendPosition position) {
		setPosition(position.getName());
	}

	/**
	 * Specifies the legend text style.
	 * 
	 * @param textStyle
	 */
	public final native void setTextStyle(TextStyle textStyle) /*-{
		this.textStyle = textStyle;
	}-*/;

	private final native void setAlignment(String alignment) /*-{
		this.alignment = alignment;
	}-*/;

	private final native void setPosition(String position) /*-{
		this.position = position;
	}-*/;

}
