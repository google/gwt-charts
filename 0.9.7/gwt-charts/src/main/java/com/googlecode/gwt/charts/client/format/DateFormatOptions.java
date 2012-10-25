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

public class DateFormatOptions extends JavaScriptObject {
	public static DateFormatOptions create() {
		return createObject().cast();
	}

	protected DateFormatOptions() {
	}

	public final void setFormatType(FormatType formatType) {
		setFormatType(formatType.getName());
	}

	public final native void setPattern(String pattern) /*-{
		this.pattern = pattern;
	}-*/;

	public final native void setTimeZone(int timeZone) /*-{
		this.timeZone = timeZone;
	}-*/;

	private final native void setFormatType(String formatType) /*-{
		this.formatType = formatType;
	}-*/;
}
