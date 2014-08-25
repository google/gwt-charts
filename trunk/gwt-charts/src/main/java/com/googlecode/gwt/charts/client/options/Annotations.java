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
 * Annotations settings.
 * 
 */
public class Annotations extends JavaScriptObject {
	/**
	 * Default constructor
	 * 
	 * @return a new object instance
	 */
	public static Annotations create() {
		return createObject().cast();
	}

	protected Annotations() {
	}

	/**
	 * Controls the appearance of the boxes surrounding annotations
	 * 
	 * @param boxStyle
	 */
	public final native void setBoxStyle(BoxStyle boxStyle) /*-{
		this.boxStyle = boxStyle;
	}-*/;

	/**
	 * Lets you override Google Charts' choice of the annotation color. By default is true,
	 * which causes Charts to select an annotation color with good contrast: light colors on dark backgrounds, and dark
	 * on light. If you set annotations.highContrast to false and don't specify your own annotation color, Google Charts
	 * will use the default series color for the annotation.
	 * 
	 * @param highContrast
	 */
	public final native void setHighContrast(boolean highContrast) /*-{
		this.highContrast = highContrast;
	}-*/;

	/**
	 * Controls the appearance of the text of the annotation.
	 * 
	 * @param textStyle
	 */
	public final native void setTextStyle(AnnotationTextStyle textStyle) /*-{
		this.textStyle = textStyle;
	}-*/;
}
