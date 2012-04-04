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
package com.googlecode.gwt.charts.client.controls;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;

import com.googlecode.gwt.charts.client.ChartWrapperObject;
import com.googlecode.gwt.charts.client.DataSource;
import com.googlecode.gwt.charts.client.HasListeners;

public class DashboardObject extends HasListeners {

	public static native DashboardObject create(Element container) /*-{
		return new $wnd.google.visualization.Dashboard(container);
	}-*/;

	protected DashboardObject() {
	}

	public final native void bind(ControlWrapperObject<?> controlWrapper, ChartWrapperObject<?> chartWrapper) /*-{
		this.bind(controlWrapper, chartWrapper);
	}-*/;

	public final native void bind(JsArray<ControlWrapperObject<?>> controlWrappers, JsArray<ChartWrapperObject<?>> chartWrappers) /*-{
		this.bind(controlWrappers, chartWrappers);
	}-*/;

	public final native void draw(DataSource data) /*-{
		this.draw(data);
	}-*/;

}
