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
package com.googlecode.gwt.charts.client.query;

public enum SendMethod {
	/**
	 * Send the query using XmlHttpRequest.
	 */
	XHR("xhr"),
	/**
	 * Send the query using script injection.
	 */
	SCRIPT_INJECTION("scriptInjection"),
	/**
	 * [Available only for gadgets] Send the query using the Gadget API makeRequest() method. If specified, you should
	 * also specify makeRequestParams.
	 */
	MAKE_REQUEST("makeRequest"),
	/**
	 * Use the method specified by the tqrt URL parameter from the data source URL. tqrt can have the following values:
	 * 'xhr', 'scriptInjection', or 'makeRequest'. If tqrt is missing or has an invalid value, the default is 'xhr' for
	 * same-domain requests and 'scriptInjection' for cross-domain requests.
	 */
	AUTO("auto");

	private String name;

	private SendMethod(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
