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
 * The direction in which the values along the axis grow.
 */
public enum Direction {
	/**
	 * Natural order.
	 */
	NATURAL(1),
	/**
	 * Reverse the order of the values.
	 */
	REVERSE(-1);

	/**
	 * Get a Direction by providing its value.
	 * 
	 * @param value the Direction value.
	 * @return a Direction corresponding to the provided value.
	 */
	public static Direction findByValue(int value) {
		for (Direction direction : Direction.values()) {
			if (direction.getValue() == value) {
				return direction;
			}
		}
		return null;
	}

	private final int value;

	private Direction(int value) {
		this.value = value;
	}

	/**
	 * Get the value of the Direction.
	 * 
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
}
