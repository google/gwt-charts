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

/**
 * A read-only view of an underlying DataTable. A DataView allows selection of only a subset of the columns and/or rows.
 * It also allows reordering columns/rows, and duplicating columns/rows.<br>
 * 
 * A view is a live window on the underlying DataTable, not a static snapshot of data. However, you still should must be
 * careful when changing the structure of the table itself, as described here:<br>
 * 
 * <ul>
 * <li>Adding or removing columns from the underlying table will not be reflected by the view, and might cause
 * unexpected behavior in the view; you will have to create a new DataView from the DataTable to pick up these changes.</li>
 * <li>Adding or removing rows from the underlying table is safe and changes will be propagated to the view immediately
 * (but you must call draw() on any visualizations after this change to have the new row set rendered). Note that if
 * your view has filtered out rows by calling one of the setRows() or hideRows() methods, and you add or remove rows
 * from the underlying table, the behavior is unexpected; you must create a new DataView to reflect the new table.</li>
 * <li>Changing cell values in existing cells is safe, and changes are immediately propagated to the DataView (but you
 * must call draw() on any visualizations after this change to have the new cell values rendered).</li>
 * </ul>
 * 
 * It is also possible to create a DataView from another DataView. Note that whenever an underlying table or view is
 * mentioned, it refers to the level immediately below this level. In other words, it refers to the data object used to
 * construct this DataView.<br>
 * 
 * DataView also supports calculated columns; these are columns whose value is calculated on the fly using a function
 * that you supply. So, for example, you can include a column that is a sum of two preceding columns, or a column that
 * calculates and shows the calendar quarter of a date from another column. See setColumns() for more details.<br>
 * 
 * When you modify a DataView by hiding or showing rows or columns, the visualization will not be affected until you
 * call draw() on the visualization again.<br>
 * 
 * @see <a href="http://developers.google.com/chart/interactive/docs/reference.html#DataView">DataView API Reference</a>
 */
public class DataView extends DataSource {

	/**
	 * Creates a new DataView for the given DataSource
	 * 
	 * @param dataSource A DataTable or DataView used to initialize the view. By default, the view contains all the
	 *        columns and rows in the underlying data table or view, in the original order.
	 * @return a new DataView
	 */
	public static native DataView create(DataSource dataSource) /*-{
		return new $wnd.google.visualization.DataView(dataSource);
	}-*/;

	/**
	 * This constructor creates a new DataView by assigning a serialized DataView to a DataTable. It helps you recreate
	 * the DataView that you serialized using DataView.toJSON()
	 * 
	 * @param dataSource The DataTable object that you used to create the DataView, on which you called
	 *        DataView.toJSON(). If this table is any different from the original table, you will get unpredictable
	 *        results.
	 * @param json The JSON string returned by DataView.toJSON(). This is a description of which rows to show or hide
	 *        from the data DataTable.
	 * @return a new DataView
	 */
	public static native DataView createFromJson(DataSource dataSource, String json) /*-{
		return $wnd.google.visualization.DataView.fromJSON(dataSource, json);
	}-*/;

	protected DataView() {
	}

	/**
	 * Returns the index in the underlying table (or view) of a given column specified by its index in this view.
	 * 
	 * @param viewColumnIndex should be a number greater than or equal to zero, and less than the number of columns as
	 *        returned
	 * @return the index in the underlying table (or view). Returns -1 if this is a generated column.
	 */
	public final native int getTableColumnIndex(int viewColumnIndex) /*-{
		return this.getTableColumnIndex(viewColumnIndex);
	}-*/;

	/**
	 * Returns the index in the underlying table (or view) of a given row specified by its index in this view.
	 * viewRowIndex should be a number greater than or equal to zero, and less than the number of rows as returned by
	 * the getNumberOfRows() method.
	 * 
	 * @param viewRowIndex
	 * @return the index of a given row specified by its index in this view
	 */
	public final native int getTableRowIndex(int viewRowIndex) /*-{
		return this.getTableRowIndex(viewRowIndex);
	}-*/;

	/**
	 * Returns the index in this view that maps to a given column specified by its index in the underlying table (or
	 * view). If more than one such index exists, returns the first (smallest) one. If no such index exists (the
	 * specified column is not in the view), returns -1. tableColumnIndex should be a number greater than or equal to
	 * zero, and less than the number of columns as returned by the getNumberOfColumns() method of the underlying
	 * table/view.
	 * 
	 * @param tableColumnIndex
	 * @return the index in this view that maps to a given column
	 */
	public final native int getViewColumnIndex(int tableColumnIndex) /*-{
		return this.getViewColumnIndex(tableColumnIndex);
	}-*/;

	/**
	 * Returns the columns in this view, in order. That is, if you call setColumns with some array, and then call
	 * getViewColumns() you should get an identical array.
	 * 
	 * @return the columns in this view, in order
	 */
	public final native JsArrayInteger getViewColumns() /*-{
		return this.getViewColumns();
	}-*/;

	/**
	 * Returns the index in this view that maps to a given row specified by its index in the underlying table (or view).
	 * If more than one such index exists, returns the first (smallest) one. If no such index exists (the specified row
	 * is not in the view), returns -1. tableRowIndex should be a number greater than or equal to zero, and less than
	 * the number of rows as returned by the getNumberOfRows() method of the underlying table/view.
	 * 
	 * @param tableRowIndex
	 * @return the index in this view that maps to a given row
	 */
	public final native int getViewRowIndex(int tableRowIndex) /*-{
		return this.getViewRowIndex(tableRowIndex);
	}-*/;

	/**
	 * Returns the rows in this view, in order. That is, if you call setRows with some array, and then call
	 * getViewRows() you should get an identical array.
	 * 
	 * @return the rows in this view, in order
	 */
	public final native JsArrayInteger getViewRows() /*-{
		return this.getViewRows();
	}-*/;

	/**
	 * Hides the specified columns from the current view. columnIndexes is an array of numbers representing the indexes
	 * of the columns to hide. These indexes are the index numbers in the underlying table/view. The numbers in
	 * columnIndexes do not have to be in order (that is, [3,4,1] is fine). The remaining columns retain their index
	 * order when you iterate through them. Entering an index number for a column already hidden is not an error, but
	 * entering an index that does not exist in the underlying table/view will throw an error. To unhide columns, call
	 * setColumns().
	 * 
	 * @param columnIndexes
	 */
	public final native void hideColumns(JsArrayInteger columnIndexes) /*-{
		this.hideColumns(columnIndexes);
	}-*/;

	/**
	 * Hides all rows with indexes that lie between min and max (inclusive) from the current view. This is a convenience
	 * syntax for hideRows(rowIndexes) above.
	 * 
	 * @param fromIndex
	 * @param toIndex
	 */
	public final native void hideRows(int fromIndex, int toIndex) /*-{
		this.hideRows(fromIndex, toIndex);
	}-*/;

	/**
	 * Hides the specified rows from the current view. rowIndexes is an array of numbers representing the indexes of the
	 * rows to hide. These indexes are the index numbers in the underlying table/view. The numbers in rowIndexes do not
	 * have to be in order (that is, [3,4,1] is fine). The remaining rows retain their index order. Entering an index
	 * number for a row already hidden is not an error, but entering an index that does not exist in the underlying
	 * table/view will throw an error. To unhide rows, call setRows().
	 * 
	 * @param rowIndexes
	 */
	public final native void hideRows(JsArrayInteger rowIndexes) /*-{
		this.hideRows(rowIndexes);
	}-*/;

	/**
	 * Specifies which columns are visible in this view. Any columns not specified will be hidden. This is an array of
	 * column indexes in the underlying table/view. If you don't call this method, the default is
	 * to show all columns. The array can also contain duplicates, to show the same column multiple times. Columns will
	 * be shown in the order specified.
	 * 
	 * @param columnIndexes an array of column indexes in the underlying table/view
	 */
	public final native void setColumns(JsArrayInteger columnIndexes) /*-{
		this.setColumns(columnIndexes);
	}-*/;

	/**
	 * Specifies which columns are visible in this view. Any columns not specified will be hidden. This is an array of
	 * column indexes in the underlying table/view, or calculated columns. If you don't call this method, the default is
	 * to show all columns. The array can also contain duplicates, to show the same column multiple times. Columns will
	 * be shown in the order specified.
	 * 
	 * @param columnIndexes an array of column indexes in the underlying table/view, or calculated columns like {@link DataViewColumn}
	 */
	public final native void setColumns(JsArrayMixed columnIndexes) /*-{
		this.setColumns(columnIndexes);
	}-*/;

	/**
	 * Specifies which columns are visible in this view. Any columns not specified will be hidden. This is an array of
	 * calculated columns in the underlying table/view. If you don't call this method, the default is
	 * to show all columns. The array can also contain duplicates, to show the same column multiple times. Columns will
	 * be shown in the order specified.
	 * 
	 * @param columnIndexes an array of calculated columns
	 */
	public final native void setColumns(JsArray<DataViewColumn> columnIndexes) /*-{
		this.setColumns(columnIndexes);
	}-*/;

	/**
	 * Sets the rows in this view to be all indexes (in the underlying table/view) that lie between min and max
	 * (inclusive). This is a convenience syntax for setRows(rowIndexes) above
	 * 
	 * @param fromIndex
	 * @param toIndex
	 */
	public final native void setRows(int fromIndex, int toIndex) /*-{
		this.setRows(fromIndex, toIndex);
	}-*/;

	/**
	 * Sets the visible rows in this view, based on index numbers from the underlying table/view. rowIndexes should be
	 * an array of index numbers specifying which rows to show in the view. The array specifies the order in which to
	 * show the rows, and rows can be duplicated. Note that only the rows specified in rowIndexes will be shown; this
	 * method clears all other rows from the view. The array can also contain duplicates, effectively duplicating the
	 * specified row in this view (for example, setRows([3, 4, 3, 2]) will cause row 3 to appear twice in this view).
	 * The array thus provides a mapping of the rows from the underlying table/view to this view. You can use
	 * getFilteredRows() or getSortedRows() to generate input for this method.
	 * 
	 * @param rowIndexes
	 */
	public final native void setRows(JsArrayInteger rowIndexes) /*-{
		this.setRows(rowIndexes);
	}-*/;

	/**
	 * Returns a DataTable object populated with the visible rows and columns of the DataView.
	 * 
	 * @return a DataTable representation of this view
	 */
	public final native DataTable toDataTable() /*-{
		this.toDataTable();
	}-*/;
}
