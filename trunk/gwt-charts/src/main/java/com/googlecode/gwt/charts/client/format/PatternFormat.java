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
import com.google.gwt.core.client.JsArrayInteger;

import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.util.ArrayHelper;

/**
 * Enables you to merge the values of designated columns into a single column, along with arbitrary text. So, for
 * example, if you had a column for first name and a column for last name, you could populate a third column with {last
 * name}, {first name}. This formatter does not follow the conventions for the constructor and the format() method. See
 * the Methods section below for instructions.
 */
public class PatternFormat extends JavaScriptObject {
	/**
	 * Default constructor.
	 * This is a string that describes which column values to put into the destination column, along with any arbitrary
	 * text. Embed placeholders in your string to indicate a value from another column to embed. The placeholders are
	 * {#}, where # is a the index of a source column to use. The index is an index in the srcColumnIndices array from
	 * the format() method below. To include a literal { or } character, escape it like this: \{ or \}. To include a
	 * literal \ mark, escape it as \\.
	 * 
	 * @param pattern
	 * @return a new object instance
	 */
	public static native PatternFormat create(String pattern) /*-{
		return new $wnd.google.visualization.PatternFormat(pattern);
	}-*/;

	protected PatternFormat() {
	}

	/**
	 * Apply formatter to given column indexes.
	 * 
	 * @param data the data source
	 * @param srcColumnIndices An array of one or more (zero-based) column indices to pull as the sources from the
	 *        underlying DataTable. This will be used as a data source for the pattern parameter in the constructor. The
	 *        column numbers do not have to be in sorted order.
	 */
	public final void format(DataTable data, int... srcColumnIndices) {
		format(data, ArrayHelper.createArray(srcColumnIndices));
	}

	/**
	 * Apply formatter to given column indexes.
	 * 
	 * @param data the data source
	 * @param srcColumnIndices An array of one or more (zero-based) column indices to pull as the sources from the
	 *        underlying DataTable. This will be used as a data source for the pattern parameter in the constructor. The
	 *        column numbers do not have to be in sorted order.
	 */
	public final native void format(DataTable data, JsArrayInteger srcColumnIndices) /*-{
		this.format(data, srcColumnIndices);
	}-*/;

	/**
	 * Apply formatter to given column indexes.
	 * 
	 * @param data the data source
	 * @param srcColumnIndices An array of one or more (zero-based) column indices to pull as the sources from the
	 *        underlying DataTable. This will be used as a data source for the pattern parameter in the constructor. The
	 *        column numbers do not have to be in sorted order.
	 * @param dstColumnIndex The destination column to place the output of the pattern manipulation. If not specified,
	 *        the first element in srcColumIndices will be used as the destination.
	 */
	public final native void format(DataTable data, JsArrayInteger srcColumnIndices, int dstColumnIndex) /*-{
		this.format(data, srcColumnIndices, dstColumnIndex);
	}-*/;
}
