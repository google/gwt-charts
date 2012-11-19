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
import com.googlecode.gwt.charts.client.options.TableSort;

public class TableOptions extends Options {
	public static TableOptions create() {
		return createObject().cast();
	}

	protected TableOptions() {
	}

	public final native void setAllowHtml(boolean allowHtml) /*-{
		this.allowHtml = allowHtml;
	}-*/;

	public final native void setAlternatingRowStyle(boolean alternatingRowStyle) /*-{
		this.alternatingRowStyle = alternatingRowStyle;
	}-*/;

	public final native void setCssClassNames(CssClassNames cssClassNames) /*-{
		this.cssClassNames = cssClassNames;
	}-*/;

	public final native void setHAxis(int firstRowNumber) /*-{
		this.firstRowNumber = firstRowNumber;
	}-*/;

	public final native void setPage(int page) /*-{
		this.page = page;
	}-*/;

	public final native void setPageSize(int pageSize) /*-{
		this.pageSize = pageSize;
	}-*/;

	public final native void setRtlTable(boolean rtlTable) /*-{
		this.rtlTable = rtlTable;
	}-*/;

	public final native void setScrollLeftStartPosition(int scrollLeftStartPosition) /*-{
		this.scrollLeftStartPosition = scrollLeftStartPosition;
	}-*/;

	public final native void setShowRowNumber(boolean showRowNumber) /*-{
		this.showRowNumber = showRowNumber;
	}-*/;

	public final native void setSort(String sort) /*-{
		this.sort = sort;
	}-*/;

	public final void setSort(TableSort sort) {
		setSort(sort.getName());
	}

	public final native void setSortAscending(boolean sortAscending) /*-{
		this.sortAscending = sortAscending;
	}-*/;

	public final native void setSortColumn(int sortColumn) /*-{
		this.sortColumn = sortColumn;
	}-*/;

	public final native void setStartPage(int startPage) /*-{
		this.startPage = startPage;
	}-*/;

}
