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

/**
 * Assigns colors to the foreground or background of a numeric cell, depending on the cell value. This formatter is an
 * unusual, in that it doesn't take its options in the constructor. Instead, you should call addRange() or
 * addGradientRange() as many times as you want, to add color ranges, before calling format(). Colors can be specified
 * in any acceptable HTML format, for example "black", "#000000", or "#000".
 */
public class ColorFormat extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static native ColorFormat create() /*-{
		return new $wnd.google.visualization.ColorFormat();
	}-*/;

	protected ColorFormat() {
	}

	/**
	 * Assigns a background color from a range, according to the cell value. The color is scaled to match the cell's
	 * value within a range from a lower boundary color to an upper boundary color. Note that this method cannot compare
	 * string values, as addRange() can. Tip: Color ranges are often hard for viewers to gauge accurately; the simplest
	 * and easiest to read range is from a fully saturated color to white (e.g., #FF0000—FFFFFF).
	 * 
	 * @param from lower boundary (inclusive) of the range, or null. If null, it will match -∞.
	 * @param to high boundary (non-inclusive) of the range, or null. If null, it will match +∞.
	 * @param color color to apply to text in matching cells. This color is the same for all cells, no matter what their
	 *        value.
	 * @param fromBgColor background color for cells holding values at the low end of the gradient. Values can be either
	 *        '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
	 * @param toBgColor background color for cells holding values at the high end of the gradient. Values can be either
	 *        '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
	 */
	public final void addGradientRange(Date from, Date to, String color, String fromBgColor, String toBgColor) {
		JsDate fromValue = DateHelper.getJsDate(from);
		JsDate toValue = DateHelper.getJsDate(to);
		this.addGradientRange(fromValue, toValue, color, fromBgColor, toBgColor);
	}

	/**
	 * Assigns a background color from a range, according to the cell value. The color is scaled to match the cell's
	 * value within a range from a lower boundary color to an upper boundary color. Note that this method cannot compare
	 * string values, as addRange() can. Tip: Color ranges are often hard for viewers to gauge accurately; the simplest
	 * and easiest to read range is from a fully saturated color to white (e.g., #FF0000—FFFFFF).
	 * 
	 * @param from lower boundary (inclusive) of the range, or null. If null, it will match -∞.
	 * @param to high boundary (non-inclusive) of the range, or null. If null, it will match +∞.
	 * @param color color to apply to text in matching cells. This color is the same for all cells, no matter what their
	 *        value.
	 * @param fromBgColor background color for cells holding values at the low end of the gradient. Values can be either
	 *        '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
	 * @param toBgColor background color for cells holding values at the high end of the gradient. Values can be either
	 *        '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
	 */
	public final native void addGradientRange(Double from, Double to, String color, String fromBgColor, String toBgColor) /*-{
		var fromValue = (from != null ? @java.lang.Double::valueOf(D)(from) : null);
		var toValue = (to != null ? @java.lang.Double::valueOf(D)(to) : null);
		this.addGradientRange(fromValue, toValue, color, fromBgColor, toBgColor);
	}-*/;

	/**
	 * Assigns a background color from a range, according to the cell value. The color is scaled to match the cell's
	 * value within a range from a lower boundary color to an upper boundary color. Note that this method cannot compare
	 * string values, as addRange() can. Tip: Color ranges are often hard for viewers to gauge accurately; the simplest
	 * and easiest to read range is from a fully saturated color to white (e.g., #FF0000—FFFFFF).
	 * 
	 * @param from lower boundary (inclusive) of the range, or null. If null, it will match -∞.
	 * @param to high boundary (non-inclusive) of the range, or null. If null, it will match +∞.
	 * @param color color to apply to text in matching cells. This color is the same for all cells, no matter what their
	 *        value.
	 * @param fromBgColor background color for cells holding values at the low end of the gradient. Values can be either
	 *        '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
	 * @param toBgColor background color for cells holding values at the high end of the gradient. Values can be either
	 *        '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
	 */
	public final native void addGradientRange(Integer from, Integer to, String color, String fromBgColor,
			String toBgColor) /*-{
		var fromValue = (from != null ? @java.lang.Integer::valueOf(I)(from) : null);
		var toValue = (to != null ? @java.lang.Integer::valueOf(I)(to) : null);
		this.addGradientRange(fromValue, toValue, color, fromBgColor, toBgColor);
	}-*/;

	/**
	 * Assigns a background color from a range, according to the cell value. The color is scaled to match the cell's
	 * value within a range from a lower boundary color to an upper boundary color. Note that this method cannot compare
	 * string values, as addRange() can. Tip: Color ranges are often hard for viewers to gauge accurately; the simplest
	 * and easiest to read range is from a fully saturated color to white (e.g., #FF0000—FFFFFF).
	 * 
	 * @param from lower boundary (inclusive) of the range, or null. If null, it will match -∞.
	 * @param to high boundary (non-inclusive) of the range, or null. If null, it will match +∞.
	 * @param color color to apply to text in matching cells. This color is the same for all cells, no matter what their
	 *        value.
	 * @param fromBgColor background color for cells holding values at the low end of the gradient. Values can be either
	 *        '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
	 * @param toBgColor background color for cells holding values at the high end of the gradient. Values can be either
	 *        '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
	 */
	public final native void addGradientRange(JavaScriptObject from, JavaScriptObject to, String color,
			String fromBgColor, String toBgColor) /*-{
		this.addGradientRange(from, to, color, fromBgColor, toBgColor);
	}-*/;

	/**
	 * Assigns a background color from a range, according to the cell value. The color is scaled to match the cell's
	 * value within a range from a lower boundary color to an upper boundary color. Note that this method cannot compare
	 * string values, as addRange() can. Tip: Color ranges are often hard for viewers to gauge accurately; the simplest
	 * and easiest to read range is from a fully saturated color to white (e.g., #FF0000—FFFFFF).
	 * 
	 * @param from lower boundary (inclusive) of the range, or null. If null, it will match -∞.
	 * @param to high boundary (non-inclusive) of the range, or null. If null, it will match +∞.
	 * @param color color to apply to text in matching cells. This color is the same for all cells, no matter what their
	 *        value.
	 * @param fromBgColor background color for cells holding values at the low end of the gradient. Values can be either
	 *        '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
	 * @param toBgColor background color for cells holding values at the high end of the gradient. Values can be either
	 *        '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
	 */
	public final native void addGradientRange(String from, String to, String color, String fromBgColor, String toBgColor) /*-{
		this.addGradientRange(from, to, color, fromBgColor, toBgColor);
	}-*/;

	/**
	 * Assigns a background color from a range, according to the cell value. The color is scaled to match the cell's
	 * value within a range from a lower boundary color to an upper boundary color. Note that this method cannot compare
	 * string values, as addRange() can. Tip: Color ranges are often hard for viewers to gauge accurately; the simplest
	 * and easiest to read range is from a fully saturated color to white (e.g., #FF0000—FFFFFF).
	 * 
	 * @param from lower boundary (inclusive) of the range, or null. If null, it will match -∞.
	 * @param to high boundary (non-inclusive) of the range, or null. If null, it will match +∞.
	 * @param color color to apply to text in matching cells. This color is the same for all cells, no matter what their
	 *        value.
	 * @param fromBgColor background color for cells holding values at the low end of the gradient. Values can be either
	 *        '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
	 * @param toBgColor background color for cells holding values at the high end of the gradient. Values can be either
	 *        '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
	 */
	public final native void addGradientRange(TimeOfDay from, TimeOfDay to, String color, String fromBgColor,
			String toBgColor) /*-{
		this.addGradientRange(from, to, color, fromBgColor, toBgColor);
	}-*/;

	/**
	 * Specifies a foreground color and/or background color to a cell, depending on the cell value. Any cell with a
	 * value in the specified from—to range will be assigned color and bgcolor. It is important to realize that the
	 * range is non-inclusive, because creating a range from 1—1,000 and a second from 1,000—2,000 will not cover the
	 * value 1,000!
	 * 
	 * @param from lower boundary (inclusive) of the range, or null. If null, it will match -∞.
	 * @param to high boundary (non-inclusive) of the range, or null. If null, it will match +∞.
	 * @param color color to apply to text in matching cells. Values can be either '#RRGGBB' values or defined color
	 *        constants, (example: '#FF0000' or 'red').
	 * @param bgColor color to apply to the background of matching cells. Values can be either '#RRGGBB' values or
	 *        defined color constants, (example: '#FF0000' or 'red').
	 */
	public final void addRange(Date from, Date to, String color, String bgColor) {
		JsDate fromValue = DateHelper.getJsDate(from);
		JsDate toValue = DateHelper.getJsDate(to);
		this.addRange(fromValue, toValue, color, bgColor);
	}

	/**
	 * Specifies a foreground color and/or background color to a cell, depending on the cell value. Any cell with a
	 * value in the specified from—to range will be assigned color and bgcolor. It is important to realize that the
	 * range is non-inclusive, because creating a range from 1—1,000 and a second from 1,000—2,000 will not cover the
	 * value 1,000!
	 * 
	 * @param from The lower boundary (inclusive) of the range, or null. If null, it will match -∞.
	 * @param to The high boundary (non-inclusive) of the range, or null. If null, it will match +∞.
	 * @param color The color to apply to text in matching cells. Values can be either '#RRGGBB' values or defined color
	 *        constants, (example: '#FF0000' or 'red').
	 * @param bgColor The color to apply to the background of matching cells. Values can be either '#RRGGBB' values or
	 *        defined color constants, (example: '#FF0000' or 'red').
	 */
	public final native void addRange(Double from, Double to, String color, String bgColor) /*-{
		var fromValue = (from != null ? @java.lang.Double::valueOf(D)(from) : null);
		var toValue = (to != null ? @java.lang.Double::valueOf(D)(to) : null);
		this.addRange(fromValue, toValue, color, bgColor);
	}-*/;

	/**
	 * Specifies a foreground color and/or background color to a cell, depending on the cell value. Any cell with a
	 * value in the specified from—to range will be assigned color and bgcolor. It is important to realize that the
	 * range is non-inclusive, because creating a range from 1—1,000 and a second from 1,000—2,000 will not cover the
	 * value 1,000!
	 * 
	 * @param from The lower boundary (inclusive) of the range, or null. If null, it will match -∞.
	 * @param to The high boundary (non-inclusive) of the range, or null. If null, it will match +∞.
	 * @param color The color to apply to text in matching cells. Values can be either '#RRGGBB' values or defined color
	 *        constants, (example: '#FF0000' or 'red').
	 * @param bgColor The color to apply to the background of matching cells. Values can be either '#RRGGBB' values or
	 *        defined color constants, (example: '#FF0000' or 'red').
	 */
	public final native void addRange(Integer from, Integer to, String color, String bgColor) /*-{
		var fromValue = (from != null ? @java.lang.Integer::valueOf(I)(from) : null);
		var toValue = (to != null ? @java.lang.Integer::valueOf(I)(to) : null);
		this.addRange(fromValue, toValue, color, bgColor);
	}-*/;

	/**
	 * Specifies a foreground color and/or background color to a cell, depending on the cell value. Any cell with a
	 * value in the specified from—to range will be assigned color and bgcolor. It is important to realize that the
	 * range is non-inclusive, because creating a range from 1—1,000 and a second from 1,000—2,000 will not cover the
	 * value 1,000!
	 * 
	 * @param from The lower boundary (inclusive) of the range, or null. If null, it will match -∞.
	 * @param to The high boundary (non-inclusive) of the range, or null. If null, it will match +∞.
	 * @param color The color to apply to text in matching cells. Values can be either '#RRGGBB' values or defined color
	 *        constants, (example: '#FF0000' or 'red').
	 * @param bgColor The color to apply to the background of matching cells. Values can be either '#RRGGBB' values or
	 *        defined color constants, (example: '#FF0000' or 'red').
	 */
	public final native void addRange(JavaScriptObject from, JavaScriptObject to, String color, String bgColor) /*-{
		this.addRange(from, to, color, fromBgColor, toBgColor);
	}-*/;

	/**
	 * Specifies a foreground color and/or background color to a cell, depending on the cell value. Any cell with a
	 * value in the specified from—to range will be assigned color and bgcolor. It is important to realize that the
	 * range is non-inclusive, because creating a range from 1—1,000 and a second from 1,000—2,000 will not cover the
	 * value 1,000!
	 * 
	 * @param from The lower boundary (inclusive) of the range, or null. If null, it will match -∞.
	 * @param to The high boundary (non-inclusive) of the range, or null. If null, it will match +∞.
	 * @param color The color to apply to text in matching cells. Values can be either '#RRGGBB' values or defined color
	 *        constants, (example: '#FF0000' or 'red').
	 * @param bgColor The color to apply to the background of matching cells. Values can be either '#RRGGBB' values or
	 *        defined color constants, (example: '#FF0000' or 'red').
	 */
	public final native void addRange(String from, String to, String color, String bgColor) /*-{
		this.addRange(from, to, color, bgColor);
	}-*/;

	/**
	 * Specifies a foreground color and/or background color to a cell, depending on the cell value. Any cell with a
	 * value in the specified from—to range will be assigned color and bgcolor. It is important to realize that the
	 * range is non-inclusive, because creating a range from 1—1,000 and a second from 1,000—2,000 will not cover the
	 * value 1,000!
	 * 
	 * @param from The lower boundary (inclusive) of the range, or null. If null, it will match -∞.
	 * @param to The high boundary (non-inclusive) of the range, or null. If null, it will match +∞.
	 * @param color The color to apply to text in matching cells. Values can be either '#RRGGBB' values or defined color
	 *        constants, (example: '#FF0000' or 'red').
	 * @param bgColor The color to apply to the background of matching cells. Values can be either '#RRGGBB' values or
	 *        defined color constants, (example: '#FF0000' or 'red').
	 */
	public final native void addRange(TimeOfDay from, TimeOfDay to, String color, String bgColor) /*-{
		this.addRange(from, to, color, bgColor);
	}-*/;

	/**
	 * Apply formatter to given column index.
	 * 
	 * @param data the data source
	 * @param colIndex column index
	 */
	public final native void format(DataTable data, int colIndex) /*-{
		this.format(data, colIndex);
	}-*/;
}
