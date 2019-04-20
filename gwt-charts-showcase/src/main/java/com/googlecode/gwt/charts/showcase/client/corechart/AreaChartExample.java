package com.googlecode.gwt.charts.showcase.client.corechart;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.corechart.AreaChart;
import com.googlecode.gwt.charts.client.corechart.AreaChartOptions;
import com.googlecode.gwt.charts.client.options.HAxis;
import com.googlecode.gwt.charts.client.options.VAxis;

public class AreaChartExample extends DockLayoutPanel {
	private AreaChart chart;
	
	public AreaChartExample() {
		super(Unit.PX);
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CORECHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				chart = new AreaChart();
				add(chart);
				draw();
			}
		});
	}

	private void draw() {
		String[] countries = new String[] { "Bolivia", "Ecuador", "Madagascar", "Papua Guinea", "Rwanda" };
		String[] months = new String[] { "2004/05", "2005/06", "2006/07", "2007/08", "2008/09" };
		int[][] values = new int[][] { { 165, 135, 157, 139, 136 }, { 938, 1120, 1167, 1110, 691 },
				{ 522, 599, 587, 615, 629 }, { 998, 1268, 807, 968, 1026 }, { 450, 288, 397, 215, 366 } };

		// Prepare the data
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.STRING, "Year");
		for (int i = 0; i < countries.length; i++) {
			dataTable.addColumn(ColumnType.NUMBER, countries[i]);
		}
		dataTable.addRows(months.length);
		for (int i = 0; i < months.length; i++) {
			dataTable.setValue(i, 0, months[i]);
		}
		for (int col = 0; col < values.length; col++) {
			for (int row = 0; row < values[col].length; row++) {
				dataTable.setValue(row, col + 1, values[col][row]);
			}
		}

		// Set options
		AreaChartOptions options = AreaChartOptions.create();
		options.setTitle("Monthly Coffee Production by Country");
		options.setIsStacked(true);
		options.setHAxis(HAxis.create("Cups"));
		options.setVAxis(VAxis.create("Year"));

		// Draw the chart
		chart.draw(dataTable, options);
	}
}
