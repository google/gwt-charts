package com.googlecode.gwt.charts.showcase.client.corechart;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.corechart.ScatterChart;
import com.googlecode.gwt.charts.client.corechart.ScatterChartOptions;
import com.googlecode.gwt.charts.client.options.HAxis;
import com.googlecode.gwt.charts.client.options.VAxis;

public class ScatterChartExample extends DockLayoutPanel {
	private ScatterChart chart;
	
	public ScatterChartExample() {
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
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.NUMBER, "X");
		dataTable.addColumn(ColumnType.NUMBER, "Shape 1");
		dataTable.addColumn(ColumnType.NUMBER, "Shape 2");
		dataTable.addRows(1000);
		for (int i = 0; i < 500; ++i) {
			dataTable.setValue(i, 0, Math.sin(i / 5.0) * 0.25);
			dataTable.setValue(i, 1, Math.cos(i / 25.0));
		}
		for (int i = 0; i < 500; i++) {
			dataTable.setValue(i + 500, 0, Math.sin(i / 25.0));
			dataTable.setValue(i + 500, 2, Math.cos(i / 10.0) * 0.5);
		}

		// Set options
		ScatterChartOptions options = ScatterChartOptions.create();
		options.setBackgroundColor("#f0f0f0");
		options.setFontName("Tahoma");
		options.setTitle("Cool shapes");
		options.setHAxis(HAxis.create("X"));
		options.setVAxis(VAxis.create("Y"));

		// Draw the chart
		chart.draw(dataTable, options);
	}
}
