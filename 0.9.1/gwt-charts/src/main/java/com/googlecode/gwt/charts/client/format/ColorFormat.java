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
package com.googlecode.gwt.charts.client.format;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;

import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.TimeOfDay;
import com.googlecode.gwt.charts.client.util.DateHelper;

import java.util.Date;

public class ColorFormat extends JavaScriptObject {
	public static native ColorFormat create() /*-{
		return new $wnd.google.visualization.ColorFormat();
	}-*/;

	protected ColorFormat() {
	}

	public final void addGradientRange(Date from, Date to, String color, String fromBgColor, String toBgColor) {
		JsDate fromValue = DateHelper.getJsDate(from);
		JsDate toValue = DateHelper.getJsDate(to);
		this.addGradientRange(fromValue, toValue, color, fromBgColor, toBgColor);
	}

	public final native void addGradientRange(Double from, Double to, String color, String fromBgColor, String toBgColor) /*-{
		var fromValue = (from != null ? @java.lang.Double::valueOf(D)(from) : null);
		var toValue = (to != null ? @java.lang.Double::valueOf(D)(to) : null);
		this.addGradientRange(fromValue, toValue, color, fromBgColor, toBgColor);
	}-*/;

	public final native void addGradientRange(Integer from, Integer to, String color, String fromBgColor,
			String toBgColor) /*-{
		var fromValue = (from != null ? @java.lang.Integer::valueOf(I)(from) : null);
		var toValue = (to != null ? @java.lang.Integer::valueOf(I)(to) : null);
		this.addGradientRange(fromValue, toValue, color, fromBgColor, toBgColor);
	}-*/;

	public final native void addGradientRange(JavaScriptObject from, JavaScriptObject to, String color,
			String fromBgColor, String toBgColor) /*-{
		this.addGradientRange(from, to, color, fromBgColor, toBgColor);
	}-*/;

	public final native void addGradientRange(String from, String to, String color, String fromBgColor, String toBgColor) /*-{
		this.addGradientRange(from, to, color, fromBgColor, toBgColor);
	}-*/;

	public final native void addGradientRange(TimeOfDay from, TimeOfDay to, String color, String fromBgColor,
			String toBgColor) /*-{
		this.addGradientRange(from, to, color, fromBgColor, toBgColor);
	}-*/;

	public final void addRange(Date from, Date to, String color, String bgColor) {
		JsDate fromValue = DateHelper.getJsDate(from);
		JsDate toValue = DateHelper.getJsDate(to);
		this.addRange(fromValue, toValue, color, bgColor);
	}

	public final native void addRange(Double from, Double to, String color, String bgColor) /*-{
		var fromValue = (from != null ? @java.lang.Double::valueOf(D)(from) : null);
		var toValue = (to != null ? @java.lang.Double::valueOf(D)(to) : null);
		this.addRange(fromValue, toValue, color, bgColor);
	}-*/;

	public final native void addRange(Integer from, Integer to, String color, String bgColor) /*-{
		var fromValue = (from != null ? @java.lang.Integer::valueOf(I)(from) : null);
		var toValue = (to != null ? @java.lang.Integer::valueOf(I)(to) : null);
		this.addRange(fromValue, toValue, color, bgColor);
	}-*/;

	public final native void addRange(JavaScriptObject from, JavaScriptObject to, String color, String bgColor) /*-{
		this.addRange(from, to, color, fromBgColor, toBgColor);
	}-*/;

	public final native void addRange(String from, String to, String color, String bgColor) /*-{
		this.addRange(from, to, color, bgColor);
	}-*/;

	public final native void addRange(TimeOfDay from, TimeOfDay to, String color, String bgColor) /*-{
		this.addRange(from, to, color, bgColor);
	}-*/;

	public final native void format(DataTable data, int colIndex) /*-{
		this.format(data, colIndex);
	}-*/;
}
