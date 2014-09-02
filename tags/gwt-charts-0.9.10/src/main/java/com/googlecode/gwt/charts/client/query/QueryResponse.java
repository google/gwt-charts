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
import com.google.gwt.core.client.JsArrayString;

import com.googlecode.gwt.charts.client.DataTable;

/**
 * Represents a response of a query execution as received from the data source. An instance of this class is passed as
 * an argument to the callback function that was set when Query.send was called.
 * 
 * @see Query
 */
public class QueryResponse extends JavaScriptObject {
	protected QueryResponse() {
	}

	/**
	 * Returns the data table as returned by the data source. Returns null if the query execution failed and no data was
	 * returned.
	 * 
	 * @return data table or null if query execution failed
	 */
	public final native DataTable getDataTable() /*-{
		return this.getDataTable();
	}-*/;

	/**
	 * Returns a detailed error message for queries that failed. If the query execution was successful, this method
	 * returns an empty string. The message returned is a message that is intended for developers, and may contain
	 * technical information, for example 'Column {salary} does not exist'.
	 * 
	 * @return a detailed error message for queries that failed
	 */
	public final native String getDetailedMessage() /*-{
		return this.getDetailedMessage();
	}-*/;

	/**
	 * Returns a short error message for queries that failed. If the query execution was successful, this method returns
	 * an empty string. The message returned is a short message that is intended for end users, for example 'Invalid
	 * Query' or 'Access Denied'.
	 * 
	 * @return a short error message for queries that failed
	 */
	public final native String getMessage() /*-{
		return this.getMessage();
	}-*/;

	/**
	 * Returns an array of zero of more entries. Each entry is a short string with an error or warning code that was
	 * raised while executing the query. Possible codes:
	 * <ul>
	 * <li>
	 * access_denied The user does not have permissions to access the data source.</li>
	 * <li>invalid_query The specified query has a syntax error.</li>
	 * <li>data_truncated One or more data rows that match the query selection were not returned due to output size
	 * limits (warning).</li>
	 * <li>timeout The query did not respond within the expected time.
	 * </ul>
	 * 
	 * @return an array of error or warning codes
	 */
	public final native JsArrayString getReasons() /*-{
		return this.getReasons();
	}-*/;

	/**
	 * Returns true if the query execution has any warning messages.
	 * 
	 * @return true if the query execution has any warning messages
	 */
	public final native boolean hasWarning() /*-{
		return this.hasWarning();
	}-*/;

	/**
	 * Returns true if the query execution failed, and the response does not contain any data table. Returns false if
	 * the query execution was successful and the response contains a data table.
	 * 
	 * @return true if the query execution failed, false otherwise
	 */
	public final native boolean isError() /*-{
		return this.isError();
	}-*/;
}
