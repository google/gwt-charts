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

import com.googlecode.gwt.charts.client.TimeOfDay;
import com.googlecode.gwt.charts.client.util.DateHelper;

import java.util.Date;

/**
 * Tick object properties.
 */
public class Tick extends JavaScriptObject {
	/**
	 * Default constructor
	 * 
	 * @return a new object instance
	 */
	public static Tick create() {
		return createObject().cast();
	}

	/**
	 * Constructor with value and label
	 * 
	 * @param value
	 * @param label
	 * @return a new object instance
	 */
	public static Tick create(Date value, String label) {
		Tick tick = createObject().cast();
		tick.setV(value);
		tick.setF(label);
		return tick;
	}

	/**
	 * Constructor with value and label
	 * 
	 * @param value
	 * @param label
	 * @return a new object instance
	 */
	public static Tick create(double value, String label) {
		Tick tick = createObject().cast();
		tick.setV(value);
		tick.setF(label);
		return tick;
	}

	/**
	 * Constructor with value and label
	 * 
	 * @param value
	 * @param label
	 * @return a new object instance
	 */
	public static Tick create(int value, String label) {
		Tick tick = createObject().cast();
		tick.setV(value);
		tick.setF(label);
		return tick;
	}

	/**
	 * Constructor with value and label
	 * 
	 * @param value
	 * @param label
	 * @return a new object instance
	 */
	public static Tick create(TimeOfDay value, String label) {
		Tick tick = createObject().cast();
		tick.setV(value);
		tick.setF(label);
		return tick;
	}

	protected Tick() {
	}

	/**
	 * Sets the literal string to be displayed as the label.
	 * 
	 * @param name
	 */
	public final native void setF(String name) /*-{
		this.f = name;
	}-*/;

	/**
	 * Sets the tick value
	 * 
	 * @param value
	 */
	public final void setV(Date value) {
		setV(DateHelper.getJsDate(value));
	}

	/**
	 * Sets the tick value
	 * 
	 * @param value
	 */
	public final native void setV(double value) /*-{
		this.v = value;
	}-*/;

	/**
	 * Sets the tick value
	 * 
	 * @param value
	 */
	public final native void setV(int value) /*-{
		this.v = value;
	}-*/;

	/**
	 * Sets the tick value
	 * 
	 * @param value
	 */
	public final void setV(TimeOfDay value) {
		setV(value);
	}

	private final native <E extends JavaScriptObject> void setV(E value) /*-{
		this.v = value;
	}-*/;
}
