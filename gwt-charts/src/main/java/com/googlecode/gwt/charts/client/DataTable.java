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

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.JsArrayMixed;

import java.util.Date;

/**
 * Represents a two-dimensional, mutable table of values. To make a read-only copy of a DataTable (optionally filtered
 * to show specific values, rows, or columns), create a DataView. Each column is assigned a data type, plus several
 * optional properties including an ID, label, and pattern string. In addition, you can assign custom properties
 * (name/value pairs) to any cell, row, column, or the entire table. Some visualizations support specific custom
 * properties; for example the Table visualization supports a cell property called 'style', which lets you assign an
 * inline CSS style string to the rendered table cell. A visualization should describe in its documentation any custom
 * properties that it supports.
 * 
 * @see <a href="http://code.google.com/apis/chart/interactive/docs/reference.html#DataTable">DataTable API
 *      Reference</a>
 */
public class DataTable extends DataSource {

	/**
	 * Creates a DataTable object used to hold the data passed into a visualization.
	 * 
	 * @return an object used to hold the data passed into a visualization.
	 */
	public static native DataTable create() /*-{
		return new $wnd.google.visualization.DataTable();
	}-*/;

	/**
	 * Creates a DataTable object used to hold the data passed into a visualization.
	 * 
	 * @param dataLiteral a JavaScript object containing data used to initialize the table.
	 * @return an object used to hold the data passed into a visualization.
	 */
	public static native DataTable create(DataLiteral dataLiteral) /*-{
		return new $wnd.google.visualization.DataTable(dataLiteral);
	}-*/;

	/**
	 * Creates a DataTable object used to hold the data passed into a visualization.
	 * 
	 * @param dataLiteral a JavaScript object containing data used to initialize the table.
	 * @param version A numeric value specifying the version of the wire protocol used. This is only used by Chart Tools
	 *        Datasource implementors. The current version is 0.6.
	 * @return an object used to hold the data passed into a visualization.
	 */
	public static native DataTable create(DataLiteral dataLiteral, double version) /*-{
		return new $wnd.google.visualization.DataTable(dataLiteral, version);
	}-*/;

	/**
	 * Creates a DataTable object used to hold the data passed into a visualization.
	 * 
	 * @param jsonString Data used to initialize the table. This can be the JSON returned by calling DataTable.toJSON()
	 *        on a populated table
	 * @return an object used to hold the data passed into a visualization.
	 */
	public static native DataTable create(String jsonString) /*-{
		return new $wnd.google.visualization.DataTable(jsonString);
	}-*/;

	/**
	 * Creates a DataTable object used to hold the data passed into a visualization.
	 * 
	 * @param jsonString Data used to initialize the table. This can be the JSON returned by calling DataTable.toJSON()
	 *        on a populated table
	 * @param version A numeric value specifying the version of the wire protocol used. This is only used by Chart Tools
	 *        Datasource implementors. The current version is 0.6.
	 * @return an object used to hold the data passed into a visualization.
	 */
	public static native DataTable create(String jsonString, double version) /*-{
		return new $wnd.google.visualization.DataTable(jsonString, version);
	}-*/;

	protected DataTable() {
	}

	/**
	 * Adds a new column to the data table. All the cells of the new column are assigned a null value
	 * 
	 * @param type the data type of the values of the column
	 * @return the index of the new column
	 */
	public final int addColumn(ColumnType type) {
		return addColumn(type.getName());
	}

	/**
	 * Adds a new column to the data table. All the cells of the new column are assigned a null value
	 * 
	 * @param type the data type of the values of the column
	 * @param label
	 * @return the index of the new column
	 */
	public final int addColumn(ColumnType type, String label) {
		return this.addColumn(type.getName(), label);
	}

	/**
	 * Adds a new column to the data table. All the cells of the new column are assigned a null value
	 * 
	 * @param type the data type of the values of the column
	 * @param label A string with the label of the column. The column label is typically displayed as part of the
	 *        visualization, for example as a column header in a table, or as a legend label in a pie chart. If not
	 *        value is specified, an empty string is assigned.
	 * @param id A string with a unique identifier for the column. If not value is specified, an empty string is
	 *        assigned.
	 * @return the index of the new column
	 */
	public final int addColumn(ColumnType type, String label, String id) {
		return addColumn(type.getName(), label, id);
	}

	/**
	 * Adds a new, empty row to the end of the table.
	 * 
	 * @return the index of the new row
	 */
	public final native int addRow() /*-{
		return this.addRow();
	}-*/;

	/**
	 * Adds a new row to the data table.
	 * 
	 * @param <E> an array of column values
	 * @param cellArray A row object, specifying the data for the new row. This parameter is an array of cell values: if
	 *        you only want to specify a value for a cell, just give the cell value (e.g., 55, 'hello');
	 * @return the index of the new row
	 * @see DataCell
	 */
	public final native <E extends JsArrayMixed> int addRow(E cellArray) /*-{
		return this.addRow(cellArray);
	}-*/;

	/**
	 * Adds emptys row to the end of the table.
	 * 
	 * @param number the number of rows to add
	 * @return the index of the last added row
	 */
	public final native int addRows(int number) /*-{
		return this.addRows(number);
	}-*/;

	/**
	 * Adds new rows to the data table.
	 * 
	 * @param <E> an array of column values
	 * @param rowArray An array of row objects used to populate a set of new rows.
	 * @return the index of the last added row
	 * @see DataCell
	 */
	public final native <E extends JsArrayMixed> int addRows(JsArray<E> rowArray) /*-{
		return this.addRows(rowArray);
	}-*/;

	/**
	 * Returns a clone of the data table. The result is a deep copy of the data table except for the cell properties,
	 * row properties, table properties and column properties, which are shallow copies; this means that non-primitive
	 * properties are copied by reference, but primitive properties are copied by value.
	 * @return a clone of this object
	 */
	public final native DataTable cloneObject() /*-{
		return this.clone();
	}-*/;

	/**
	 * Returns a sorted version of the table without modifying the order of the underlying data. To permanently sort the
	 * underlying data, call sort().
	 * 
	 * @param columnIndex specifies the index of the column to sort by. Sorting will be in ascending order
	 * @return The returned value is an array of numbers, each number is an index of a DataTable row. Iterating on the
	 *         DataTable rows by the order of the returned array will result in rows ordered by the specified
	 *         sortColumns. The output can be used as input to DataView.setRows() to quickly change the displayed set of
	 *         rows in a visualization.
	 */
	public final native JsArrayInteger getSortedRows(int columnIndex) /*-{
		return this.getSortedRows(columnIndex);
	}-*/;

	/**
	 * Returns a sorted version of the table without modifying the order of the underlying data. To permanently sort the
	 * underlying data, call sort().
	 * 
	 * @param sortColumns An array of objects, each one with the number of the column index to sort by, and an optional
	 *        boolean property desc.
	 * @return The returned value is an array of numbers, each number is an index of a DataTable row. Iterating on the
	 *         DataTable rows by the order of the returned array will result in rows ordered by the specified
	 *         sortColumns. The output can be used as input to DataView.setRows() to quickly change the displayed set of
	 *         rows in a visualization.
	 */
	public final native JsArrayInteger getSortedRows(JsArray<SortColumn> sortColumns) /*-{
		return this.getSortedRows(sortColumns);
	}-*/;

	/**
	 * Returns a sorted version of the table without modifying the order of the underlying data. To permanently sort the
	 * underlying data, call sort().
	 * 
	 * @param columnIndexes An array of numbers of the column indexes by which to sort. The first number is the primary
	 *        column by which to sort, the second one is the secondary, and so on. This means that when two values in
	 *        the first column are equal, the values in the next column are compared, and so on.
	 * @return The returned value is an array of numbers, each number is an index of a DataTable row. Iterating on the
	 *         DataTable rows by the order of the returned array will result in rows ordered by the specified
	 *         sortColumns. The output can be used as input to DataView.setRows() to quickly change the displayed set of
	 *         rows in a visualization.
	 */
	public final native JsArrayInteger getSortedRows(JsArrayInteger columnIndexes) /*-{
		return this.getSortedRows(columnIndexes);
	}-*/;

	/**
	 * Returns a sorted version of the table without modifying the order of the underlying data. To permanently sort the
	 * underlying data, call sort().
	 * 
	 * @param sortColumn A single object that contains the number of the column index to sort by, and an optional
	 *        boolean property desc.
	 * @return The returned value is an array of numbers, each number is an index of a DataTable row. Iterating on the
	 *         DataTable rows by the order of the returned array will result in rows ordered by the specified
	 *         sortColumns. The output can be used as input to DataView.setRows() to quickly change the displayed set of
	 *         rows in a visualization.
	 */
	public final native JsArrayInteger getSortedRows(SortColumn sortColumn) /*-{
		return this.getSortedRows(sortColumn);
	}-*/;

	/**
	 * Inserts a new column to the data table, at the specifid index. All existing columns at or after the specified
	 * index are shifted to a higher index.
	 * 
	 * @param columnIndex a number with the required index of the new column.
	 * @param type the data type of the values of the column
	 */
	public final void insertColumn(int columnIndex, ColumnType type) {
		insertColumn(columnIndex, type.getName());
	}

	/**
	 * Inserts a new column to the data table, at the specifid index. All existing columns at or after the specified
	 * index are shifted to a higher index.
	 * 
	 * @param columnIndex a number with the required index of the new column.
	 * @param type the data type of the values of the column
	 * @param label should be a string with the label of the column. The column label is typically displayed as part of
	 *        the visualization, for example as a column header in a table, or as a legend label in a pie chart. If no
	 *        value is specified, an empty string is assigned.
	 */
	public final void insertColumn(int columnIndex, ColumnType type, String label) {
		insertColumn(columnIndex, type.getName(), label);
	}

	/**
	 * Inserts a new column to the data table, at the specifid index. All existing columns at or after the specified
	 * index are shifted to a higher index.
	 * 
	 * @param columnIndex a number with the required index of the new column.
	 * @param type the data type of the values of the column
	 * @param label should be a string with the label of the column. The column label is typically displayed as part of
	 *        the visualization, for example as a column header in a table, or as a legend label in a pie chart. If no
	 *        value is specified, an empty string is assigned.
	 * @param id should be a string with a unique identifier for the column. If no value is specified, an empty string
	 *        is assigned.
	 */
	public final void insertColumn(int columnIndex, ColumnType type, String label, String id) {
		this.insertColumn(columnIndex, type.getName(), label, id);
	}

	/**
	 * Insert the specified number of empty rows at the specified row index.
	 * 
	 * @param rowIndex is the index number where to insert the new row(s). Rows will be added, starting at the index
	 *        number specified.
	 * @param rowCount number of empty rows to add
	 */
	public final native void insertRows(int rowIndex, int rowCount) /*-{
		this.insertRows(rowIndex, rowCount);
	}-*/;

	/**
	 * Insert the specified number of empty rows at the specified row index.
	 * 
	 * @param rowIndex is the index number where to insert the new row(s). Rows will be added, starting at the index
	 *        number specified.
	 * @param rowArray an array of row objects used to populate a set of new rows.
	 * @see #addRows(JsArray)
	 */
	public final native <E extends JsArrayMixed> void insertRows(int rowIndex, JsArray<E> rowArray) /*-{
		this.insertRows(rowIndex, rowArray);
	}-*/;

	/**
	 * Removes the column at the specified index.
	 * 
	 * @param columnIndex should be a number with a valid column index.
	 */
	public final native void removeColumn(int columnIndex) /*-{
		this.removeColumn(columnIndex);
	}-*/;

	/**
	 * Removes the specified number of columns starting from the column at the specified index.
	 * 
	 * @param columnIndex should be a number with a valid column index.
	 * @param numberOfColumns is the number of columns to remove.
	 */
	public final native void removeColumns(int columnIndex, int numberOfColumns) /*-{
		this.removeColumns(columnIndex, numberOfColumns);
	}-*/;

	/**
	 * Removes the row at the specified index.
	 * 
	 * @param rowIndex should be a number with a valid row index.
	 */
	public final native void removeRow(int rowIndex) /*-{
		this.removeRow(rowIndex);
	}-*/;

	/**
	 * Removes the specified number of rows starting from the row at the specified index.
	 * 
	 * @param rowIndex should be a number with a valid row index.
	 * @param numberOfRows is the number of rows to remove.
	 */
	public final native void removeRows(int rowIndex, int numberOfRows) /*-{
		this.removeRows(rowIndex, numberOfRows);
	}-*/;

	public final native void setCell(int rowIndex, int columnIndex) /*-{
		this.setCell(rowIndex, columnIndex);
	}-*/;

	public final native void setCell(int rowIndex, int columnIndex, boolean value) /*-{
		this.setCell(rowIndex, columnIndex, value);
	}-*/;

	public final native void setCell(int rowIndex, int columnIndex, boolean value, String formattedValue) /*-{
		this.setCell(rowIndex, columnIndex, value, formattedValue);
	}-*/;

	public final native void setCell(int rowIndex, int columnIndex, boolean value, String formattedValue,
			Properties properties) /*-{
		this.setCell(rowIndex, columnIndex, value, formattedValue, properties);
	}-*/;

	public final native void setCell(int rowIndex, int columnIndex, Date value) /*-{
		this.setCell(rowIndex, columnIndex, @com.googlecode.gwt.charts.client.util.DateHelper::getJsDate(Ljava/util/Date;) (value));
	}-*/;

	public final native void setCell(int rowIndex, int columnIndex, Date value, String formattedValue) /*-{
		this.setCell(rowIndex, columnIndex, @com.googlecode.gwt.charts.client.util.DateHelper::getJsDate(Ljava/util/Date;) (value), formattedValue);
	}-*/;
	
	public final native void setCell(int rowIndex, int columnIndex, Date value, String formattedValue,
			Properties properties) /*-{
		this.setCell(rowIndex, columnIndex, @com.googlecode.gwt.charts.client.util.DateHelper::getJsDate(Ljava/util/Date;) (value), formattedValue, properties);
	}-*/;

	public final native void setCell(int rowIndex, int columnIndex, double value) /*-{
		this.setCell(rowIndex, columnIndex, value);
	}-*/;

	public final native void setCell(int rowIndex, int columnIndex, double value, String formattedValue) /*-{
		this.setCell(rowIndex, columnIndex, value, formattedValue);
	}-*/;

	public final native void setCell(int rowIndex, int columnIndex, double value, String formattedValue,
			Properties properties) /*-{
		this.setCell(rowIndex, columnIndex, value, formattedValue, properties);
	}-*/;

	public final native void setCell(int rowIndex, int columnIndex, String value) /*-{
		this.setCell(rowIndex, columnIndex, value);
	}-*/;
	
	public final native void setCell(int rowIndex, int columnIndex, String value, String formattedValue) /*-{
		this.setCell(rowIndex, columnIndex, value, formattedValue);
	}-*/;

	public final native void setCell(int rowIndex, int columnIndex, String value, String formattedValue,
			Properties properties) /*-{
		this.setCell(rowIndex, columnIndex, value, formattedValue, properties);
	}-*/;

	public final native void setCell(int rowIndex, int columnIndex, TimeOfDay value) /*-{
		this.setCell(rowIndex, columnIndex, value);
	}-*/;

	public final native void setCell(int rowIndex, int columnIndex, TimeOfDay value, String formattedValue) /*-{
		this.setCell(rowIndex, columnIndex, value, formattedValue);
	}-*/;

	public final native void setCell(int rowIndex, int columnIndex, TimeOfDay value, String formattedValue,
			Properties properties) /*-{
		this.setCell(rowIndex, columnIndex, value, formattedValue, properties);
	}-*/;

	/**
	 * Set the value of a cell to null.
	 * 
	 * @param rowIndex The index of the row.
	 * @param columnIndex The index of the column.
	 * @param formattedValue The desired String representation of null, such as "", "null", "nil", "N/A", "none", etc.
	 * @param properties
	 */
	public final native void setCellNull(int rowIndex, int columnIndex, String formattedValue, Properties properties) /*-{
		this.setCell(rowIndex, columnIndex, null, formattedValue, properties);
	}-*/;

	/**
	 * Sets the label of a column.
	 * 
	 * @param columnIndex should be a number greater than or equal to zero, and less than the number of columns as
	 *        returned by the getNumberOfColumns() method.
	 * @param label is a string with the label to assign to the column. The column label is typically displayed as part
	 *        of the visualization. For example the column label can be displayed as a column header in a table, or as
	 *        the legend label in a pie chart.
	 * @see #getColumnLabel(int)
	 */
	public final native void setColumnLabel(int columnIndex, String label) /*-{
		this.setColumnLabel(columnIndex, label);
	}-*/;

	/**
	 * Sets the formatted value of a cell.
	 * 
	 * @param rowIndex should be a number greater than or equal to zero, and less than the number of rows as returned by
	 *        the getNumberOfRows() method.
	 * @param columnIndex should be a number greater than or equal to zero, and less than the number of columns as
	 *        returned by the getNumberOfColumns() method.
	 * @param formattedValue is a string with the value formatted for display. To clear this value and have the API
	 *        apply default formatting to the cell value as needed, set it formattedValue null; to explicitly set an
	 *        empty formatted value, set it to an empty string.
	 * @see #getFormattedValue(int, int)
	 */
	public final native void setFormattedValue(int rowIndex, int columnIndex, String formattedValue) /*-{
		this.setFormattedValue(rowIndex, columnIndex, formattedValue);
	}-*/;

	public final native void setProperties(int rowIndex, int columnIndex, Properties properties) /*-{
		this.setProperties(rowIndex, columnIndex, properties);
	}-*/;

	public final native void setProperty(int rowIndex, int columnIndex, String name, String value) /*-{
		this.setProperty(rowIndex, columnIndex, name, value);
	}-*/;

	/**
	 * Sets the value of a cell. In addition to overwriting any existing cell value, this method will also clear out any
	 * formatted value and properties for the cell.
	 * 
	 * @param rowIndex should be a number greater than or equal to zero, and less than the number of rows as returned by
	 *        the getNumberOfRows() method.
	 * @param columnIndex should be a number greater than or equal to zero, and less than the number of columns as
	 *        returned by the getNumberOfColumns() method. This method does not let you set a formatted value for this
	 *        cell; to do that, call setFormattedValue().
	 * @param value is the value assigned to the specified cell. The type of the returned value depends on the column
	 *        type
	 * @see #setCell(int, int)
	 * @see #setFormattedValue(int, int, String)
	 * @see #setProperty(int, int, String, String)
	 * @see #setProperties(int, int, Properties)
	 */
	public final native void setValue(int rowIndex, int columnIndex, boolean value) /*-{
		this.setValue(rowIndex, columnIndex, value);
	}-*/;

	/**
	 * Sets the value of a cell. In addition to overwriting any existing cell value, this method will also clear out any
	 * formatted value and properties for the cell.
	 * 
	 * @param rowIndex should be a number greater than or equal to zero, and less than the number of rows as returned by
	 *        the getNumberOfRows() method.
	 * @param columnIndex should be a number greater than or equal to zero, and less than the number of columns as
	 *        returned by the getNumberOfColumns() method. This method does not let you set a formatted value for this
	 *        cell; to do that, call setFormattedValue().
	 * @param value is the value assigned to the specified cell. The type of the returned value depends on the column
	 *        type
	 * @see #setCell(int, int)
	 * @see #setFormattedValue(int, int, String)
	 * @see #setProperty(int, int, String, String)
	 * @see #setProperties(int, int, Properties)
	 */
	public final native void setValue(int rowIndex, int columnIndex, Date value) /*-{
		this.setValue(rowIndex, columnIndex, @com.googlecode.gwt.charts.client.util.DateHelper::getJsDate(Ljava/util/Date;) (value));
	}-*/;

	/**
	 * Sets the value of a cell. In addition to overwriting any existing cell value, this method will also clear out any
	 * formatted value and properties for the cell.
	 * 
	 * @param rowIndex should be a number greater than or equal to zero, and less than the number of rows as returned by
	 *        the getNumberOfRows() method.
	 * @param columnIndex should be a number greater than or equal to zero, and less than the number of columns as
	 *        returned by the getNumberOfColumns() method. This method does not let you set a formatted value for this
	 *        cell; to do that, call setFormattedValue().
	 * @param value is the value assigned to the specified cell. The type of the returned value depends on the column
	 *        type
	 * @see #setCell(int, int)
	 * @see #setFormattedValue(int, int, String)
	 * @see #setProperty(int, int, String, String)
	 * @see #setProperties(int, int, Properties)
	 */
	public final native void setValue(int rowIndex, int columnIndex, double value) /*-{
		this.setValue(rowIndex, columnIndex, value);
	}-*/;

	/**
	 * Sets the value of a cell. In addition to overwriting any existing cell value, this method will also clear out any
	 * formatted value and properties for the cell.
	 * 
	 * @param rowIndex should be a number greater than or equal to zero, and less than the number of rows as returned by
	 *        the getNumberOfRows() method.
	 * @param columnIndex should be a number greater than or equal to zero, and less than the number of columns as
	 *        returned by the getNumberOfColumns() method. This method does not let you set a formatted value for this
	 *        cell; to do that, call setFormattedValue().
	 * @param value is the value assigned to the specified cell. The type of the returned value depends on the column
	 *        type
	 * @see #setCell(int, int)
	 * @see #setFormattedValue(int, int, String)
	 * @see #setProperty(int, int, String, String)
	 * @see #setProperties(int, int, Properties)
	 */
	public final native void setValue(int rowIndex, int columnIndex, String value) /*-{
		this.setValue(rowIndex, columnIndex, value);
	}-*/;

	/**
	 * Sets the value of a cell. In addition to overwriting any existing cell value, this method will also clear out any
	 * formatted value and properties for the cell.
	 * 
	 * @param rowIndex should be a number greater than or equal to zero, and less than the number of rows as returned by
	 *        the getNumberOfRows() method.
	 * @param columnIndex should be a number greater than or equal to zero, and less than the number of columns as
	 *        returned by the getNumberOfColumns() method. This method does not let you set a formatted value for this
	 *        cell; to do that, call setFormattedValue().
	 * @param value is the value assigned to the specified cell. The type of the returned value depends on the column
	 *        type
	 * @see #setCell(int, int)
	 * @see #setFormattedValue(int, int, String)
	 * @see #setProperty(int, int, String, String)
	 * @see #setProperties(int, int, Properties)
	 */
	public final native void setValue(int rowIndex, int columnIndex, TimeOfDay value) /*-{
		this.setValue(rowIndex, columnIndex, value);
	}-*/;

	/**
	 * Sets the value of a cell. In addition to overwriting any existing cell value, this method will also clear out any
	 * formatted value and properties for the cell.
	 * 
	 * @param rowIndex should be a number greater than or equal to zero, and less than the number of rows as returned by
	 *        the getNumberOfRows() method.
	 * @param columnIndex should be a number greater than or equal to zero, and less than the number of columns as
	 *        returned by the getNumberOfColumns() method. This method does not let you set a formatted value for this
	 *        cell; to do that, call setFormattedValue().
	 * @see #setCell(int, int)
	 * @see #setFormattedValue(int, int, String)
	 * @see #setProperty(int, int, String, String)
	 * @see #setProperties(int, int, Properties)
	 */
	public final native void setValueNull(int rowIndex, int columnIndex) /*-{
		this.setValue(rowIndex, columnIndex, null);
	}-*/;

	/**
	 * Sorts the rows, according to the specified sort columns. The DataTable is modified by this method.
	 * 
	 * @param columnIndex specifies the index of the column to sort by. Sorting will be in ascending order
	 * @see #getSortedRows(int)
	 */
	public final native void sort(int columnIndex) /*-{
		this.sort(columnIndex);
	}-*/;

	/**
	 * Sorts the rows, according to the specified sort columns. The DataTable is modified by this method.
	 * 
	 * @param sortColumns An array of objects, each one with the number of the column index to sort by, and an optional
	 *        boolean property desc.
	 * @see #getSortedRows(SortColumn)
	 */
	public final native void sort(JsArray<SortColumn> sortColumns) /*-{
		this.sort(sortColumns);
	}-*/;

	/**
	 * Sorts the rows, according to the specified sort columns. The DataTable is modified by this method.
	 * 
	 * @param columnIndexes An array of numbers of the column indexes by which to sort. The first number is the primary
	 *        column by which to sort, the second one is the secondary, and so on. This means that when two values in
	 *        the first column are equal, the values in the next column are compared, and so on.
	 * @see #getSortedRows(JsArrayInteger)
	 */
	public final native void sort(JsArrayInteger columnIndexes) /*-{
		this.sort(columnIndexes);
	}-*/;

	/**
	 * Sorts the rows, according to the specified sort columns. The DataTable is modified by this method.
	 * 
	 * @param sortColumn A single object that contains the number of the column index to sort by, and an optional
	 *        boolean property desc.
	 * @see #getSortedRows(JsArray)
	 */
	public final native void sort(SortColumn sortColumn) /*-{
		this.sort(sortColumn);
	}-*/;

	private final native int addColumn(String type) /*-{
		return this.addColumn(type);
	}-*/;

	private final native int addColumn(String type, String label) /*-{
		return this.addColumn(type, label);
	}-*/;

	private final native int addColumn(String type, String label, String id) /*-{
		return this.addColumn(type, label, id);
	}-*/;

	private final native void insertColumn(int columnIndex, String type) /*-{
		this.insertColumn(columnIndex, type);
	}-*/;

	private final native void insertColumn(int columnIndex, String type, String label) /*-{
		this.insertColumn(columnIndex, type, label);
	}-*/;

	private final native void insertColumn(int columnIndex, String type, String label, String id) /*-{
		this.insertColumn(columnIndex, type, label, id);
	}-*/;

}
