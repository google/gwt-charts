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

/**
 * Represents a column object for adding to a DataTable.
 */
public class DataColumn extends JavaScriptObject {

	public static DataColumn create(ColumnType type) {
		DataColumn dataColumn = createObject().cast();
		dataColumn.setType(type);
		return dataColumn;
	}

	protected DataColumn() {
	}

	/**
	 * Sets an id for the column.
	 * 
	 * @param id an id for the column
	 */
	public final native void setId(String id) /*-{
		this.id = id;
	}-*/;

	/**
	 * Sets a label for the column.
	 * 
	 * @param label a label for the column
	 */
	public final native void setLabel(String label) /*-{
		this.label = label;
	}-*/;

	public final native void setP(Properties p) /*-{
		this.p = p;
	}-*/;

	/**
	 * Sets a pattern specifying how to display the column value.
	 * 
	 * @param pattern number (or date) format string specifying how to display the column value
	 */
	public final native void setPattern(String pattern) /*-{
		this.pattern = pattern;
	}-*/;

	/**
	 * Sets a role for the column.
	 * 
	 * @param role a role for the column
	 */
	public final void setRole(RoleType role) {
		setRole(role.getName());
	}

	/**
	 * Sets a type for the column.
	 * 
	 * @param type a type for the column
	 */
	public final void setType(ColumnType type) {
		setType(type.getName());
	}

	private final native void setRole(String role) /*-{
		this.role = role;
	}-*/;

	private final native void setType(String type) /*-{
		this.type = type.@com.googlecode.gwt.charts.client.ColumnType::getName();
	}-*/;
}
