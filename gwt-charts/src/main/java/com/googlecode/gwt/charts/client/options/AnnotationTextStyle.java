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
 * Defines a text style.
 */
public class AnnotationTextStyle extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object
	 */
	public static AnnotationTextStyle create() {
		return createObject().cast();
	}

	protected AnnotationTextStyle() {
	}

	/**
	 * Sets the text outline color.
	 * 
	 * @param auraColor an HTML color string
	 */
	public final native void setAuraColor(String auraColor) /*-{
		this.auraColor = auraColor;
	}-*/;

	/**
	 * Sets boldness on/off.
	 * 
	 * @param bold true for bold, false for regular
	 */
	public final native void setBold(boolean bold) /*-{
		this.bold = bold;
	}-*/;

	/**
	 * Sets the text color.
	 * 
	 * @param color an HTML color string
	 */
	public final native void setColor(String color) /*-{
		this.color = color;
	}-*/;

	/**
	 * Sets the text font family name.
	 * 
	 * @param fontName a font family name
	 */
	public final native void setFontName(String fontName) /*-{
		this.fontName = fontName;
	}-*/;

	/**
	 * Sets the text font size.
	 * 
	 * @param fontSize
	 */
	public final native void setFontSize(int fontSize) /*-{
		this.fontSize = fontSize;
	}-*/;

	/**
	 * Sets italic.
	 * 
	 * @param italic true for italic, false for regular
	 */
	public final native void setItalic(boolean italic) /*-{
		this.italic = italic;
	}-*/;

	/**
	 * Sets the text opacity.
	 * 
	 * @param opacity a value from 0.0 (fully transparent) to 1.0 (fully opaque)
	 */
	public final native void setOpacity(double opacity) /*-{
		this.opacity = opacity;
	}-*/;
}
