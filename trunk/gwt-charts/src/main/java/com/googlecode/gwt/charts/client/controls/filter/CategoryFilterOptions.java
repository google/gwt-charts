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

import com.googlecode.gwt.charts.client.controls.ControlOptions;

/**
 * Configuration options for {@link CategoryFilter}.
 */
public class CategoryFilterOptions extends ControlOptions<CategoryFilterUi> {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static CategoryFilterOptions create() {
		return createObject().cast();
	}

	protected CategoryFilterOptions() {
		// Default constructor.
	}

	/**
	 * When populating the list of selectable values automatically from the DataTable column this filter operates on,
	 * whether to use the actual cell values or their formatted values. (default: false)
	 * 
	 * @param useFormattedValue true to use the actual cell values or their formatted values
	 */
	public final native void setUseFormattedValue(boolean useFormattedValue) /*-{
		this.useFormattedValue = useFormattedValue;
	}-*/;

	/**
	 * The list of values will be automatically computed
	 * from the values present in the DataTable column this control operates on.
	 */
	public final native void setValues() /*-{
		this.values = null;
	}-*/;

	/**
	 * List of object values to choose from.
	 * They should have a suitable toString() representation for display to the user.
	 * 
	 * @param values
	 */
	public final native void setValues(JsArray<JavaScriptObject> values) /*-{
		this.values = values;
	}-*/;

	/**
	 * List of boolean values to choose from.
	 * 
	 * @param values
	 */
	public final native void setValues(JsArrayBoolean values) /*-{
		this.values = values;
	}-*/;

	/**
	 * List of number values to choose from.
	 * 
	 * @param values
	 */
	public final native void setValues(JsArrayNumber values) /*-{
		this.values = values;
	}-*/;

	/**
	 * List of string values to choose from.
	 * 
	 * @param values
	 */
	public final native void setValues(JsArrayString values) /*-{
		this.values = values;
	}-*/;
}
