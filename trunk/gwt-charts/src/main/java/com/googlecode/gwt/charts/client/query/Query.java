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

/**
 * Represents a query that is sent to a data source.
 * 
 * @see <a href="http://developers.google.com/chart/interactive/docs/reference.html#queryobjects"></a>
 */
public class Query extends JavaScriptObject {

	/**
	 * Constructor with data source.
	 * 
	 * @param dataSourceUrl URL to send the query to.
	 * @return a new query opbject
	 */
	public static final native Query create(String dataSourceUrl) /*-{
		return new $wnd.google.visualization.Query(dataSourceUrl);
	}-*/;

	/**
	 * Constructor with data source and options.
	 * 
	 * @param dataSourceUrl URL to send the query to.
	 * @param options A map of options for the request.
	 * @return a new query opbject
	 */
	public static final native Query create(String dataSourceUrl, QueryOptions options) /*-{
		return new $wnd.google.visualization.Query(dataSourceUrl, options);
	}-*/;

	protected Query() {
	}

	/**
	 * Stops the automated query sending that was started with setRefreshInterval().
	 */
	public final native void abort() /*-{
		this.abort();
	}-*/;

	/**
	 * Sends the query to the data source. callback should be a function that will be called when the data source
	 * responds.<br>
	 * The callback function will receive a single parameter of type google.visualization.QueryResponse.
	 * 
	 * @param queryCallback
	 */
	public final native void send(QueryCallback queryCallback) /*-{
		this
				.send(function(response) {
					queryCallback.@com.googlecode.gwt.charts.client.query.QueryCallback::onResponse(Lcom/googlecode/gwt/charts/client/query/QueryResponse;)(response);
				});
	}-*/;

	/**
	 * Sets the query string. The value of the string parameter should be a valid query.
	 * This method, if used, should be called before calling the send method.<br>
	 * Learn more about the <a href="https://developers.google.com/chart/interactive/docs/querylanguage">Query
	 * language</a>.
	 * 
	 * @param query
	 */
	public final native void setQuery(String query) /*-{
		this.setQuery(query);
	}-*/;

	/**
	 * Sets the query to automatically call the send method every specified duration (number of seconds), starting from
	 * the first explicit call to send. seconds is a number greater than or equal to zero.
	 * 
	 * Cancel this method either by calling it again with zero (the default), or by calling abort().
	 * 
	 * @param refreshInterval
	 */
	public final native void setRefreshInterval(int refreshInterval) /*-{
		this.setRefreshInterval(refreshInterval);
	}-*/;

	/**
	 * Sets the number of seconds to wait for the data source to respond before raising a timeout error. seconds is a
	 * number greater than zero.
	 * 
	 * @param timeout the default timeout is 30 seconds.
	 */
	public final native void setTimeout(int timeout) /*-{
		this.setTimeout(timeout);
	}-*/;

}
