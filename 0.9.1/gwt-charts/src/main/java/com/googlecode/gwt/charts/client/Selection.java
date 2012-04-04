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

public class Selection extends JavaScriptObject {

	public static Selection create(Integer row, Integer column) {
		Selection selection = createObject().cast();
		selection.setRow(row);
		selection.setColumn(column);
		return selection;
	}
	
	protected Selection() {
	}

	public final native Integer getColumn() /*-{
		return this.column != null ? @java.lang.Integer::valueOf(I)(this.column) : null;
	}-*/;

	public final native Integer getRow() /*-{
		return this.row != null ? @java.lang.Integer::valueOf(I)(this.row) : null;
	}-*/;

	public final native void setColumn(Integer column) /*-{
		if (column == null) {
			delete this.column;
		}
		this.column = column.@java.lang.Integer::intValue();
	}-*/;

	public final native void setRow(Integer row) /*-{
		if (row == null) {
			delete this.row;
		}
		this.row = row.@java.lang.Integer::intValue();
	}-*/;
}
