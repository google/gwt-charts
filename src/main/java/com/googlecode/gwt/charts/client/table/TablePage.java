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

/**
 * Defines table paging.
 */
public enum TablePage {
	/**
	 * The table will include page-forward and page-back buttons. Clicking on these buttons will perform the paging
	 * operation and change the displayed page. You might want to also set the pageSize option.
	 */
	ENABLE("enable"),
	/**
	 * The table will include page-forward and page-back buttons, but clicking them will trigger a 'page' event and will
	 * not change the displayed page. This option should be used when the code implements its own page turning logic.
	 * See the TableQueryWrapper example for an example of how to handle paging events manually.
	 */
	EVENT("event"),
	/**
	 * Paging is not supported.
	 */
	DISABLE("disable");

	/**
	 * Get a TablePage by providing its name.
	 * 
	 * @param name the TablePage name.
	 * @return a TablePage corresponding to the provided name.
	 */
	public static TablePage findByName(String name) {
		for (TablePage tablePage : TablePage.values()) {
			if (tablePage.getName().equals(name)) {
				return tablePage;
			}
		}
		return null;
	}

	private final String name;

	private TablePage(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the TablePage.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
