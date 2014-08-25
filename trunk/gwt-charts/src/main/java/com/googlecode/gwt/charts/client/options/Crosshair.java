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
 * An object containing the crosshair properties for the chart.
 */
public class Crosshair extends JavaScriptObject {
	/**
	 * Default constructor
	 * 
	 * @return a new object instance
	 */
	public static Crosshair create() {
		return createObject().cast();
	}

	protected Crosshair() {
	}

	/**
	 * Sets the color
	 * 
	 * @param color an HTML color string
	 */
	public final native void setColor(String color) /*-{
		this.color = color;
	}-*/;

	/**
	 * Sets the crosshair properties upon focus.
	 * 
	 * @param focused
	 */
	public final native void setFocused(CrosshairProperties focused) /*-{
		this.focused = focused;
	}-*/;

	/**
	 * Sets the opacity
	 * 
	 * @param opacity a value from 0.0 (fully transparent) to 1.0 (fully opaque)
	 */
	public final native void setOpacity(double opacity) /*-{
		this.opacity = opacity;
	}-*/;

	/**
	 * Sets the crosshair orientation
	 * 
	 * @param orientation
	 */
	public final void setOrientation(CrosshairOrientation orientation) {
		setOrientation(orientation.getName());
	}

	/**
	 * Sets the crosshair properties upon selection.
	 * 
	 * @param selected
	 */
	public final native void setSelected(CrosshairProperties selected) /*-{
		this.selected = selected;
	}-*/;

	/**
	 * Determins when to display crosshairs
	 * 
	 * @param trigger
	 */
	public final void setTrigger(CrosshairTrigger trigger) {
		setTrigger(trigger.getName());
	}

	private final native void setOrientation(String orientation) /*-{
		this.orientation = orientation;
	}-*/;

	private final native void setTrigger(String trigger) /*-{
		this.trigger = trigger;
	}-*/;
}
