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
 * A set of label options
 */
public class LabelStyle extends JavaScriptObject {
	/**
	 * Default constructor
	 * 
	 * @return a new object instance
	 */
	public static LabelStyle create() {
		return createObject().cast();
	}

	protected LabelStyle() {
	}

	/**
	 * Sets boldness on/off
	 * 
	 * @param bold true for bold, false for regular
	 */
	public final native void setBold(boolean bold) /*-{
		this.bold = bold;
	}-*/;

	/**
	 * Sets the border color
	 * 
	 * @param color an HTML color string
	 */
	public final native void setColor(String color) /*-{
		this.color = color;
	}-*/;

	/**
	 * Sets the font name
	 * 
	 * @param fontName a valid font name
	 */
	public final native void setFontName(String fontName) /*-{
		this.fontName = fontName;
	}-*/;

	/**
	 * Sets the font size
	 * 
	 * @param fontSize value in pixels
	 */
	public final native void setFontSize(int fontSize) /*-{
		this.fontSize = fontSize;
	}-*/;

	/**
	 * Sets italic
	 * 
	 * @param italic true for italic, false for regular
	 */
	public final native void setItalic(boolean italic) /*-{
		this.italic = italic;
	}-*/;

}
