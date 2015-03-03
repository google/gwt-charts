package com.googlecode.gwt.charts.showcase.client.others;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.geochart.GeoChart;
import com.googlecode.gwt.charts.client.geochart.GeoChartColorAxis;
import com.googlecode.gwt.charts.client.geochart.GeoChartOptions;

public class GeoChartExample extends DockLayoutPanel {
	private GeoChart geoChart;

	public GeoChartExample() {
		super(Unit.PX);
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.GEOCHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				geoChart = new GeoChart();
				add(geoChart);
				draw();
			}
		});
	}

	private void draw() {
		// Prepare the data
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.STRING, "Country");
		dataTable.addColumn(ColumnType.NUMBER, "Popularity");
		dataTable.addRows(6);
		dataTable.setValue(0, 0, "Germany");
		dataTable.setValue(0, 1, 200);
		dataTable.setValue(1, 0, "United States");
		dataTable.setValue(1, 1, 300);
		dataTable.setValue(2, 0, "Brazil");
		dataTable.setValue(2, 1, 400);
		dataTable.setValue(3, 0, "Canada");
		dataTable.setValue(3, 1, 500);
		dataTable.setValue(4, 0, "France");
		dataTable.setValue(4, 1, 600);
		dataTable.setValue(5, 0, "RU");
		dataTable.setValue(5, 1, 700);

		// Set options
		GeoChartOptions options = GeoChartOptions.create();
		GeoChartColorAxis geoChartColorAxis = GeoChartColorAxis.create();
		geoChartColorAxis.setColors("green", "yellow", "red");
		options.setColorAxis(geoChartColorAxis);
		options.setDatalessRegionColor("gray");

		// Draw the chart
		geoChart.draw(dataTable, options);
	}
}
