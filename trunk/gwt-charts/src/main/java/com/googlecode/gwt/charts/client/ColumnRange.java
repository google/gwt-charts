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

public class ColumnRange extends JavaScriptObject {
	public static ColumnRange create() {
		return createObject().cast();
	}

	public static ColumnRange create(int min, int max) {
		ColumnRange columnRange = createObject().cast();
		columnRange.setMin(min);
		columnRange.setMax(max);
		return columnRange;
	}

	protected ColumnRange() {
	}

	public final native int setMax(int max) /*-{
		this.max = max;
	}-*/;

	public final native int setMin(int min) /*-{
		this.min = min;
	}-*/;
}
