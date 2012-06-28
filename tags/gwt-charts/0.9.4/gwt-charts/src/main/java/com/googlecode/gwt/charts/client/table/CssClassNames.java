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

public class CssClassNames extends JavaScriptObject {
	protected CssClassNames() {
	}

	public final native void setHeaderCell(String headerCell) /*-{
		this.headerCell = headerCell;
	}-*/;

	public final native void setHeaderRow(String headerRow) /*-{
		this.headerRow = headerRow;
	}-*/;

	public final native void setHoverTableRow(String hoverTableRow) /*-{
		this.hoverTableRow = hoverTableRow;
	}-*/;

	public final native void setOddTableRow(String oddTableRow) /*-{
		this.oddTableRow = oddTableRow;
	}-*/;

	public final native void setRowNumberCell(String rowNumberCell) /*-{
		this.rowNumberCell = rowNumberCell;
	}-*/;

	public final native void setSelectedTableRow(String selectedTableRow) /*-{
		this.selectedTableRow = selectedTableRow;
	}-*/;

	public final native void setTableCell(String tableCell) /*-{
		this.tableCell = tableCell;
	}-*/;

	public final native void setTableRow(String tableRow) /*-{
		this.tableRow = tableRow;
	}-*/;
}
