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
import com.googlecode.gwt.charts.client.util.ArrayHelper;

/**
 * State configuration options for {@link CategoryFilter}.
 */
public class CategoryFilterState extends ControlState {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static CategoryFilterState create() {
		return createObject().cast();
	}

	protected CategoryFilterState() {
		// Default constructor.
	}

	/**
	 * The set of values currently selected.<br>
	 * The selected values must be a set of the overall selectable values defined
	 * by the values option (any extraneous one will be ignored).<br>
	 * If the CategoryFilter does not allow multiple choice, only the first value of the array is retained.
	 * 
	 * @return set of values currently selected
	 */
	public final native JsArrayBoolean getSelectedValuesBoolean() /*-{
		return this.selectedValues;
	}-*/;

	/**
	 * The set of values currently selected.<br>
	 * The selected values must be a set of the overall selectable values defined
	 * by the values option (any extraneous one will be ignored).<br>
	 * 
	 * @return set of values currently selected
	 */
	public final native JsArrayNumber getSelectedValuesNumber() /*-{
		return this.selectedValues;
	}-*/;

	/**
	 * The set of values currently selected.<br>
	 * The selected values must be a set of the overall selectable values defined
	 * by the values option (any extraneous one will be ignored).<br>
	 * 
	 * @return set of values currently selected
	 */
	public final native JsArray<JavaScriptObject> getSelectedValuesObject() /*-{
		return this.selectedValues;
	}-*/;

	/**
	 * The set of values currently selected.<br>
	 * The selected values must be a set of the overall selectable values defined
	 * by the values option (any extraneous one will be ignored).<br>
	 * 
	 * @return set of values currently selected
	 */
	public final native JsArrayString getSelectedValuesString() /*-{
		return this.selectedValues;
	}-*/;

	/**
	 * Sets selected values.<br>
	 * The selected values must be a set of the overall selectable values defined
	 * by the values option (any extraneous one will be ignored).<br>
	 * If the CategoryFilter does not allow multiple choice, only the first value of the array is retained.
	 * 
	 * @param selectedValues
	 */
	public final void setSelectedValues(boolean... selectedValues) {
		setSelectedValues(ArrayHelper.createArray(selectedValues));
	}

	/**
	 * Sets selected values.<br>
	 * The selected values must be a set of the overall selectable values defined
	 * by the values option (any extraneous one will be ignored).<br>
	 * If the CategoryFilter does not allow multiple choice, only the first value of the array is retained.
	 * 
	 * @param selectedValues
	 */
	public final void setSelectedValues(double... selectedValues) {
		setSelectedValues(ArrayHelper.createArray(selectedValues));
	}

	/**
	 * Sets selected values.<br>
	 * The selected values must be a set of the overall selectable values defined
	 * by the values option (any extraneous one will be ignored).<br>
	 * If the CategoryFilter does not allow multiple choice, only the first value of the array is retained.
	 * 
	 * @param selectedValues
	 */
	public final void setSelectedValues(Object... selectedValues) {
		setSelectedValues(ArrayHelper.createArray(selectedValues));
	}

	/**
	 * Sets selected values.<br>
	 * The selected values must be a set of the overall selectable values defined
	 * by the values option (any extraneous one will be ignored).<br>
	 * If the CategoryFilter does not allow multiple choice, only the first value of the array is retained.
	 * 
	 * @param selectedValues
	 */
	public final void setSelectedValues(String... selectedValues) {
		setSelectedValues(ArrayHelper.createArray(selectedValues));
	}

	/**
	 * Sets selected values.<br>
	 * The selected values must be a set of the overall selectable values defined
	 * by the values option (any extraneous one will be ignored).<br>
	 * If the CategoryFilter does not allow multiple choice, only the first value of the array is retained.
	 * 
	 * @param selectedValues
	 */
	private final native void setSelectedValues(JsArray<JavaScriptObject> selectedValues) /*-{
		this.selectedValues = selectedValues;
	}-*/;

	/**
	 * Sets selected values.<br>
	 * The selected values must be a set of the overall selectable values defined
	 * by the values option (any extraneous one will be ignored).<br>
	 * If the CategoryFilter does not allow multiple choice, only the first value of the array is retained.
	 * 
	 * @param selectedValues
	 */
	private final native void setSelectedValues(JsArrayBoolean selectedValues) /*-{
		this.selectedValues = selectedValues;
	}-*/;

	/**
	 * Sets selected values.<br>
	 * The selected values must be a set of the overall selectable values defined
	 * by the values option (any extraneous one will be ignored).<br>
	 * If the CategoryFilter does not allow multiple choice, only the first value of the array is retained.
	 * 
	 * @param selectedValues
	 */
	private final native void setSelectedValues(JsArrayNumber selectedValues) /*-{
		this.selectedValues = selectedValues;
	}-*/;

	/**
	 * Sets selected values.<br>
	 * The selected values must be a set of the overall selectable values defined
	 * by the values option (any extraneous one will be ignored).<br>
	 * If the CategoryFilter does not allow multiple choice, only the first value of the array is retained.
	 * 
	 * @param selectedValues
	 */
	private final native void setSelectedValues(JsArrayString selectedValues) /*-{
		this.selectedValues = selectedValues;
	}-*/;

}
