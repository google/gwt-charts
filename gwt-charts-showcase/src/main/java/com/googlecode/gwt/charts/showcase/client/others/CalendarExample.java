package com.googlecode.gwt.charts.showcase.client.others;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.calendar.Calendar;
import com.googlecode.gwt.charts.client.calendar.CalendarOptions;
import com.googlecode.gwt.charts.showcase.client.util.DateUtils;

public class CalendarExample extends DockLayoutPanel {
	private Calendar chart;

	public CalendarExample() {
		super(Unit.PX);
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CALENDAR);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				chart = new Calendar();
				add(chart);
				draw();
			}
		});
	}

	private void draw() {
		// Prepare the data
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.DATE, "Date");
		dataTable.addColumn(ColumnType.NUMBER, "Won/Loss");
		dataTable.addRows(13);
		dataTable.setValue(0, 0, DateUtils.create(2012, 3, 13));
		dataTable.setValue(0, 1, 37032);
		dataTable.setValue(1, 0, DateUtils.create(2012, 3, 14));
		dataTable.setValue(1, 1, 38024);
		dataTable.setValue(2, 0, DateUtils.create(2012, 3, 15));
		dataTable.setValue(2, 1, 38024);
		dataTable.setValue(3, 0, DateUtils.create(2012, 3, 16));
		dataTable.setValue(3, 1, 38108);
		dataTable.setValue(4, 0, DateUtils.create(2012, 3, 17));
		dataTable.setValue(4, 1, 38229);
		// Many rows omitted for brevity.
		dataTable.setValue(5, 0, DateUtils.create(2013, 9, 4));
		dataTable.setValue(5, 1, 38177);
		dataTable.setValue(6, 0, DateUtils.create(2013, 9, 5));
		dataTable.setValue(6, 1, 38705);
		dataTable.setValue(7, 0, DateUtils.create(2013, 9, 12));
		dataTable.setValue(7, 1, 38210);
		dataTable.setValue(8, 0, DateUtils.create(2013, 9, 13));
		dataTable.setValue(8, 1, 38029);
		dataTable.setValue(9, 0, DateUtils.create(2013, 9, 19));
		dataTable.setValue(9, 1, 38823);
		dataTable.setValue(10, 0, DateUtils.create(2013, 9, 23));
		dataTable.setValue(10, 1, 38345);
		dataTable.setValue(11, 0, DateUtils.create(2013, 9, 24));
		dataTable.setValue(11, 1, 38436);
		dataTable.setValue(12, 0, DateUtils.create(2013, 9, 30));
		dataTable.setValue(12, 1, 38447);

		// Set options
		CalendarOptions options = CalendarOptions.create();
		options.setTitle("Red Sox Attendance");

		// Draw the chart
		chart.draw(dataTable, options);
	}
}
