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

/**
 * Data type of the values of a DataTable column
 */
public enum ColumnType {
	STRING("string"), NUMBER("number"), BOOLEAN("boolean"), DATE("date"), DATETIME("datetime"), TIMEOFDAY("timeofday");

	/**
	 * Get the corresponding ColumnType by name.
	 * @param name a string representing the ColumnType name.
	 * @return a ColumnType corresponding to the provided name.
	 */
	public static ColumnType findByName(String name) {
		for (ColumnType columnType : ColumnType.values()) {
			if (columnType.getName().equals(name)) {
				return columnType;
			}
		}
		return null;
	}

	private final String name;

	private ColumnType(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the ColumnType.
	 * @return the name of the ColumnType.
	 */
	public String getName() {
		return name;
	}
}
