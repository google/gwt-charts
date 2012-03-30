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
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayBoolean;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.core.client.JsDate;

import com.googlecode.gwt.charts.client.util.DateHelper;

import java.util.Date;

/**
 * This class implements the common methods of DataTable and DataView.
 * 
 * @see <a href="http://code.google.com/apis/visualization/documentation/reference.html#DataTable"> DataTable API
 *      Reference</a>
 */
public class DataSource extends JavaScriptObject {

	protected DataSource() {
	}

	/**
	 * Returns the identifier of a given column specified by the column index in the underlying table. For data tables
	 * that are retrieved by queries, the column identifier is set by the data source, and can be used to refer to
	 * columns when using the query language.
	 * 
	 * @param
	 * @return
	 */
	public final native String getColumnId(int columnIndex) /*-{
		return this.getColumnId(columnIndex);
	}-*/;

	/**
	 * Returns the label of a given column specified by the column index in the underlying table. The column label is
	 * typically displayed as part of the visualization. For example the column label can be displayed as a column
	 * header in a table, or as the legend label in a pie chart. For data tables that are retrieved by queries, the
	 * column label is set by the data source, or by the label clause of the query language.
	 * 
	 * @param columnIndex
	 * @return
	 */
	public final native String getColumnLabel(int columnIndex) /*-{
		return this.getColumnLabel(columnIndex);
	}-*/;

	/**
	 * Returns the formatting pattern used to format the values of the specified column. columnIndex should be a number
	 * greater than or equal to zero, and less than the number of columns as returned by the getNumberOfColumns()
	 * method. For data tables that are retrieved by queries, The column pattern is set by the data source, or by the
	 * format clause of the query language. An example of a pattern is '#,##0.00'. For more on patterns see the query
	 * language reference.
	 * 
	 * @param columnIndex
	 * @return
	 */
	public final native String getColumnPattern(int columnIndex) /*-{
		return this.getColumnPattern(columnIndex);
	}-*/;

	/**
	 * Returns a map of all properties for the specified column. Note that the properties object is returned by
	 * reference, so changing values in the retrieved object changes them in the DataTable. columnIndex is the numeric
	 * index of the column to retrieve properties for.
	 * 
	 * @param columnIndex
	 * @return
	 */
	public final native Properties getColumnProperties(int columnIndex) /*-{
		return this.getColumnProperties(columnIndex);
	}-*/;

	/**
	 * Returns the value of a named property, or null if no such property is set for the specified column. The return
	 * type varies, depending on the property. columnIndex should be a number greater than or equal to zero, and less
	 * than the number of columns as returned by the getNumberOfColumns() method. name is the property name, as a
	 * string.
	 * 
	 * @param columnIndex
	 * @param propertyName
	 * @return
	 */
	// FIXME value type can vary
	public final native String getColumnProperty(int columnIndex, String propertyName) /*-{
		return this.getColumnProperty(columnIndex, propertyName);
	}-*/;

	/**
	 * Returns the minimal and maximal values of values in a specified column. The returned object has properties min
	 * and max. If the range has no values, min and max will contain null. columnIndex should be a number greater than
	 * or equal to zero, and less than the number of columns as returned by the getNumberOfColumns() method.
	 * 
	 * @param columnIndex
	 * @return
	 */
	public final native ColumnRange getColumnRange(int columnIndex) /*-{
		return this.getColumnRange(columnIndex);
	}-*/;

	/**
	 * Returns the role of the specified column.
	 * 
	 * @param columnIndex
	 * @return
	 */
	public final native RoleType getColumnRole(int columnIndex) /*-{
		return @com.googlecode.gwt.charts.client.RoleType::findByName(Ljava/lang/String;) (this.getColumnRole(columnIndex));
	}-*/;

	/**
	 * Returns the type of a given column specified by the column index. columnIndex should be a number greater than or
	 * equal to zero, and less than the number of columns as returned by the getNumberOfColumns() method. The returned
	 * column type can be one of the following: 'string' 'number' 'boolean' 'date' 'datetime' 'timeofday'
	 * 
	 * @param columnIndex
	 * @return
	 */
	public final native ColumnType getColumnType(int columnIndex) /*-{
		return @com.googlecode.gwt.charts.client.ColumnType::findByName(Ljava/lang/String;) (this.getColumnType(columnIndex));
	}-*/;

	public final native JsArrayBoolean getDistinctValuesBoolean(int columnIndex) /*-{
		return this.getDistinctValues(columnIndex);
	}-*/;

	public final native JsArray<JsDate> getDistinctValuesDate(int columnIndex) /*-{
		return this.getDistinctValues(columnIndex);
	}-*/;

	/**
	 * Returns the unique values in a certain column, in ascending order.
	 * 
	 * @param columnIndex should be a number greater than or equal to zero, and less than the number of columns as
	 *        returned by the getNumberOfColumns() method.
	 * @return the unique values in a certain column, in ascending order.
	 */
	// FIXME value type can vary
	public final native JsArrayNumber getDistinctValuesNumber(int columnIndex) /*-{
		return this.getDistinctValues(columnIndex);
	}-*/;

	public final native JsArrayString getDistinctValuesString(int columnIndex) /*-{
		return this.getDistinctValues(columnIndex);
	}-*/;

	public final native JsArray<TimeOfDay> getDistinctValuesTimeOfDay(int columnIndex) /*-{
		return this.getDistinctValues(columnIndex);
	}-*/;

	/**
	 * @param filters
	 * @return
	 */
	public final native JsArrayNumber getFilteredRows(JsArray<RowFilter> filters) /*-{
		return this.getFilteredRows(filters);
	}-*/;

	/**
	 * @param rowIndex
	 * @param columnIndex
	 * @return
	 */
	public final native String getFormattedValue(int rowIndex, int columnIndex) /*-{
		return this.getFormattedValue(rowIndex, columnIndex);
	}-*/;

	/**
	 * @return
	 */
	public final native int getNumberOfColumns() /*-{
		return this.getNumberOfColumns();
	}-*/;

	/**
	 * @return
	 */
	public final native int getNumberOfRows() /*-{
		return this.getNumberOfRows();
	}-*/;

	public final native Properties getProperties(int rowIndex, int columnIndex) /*-{
		return this.getProperties(rowIndex, columnIndex);
	}-*/;

	// FIXME value type can vary
	public final native String getProperty(int rowIndex, int columnIndex, String name) /*-{
		return this.getProperty(rowIndex, columnIndex, name);
	}-*/;

	public final native Properties getRowProperties(int rowIndex) /*-{
		return this.getRowProperties(rowIndex);
	}-*/;

	// FIXME value type can vary
	public final native String getRowProperty(int rowIndex, String name) /*-{
		return this.getRowProperty(rowIndex, columnIndex, name);
	}-*/;

	public final native Properties getTableProperties() /*-{
		return this.getTableProperties();
	}-*/;

	// FIXME value type can vary
	public final native String getTableProperty(String name) /*-{
		return this.getRowProperty(name);
	}-*/;

	public final native boolean getValueBoolean(int rowIndex, int columnIndex) /*-{
		return this.getValue(rowIndex, columnIndex);
	}-*/;

	public final Date getValueDate(int rowIndex, int columnIndex) {
		return DateHelper.getDate(getValueJsDate(rowIndex, columnIndex));
	}

	public final native double getValueNumber(int rowIndex, int columnIndex) /*-{
		return this.getValue(rowIndex, columnIndex);
	}-*/;

	public final native String getValueString(int rowIndex, int columnIndex) /*-{
		return this.getValue(rowIndex, columnIndex);
	}-*/;

	public final native TimeOfDay getValueTimeOfDay(int rowIndex, int columnIndex) /*-{
		return this.getValue(rowIndex, columnIndex);
	}-*/;

	public final native boolean isValueNull(int rowIndex, int columnIndex) /*-{
		return this.getValue(rowIndex, columnIndex) == null;
	}-*/;

	public final native String toJSON() /*-{
		return this.toJSON();
	}-*/;

	private final native JsDate getValueJsDate(int rowIndex, int columnIndex) /*-{
		return this.getValue(rowIndex, columnIndex);
	}-*/;
}
