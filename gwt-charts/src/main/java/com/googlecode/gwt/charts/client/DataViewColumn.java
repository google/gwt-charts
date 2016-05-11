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
 * Represents a calculated column. A calculated column creates a value on the fly for each row and adds it to the view.
 */
public class DataViewColumn extends JavaScriptObject {

	/**
	 * Default constructor.
	 * 
	 * @param columnFunction a function for calculating each row value
	 * @param type data type of the data in the column.
	 * 
	 * @return the new column
	 */
	public static DataViewColumn create(ColumnFunction columnFunction, ColumnType type) {
		DataViewColumn dataColumn = createObject().cast();
		dataColumn.setCalc(columnFunction);
		dataColumn.setType(type);
		return dataColumn;
	}

	/**
	 * Creates a new column
	 * This is similar to passing in a number instead of an object, but enables you to specify a role and properties for
	 * the new column.
	 * 
	 * @param sourceColumn
	 * @return the new column
	 */
	public static DataViewColumn create(int sourceColumn) {
		DataViewColumn dataColumn = createObject().cast();
		dataColumn.setSourceColumn(sourceColumn);
		return dataColumn;
	}

	protected DataViewColumn() {
	}

	/**
	 * Sets a function that will be called for each row in the column to calculate a value for that cell.
	 * 
	 * @param columnFunction a function for calculating each row value
	 */
	public final native void setCalc(ColumnFunction columnFunction) /*-{
		this.calc = function(dataTable, row) {
			return columnFunction.@com.googlecode.gwt.charts.client.ColumnFunction::calc(Lcom/googlecode/gwt/charts/client/DataTable;I) (dataTable, row);
		};
	}-*/;

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
	 * Sets a pattern specifying how to display the column value.
	 * 
	 * @param pattern number (or date) format string specifying how to display the column value
	 */
	public final native void setPattern(String pattern) /*-{
		this.pattern = pattern;
	}-*/;

	/**
	 * Sets an object containing any arbitrary properties to assign to this column. If not specified, the view column
	 * will have no properties.
	 * 
	 * @param properties a map of custom values applied to the cell.
	 */
	public final native void setProperties(Properties properties) /*-{
		this.properties = properties;
	}-*/;

	/**
	 * Sets a role for the column.
	 * If not specified, the existing role will not be imported.
	 * 
	 * @param role a role for the column
	 */
	public final void setRole(RoleType role) {
		setRole(role.getName());
	}

	/**
	 * Sets the source column to use as a value; if specified, do not specify the calc or the type property. This is
	 * similar to passing in a number instead of an object, but enables you to specify a role and properties for the new
	 * column.
	 * 
	 * @param sourceColumn a source column to use as a value
	 */
	public final native void setSourceColumn(int sourceColumn) /*-{
		this.sourceColumn = sourceColumn;
	}-*/;

	/**
	 * Sets a type for the column.
	 * Used as type of the value that the calc function returns
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
		this.type = type;
	}-*/;
}
