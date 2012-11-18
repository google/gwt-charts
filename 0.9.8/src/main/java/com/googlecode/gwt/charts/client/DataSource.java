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
	 * @param columnIndex the column position
	 * @return the identifier of the given column index
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
	 * @param columnIndex the column position
	 * @return the label of the given column index
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
	 * @param columnIndex the column position
	 * @return the pattern of the given column index
	 */
	public final native String getColumnPattern(int columnIndex) /*-{
		return this.getColumnPattern(columnIndex);
	}-*/;

	/**
	 * Returns a map of all properties for the specified column. Note that the properties object is returned by
	 * reference, so changing values in the retrieved object changes them in the DataTable. columnIndex is the numeric
	 * index of the column to retrieve properties for.
	 * 
	 * @param columnIndex the column position
	 * @return the properties of the given column index
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
	 * @param columnIndex the column position
	 * @param propertyName a property name
	 * @return the property value of the given column and property name
	 */
	public final native boolean getColumnPropertyBoolean(int columnIndex, String propertyName) /*-{
		return this.getColumnProperty(columnIndex, propertyName);
	}-*/;

	/**
	 * Returns the value of a named property, or null if no such property is set for the specified column. The return
	 * type varies, depending on the property. columnIndex should be a number greater than or equal to zero, and less
	 * than the number of columns as returned by the getNumberOfColumns() method. name is the property name, as a
	 * string.
	 * 
	 * @param columnIndex the column position
	 * @param propertyName a property name
	 * @return the property value of the given column and property name
	 */
	public final native JsDate getColumnPropertyDate(int columnIndex, String propertyName) /*-{
		return this.getColumnProperty(columnIndex, propertyName);
	}-*/;

	/**
	 * Returns the value of a named property, or null if no such property is set for the specified column. The return
	 * type varies, depending on the property. columnIndex should be a number greater than or equal to zero, and less
	 * than the number of columns as returned by the getNumberOfColumns() method. name is the property name, as a
	 * string.
	 * 
	 * @param columnIndex the column position
	 * @param propertyName a property name
	 * @return the property value of the given column and property name
	 */
	public final native double getColumnPropertyNumber(int columnIndex, String propertyName) /*-{
		return this.getColumnProperty(columnIndex, propertyName);
	}-*/;

	/**
	 * Returns the value of a named property, or null if no such property is set for the specified column. The return
	 * type varies, depending on the property. columnIndex should be a number greater than or equal to zero, and less
	 * than the number of columns as returned by the getNumberOfColumns() method. name is the property name, as a
	 * string.
	 * 
	 * @param columnIndex the column position
	 * @param propertyName a property name
	 * @return the property value of the given column and property name
	 */
	public final native JavaScriptObject getColumnPropertyObject(int columnIndex, String propertyName) /*-{
		return this.getColumnProperty(columnIndex, propertyName);
	}-*/;

	/**
	 * Returns the value of a named property, or null if no such property is set for the specified column. The return
	 * type varies, depending on the property. columnIndex should be a number greater than or equal to zero, and less
	 * than the number of columns as returned by the getNumberOfColumns() method. name is the property name, as a
	 * string.
	 * 
	 * @param columnIndex the column position
	 * @param propertyName a property name
	 * @return the property value of the given column and property name
	 */
	public final native String getColumnPropertyString(int columnIndex, String propertyName) /*-{
		return this.getColumnProperty(columnIndex, propertyName);
	}-*/;

	/**
	 * Returns the minimal and maximal values of values in a specified column. The returned object has properties min
	 * and max. If the range has no values, min and max will contain null. columnIndex should be a number greater than
	 * or equal to zero, and less than the number of columns as returned by the getNumberOfColumns() method.
	 * 
	 * @param columnIndex the column position
	 * @return an object with minimal and maximal values of values in the specified column
	 */
	public final native ColumnRange getColumnRange(int columnIndex) /*-{
		return this.getColumnRange(columnIndex);
	}-*/;

	/**
	 * Returns the role of the specified column.
	 * 
	 * @param columnIndex the column position
	 * @return the role of the specified column
	 */
	public final native RoleType getColumnRole(int columnIndex) /*-{
		return @com.googlecode.gwt.charts.client.RoleType::findByName(Ljava/lang/String;) (this.getColumnRole(columnIndex));
	}-*/;

	/**
	 * Returns the type of a given column specified by the column index. columnIndex should be a number greater than or
	 * equal to zero, and less than the number of columns as returned by the getNumberOfColumns() method.
	 * 
	 * @param columnIndex the column position
	 * @return the type of the specified column
	 */
	public final native ColumnType getColumnType(int columnIndex) /*-{
		return @com.googlecode.gwt.charts.client.ColumnType::findByName(Ljava/lang/String;) (this.getColumnType(columnIndex));
	}-*/;

	/**
	 * Returns the unique values in a certain column, in ascending order.
	 * 
	 * @param columnIndex should be a number greater than or equal to zero, and less than the number of columns as
	 *        returned by the getNumberOfColumns() method.
	 * @return the unique values in a certain column, in ascending order.
	 */
	public final native JsArrayBoolean getDistinctValuesBoolean(int columnIndex) /*-{
		return this.getDistinctValues(columnIndex);
	}-*/;

	/**
	 * Returns the unique values in a certain column, in ascending order.
	 * 
	 * @param columnIndex should be a number greater than or equal to zero, and less than the number of columns as
	 *        returned by the getNumberOfColumns() method.
	 * @return the unique values in a certain column, in ascending order.
	 */
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
	public final native JsArrayNumber getDistinctValuesNumber(int columnIndex) /*-{
		return this.getDistinctValues(columnIndex);
	}-*/;

	/**
	 * Returns the unique values in a certain column, in ascending order.
	 * 
	 * @param columnIndex should be a number greater than or equal to zero, and less than the number of columns as
	 *        returned by the getNumberOfColumns() method.
	 * @return the unique values in a certain column, in ascending order.
	 */
	public final native JsArray<JavaScriptObject> getDistinctValuesObject(int columnIndex) /*-{
		return this.getDistinctValues(columnIndex);
	}-*/;

	/**
	 * Returns the unique values in a certain column, in ascending order.
	 * 
	 * @param columnIndex should be a number greater than or equal to zero, and less than the number of columns as
	 *        returned by the getNumberOfColumns() method.
	 * @return the unique values in a certain column, in ascending order.
	 */
	public final native JsArrayString getDistinctValuesString(int columnIndex) /*-{
		return this.getDistinctValues(columnIndex);
	}-*/;

	/**
	 * Returns the unique values in a certain column, in ascending order.
	 * 
	 * @param columnIndex should be a number greater than or equal to zero, and less than the number of columns as
	 *        returned by the getNumberOfColumns() method.
	 * @return the unique values in a certain column, in ascending order.
	 */
	public final native JsArray<TimeOfDay> getDistinctValuesTimeOfDay(int columnIndex) /*-{
		return this.getDistinctValues(columnIndex);
	}-*/;

	/**
	 * Returns the row indexes for rows that match all of the given filters. The indexes are returned in ascending
	 * order. The output of this method can be used as input to DataView.setRows() to change the displayed set of rows
	 * in a visualization.
	 * 
	 * @param filters An array of objects that describe an acceptable cell value.
	 * @return the row indexes for rows that match all of the given filters.
	 */
	public final native JsArrayNumber getFilteredRows(JsArray<RowFilter> filters) /*-{
		return this.getFilteredRows(filters);
	}-*/;

	/**
	 * Returns the formatted value of the cell at the given row and column indexes.
	 * 
	 * @param rowIndex should be a number greater than or equal to zero, and less than the number of rows
	 * @param columnIndex should be a number greater than or equal to zero, and less than the number of columns
	 * @return the formatted value
	 */
	public final native String getFormattedValue(int rowIndex, int columnIndex) /*-{
		return this.getFormattedValue(rowIndex, columnIndex);
	}-*/;

	/**
	 * Returns the number of columns in the table.
	 * 
	 * @return number of columns in the table
	 */
	public final native int getNumberOfColumns() /*-{
		return this.getNumberOfColumns();
	}-*/;

	/**
	 * Returns the number of rows in the table.
	 * 
	 * @return number of rows in the table
	 */
	public final native int getNumberOfRows() /*-{
		return this.getNumberOfRows();
	}-*/;

	/**
	 * Returns a map of all the properties for the specified cell. Note that the properties object is returned by
	 * reference, so changing values in the retrieved object changes them in the DataSource.
	 * 
	 * @param rowIndex is the cell's row index.
	 * @param columnIndex is the cell's column index.
	 * @return a map of all the properties for the specified cell
	 */
	public final native Properties getProperties(int rowIndex, int columnIndex) /*-{
		return this.getProperties(rowIndex, columnIndex);
	}-*/;

	/**
	 * Returns the value of a named property, or null if no such property is set for the specified cell.
	 * 
	 * @param rowIndex is the cell's row index.
	 * @param columnIndex is the cell's column index.
	 * @param name is a string with the property name.
	 * @return the value of a named property or null
	 */
	public final native boolean getPropertyBoolean(int rowIndex, int columnIndex, String name) /*-{
		return this.getProperty(rowIndex, columnIndex, name);
	}-*/;

	/**
	 * Returns the value of a named property, or null if no such property is set for the specified cell.
	 * 
	 * @param rowIndex is the cell's row index.
	 * @param columnIndex is the cell's column index.
	 * @param name is a string with the property name.
	 * @return the value of a named property or null
	 */
	public final Date getPropertyDate(int rowIndex, int columnIndex, String name) {
		JsDate jsDate = getPropertyObject(rowIndex, columnIndex, name).cast();
		return DateHelper.getDate(jsDate);
	}

	/**
	 * Returns the value of a named property, or null if no such property is set for the specified cell.
	 * 
	 * @param rowIndex is the cell's row index.
	 * @param columnIndex is the cell's column index.
	 * @param name is a string with the property name.
	 * @return the value of a named property or null
	 */
	public final native double getPropertyNumber(int rowIndex, int columnIndex, String name) /*-{
		return this.getProperty(rowIndex, columnIndex, name);
	}-*/;

	/**
	 * Returns the value of a named property, or null if no such property is set for the specified cell.
	 * 
	 * @param rowIndex is the cell's row index.
	 * @param columnIndex is the cell's column index.
	 * @param name is a string with the property name.
	 * @return the value of a named property or null
	 */
	public final native JavaScriptObject getPropertyObject(int rowIndex, int columnIndex, String name) /*-{
		return this.getProperty(rowIndex, columnIndex, name);
	}-*/;

	/**
	 * Returns the value of a named property, or null if no such property is set for the specified cell.
	 * 
	 * @param rowIndex is the cell's row index.
	 * @param columnIndex is the cell's column index.
	 * @param name is a string with the property name.
	 * @return the value of a named property or null
	 */
	public final native String getPropertyString(int rowIndex, int columnIndex, String name) /*-{
		return this.getProperty(rowIndex, columnIndex, name);
	}-*/;

	/**
	 * Returns a map of all properties for the specified row. Note that the properties object is returned by reference,
	 * so changing values in the retrieved object changes them in the DataTable.
	 * 
	 * @param rowIndex is the index of the row to retrieve properties for.
	 * @return a map of all properties for the specified row
	 */
	public final native Properties getRowProperties(int rowIndex) /*-{
		return this.getRowProperties(rowIndex);
	}-*/;

	/**
	 * Returns the value of a named property, or null if no such property is set for the specified row.
	 * 
	 * @param rowIndex is the cell's row index.
	 * @param name is a string with the property name.
	 * @return the value of a named property or null
	 */
	public final native boolean getRowPropertyBoolean(int rowIndex, String name) /*-{
		return this.getRowProperty(rowIndex, name);
	}-*/;

	/**
	 * Returns the value of a named property, or null if no such property is set for the specified row.
	 * 
	 * @param rowIndex is the cell's row index.
	 * @param name is a string with the property name.
	 * @return the value of a named property or null
	 */
	public final Date getRowPropertyDate(int rowIndex, String name) {
		JsDate jsDate = getRowPropertyObject(rowIndex, name).cast();
		return DateHelper.getDate(jsDate);
	}

	/**
	 * Returns the value of a named property, or null if no such property is set for the specified row.
	 * 
	 * @param rowIndex is the cell's row index.
	 * @param name is a string with the property name.
	 * @return the value of a named property or null
	 */
	public final native double getRowPropertyNumber(int rowIndex, String name) /*-{
		return this.getRowProperty(rowIndex, name);
	}-*/;

	/**
	 * Returns the value of a named property, or null if no such property is set for the specified row.
	 * 
	 * @param rowIndex is the cell's row index.
	 * @param name is a string with the property name.
	 * @return the value of a named property or null
	 */
	public final native JavaScriptObject getRowPropertyObject(int rowIndex, String name) /*-{
		return this.getRowProperty(rowIndex, name);
	}-*/;

	/**
	 * Returns the value of a named property, or null if no such property is set for the specified row.
	 * 
	 * @param rowIndex is the cell's row index.
	 * @param name is a string with the property name.
	 * @return the value of a named property or null
	 */
	public final native String getRowPropertyString(int rowIndex, String name) /*-{
		return this.getRowProperty(rowIndex, name);
	}-*/;

	/**
	 * Returns a map of all properties for the table.
	 * 
	 * @return a map of all properties
	 */
	public final native Properties getTableProperties() /*-{
		return this.getTableProperties();
	}-*/;

	/**
	 * Returns the value of a named property, or null if no such property is set for the table.
	 * 
	 * @param name is a string with the property name.
	 * @return the value of a named property or null
	 */
	public final native boolean getTablePropertyBoolean(String name) /*-{
		return this.getTableProperty(name);
	}-*/;

	/**
	 * Returns the value of a named property, or null if no such property is set for the table.
	 * 
	 * @param name is a string with the property name.
	 * @return the value of a named property or null
	 */
	public final Date getTablePropertyDate(String name) {
		JsDate jsDate = getTablePropertyObject(name).cast();
		return DateHelper.getDate(jsDate);
	}

	/**
	 * Returns the value of a named property, or null if no such property is set for the table.
	 * 
	 * @param name is a string with the property name.
	 * @return the value of a named property or null
	 */
	public final native double getTablePropertyNumber(String name) /*-{
		return this.getTableProperty(name);
	}-*/;

	/**
	 * Returns the value of a named property, or null if no such property is set for the table.
	 * 
	 * @param name is a string with the property name.
	 * @return the value of a named property or null
	 */
	public final native JavaScriptObject getTablePropertyObject(String name) /*-{
		return this.getTableProperty(name);
	}-*/;

	/**
	 * Returns the value of a named property, or null if no such property is set for the table.
	 * 
	 * @param name is a string with the property name.
	 * @return the value of a named property or null
	 */
	public final native String getTablePropertyString(String name) /*-{
		return this.getTableProperty(name);
	}-*/;

	/**
	 * Returns the value of the cell at the given row and column indexes.
	 * 
	 * @param rowIndex should be a number greater than or equal to zero, and less than the number of rows
	 * @param columnIndex should be a number greater than or equal to zero, and less than the number of columns
	 * @return value of the specified cell
	 */
	public final native boolean getValueBoolean(int rowIndex, int columnIndex) /*-{
		return this.getValue(rowIndex, columnIndex);
	}-*/;

	/**
	 * Returns the value of the cell at the given row and column indexes.
	 * 
	 * @param rowIndex should be a number greater than or equal to zero, and less than the number of rows
	 * @param columnIndex should be a number greater than or equal to zero, and less than the number of columns
	 * @return value of the specified cell
	 */
	public final Date getValueDate(int rowIndex, int columnIndex) {
		JsDate jsDate = getValueObject(rowIndex, columnIndex).cast();
		return DateHelper.getDate(jsDate);
	}

	/**
	 * Returns the value of the cell at the given row and column indexes.
	 * 
	 * @param rowIndex should be a number greater than or equal to zero, and less than the number of rows
	 * @param columnIndex should be a number greater than or equal to zero, and less than the number of columns
	 * @return value of the specified cell
	 */
	public final native double getValueNumber(int rowIndex, int columnIndex) /*-{
		return this.getValue(rowIndex, columnIndex);
	}-*/;

	/**
	 * Returns the value of the cell at the given row and column indexes.
	 * 
	 * @param rowIndex should be a number greater than or equal to zero, and less than the number of rows
	 * @param columnIndex should be a number greater than or equal to zero, and less than the number of columns
	 * @return value of the specified cell
	 */
	public final native JavaScriptObject getValueObject(int rowIndex, int columnIndex) /*-{
		return this.getValue(rowIndex, columnIndex);
	}-*/;

	/**
	 * Returns the value of the cell at the given row and column indexes.
	 * 
	 * @param rowIndex should be a number greater than or equal to zero, and less than the number of rows
	 * @param columnIndex should be a number greater than or equal to zero, and less than the number of columns
	 * @return value of the specified cell
	 */
	public final native String getValueString(int rowIndex, int columnIndex) /*-{
		return this.getValue(rowIndex, columnIndex);
	}-*/;

	/**
	 * Returns the value of the cell at the given row and column indexes.
	 * 
	 * @param rowIndex should be a number greater than or equal to zero, and less than the number of rows
	 * @param columnIndex should be a number greater than or equal to zero, and less than the number of columns
	 * @return value of the specified cell
	 */
	public final native TimeOfDay getValueTimeOfDay(int rowIndex, int columnIndex) /*-{
		return this.getValue(rowIndex, columnIndex);
	}-*/;

	/**
	 * Checks if the value of the cell at the given row and column indexes is null
	 * 
	 * @param rowIndex should be a number greater than or equal to zero, and less than the number of rows
	 * @param columnIndex should be a number greater than or equal to zero, and less than the number of columns
	 * @return true if null, false otherwise
	 */
	public final native boolean isValueNull(int rowIndex, int columnIndex) /*-{
		return this.getValue(rowIndex, columnIndex) == null;
	}-*/;

	/**
	 * Returns a JSON representation of the DataTable that can be passed into the DataTable constructor.
	 * 
	 * @return a JSON representation of the DataTable
	 */
	public final native String toJSON() /*-{
		return this.toJSON();
	}-*/;
}
