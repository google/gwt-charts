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
 * The shape of individual data elements.
 */
public enum PointShapeType {
	/**
	 * Circle.
	 */
	CIRCLE("circle"),
	/**
	 * Triangle.
	 */
	TRIANGLE("triangle"),
	/**
	 * Square.
	 */
	SQUARE("square"),
	/**
	 * Diamond.
	 */
	DIAMOND("diamond"),
	/**
	 * Star.
	 */
	STAR("star"),
	/**
	 * Polygon.
	 */
	POLYGON("polygon");

	/**
	 * Get an PointShapeType by providing its name.
	 * 
	 * @param name the PointShapeType name.
	 * @return an PointShapeType corresponding to the provided name.
	 */
	public static PointShapeType findByName(String name) {
		for (PointShapeType pointShapeType : PointShapeType.values()) {
			if (pointShapeType.getName().equals(name)) {
				return pointShapeType;
			}
		}
		return null;
	}

	private final String name;

	private PointShapeType(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the PointShapeType.
	 * @return the name of the PointShapeType.
	 */
	public String getName() {
		return name;
	}
}
