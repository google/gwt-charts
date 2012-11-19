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

import com.googlecode.gwt.charts.client.event.CancelEvent;
import com.googlecode.gwt.charts.client.event.CancelHandler;
import com.googlecode.gwt.charts.client.event.HandlerRef;
import com.googlecode.gwt.charts.client.event.OkEvent;
import com.googlecode.gwt.charts.client.event.OkHandler;

/**
 * The ChartEditor class is used to open an in-page dialog box that enables a user to customize a visualization on the
 * fly.<br>
 * To use ChartEditor:
 * <ul>
 * <li>Load the {@link ChartPackage#CHARTEDITOR} package. You do not need to load the packages for the chart type that
 * you render in the editor; the chart editor will load that package for you.</li>
 * <li>Create a ChartWrapperObject object that defines the chart for the user to customize. This chart will be shown in the
 * dialog, and the user uses the editor to redesign the chart, change chart types, or even change the source data.</li>
 * <li>Create a new ChartEditor instance, and register to listen for the "ok" event. This event is thrown when the user
 * clicks the "OK" button on the dialog. When received, you should call ChartEditor.getChartWrapper() to retrieve the
 * user-modified chart.</li>
 * <li>Call ChartEditor.openDialog(), passing in the ChartWrapperObject. This opens the dialog. The dialog buttons enable the
 * user to close the editor. The ChartEditor instance is available as long as it is in scope; it is not automatically
 * destroyed after the user closes the dialog.</li>
 * <li>To update the chart in code, call setChartWrapper().</li>
 * </ul>
 */
public class ChartEditor extends HasListeners {
	/**
	 * Creates a empty ChartEditor instance.
	 * 
	 * @return a new ChartEditor instance
	 */
	public static native ChartEditor create() /*-{
		return new $wnd.google.visualization.ChartEditor();
	}-*/;

	// TODO implement chart editor options: dataSourceInput
	protected ChartEditor() {
		// Default constructor
	}
	
	/**
	 * Fired when the user clicks the "Cancel" button on the dialog.
	 * 
	 * @param handler the error handler
	 * @return a reference for removing this handler
	 */
	public final HandlerRef addCancelHandler(CancelHandler handler) {
		return addListener(CancelEvent.NAME, handler);
	}

	/**
	 * Fired when the user clicks the "OK" button on the dialog. After receiving this method, you should call
	 * getChartWrapper() to retrieve the user-configured chart.
	 * 
	 * @param handler the ready handler
	 * @return a reference for removing this handler
	 */
	public final HandlerRef addOkHandler(OkHandler handler) {
		return addListener(OkEvent.NAME, handler);
	}

	/**
	 * Opens the chart editor as an embedded dialog box on the page. The function returns immediately; it does not wait
	 * for the dialog to be closed. If you do not lose scope of the instance, you can call openDialog() again to reopen
	 * the dialog, although you must pass in a ChartWrapperObject object again.
	 * 
	 * @param chartWrapperObject A ChartWrapperObject object defining the initial chart to render in the window. The chart
	 *        must either have a populated DataTable, or be connected to a valid data source. This wrapper is copied
	 *        internally to the chart editor, so any later changes that you make to your ChartWrapperObject handle will not be
	 *        reflected in
	 *        the chart editor's copy.
	 */
	public final native void openDialog(ChartWrapper<?> chartWrapperObject)/*-{
		this.openDialog(chartWrapperObject);
	}-*/;

	/**
	 * Closes the chart editor dialog box.
	 */
	public final native void closeDialog()/*-{
		this.closeDialog(chartWrapperObject);
	}-*/;

	/**
	 * Returns a ChartWrapperObject representing the chart, with user modifications.
	 * 
	 * @return a ChartWrapperObject representing the chart
	 */
	public final native ChartWrapper<?> getChartWrapper()/*-{
		return this.getChartWrapper();
	}-*/;

	/**
	 * Use this method to update the rendered chart on the editor.
	 * 
	 * @param chartWrapperObject A ChartWrapperObject object representing the new chart to render. The chart must either have
	 *        a populated DataTable, or be connected to a valid data source.
	 */
	public final native void setChartWrapper(ChartWrapper<?> chartWrapperObject)/*-{
		this.setChartWrapper(chartWrapperObject);
	}-*/;
}
