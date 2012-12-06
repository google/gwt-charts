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

	/**
	 * Default static constructor
	 * 
	 * @param type data type of the data in the column.
	 * 
	 * @return a new object
	 */
	public static DataColumn create(ColumnType type) {
		DataColumn dataColumn = createObject().cast();
		dataColumn.setType(type);
		return dataColumn;
	}

	/**
	 * Default static constructor
	 * 
	 * @param type data type of the data in the column.
	 * @param role a role for the column
	 * 
	 * @return a new object
	 */
	public static DataColumn create(ColumnType type, RoleType role) {
		DataColumn dataColumn = createObject().cast();
		dataColumn.setType(type);
		dataColumn.setRole(role);
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

	/**
	 * An object that is a map of custom values applied to the cell. These values can be of any JavaScript type. If your
	 * visualization supports any cell-level properties, it will describe them; otherwise, this property will be
	 * ignored.<br>
	 * Has no effect when added to a DataTable.
	 * 
	 * @param p a map of custom values applied to the cell.
	 */
	public final void setP(Properties p) {
		// A workaround for a unexplainable difference between a DataTable and a literal column
		// setP uses the setRole value if already set
		if (!p.containsKey("role")) {
			String role = getRole();
			if (role != null) {
				p.set("role", role);
			}
		}
		setP(p);
	}

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
		// A workaround for a unexplainable difference between a DataTable and a literal column
		// This way setRole works for either cases
		Properties properties = getP();
		if (properties == null) {
			properties = Properties.create();
		}
		properties.set("role", role.getName());
	}

	/**
	 * Sets a type for the column.
	 * 
	 * @param type a type for the column
	 */
	public final void setType(ColumnType type) {
		setType(type.getName());
	}

	private final native Properties getP() /*-{
		return this.p;
	}-*/;

	private final native String getRole() /*-{
		return this.role;
	}-*/;

	private final native void setProperties(Properties p) /*-{
		this.p = p;
	}-*/;

	private final native void setRole(String role) /*-{
		this.role = role;
	}-*/;

	private final native void setType(String type) /*-{
		this.type = type.@com.googlecode.gwt.charts.client.ColumnType::getName();
	}-*/;

}
