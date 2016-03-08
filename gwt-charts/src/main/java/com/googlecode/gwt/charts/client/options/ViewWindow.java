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

import com.googlecode.gwt.charts.client.util.DateHelper;

import java.util.Date;

/**
 * Specifies the cropping range of an axis.
 */
public class ViewWindow extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static ViewWindow create() {
		return createObject().cast();
	}

	/**
	 * Default constructor.
	 * 
	 * @param min
	 * @param max
	 * 
	 * @return a new object instance
	 */
	public static ViewWindow create(Date min, Date max) {
		ViewWindow viewWindow = createObject().cast();
		viewWindow.setMax(max);
		viewWindow.setMin(min);
		return viewWindow;
	}

	/**
	 * Default constructor.
	 * 
	 * @param min
	 * @param max
	 * 
	 * @return a new object instance
	 */
	public static ViewWindow create(double min, double max) {
		ViewWindow viewWindow = createObject().cast();
		viewWindow.setMax(max);
		viewWindow.setMin(min);
		return viewWindow;
	}

	protected ViewWindow() {
	}

	/**
	 * <ul>
	 * <li>For a continuous axis:</li>
	 * The maximum horizontal data value to render.
	 * <li>For a discrete axis:</li>
	 * The zero-based row index where the cropping window ends. Data points at this index and higher will be cropped
	 * out. In conjunction with the other axis viewWindowMode.min, it defines a half-opened range [min, max) that
	 * denotes the element indices to display. In other words, every index such that min <= index < max will be
	 * displayed.
	 * </ul>
	 * Ignored when viewWindowMode is 'pretty' or 'maximized'.
	 * 
	 * @param max
	 */
	public final void setMax(Date max) {
		setMaxDate(DateHelper.getJsDate(max));
	}

	/**
	 * <ul>
	 * <li>For a continuous axis:</li>
	 * The maximum horizontal data value to render.
	 * <li>For a discrete axis:</li>
	 * The zero-based row index where the cropping window ends. Data points at this index and higher will be cropped
	 * out. In conjunction with the other axis viewWindowMode.min, it defines a half-opened range [min, max) that
	 * denotes the element indices to display. In other words, every index such that min <= index < max will be
	 * displayed.
	 * </ul>
	 * Ignored when viewWindowMode is 'pretty' or 'maximized'.
	 * 
	 * @param max
	 */
	public final native void setMax(double max) /*-{
		this.max = max;
	}-*/;

	/**
	 * <ul>
	 * <li>For a continuous axis:</li>
	 * The maximum horizontal data value to render.
	 * <li>For a discrete axis:</li>
	 * The zero-based row index where the cropping window ends. Data points at this index and higher will be cropped
	 * out. In conjunction with the other axis viewWindowMode.min, it defines a half-opened range [min, max) that
	 * denotes the element indices to display. In other words, every index such that min <= index < max will be
	 * displayed.
	 * </ul>
	 * Ignored when viewWindowMode is 'pretty' or 'maximized'.
	 * 
	 * @param max
	 */
	public final native void setMax(String max) /*-{
		this.max = max;
	}-*/;

	/**
	 * <ul>
	 * <li>For a continuous axis:</li>
	 * The maximum horizontal data value to render.
	 * <li>For a discrete axis:</li>
	 * The zero-based row index where the cropping window begins. Data points at indices lower than this will be cropped
	 * out. In conjunction with the other axis viewWindowMode.max, it defines a half-opened range [min, max) that
	 * denotes the element indices to display. In other words, every index such that min <= index < max will be
	 * displayed.
	 * </ul>
	 * Ignored when viewWindowMode is 'pretty' or 'maximized'.
	 * 
	 * @param min
	 */
	public final void setMin(Date min) {
		setMinDate(DateHelper.getJsDate(min));
	}

	/**
	 * <ul>
	 * <li>For a continuous axis:</li>
	 * The maximum horizontal data value to render.
	 * <li>For a discrete axis:</li>
	 * The zero-based row index where the cropping window begins. Data points at indices lower than this will be cropped
	 * out. In conjunction with the other axis viewWindowMode.max, it defines a half-opened range [min, max) that
	 * denotes the element indices to display. In other words, every index such that min <= index < max will be
	 * displayed.
	 * </ul>
	 * Ignored when viewWindowMode is 'pretty' or 'maximized'.
	 * 
	 * @param min
	 */
	public final native void setMin(double min) /*-{
		this.min = min;
	}-*/;

	/**
	 * <ul>
	 * <li>For a continuous axis:</li>
	 * The maximum horizontal data value to render.
	 * <li>For a discrete axis:</li>
	 * The zero-based row index where the cropping window begins. Data points at indices lower than this will be cropped
	 * out. In conjunction with the other axis viewWindowMode.max, it defines a half-opened range [min, max) that
	 * denotes the element indices to display. In other words, every index such that min <= index < max will be
	 * displayed.
	 * </ul>
	 * Ignored when viewWindowMode is 'pretty' or 'maximized'.
	 * 
	 * @param min
	 */
	public final native void setMin(String min) /*-{
		this.min = min;
	}-*/;

	private final native void setMaxDate(JavaScriptObject max) /*-{
		this.max = max;
	}-*/;

	private final native void setMinDate(JavaScriptObject min) /*-{
		this.min = min;
	}-*/;
}
