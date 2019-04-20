package com.googlecode.gwt.charts.showcase.client.diffchart;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.corechart.PieChart;

public class DiffPieChartExample extends DockLayoutPanel {
	private PieChart chart;

	public DiffPieChartExample() {
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
		DataTable pieOldData = DataTable.create();
		pieOldData.addColumn(ColumnType.STRING, "Major");
		pieOldData.addColumn(ColumnType.NUMBER, "Degrees");
		pieOldData.addRow("Business", 256070);
		pieOldData.addRow("Education", 108034);
		pieOldData.addRow("Social Sciences & History", 127101);
		pieOldData.addRow("Health", 81863);
		pieOldData.addRow("Psychology", 74194);

		DataTable pieNewData = DataTable.create();
		pieNewData.addColumn(ColumnType.STRING, "Major");
		pieNewData.addColumn(ColumnType.NUMBER, "Degrees");
		pieNewData.addRow("Business", 358293);
		pieNewData.addRow("Education", 101265);
		pieNewData.addRow("Social Sciences & History", 172780);
		pieNewData.addRow("Health", 129634);
		pieNewData.addRow("Psychology", 97216);

		// Draw the chart
		chart.draw(chart.computeDiff(pieOldData, pieNewData));
	}
}
