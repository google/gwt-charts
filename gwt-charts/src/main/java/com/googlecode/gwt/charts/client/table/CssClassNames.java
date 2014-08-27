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
package com.googlecode.gwt.charts.client.table;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * An object in which each property name describes a table element, and the property value is a string, defining a class
 * to assign to that table element. Use this property to assign custom CSS to specific elements of your table. To use
 * this property, assign an object, where the property name specifies the table element, and the property value is a
 * string, specifying a class name to assign to that element. You must then define a CSS style for that class on your
 * page.
 */
public class CssClassNames extends JavaScriptObject {
	protected CssClassNames() {
	}

	/**
	 * Assigns a class name to all cells in the header row (&lt;td&gt; element).
	 * 
	 * @param headerCell
	 */
	public final native void setHeaderCell(String headerCell) /*-{
		this.headerCell = headerCell;
	}-*/;

	/**
	 * Assigns a class name to the table header row (&lt;tr&gt; element).
	 * 
	 * @param headerRow
	 */
	public final native void setHeaderRow(String headerRow) /*-{
		this.headerRow = headerRow;
	}-*/;

	/**
	 * Assigns a class name to the hovered table row (&lt;tr&gt; element).
	 * 
	 * @param hoverTableRow
	 */
	public final native void setHoverTableRow(String hoverTableRow) /*-{
		this.hoverTableRow = hoverTableRow;
	}-*/;

	/**
	 * Assigns a class name to odd table rows (&lt;tr&gt; elements).&lt;td&gt;Note: the alternatingRowStyle option must
	 * be set to true.
	 * 
	 * @param oddTableRow
	 */
	public final native void setOddTableRow(String oddTableRow) /*-{
		this.oddTableRow = oddTableRow;
	}-*/;

	/**
	 * Assigns a class name to the cells in the row number column (&lt;td&gt; element).<br>
	 * Note: the showRowNumber option must be set to true.
	 * 
	 * @param rowNumberCell
	 */
	public final native void setRowNumberCell(String rowNumberCell) /*-{
		this.rowNumberCell = rowNumberCell;
	}-*/;

	/**
	 * Assigns a class name to the selected table row (&lt;tr&gt; element).
	 * 
	 * @param selectedTableRow
	 */
	public final native void setSelectedTableRow(String selectedTableRow) /*-{
		this.selectedTableRow = selectedTableRow;
	}-*/;

	/**
	 * Assigns a class name to all non-header table cells (&lt;td&gt; element).
	 * 
	 * @param tableCell
	 */
	public final native void setTableCell(String tableCell) /*-{
		this.tableCell = tableCell;
	}-*/;

	/**
	 * Assigns a class name to the non-header rows (&lt;tr&gt; elements).
	 * 
	 * @param tableRow
	 */
	public final native void setTableRow(String tableRow) /*-{
		this.tableRow = tableRow;
	}-*/;
}
