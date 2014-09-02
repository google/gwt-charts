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

import com.googlecode.gwt.charts.client.options.Options;

/**
 * Configuration options for {@link Table}.
 */
public class TableOptions extends Options {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static TableOptions create() {
		return createObject().cast();
	}

	protected TableOptions() {
	}

	/**
	 * If set to true, formatted values of cells that include HTML tags will be rendered as HTML. If set to false, most
	 * custom formatters will not work properly.
	 * 
	 * @param allowHtml
	 */
	public final native void setAllowHtml(boolean allowHtml) /*-{
		this.allowHtml = allowHtml;
	}-*/;

	/**
	 * Determines if alternating color style will be assigned to odd and even rows.
	 * 
	 * @param alternatingRowStyle
	 */
	public final native void setAlternatingRowStyle(boolean alternatingRowStyle) /*-{
		this.alternatingRowStyle = alternatingRowStyle;
	}-*/;

	/**
	 * An object in which each property name describes a table element, and the property value is a string, defining a
	 * class to assign to that table element. Use this property to assign custom CSS to specific elements of your table.
	 * To use this property, assign an object, where the property name specifies the table element, and the property
	 * value is a string, specifying a class name to assign to that element.
	 * 
	 * @param cssClassNames
	 */
	public final native void setCssClassNames(CssClassNames cssClassNames) /*-{
		this.cssClassNames = cssClassNames;
	}-*/;

	/**
	 * The row number for the first row in the dataTable. Used only if showRowNumber is true.
	 * 
	 * @param firstRowNumber
	 */
	public final native void setFirstRowNumber(int firstRowNumber) /*-{
		this.firstRowNumber = firstRowNumber;
	}-*/;

	/**
	 * If and how to enable paging through the data.
	 * 
	 * @param page
	 */
	public final void setPage(TablePage page) {
		setPage(page.getName());
	}

	/**
	 * The number of rows in each page, when paging is enabled with the page option.
	 * 
	 * @param pageSize default is 10
	 */
	public final native void setPageSize(int pageSize) /*-{
		this.pageSize = pageSize;
	}-*/;

	/**
	 * Adds basic support for right-to-left languages (such as Arabic or Hebrew) by reversing the column order of the
	 * table, so that column zero is the rightmost column, and the last column is the leftmost column. This does not
	 * affect the column index in the underlying data, only the order of display. Full bi-directional (BiDi) language
	 * display is not supported by the table visualization even with this option. This option will be ignored if you
	 * enable paging (using the page option), or if the table has scroll bars because you have specified height and
	 * width options smaller than the required table size.
	 * 
	 * @param rtlTable
	 */
	public final native void setRtlTable(boolean rtlTable) /*-{
		this.rtlTable = rtlTable;
	}-*/;

	/**
	 * Sets the horizontal scrolling position, in pixels, if the table has horizontal scroll bars because you have set
	 * the width property. The table will open scrolled that many pixels past the leftmost column.
	 * 
	 * @param scrollLeftStartPosition
	 */
	public final native void setScrollLeftStartPosition(int scrollLeftStartPosition) /*-{
		this.scrollLeftStartPosition = scrollLeftStartPosition;
	}-*/;

	/**
	 * If set to true, shows the row number as the first column of the table.
	 * 
	 * @param showRowNumber
	 */
	public final native void setShowRowNumber(boolean showRowNumber) /*-{
		this.showRowNumber = showRowNumber;
	}-*/;

	/**
	 * If and how to sort columns when the user clicks a column heading. If sorting is enabled, consider setting the
	 * sortAscending and sortColumn properties as well.
	 * 
	 * @param sort
	 */
	public final void setSort(TableSort sort) {
		setSort(sort.getName());
	}

	/**
	 * The order in which the initial sort column is sorted. True for ascending, false for descending. Ignored if
	 * sortColumn is not specified.
	 * 
	 * @param sortAscending
	 */
	public final native void setSortAscending(boolean sortAscending) /*-{
		this.sortAscending = sortAscending;
	}-*/;

	/**
	 * An index of a column in the data table, by which the table is initially sorted. The column will be marked with a
	 * small arrow indicating the sort order.
	 * 
	 * @param sortColumn
	 */
	public final native void setSortColumn(int sortColumn) /*-{
		this.sortColumn = sortColumn;
	}-*/;

	/**
	 * The first table page to display. Used only if page is in mode enable/event.
	 * 
	 * @param startPage
	 */
	public final native void setStartPage(int startPage) /*-{
		this.startPage = startPage;
	}-*/;

	private final native void setPage(String page) /*-{
		this.page = page;
	}-*/;

	private final native void setSort(String sort) /*-{
		this.sort = sort;
	}-*/;

}
