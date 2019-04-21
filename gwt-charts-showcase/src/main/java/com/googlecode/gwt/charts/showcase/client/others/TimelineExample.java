package com.googlecode.gwt.charts.showcase.client.others;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.format.PatternFormat;
import com.googlecode.gwt.charts.client.timeline.Timeline;
import com.googlecode.gwt.charts.client.timeline.TimelineOptions;
import com.googlecode.gwt.charts.showcase.client.util.DateUtils;

public class TimelineExample extends DockLayoutPanel {
	private Timeline timeline;

	public TimelineExample() {
		super(Unit.PX);
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.TIMELINE);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				timeline = new Timeline();
				add(timeline);
				draw();
			}
		});
	}

	private void draw() {
		// Prepare the data
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.STRING, "Term");
		dataTable.addColumn(ColumnType.STRING, "Name");
		dataTable.addColumn(ColumnType.DATE, "Start");
		dataTable.addColumn(ColumnType.DATE, "End");
		dataTable.addRows(3);
		
		dataTable.setValue(0, 0, "1");
		dataTable.setValue(0, 1, "George Washington");
		dataTable.setValue(0, 2, DateUtils.create(1789, 3, 29));
		dataTable.setValue(0, 3, DateUtils.create(1797, 2, 3));
		dataTable.setValue(1, 0, "2");
		dataTable.setValue(1, 1, "John Adams");
		dataTable.setValue(1, 2, DateUtils.create(1797, 2, 3));
		dataTable.setValue(1, 3, DateUtils.create(1801, 2, 3));
		dataTable.setValue(2, 0, "3");
		dataTable.setValue(2, 1, "Thomas Jefferson");
		dataTable.setValue(2, 2, DateUtils.create(1801, 2, 3));
		dataTable.setValue(2, 3, DateUtils.create(1809, 2, 3));


		PatternFormat format = PatternFormat.create("{0}<div style=\"color:red; font-style:italic\">{1}</div>");
		format.format(dataTable, 0, 2);
		
		// Set options
		TimelineOptions options = TimelineOptions.create();
		options.setShowRowLabels(false);

		// Draw the chart
		timeline.draw(dataTable, options);
	}
}
