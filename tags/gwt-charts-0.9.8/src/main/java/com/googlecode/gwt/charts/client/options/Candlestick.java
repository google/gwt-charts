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
 * An object with members to configure the visual properties of the bubbles.
 */
public class Candlestick extends JavaScriptObject {
	/**
	 * Default constructor
	 * 
	 * @return a new object
	 */
	public static Candlestick create() {
		return createObject().cast();
	}

	protected Candlestick() {
	}

	/**
	 * Sets the colors applied to falling candles
	 * 
	 * @param fallingColor falling candles color settings
	 */
	public final native void setFallingColor(BackgroundColor fallingColor) /*-{
		this.fallingColor = fallingColor;
	}-*/;

	/**
	 * If true, rising candles will appear hollow and falling candles will appear solid, otherwise, the opposite.
	 * 
	 * @param hollowIsRising
	 */
	public final native void setHollowIsRising(boolean hollowIsRising) /*-{
		this.hollowIsRising = hollowIsRising;
	}-*/;

	/**
	 * Sets the colors applied to rising candles
	 * 
	 * @param risingColor rising candles color settings
	 */
	public final native void setRisingColor(BackgroundColor risingColor) /*-{
		this.risingColor = risingColor;
	}-*/;

}
