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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayBoolean;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;

import com.googlecode.gwt.charts.client.controls.ControlState;

public class CategoryFilterState extends ControlState {
	public static CategoryFilterState create() {
		return createObject().cast();
	}

	protected CategoryFilterState() {
		// Default constructor
	}

	public final native void setSelectedValues(JsArray<JavaScriptObject> selectedValues) /*-{
		this.selectedValues = selectedValues;
	}-*/;

	public final native void setSelectedValues(JsArrayBoolean selectedValues) /*-{
		this.selectedValues = selectedValues;
	}-*/;

	public final native void setSelectedValues(JsArrayNumber selectedValues) /*-{
		this.selectedValues = selectedValues;
	}-*/;

	public final native void setSelectedValues(JsArrayString selectedValues) /*-{
		this.selectedValues = selectedValues;
	}-*/;

	public final native JsArray<JavaScriptObject> getSelectedValuesObject() /*-{
		return this.selectedValues;
	}-*/;

	public final native JsArrayBoolean getSelectedValuesBoolean() /*-{
		return this.selectedValues;
	}-*/;

	public final native JsArrayNumber getSelectedValuesNumber() /*-{
		return this.selectedValues;
	}-*/;

	public final native JsArrayString getSelectedValuesString() /*-{
		return this.selectedValues;
	}-*/;
}
