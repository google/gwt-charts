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
 * An object with members to configure various vertical axis elements.
 */
public class VAxis extends Axis {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static VAxis create() {
		return createObject().cast();
	}

	/**
	 * Constructor with title.
	 * 
	 * @param title axis title
	 * 
	 * @return a new object instance
	 */
	public static VAxis create(String title) {
		VAxis vAxis = createObject().cast();
		vAxis.setTitle(title);
		return vAxis;
	}

	protected VAxis() {
	}

}
