package com.googlecode.gwt.charts.showcase.client.corechart;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.Selection;
import com.googlecode.gwt.charts.client.corechart.PieChart;
import com.googlecode.gwt.charts.client.corechart.PieChartOptions;
import com.googlecode.gwt.charts.client.event.ReadyEvent;
import com.googlecode.gwt.charts.client.event.ReadyHandler;

public class PieChartExample extends DockLayoutPanel {
	private PieChart chart;
	
	public PieChartExample() {
		super(Unit.PX);
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CORECHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				chart = new PieChart();
				add(chart);
				draw();
			}
		});
	}

	private void draw() {
		// Prepare the data
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.STRING, "Task");
		dataTable.addColumn(ColumnType.NUMBER, "Hours per Day");
		dataTable.addRows(5);
		dataTable.setValue(0, 0, "Work");
		dataTable.setValue(0, 1, 11);
		dataTable.setValue(1, 0, "Sleep");
		dataTable.setValue(1, 1, 7);
		dataTable.setValue(2, 0, "Watch TV");
		dataTable.setValue(2, 1, 3);
		dataTable.setValue(3, 0, "Eat");
		dataTable.setValue(3, 1, 2);
		dataTable.setValue(4, 0, "Commute");
		dataTable.setValue(4, 1, 1);

		// Set options
		PieChartOptions options = PieChartOptions.create();
		options.setBackgroundColor("#f0f0f0");

		// options.setColors(colors);
		options.setFontName("Tahoma");
		options.setIs3D(false);
		options.setPieResidueSliceColor("#000000");
		options.setPieResidueSliceLabel("Others");
		options.setSliceVisibilityThreshold(0.1);
		options.setTitle("So, how was your day?");

		// Draw the chart
		chart.draw(dataTable, options);
		chart.addReadyHandler(new ReadyHandler() {

			@Override
			public void onReady(ReadyEvent event) {
				chart.setSelection(Selection.create(1, null));
			}
		});
	}

}
