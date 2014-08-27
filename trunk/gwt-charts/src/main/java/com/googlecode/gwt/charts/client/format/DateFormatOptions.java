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

import com.googlecode.gwt.charts.client.options.FormatType;

/**
 * Configuration options for {@link DateFormat}.
 */
public class DateFormatOptions extends JavaScriptObject {
	/**
	 * Default constructor
	 * 
	 * @return a new object instance
	 */
	public static DateFormatOptions create() {
		return createObject().cast();
	}

	protected DateFormatOptions() {
	}

	/**
	 * A quick formatting option for the date.
	 * 
	 * @param formatType
	 */
	public final void setFormatType(FormatType formatType) {
		setFormatType(formatType.getName());
	}

	/**
	 * The format used to display the date
	 * 
	 * @see <a href="http://icu-project.org/apiref/icu4j/com/ibm/icu/text/SimpleDateFormat.html">java SimpleDateFormat
	 *      class</a>
	 * @param pattern
	 */
	public final native void setPattern(String pattern) /*-{
		this.pattern = pattern;
	}-*/;

	/**
	 * A custom format pattern to apply to the value, similar to the ICU date and time format.
	 * 
	 * @param timeZone
	 */
	public final native void setTimeZone(int timeZone) /*-{
		this.timeZone = timeZone;
	}-*/;

	private final native void setFormatType(String formatType) /*-{
		this.formatType = formatType;
	}-*/;
}
