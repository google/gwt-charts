package com.googlecode.gwt.charts.showcase.client.diffchart;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.corechart.ScatterChart;
import com.googlecode.gwt.charts.client.util.ChartHelper;

public class DiffScatterChartExample extends DockLayoutPanel {
	private ScatterChart chart;

	public DiffScatterChartExample() {
		super(Unit.PX);
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CORECHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				chart = new ScatterChart();
				add(chart);
				draw();
			}
		});
	}

	private void draw() {
		// Prepare the data
		DataTable scatterOldData = ChartHelper.arrayToDataTable(new Object[][] { { "", "Medicine 1", "Medicine 2" },
				{ 23, null, 12 }, { 9, null, 39 }, { 15, null, 28 }, { 37, null, 30 }, { 21, null, 14 },
				{ 12, null, 18 }, { 29, null, 34 }, { 8, null, 12 }, { 38, null, 28 }, { 35, null, 12 },
				{ 26, null, 10 }, { 10, null, 29 }, { 11, null, 10 }, { 27, null, 38 }, { 39, null, 17 },
				{ 34, null, 20 }, { 38, null, 5 }, { 33, null, 27 }, { 23, null, 39 }, { 12, null, 10 },
				{ 8, 15, null }, { 39, 15, null }, { 27, 31, null }, { 30, 24, null }, { 31, 39, null },
				{ 35, 6, null }, { 5, 5, null }, { 19, 39, null }, { 22, 8, null }, { 19, 23, null }, { 27, 20, null },
				{ 11, 6, null }, { 34, 33, null }, { 38, 8, null }, { 39, 29, null }, { 13, 23, null },
				{ 13, 36, null }, { 39, 6, null }, { 14, 37, null }, { 13, 39, null } }, false);
		DataTable scatterNewData = ChartHelper.arrayToDataTable(new Object[][] { { "", "Medicine 1", "Medicine 2" },
				{ 22, null, 12 }, { 7, null, 40 }, { 14, null, 31 }, { 37, null, 30 }, { 18, null, 17 },
				{ 9, null, 20 }, { 26, null, 36 }, { 5, null, 13 }, { 36, null, 30 }, { 35, null, 15 },
				{ 24, null, 12 }, { 7, null, 31 }, { 10, null, 12 }, { 24, null, 40 }, { 37, null, 18 },
				{ 32, null, 21 }, { 35, null, 7 }, { 31, null, 30 }, { 21, null, 42 }, { 12, null, 10 },
				{ 10, 13, null }, { 40, 12, null }, { 28, 29, null }, { 32, 22, null }, { 31, 37, null },
				{ 38, 5, null }, { 6, 4, null }, { 21, 36, null }, { 22, 8, null }, { 21, 22, null }, { 28, 17, null },
				{ 12, 5, null }, { 37, 30, null }, { 41, 7, null }, { 41, 27, null }, { 15, 20, null },
				{ 14, 36, null }, { 42, 3, null }, { 14, 37, null }, { 15, 36, null } });

		// Draw the chart
		chart.draw(chart.computeDiff(scatterOldData, scatterNewData));
	}
}
