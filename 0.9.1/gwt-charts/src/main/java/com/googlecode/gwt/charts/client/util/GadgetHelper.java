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
package com.googlecode.gwt.charts.client.util;

import com.google.gwt.core.client.JavaScriptObject;

import com.googlecode.gwt.charts.client.query.Query;
import com.googlecode.gwt.charts.client.query.QueryResponse;

/**
 * A helper class to simplify writing Gadgets that use the Google Visualization API.
 * 
 * @see <a href="http://code.google.com/apis/chart/interactive/docs/reference.html#GadgetHelper">GadgetHelper API
 *      Reference</a>
 */
public class GadgetHelper extends JavaScriptObject {

	public static final native GadgetHelper create() /*-{
		return new $wnd.google.visualization.GadgetHelper();
	}-*/;

	/**
	 * Create a new instance of google.visualization.Query and set its properties according to values from the gadget
	 * preferences. The type of parameter prefs is _IG_Prefs
	 * <ol>
	 * <li>
	 * Preference _table_query_url is used to set the Query data source URL.</li>
	 * <li>Preference _table_query_refresh_interval is used to set the Query refresh interval (in seconds).
	 * </ol>
	 * 
	 * @param prefs gadget API user preferences
	 * @return a new instance of {@link Query}
	 * @see <a href="http://code.google.com/apis/gadgets/docs/reference.html#Userprefs_Ref">Gadget API User
	 *      Preferences</a>
	 */
	public static final native Query createQueryFromPrefs(JavaScriptObject prefs) /*-{
		return $wnd.google.visualization.GadgetHelper.createQueryFromPrefs(prefs);
	}-*/;

	/**
	 * Parameter response is of type google.visualization.QueryResponse. Returns true if the response contains data.
	 * Returns false if the query execution failed and the response does not contain data. If an error occured, this
	 * method displays an error message.
	 * 
	 * @param queryResponse
	 * @return true if the response contains data
	 */
	public static final native boolean validateResponse(QueryResponse queryResponse) /*-{
		return $wnd.google.visualization.GadgetHelper.validateResponse(queryResponse);
	}-*/;

	protected GadgetHelper() {
	}

}
