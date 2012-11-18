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

public class NumberFormatOptions extends JavaScriptObject {
	public static NumberFormatOptions create() {
		return createObject().cast();
	}

	protected NumberFormatOptions() {
	}

	public final native void setDecimalSymbol(String decimalSymbol) /*-{
		this.decimalSymbol = decimalSymbol;
	}-*/;

	public final native void setFractionDigits(int fractionDigits) /*-{
		this.fractionDigits = fractionDigits;
	}-*/;

	public final native void setGroupingSymbol(String groupingSymbol) /*-{
		this.groupingSymbol = groupingSymbol;
	}-*/;

	public final native void setNegativeColor(String negativeColor) /*-{
		this.negativeColor = negativeColor;
	}-*/;

	public final native void setNegativeParens(boolean negativeParens) /*-{
		this.negativeParens = negativeParens;
	}-*/;

	public final native void setPattern(String pattern) /*-{
		this.pattern = pattern;
	}-*/;

	public final native void setPrefix(String prefix) /*-{
		this.prefix = prefix;
	}-*/;

	public final native void setSuffix(String suffix) /*-{
		this.suffix = suffix;
	}-*/;
}
