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
package com.googlecode.gwt.charts.client.controls.filter;

import com.googlecode.gwt.charts.client.controls.ControlOptions;
import com.googlecode.gwt.charts.client.options.MatchType;

/**
 * Configuration options for {@link StringFilter}.
 */
public class StringFilterOptions extends ControlOptions<StringFilterUi> {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static StringFilterOptions create() {
		return createObject().cast();
	}

	protected StringFilterOptions() {
		// Default constructor.
	}

	/**
	 * Whether matching should be case sensitive or not.
	 * 
	 * @param caseSensitive
	 */
	public final native void setCaseSensitive(boolean caseSensitive) /*-{
		this.caseSensitive = caseSensitive;
	}-*/;

	/**
	 * Whether the control should match exact values only ('exact'), prefixes starting from the beginning of the value
	 * ('prefix') or any substring ('any').
	 * 
	 * @param matchType default is {@link MatchType#PREFIX}
	 */
	public final void setMatchType(MatchType matchType) {
		setMatchType(matchType.getName());
	}

	/**
	 * Whether the control should match against cell formatted values or againt actual values.
	 * 
	 * @param useFormattedValue
	 */
	public final native void setUseFormattedValue(boolean useFormattedValue) /*-{
		this.useFormattedValue = useFormattedValue;
	}-*/;

	private final native void setMatchType(String matchType) /*-{
		this.matchType = matchType;
	}-*/;

}
