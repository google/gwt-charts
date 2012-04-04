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

public class StringFilterOptions extends ControlOptions {
	public static StringFilterOptions create() {
		return createObject().cast();
	}

	protected StringFilterOptions() {
		// Default constructor
	}

	public final native void setCaseSensitive(boolean caseSensitive) /*-{
		this.caseSensitive = caseSensitive;
	}-*/;

	public final void setMatchType(MatchType matchType) {
		setMatchType(matchType.getName());
	}

	public final native void setUi(StringFilterUi ui) /*-{
		this.ui = ui;
	}-*/;

	public final native void setUseFormattedValue(boolean useFormattedValue) /*-{
		this.useFormattedValue = useFormattedValue;
	}-*/;

	private final native void setMatchType(String matchType) /*-{
		this.matchType = matchType;
	}-*/;

}
