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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Common configuration options for {@link ControlWrapper}.
 * 
 * @param <U> An object with members to configure various aspects of the control's UI.
 */
public abstract class ControlOptions<U extends ControlOptionsUi> extends JavaScriptObject {
	protected ControlOptions() {
		// Default constructor.
	}

	/**
	 * The column of the datatable the filter should operate upon. It is mandatory to provide either this option or
	 * filterColumnLabel. If both present, this option takes precedence.
	 * 
	 * @param filterColumnIndex
	 */
	public final native void setFilterColumnIndex(int filterColumnIndex) /*-{
		this.filterColumnIndex = filterColumnIndex;
	}-*/;

	/**
	 * The label of the column the filter should operate upon. It is mandatory to provide either this option or
	 * filterColumnIndex. If both present, filterColumnIndex takes precedence.
	 * 
	 * @param filterColumnLabel
	 */
	public final native void setFilterColumnLabel(String filterColumnLabel) /*-{
		this.filterColumnLabel = filterColumnLabel;
	}-*/;

	/**
	 * An object with members to configure various aspects of the control's UI.
	 * 
	 * @param ui
	 */
	public final native void setUi(U ui) /*-{
		this.ui = ui;
	}-*/;
}
