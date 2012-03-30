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
package com.googlecode.gwt.charts.client;

import com.google.gwt.core.client.JavaScriptObject;

import java.util.Date;

/**
 * Represents a cell object for adding to a DataTable.
 * 
 * @see <a href="http://code.google.com/apis/chart/interactive/docs/reference.html#cell_object">Cell Objects</a>
 */
public class DataCell extends JavaScriptObject {

	public static DataCell create() {
		return createObject().cast();
	}

	protected DataCell() {
	}

	public final native void setF(String f) /*-{
		this.f = f;
	}-*/;

	public final native void setP(Properties p) /*-{
		this.p = p;
	}-*/;

	public final native void setVBoolean(boolean v) /*-{
		this.v = v;
	}-*/;

	public final native void setVDate(Date v) /*-{
		this.v = @com.googlecode.gwt.charts.client.util.DateHelper::getJsDate(Ljava/util/Date;) (v);
	}-*/;

	public final native void setVDouble(double v) /*-{
		this.v = v;
	}-*/;

	public final native void setVInt(int v) /*-{
		this.v = v;
	}-*/;

	public final native void setVNull() /*-{
		this.v = null;
	}-*/;

	public final native void setVString(String v) /*-{
		this.v = v;
	}-*/;

	public final native void setVTimeOfDay(TimeOfDay v) /*-{
		this.v = v;
	}-*/;

}
