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
package com.googlecode.gwt.charts.client.options;

/**
 * The content of the text displayed on the slice.
 */
public enum PieSliceText {
	/**
	 * The percentage of the slice size out of the total.
	 */
	PERCENTAGE("percentage"),
	/**
	 * The quantitative value of the slice.
	 */
	VALUE("value"),
	/**
	 * The name of the slice.
	 */
	LABEL("label"),
	/**
	 * No text is displayed.
	 */
	NONE("none");
	
	/**
	 * Get a PieSliceText by providing its name.
	 * 
	 * @param name the PieSliceText name.
	 * @return a PieSliceText corresponding to the provided name.
	 */
	public static PieSliceText findByName(String name) {
		for (PieSliceText pieSliceText : PieSliceText.values()) {
			if (pieSliceText.getName().equals(name)) {
				return pieSliceText;
			}
		}
		return null;
	}

	private final String name;

	private PieSliceText(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the PieSliceText.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
