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
 * An object that specifies the tooltip style and behaviour.
 */
public class Tooltip extends JavaScriptObject {
	/**
	 * Default constructor
	 * 
	 * @return a new object instance
	 */
	public static Tooltip create() {
		return createObject().cast();
	}

	protected Tooltip() {
	}

	/**
	 * If set to true, use HTML-rendered (rather than SVG-rendered) tooltips.
	 * 
	 * @param isHtml default is false
	 */
	public final native void setIsHtml(boolean isHtml) /*-{
		this.isHtml = isHtml;
	}-*/;

	/**
	 * If true, show colored squares next to the series information in the tooltip. The default is true when focusTarget
	 * is set to 'category', otherwise the default is false.
	 * 
	 * @param showColorCode
	 */
	public final native void setShowColorCode(boolean showColorCode) /*-{
		this.showColorCode = showColorCode;
	}-*/;

	/**
	 * An object that specifies the tooltip text style.
	 * 
	 * @param textStyle
	 */
	public final native void setTextStyle(TextStyle textStyle) /*-{
		this.textStyle = textStyle;
	}-*/;

	/**
	 * Sets the user interaction that causes the tooltip to be displayed
	 * 
	 * @param trigger default is {@link TooltipTrigger#FOCUS}
	 */
	public final void setTrigger(TooltipTrigger trigger) {
		setTrigger(trigger.getName());
	}

	private final native void setTrigger(String trigger) /*-{
		this.trigger = trigger;
	}-*/;
}
