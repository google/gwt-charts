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

/**
 * Representation of time of day that may be used as a value in a data table (or data view).
 */
public class TimeOfDay extends JavaScriptObject {

	public static TimeOfDay create(int hours, int minutes, int seconds, int milliseconds) {
		TimeOfDay timeOfDay = createArray().cast();
		timeOfDay.setHour(hours);
		timeOfDay.setMinute(minutes);
		timeOfDay.setSecond(seconds);
		timeOfDay.setMillisecond(milliseconds);
		return timeOfDay;
	}

	protected TimeOfDay() {
	}

	public final native int getHour() /*-{
		return this[0];
	}-*/;

	public final native int getMillisecond() /*-{
		return this[3];
	}-*/;

	public final native int getMinute() /*-{
		return this[1];
	}-*/;

	public final native int getSecond() /*-{
		return this[2];
	}-*/;

	public final native void setHour(int hours) /*-{
		this[0] = hours;
	}-*/;

	public final native void setMillisecond(int milliseconds) /*-{
		this[3] = milliseconds;
	}-*/;

	public final native void setMinute(int minutes) /*-{
		this[1] = minutes;
	}-*/;

	public final native void setSecond(int seconds) /*-{
		this[2] = seconds;
	}-*/;

}
