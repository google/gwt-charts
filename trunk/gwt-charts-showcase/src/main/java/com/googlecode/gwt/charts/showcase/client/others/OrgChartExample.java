package com.googlecode.gwt.charts.showcase.client.others;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.format.PatternFormat;
import com.googlecode.gwt.charts.client.orgchart.OrgChart;
import com.googlecode.gwt.charts.client.orgchart.OrgChartOptions;

public class OrgChartExample extends DockLayoutPanel {
	private OrgChart chart;

	public OrgChartExample() {
		super(Unit.PX);
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.ORGCHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				chart = new OrgChart();
				add(chart);
				draw();
			}
		});
	}

	private void draw() {
		// Prepare the data
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.STRING, "Name");
		dataTable.addColumn(ColumnType.STRING, "Manager");
		dataTable.addColumn(ColumnType.STRING, "ToolTip");
		dataTable.addRows(5);
		
		dataTable.setValue(0, 0, "Mike");
		dataTable.setValue(0, 1, "");
		dataTable.setValue(0, 2, "The President");
		dataTable.setValue(1, 0, "Jim");
		dataTable.setValue(1, 1, "Mike");
		dataTable.setValue(1, 2, "VP");
		dataTable.setValue(2, 0, "Alice");
		dataTable.setValue(2, 1, "Mike");
		dataTable.setValue(2, 2, "");
		dataTable.setValue(3, 0, "Bob");
		dataTable.setValue(3, 1, "Jim");
		dataTable.setValue(3, 2, "Bob Sponge");
		dataTable.setValue(4, 0, "Carol");
		dataTable.setValue(4, 1, "Bob");
		dataTable.setValue(4, 2, "");

		PatternFormat format = PatternFormat.create("{0}<div style=\"color:red; font-style:italic\">{1}</div>");
		format.format(dataTable, 0, 2);
		
		// Set options
		OrgChartOptions options = OrgChartOptions.create();
		options.setAllowHtml(true);

		// Draw the chart
		chart.draw(dataTable, options);
	}
}
