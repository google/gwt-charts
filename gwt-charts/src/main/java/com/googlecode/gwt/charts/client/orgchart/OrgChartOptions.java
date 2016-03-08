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
package com.googlecode.gwt.charts.client.orgchart;

import com.googlecode.gwt.charts.client.options.Options;

/**
 * Configuration options for {@link OrgChart}.
 * 
 * @see <a href="https://developers.google.com/chart/interactive/docs/gallery/orgchart#Configuration_Options">Org Chart
 *      Configuration Options</a>
 */
public class OrgChartOptions extends Options {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static OrgChartOptions create() {
		return createObject().cast();
	}

	protected OrgChartOptions() {
	}

	/**
	 * Determines if double click will collapse a node.
	 * 
	 * @param allowCollapse
	 */
	public final native void setAllowCollapse(boolean allowCollapse) /*-{
		this.allowCollapse = allowCollapse;
	}-*/;

	/**
	 * If set to true, names that includes HTML tags will be rendered as HTML.
	 * 
	 * @param allowHtml
	 */
	public final native void setAllowHtml(boolean allowHtml) /*-{
		this.allowHtml = allowHtml;
	}-*/;

	/**
	 * A class name to assign to node elements.<br>
	 * Apply CSS to this class name to specify colors or styles for the chart elements.
	 * 
	 * @param nodeClass
	 */
	public final native void setNodeClass(String nodeClass) /*-{
		this.nodeClass = nodeClass;
	}-*/;

	/**
	 * A class name to assign to selected node elements.<br>
	 * Apply CSS to this class name to specify colors or styles for selected chart elements.
	 * 
	 * @param selectedNodeClass
	 */
	public final native void setSelectedNodeClass(String selectedNodeClass) /*-{
		this.selectedNodeClass = selectedNodeClass;
	}-*/;

	/**
	 * The size of the chart.
	 * 
	 * @param size
	 */
	public final void setSize(OrgChartSize size) {
		setSize(size.getName());
	}

	private final native void setSize(String size) /*-{
		this.size = size;
	}-*/;
}
