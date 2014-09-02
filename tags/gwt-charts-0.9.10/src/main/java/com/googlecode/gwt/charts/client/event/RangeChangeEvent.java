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
package com.googlecode.gwt.charts.client.event;

import com.googlecode.gwt.charts.client.Properties;

import java.util.Date;

/**
 * Fired when the user changes the range slider.
 */
public class RangeChangeEvent extends Event {
	/**
	 * The event name.
	 */
	public static String NAME = "rangechange";

	/**
	 * Creates a new event.
	 * 
	 * @param properties
	 */
	public RangeChangeEvent(Properties properties) {
		super(NAME, properties);
	}

	/**
	 * Range end endpoint.
	 * 
	 * @return index of page
	 */
	public Date getEnd() {
		return properties.getDate("end");
	}

	/**
	 * Range start endpoint.
	 * 
	 * @return index of page
	 */
	public Date getStart() {
		return properties.getDate("start");
	}
}
