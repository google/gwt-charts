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
package com.googlecode.gwt.charts.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;

import com.googlecode.gwt.charts.client.util.DateHelper;

import java.util.Date;

/**
 * A common name/value map, tipically applied to tables, rows, columns or cells
 */
public class Properties extends JavaScriptObject {
	/**
	 * Default constructor
	 * 
	 * @return a new object
	 */
	public static Properties create() {
		return JavaScriptObject.createObject().cast();
	}

	protected Properties() {
		// Default constructor
	}

	/**
	 * Checks if a property exists
	 * 
	 * @param key the property's key
	 * @return true if exists, false otherwise
	 */
	public final native boolean containsKey(String key) /*-{
		return this[key] != null;
	}-*/;

	/**
	 * Get a boolean value mapped to the specified key.
	 * 
	 * @param key the name of the property.
	 * @return the property value
	 */
	public final native boolean getBoolean(String key) /*-{
		return this[key];
	}-*/;

	/**
	 * Get a Date value mapped to the specified key.
	 * 
	 * @param key the name of the property.
	 * @return the property value
	 */
	public final Date getDate(String key) {
		JsDate jsDate = getObject(key).cast();
		return DateHelper.getDate(jsDate);
	}

	/**
	 * Get a double value mapped to the specified key.
	 * 
	 * @param key the name of the property.
	 * @return the property value
	 */
	public final native double getNumber(String key) /*-{
		return this[key];
	}-*/;

	/**
	 * Get a JavaScriptObject value mapped to the specified key.
	 * 
	 * @param key the name of the property.
	 * @return the property value
	 */
	public final native JavaScriptObject getObject(String key) /*-{
		return this[key];
	}-*/;

	/**
	 * Get a String value mapped to the specified key.
	 * 
	 * @param key the name of the property.
	 * @return the property value
	 */
	public final native String getString(String key) /*-{
		return this[key];
	}-*/;

	/**
	 * Remove a property from this name/value map.
	 * 
	 * @param key the property key
	 */
	public final native void remove(String key) /*-{
		delete this[key];
	}-*/;

	/**
	 * Set a property
	 * 
	 * @param key the name of the property
	 * @param value the value of the property
	 */
	public final native void set(String key, boolean value) /*-{
		this[key] = value;
	}-*/;

	/**
	 * Set a property
	 * 
	 * @param key the name of the property
	 * @param value the value of the property
	 */
	public final native void set(String key, Date value)/*-{
		this[key] = @com.googlecode.gwt.charts.client.util.DateHelper::getJsDate(Ljava/util/Date;) (value);
	}-*/;

	/**
	 * Set a property
	 * 
	 * @param key the name of the property
	 * @param value the value of the property
	 */
	public final native void set(String key, double value) /*-{
		this[key] = value;
	}-*/;

	/**
	 * Set a property
	 * 
	 * @param key the name of the property
	 * @param value the value of the property
	 */
	public final native void set(String key, JavaScriptObject value) /*-{
		this[key] = value;
	}-*/;

	/**
	 * Set a property
	 * 
	 * @param key the name of the property
	 * @param value the value of the property
	 */
	public final native void set(String key, String value) /*-{
		this[key] = value;
	}-*/;
}
