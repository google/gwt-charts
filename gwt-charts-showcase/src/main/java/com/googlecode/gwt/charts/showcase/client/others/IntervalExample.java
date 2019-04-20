package com.googlecode.gwt.charts.showcase.client.others;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataColumn;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.RoleType;
import com.googlecode.gwt.charts.client.corechart.LineChart;
import com.googlecode.gwt.charts.client.corechart.LineChartOptions;
import com.googlecode.gwt.charts.client.options.CurveType;
import com.googlecode.gwt.charts.client.options.Interval;
import com.googlecode.gwt.charts.client.options.IntervalStyle;
import com.googlecode.gwt.charts.client.options.Legend;
import com.googlecode.gwt.charts.client.options.LegendPosition;

public class IntervalExample extends DockLayoutPanel {
	private LineChart chart;

	public IntervalExample() {
		super(Unit.PX);
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CORECHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				chart = new LineChart();
				add(chart);
				draw();
			}
		});
	}

	private void draw() {
		// Prepare the data
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.STRING, "x");
		dataTable.addColumn(ColumnType.NUMBER, "values");
		dataTable.addColumn(DataColumn.create(ColumnType.NUMBER, RoleType.INTERVAL, "i0"));
		dataTable.addColumn(DataColumn.create(ColumnType.NUMBER, RoleType.INTERVAL, "i1"));
		dataTable.addColumn(DataColumn.create(ColumnType.NUMBER, RoleType.INTERVAL, "i2"));
		dataTable.addColumn(DataColumn.create(ColumnType.NUMBER, RoleType.INTERVAL, "i2"));
		dataTable.addColumn(DataColumn.create(ColumnType.NUMBER, RoleType.INTERVAL, "i2"));
		dataTable.addColumn(DataColumn.create(ColumnType.NUMBER, RoleType.INTERVAL, "i2"));
		dataTable.addRow("a", 100, 90, 110, 85, 96, 104, 120);
		dataTable.addRow("b", 120, 95, 130, 90, 113, 124, 140);
		dataTable.addRow("c", 130, 105, 140, 100, 117, 133, 139);
		dataTable.addRow("d", 90, 85, 95, 85, 88, 92, 95);
		dataTable.addRow("e", 70, 74, 63, 67, 69, 70, 72);
		dataTable.addRow("f", 30, 39, 22, 21, 28, 34, 40);
		dataTable.addRow("g", 80, 77, 83, 70, 77, 85, 90);
		dataTable.addRow("h", 100, 90, 110, 85, 95, 102, 110);

		// Set options
		LineChartOptions options = LineChartOptions.create();
		options.setCurveType(CurveType.FUNCTION);
		options.setLineWidth(4);
		options.setTitle("Line intervals, default");
		options.setLegend(Legend.create(LegendPosition.NONE));
		Interval interval0 = Interval.create(IntervalStyle.LINE);
		interval0.setColor("#D3362D");
		interval0.setLineWidth(0.5);
		options.setInterval("i0", interval0);
		Interval interval1 = Interval.create(IntervalStyle.LINE);
		interval1.setColor("#F1CA3A");
		interval1.setLineWidth(1);
		options.setInterval("i1", interval1);
		Interval interval2 = Interval.create(IntervalStyle.LINE);
		interval2.setColor("#5F9654");
		interval2.setLineWidth(2);
		options.setInterval("i2", interval2);

		// Draw the chart
		chart.draw(dataTable, options);
	}
}
