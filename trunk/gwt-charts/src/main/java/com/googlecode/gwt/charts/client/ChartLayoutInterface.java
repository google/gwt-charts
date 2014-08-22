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

public class ChartLayoutInterface extends JavaScriptObject {

	protected ChartLayoutInterface() {
	}

	/**
	 * Returns an object containing the left, top, width, and height of chart element id.<br>
	 * The format for id isn't yet
	 * documented (they're the return values of event handlers), but here are some examples:
	 * <p>
	 * <code>ChartLayoutInterface cli = chart.getChartLayoutInterface();</code>
	 * </p>
	 * <h3>Height of the chart area</h3> <code>cli.getBoundingBox("chartarea").getHeight()</code> <h3>Width of the third
	 * bar in the first series of a bar or column chart</h3> <code>cli.getBoundingBox("bar#0#2").getWidth()</code> <h3>
	 * Bounding box of the fifth wedge of a pie chart</h3> <code>cli.getBoundingBox("slice#4")</code> <h3>Bounding box
	 * of the chart data of a vertical (e.g., column) chart:</h3> <code>cli.getBoundingBox("vAxis#0#gridline")</code>
	 * <h3>
	 * Bounding box of the chart data of a horizontal (e.g., bar) chart:</h3>
	 * <code>cli.getBoundingBox("hAxis#0#gridline")</code>
	 * <p>
	 * Values are relative to the container of the chart. Call this after the chart is drawn.
	 * </p>
	 * 
	 * @return a BoundingBox
	 */
	public final native BoundingBox getBoundingBox()/*-{
		return this.getBoundingBox();
	}-*/;

	/**
	 * Returns an object containing the left, top, width, and height of the chart content.<br>
	 * Call this after the chart is drawn.
	 * 
	 * @return a BoundingBox
	 */
	public final native BoundingBox getChartAreaBoundingBox()/*-{
		return this.getChartAreaBoundingBox();
	}-*/;

	public final native int getHAxisValue(int position)/*-{
		return this.getHAxisValue(position);
	}-*/;

	public final native int getHAxisValue(int position, int axisIndex)/*-{
		return this.getHAxisValue(position, axisIndex);
	}-*/;

	public final native int getVAxisValue(int position)/*-{
		return this.getVAxisValue(position);
	}-*/;

	public final native int getVAxisValue(int position, int axisIndex)/*-{
		return this.getVAxisValue(position, axisIndex);
	}-*/;

	public final native int getXLocation(int position)/*-{
		return this.getXLocation(position);
	}-*/;

	public final native int getXLocation(int position, int axisIndex)/*-{
		return this.getXLocation(position, axisIndex);
	}-*/;

	public final native int getYLocation(int position)/*-{
		return this.getYLocation(position);
	}-*/;

	public final native int getYLocation(int position, int axisIndex)/*-{
		return this.getYLocation(position, axisIndex);
	}-*/;
}
