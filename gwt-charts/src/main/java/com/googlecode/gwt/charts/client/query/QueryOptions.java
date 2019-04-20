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

import com.google.gwt.core.client.JavaScriptObject;

import com.googlecode.gwt.charts.client.Properties;

/**
 * A map of options for the request.<br>
 * Note: If you are accessing a restricted data source, you should not use this parameter.
 */
public class QueryOptions extends Properties {
	public static QueryOptions create() {
		return JavaScriptObject.createObject().cast();
	}

	protected QueryOptions() {
	}

	/**
	 * A map of parameters for a makeRequest() query. Used and required only if sendMethod is 'makeRequest'.
	 * 
	 * @param params
	 */
	public final native void setMakeRequestParams(JavaScriptObject params) /*-{
		this.makeRequestParams = params;
	}-*/;

	/**
	 * Specifies the method to use to send the query.
	 * 
	 * @param sendMethod
	 */
	public final void setSendMethod(SendMethod sendMethod) {
		setSendMethod(sendMethod.getName());
	}

	protected final native void setSendMethod(String sendMethod) /*-{
		this.sendMethod = sendMethod;
	}-*/;
}
