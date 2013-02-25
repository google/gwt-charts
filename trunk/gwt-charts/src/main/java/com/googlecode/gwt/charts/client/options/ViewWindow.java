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
import com.google.gwt.core.client.JsDate;

import com.googlecode.gwt.charts.client.util.DateHelper;

import java.util.Date;

/**
 */

public class ViewWindow extends JavaScriptObject {
	public static ViewWindow create() {
		return createObject().cast();
	}

	public static ViewWindow create(double min, double max) {
		ViewWindow viewWindow = createObject().cast();
		viewWindow.setMax(max);
		viewWindow.setMin(min);
		return viewWindow;
	}

	public static ViewWindow create(Date min, Date max) {
		ViewWindow viewWindow = createObject().cast();
		viewWindow.setMax(max);
		viewWindow.setMin(min);
		return viewWindow;
	}

	protected ViewWindow() {
	}

	/**
	 * 
	 * @param max
	 */
	public final native void setMax(double max) /*-{
		this.max = max;
	}-*/;

	/**
	 * 
	 * @param min
	 */
	public final native void setMin(double min) /*-{
		this.min = min;
	}-*/;

	public final void setMax(Date max) {
		setMaxDate(DateHelper.getJsDate(max));
	}

	public final void setMin(Date min) {
		setMinDate(DateHelper.getJsDate(min));
	}

	private final native void setMaxDate(JsDate max) /*-{
		this.max = max;
	}-*/;

	private final native void setMinDate(JsDate min) /*-{
		this.min = min;
	}-*/;
}
