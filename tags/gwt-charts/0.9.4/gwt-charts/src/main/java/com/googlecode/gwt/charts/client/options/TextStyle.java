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
 * 
 */
public class TextStyle extends JavaScriptObject {
	/**
	 * Default constructor
	 * 
	 * @return a new object
	 */
	public static TextStyle create() {
		return createObject().cast();
	}

	protected TextStyle() {
	}

	/**
	 * Sets the text color
	 * @param color an HTML color string
	 */
	public final native void setColor(String color) /*-{
		this.color = color;
	}-*/;

	/**
	 * Sets the text font family name
	 * @param fontName a font family name
	 */
	public final native void setFontName(String fontName) /*-{
		this.fontName = fontName;
	}-*/;

	/**
	 * Sets the text font size
	 * @param fontSize
	 */
	public final native void setFontSize(int fontSize) /*-{
		this.fontSize = fontSize;
	}-*/;
}
