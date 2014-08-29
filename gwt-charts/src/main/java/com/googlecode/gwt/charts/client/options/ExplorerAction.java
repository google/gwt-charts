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
 * Available actions for {@link Explorer}.
 */
public enum ExplorerAction {
	/**
	 * Drag to pan around the chart horizontally and vertically.<br>
	 * To pan only along the horizontal axis, use Explorer.setAxis(Axis.HORIZONTAL).<br>
	 * Similarly for the vertical axis.
	 */
	DRAG_TO_PAN("dragToPan"),
	/**
	 * This is a region map.
	 */
	DRAG_TO_ZOOM("dragToZoom"),
	/**
	 * This is a marker map.
	 */
	RIGHT_CLICK_TO_RESET("rightClickToReset");

	/**
	 * Get a ExplorerAction by providing its name.
	 * 
	 * @param name the ExplorerAction name.
	 * @return a ExplorerAction corresponding to the provided name.
	 */
	public static ExplorerAction findByName(String name) {
		for (ExplorerAction explorerAction : ExplorerAction.values()) {
			if (explorerAction.getName().equals(name)) {
				return explorerAction;
			}
		}
		return null;
	}

	private final String name;

	private ExplorerAction(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the ExplorerAction.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
