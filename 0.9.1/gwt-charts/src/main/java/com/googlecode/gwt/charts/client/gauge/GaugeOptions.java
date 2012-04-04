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
package com.googlecode.gwt.charts.client.gauge;

import com.google.gwt.core.client.JsArrayString;

import com.googlecode.gwt.charts.client.options.Animation;
import com.googlecode.gwt.charts.client.options.Options;
import com.googlecode.gwt.charts.client.options.TextStyle;

public class GaugeOptions extends Options {
	public static GaugeOptions create() {
		return createObject().cast();
	}

	protected GaugeOptions() {
	}

	public final native void setAnimation(Animation animation) /*-{
		this.animation = animation;
	}-*/;

	public final native void setGreenColor(String greenColor) /*-{
		this.greenColor = greenColor;
	}-*/;

	public final native void setGreenFrom(double greenFrom) /*-{
		this.greenFrom = greenFrom;
	}-*/;

	public final native void setGreenTo(double greenTo) /*-{
		this.greenTo = greenTo;
	}-*/;

	public final native void setMajorTicks(JsArrayString majorTicks) /*-{
		this.majorTicks = majorTicks;
	}-*/;

	public final native void setMax(double max) /*-{
		this.max = max;
	}-*/;

	public final native void setMin(double min) /*-{
		this.min = min;
	}-*/;

	public final native void setMinorTicks(int minorTicks) /*-{
		this.minorTicks = minorTicks;
	}-*/;

	public final native void setRedColor(String redColor) /*-{
		this.redColor = redColor;
	}-*/;

	public final native void setRedFrom(double redFrom) /*-{
		this.redFrom = redFrom;
	}-*/;

	public final native void setRedTo(double redTo) /*-{
		this.redTo = redTo;
	}-*/;

	public final native void setTitleTextStyle(TextStyle textStyle) /*-{
		this.titleTextStyle = textStyle;
	}-*/;

	public final native void setYellowColor(String yellowColor) /*-{
		this.yellowColor = yellowColor;
	}-*/;

	public final native void setYellowFrom(double yellowFrom) /*-{
		this.yellowFrom = yellowFrom;
	}-*/;

	public final native void setYellowTo(double yellowTo) /*-{
		this.yellowTo = yellowTo;
	}-*/;

}
