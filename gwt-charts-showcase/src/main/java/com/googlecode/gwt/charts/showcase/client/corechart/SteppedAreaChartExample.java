package com.googlecode.gwt.charts.showcase.client.corechart;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.corechart.SteppedAreaChart;
import com.googlecode.gwt.charts.client.corechart.SteppedAreaChartOptions;
import com.googlecode.gwt.charts.client.options.VAxis;

public class SteppedAreaChartExample extends DockLayoutPanel {
	private SteppedAreaChart chart;

	public SteppedAreaChartExample() {
		super(Unit.PX);
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CORECHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				chart = new SteppedAreaChart();
				add(chart);
				draw();
			}
		});
	}

	private void draw() {
		// Prepare the data
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.STRING, "Director (Year)");
		dataTable.addColumn(ColumnType.NUMBER, "Rotten Tomatoes");
		dataTable.addColumn(ColumnType.NUMBER, "IMDB");
		dataTable.addRows(4);
		dataTable.setValue(0, 0, "Alfred Hitchcock (1935)");
		dataTable.setValue(1, 0, "Ralph Thomas (1959)");
		dataTable.setValue(2, 0, "Don Sharp (1978)");
		dataTable.setValue(3, 0, "James Hawes (2008)");
		dataTable.setValue(0, 1, 8.4);
		dataTable.setValue(1, 1, 6.9);
		dataTable.setValue(2, 1, 6.5);
		dataTable.setValue(3, 1, 4.4);
		dataTable.setValue(0, 2, 7.9);
		dataTable.setValue(1, 2, 6.5);
		dataTable.setValue(2, 2, 6.4);
		dataTable.setValue(3, 2, 6.2);

		// Set options
		SteppedAreaChartOptions options = SteppedAreaChartOptions.create();
		options.setBackgroundColor("#f0f0f0");
		options.setFontName("Tahoma");
		options.setTitle("The decline of 'The 39 Steps'");
		options.setVAxis(VAxis.create("Accumulated Rating"));
		options.setIsStacked(true);

		// Draw the chart
		chart.draw(dataTable, options);
	}
}
