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
package com.googlecode.gwt.charts.client.sankey;

import com.googlecode.gwt.charts.client.options.Options;

/**
 * Configuration options for {@link Sankey}.
 */
public class SankeyOptions extends Options {
	public static SankeyOptions create() {
		SankeyOptions sankeyOptions = (SankeyOptions) createObject().cast();
		sankeyOptions.initialize();
		return sankeyOptions;
	}

	protected SankeyOptions() {
	}

	/**
	 * With multilevel sankeys, it's sometimes nonobvious where nodes should be placed for optimal readability. The D3
	 * layout engine experiments with different node layouts, stopping when sankey.iterations attempts have been made.
	 * The larger this number, the more pleasing the layout of complex sankeys, but it comes with a cost: the sankeys
	 * will take longer to render. Conversely, the shorter this number, the quicker your charts will render.
	 * 
	 * @param iterations default value is 32
	 */
	public final native void setIterations(int iterations) /*-{
		this.sankey.iterations = iterations;
	}-*/;

	/**
	 * Controls attributes of the nodes (the vertical bars between links):
	 * 
	 * @param sankeyNode
	 */
	public final native void setNode(SankeyNode sankeyNode) /*-{
		this.sankey.node = sankeyNode;
	}-*/;

	/**
	 * Controls attributes of the connections between nodes.
	 * 
	 * @param sankeyLink
	 */
	public final native void setLink(SankeyLink sankeyLink) /*-{
		this.sankey.link = sankeyLink;
	}-*/;

	/**
	 * Draws the chart inside an inline frame. (Note that on IE8, this option is ignored; all IE8 charts are drawn in
	 * i-frames.)
	 * 
	 * @param forceIFrame true for drawing inside an inline frame
	 */
	public final native void setForceIFrame(boolean forceIFrame) /*-{
		this.forceIFrame = forceIFrame;
	}-*/;

	private final native void initialize() /*-{
		this.sankey = {};
	}-*/;
}
