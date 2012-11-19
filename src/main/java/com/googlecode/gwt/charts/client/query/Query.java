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

	public static final native Query create(String dataSourceUrl) /*-{
		return new $wnd.google.visualization.Query(dataSourceUrl);
	}-*/;

	public static final native Query create(String dataSourceUrl, QueryOptions options) /*-{
		return new $wnd.google.visualization.Query(dataSourceUrl, options);
	}-*/;

	protected Query() {
	}

	public final native void abort() /*-{
		this.abort();
	}-*/;

	public final native void send(QueryCallback queryCallback) /*-{
		this
				.send(function(response) {
					queryCallback.@com.googlecode.gwt.charts.client.query.QueryCallback::onResponse(Lcom/googlecode/gwt/charts/client/query/QueryResponse;)(response);
				});
	}-*/;

	public final native void setQuery(String query) /*-{
		this.setQuery(query);
	}-*/;

	public final native void setRefreshInterval(int refreshInterval) /*-{
		this.setRefreshInterval(refreshInterval);
	}-*/;

	public final native void setTimeout(int timeout) /*-{
		this.setTimeout(timeout);
	}-*/;

}
