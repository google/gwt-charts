package com.googlecode.gwt.charts.showcase.client.corechart;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.corechart.BubbleChart;
import com.googlecode.gwt.charts.client.corechart.BubbleChartOptions;
import com.googlecode.gwt.charts.client.options.HAxis;
import com.googlecode.gwt.charts.client.options.VAxis;

public class BubbleChartExample extends DockLayoutPanel {
	private BubbleChart chart;
	
	public BubbleChartExample() {
		super(Unit.PX);
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CORECHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				chart = new BubbleChart();
				add(chart);
				draw();
			}
		});
	}

	private void draw() {
		// Prepare the data
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.STRING, "ID");
		dataTable.addColumn(ColumnType.NUMBER, "Life Expectancy");
		dataTable.addColumn(ColumnType.NUMBER, "Fertility Rate");
		dataTable.addColumn(ColumnType.STRING, "Region");
		dataTable.addColumn(ColumnType.NUMBER, "Population");
		dataTable.addRows(4);
		dataTable.setValue(0, 0, "CAN");
		dataTable.setValue(1, 0, "DEU");
		dataTable.setValue(2, 0, "DNK");
		dataTable.setValue(3, 0, "EGY");
		dataTable.setValue(0, 1, 80.66);
		dataTable.setValue(1, 1, 79.84);
		dataTable.setValue(2, 1, 78.6);
		dataTable.setValue(3, 1, 72.73);
		dataTable.setValue(0, 2, 1.67);
		dataTable.setValue(1, 2, 1.36);
		dataTable.setValue(2, 2, 1.84);
		dataTable.setValue(3, 2, 2.78);
		dataTable.setValue(0, 3, "North America");
		dataTable.setValue(1, 3, "Europe");
		dataTable.setValue(2, 3, "Europe");
		dataTable.setValue(3, 3, "Africa");
		dataTable.setValue(0, 4, 33739900);
		dataTable.setValue(1, 4, 81902307);
		dataTable.setValue(2, 4, 5523095);
		dataTable.setValue(3, 4, 79716203);

		// Set options
		BubbleChartOptions options = BubbleChartOptions.create();
		options.setTitle("Correlation between life expectancy, fertility rate and population of some world countries (2010)");
		options.setHAxis(HAxis.create("Life Expectancy"));
		options.setVAxis(VAxis.create("Fertility Rate"));

		// Draw the chart
		chart.draw(dataTable, options);
	}
}
