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

import java.util.Date;

public class Properties extends JavaScriptObject {
	public static Properties create() {
		return JavaScriptObject.createObject().cast();
	}

	protected Properties() {
		// Default constructor
	}

	public final native boolean containsKey(String key) /*-{
		return this[key] != null;
	}-*/;

	public final native boolean getBoolean(String key) /*-{
		return this[key];
	}-*/;

	public final native Date getDate(String key) /*-{
		return @com.googlecode.gwt.charts.client.util.DateHelper::getDate(Lcom/google/gwt/core/client/JsDate;) (this[key]);
	}-*/;

	public final native double getNumber(String key) /*-{
		return this[key];
	}-*/;

	public final native JavaScriptObject getObject(String key) /*-{
		return this[key];
	}-*/;

	public final native String getString(String key) /*-{
		return this[key];
	}-*/;

	public final native void remove(String key) /*-{
		delete this[key];
	}-*/;

	public final native void set(String key, boolean value) /*-{
		this[key] = value;
	}-*/;

	public final native void set(String key, Date value)/*-{
		this[key] = @com.googlecode.gwt.charts.client.util.DateHelper::getJsDate(Ljava/util/Date;) (value);
	}-*/;

	public final native void set(String key, double value) /*-{
		this[key] = value;
	}-*/;

	public final native void set(String key, JavaScriptObject value) /*-{
		this[key] = value;
	}-*/;

	public final native void set(String key, String value) /*-{
		this[key] = value;
	}-*/;
}
