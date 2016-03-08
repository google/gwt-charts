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

/**
 * Fired when the user interacts with the control, affecting its state. For example, a statechange event will fire
 * whenever you move the thumbs of a range slider control. To retrieve an updated control state after the event fired,
 * call ControlWrapper.getState().
 */
public class StateChangeEvent extends Event {
	/**
	 * The event name.
	 */
	public static String NAME = "statechange";

	/**
	 * Creates a new event.
	 * 
	 * @param properties
	 */
	public StateChangeEvent(Properties properties) {
		super(NAME, properties);
	}

}
