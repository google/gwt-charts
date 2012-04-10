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

public class ErrorEvent extends Event {

	public static String NAME = "error";
	
	public ErrorEvent(Properties properties) {
		super(NAME, properties);
	}

	public String getDetailedMessage() {
		return properties.getString("detailedMessage");
	}

	public String getId() {
		return properties.getString("id");
	}
	
	public String getMessage() {
		return properties.getString("message");
	}
	
	public Properties getOptions() {
		return properties.getObject("options").cast();
	}
}
