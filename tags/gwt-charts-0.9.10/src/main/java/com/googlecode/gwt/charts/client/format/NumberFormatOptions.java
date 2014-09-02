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

/**
 * Configuration options for {@link NumberFormat}.
 */
public class NumberFormatOptions extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static NumberFormatOptions create() {
		return createObject().cast();
	}

	protected NumberFormatOptions() {
	}

	/**
	 * A character to use as the decimal marker. The default is a dot (.).
	 * 
	 * @param decimalSymbol
	 */
	public final native void setDecimalSymbol(String decimalSymbol) /*-{
		this.decimalSymbol = decimalSymbol;
	}-*/;

	/**
	 * A number specifying how many digits to display after the decimal. The default is 2. If you specify more digits
	 * than the number contains, it will display zeros for the smaller values. Truncated values will be rounded (5
	 * rounded up).
	 * 
	 * @param fractionDigits
	 */
	public final native void setFractionDigits(int fractionDigits) /*-{
		this.fractionDigits = fractionDigits;
	}-*/;

	/**
	 * A character to be used to group digits to the left of the decimal into sets of three. Default is a comma (,).
	 * 
	 * @param groupingSymbol
	 */
	public final native void setGroupingSymbol(String groupingSymbol) /*-{
		this.groupingSymbol = groupingSymbol;
	}-*/;

	/**
	 * The text color for negative values. No default value. Values can be any acceptable HTML color value, such as
	 * "red" or "#FF0000".
	 * 
	 * @param negativeColor
	 */
	public final native void setNegativeColor(String negativeColor) /*-{
		this.negativeColor = negativeColor;
	}-*/;

	/**
	 * A boolean, where true indicates that negative values should be surrounded by parentheses. Default is true.
	 * 
	 * @param negativeParens
	 */
	public final native void setNegativeParens(boolean negativeParens) /*-{
		this.negativeParens = negativeParens;
	}-*/;

	/**
	 * A format string. When provided, all other options are ignored, except negativeColor.
	 * The format string is a subset of the ICU pattern set.
	 * 
	 * @param pattern
	 */
	public final native void setPattern(String pattern) /*-{
		this.pattern = pattern;
	}-*/;

	/**
	 * A string prefix for the value, for example "$".
	 * 
	 * @param prefix
	 */
	public final native void setPrefix(String prefix) /*-{
		this.prefix = prefix;
	}-*/;

	/**
	 * A string suffix for the value, for example "%".
	 * 
	 * @param suffix
	 */
	public final native void setSuffix(String suffix) /*-{
		this.suffix = suffix;
	}-*/;
}
