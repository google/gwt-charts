package com.googlecode.gwt.charts.showcase.client.others;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.annotationchart.AnnotationChart;
import com.googlecode.gwt.charts.client.annotationchart.AnnotationChartOptions;
import com.googlecode.gwt.charts.showcase.client.util.DateUtils;

public class AnnotationChartExample extends DockLayoutPanel {
	private AnnotationChart chart;

	public AnnotationChartExample() {
		super(Unit.PX);
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.ANNOTATIONCHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				chart = new AnnotationChart();
				add(chart);
				draw();
			}
		});
	}

	private void draw() {
		// Prepare the data
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.DATE, "Country");
		dataTable.addColumn(ColumnType.NUMBER, "Kepler-22b mission");
		dataTable.addColumn(ColumnType.STRING, "Kepler title");
		dataTable.addColumn(ColumnType.STRING, "Kepler text");
		dataTable.addColumn(ColumnType.NUMBER, "Gliese 163 mission");
		dataTable.addColumn(ColumnType.STRING, "Gliese title");
		dataTable.addColumn(ColumnType.STRING, "Gliese text");
		dataTable.addRows(6);
		dataTable.setValue(0, 0, DateUtils.create(2314, 2, 15));
		dataTable.setValue(0, 1, 12400);
		dataTable.setValue(0, 4, 10645);
		dataTable.setValue(1, 0, DateUtils.create(2314, 2, 16));
		dataTable.setValue(1, 1, 24045);
		dataTable.setValue(1, 2, "Lalibertines");
		dataTable.setValue(1, 3, "First encounter");
		dataTable.setValue(1, 4, 12374);
		dataTable.setValue(2, 0, DateUtils.create(2314, 2, 17));
		dataTable.setValue(2, 1, 35022);
		dataTable.setValue(2, 2, "Lalibertines");
		dataTable.setValue(2, 3, "They are very tall");
		dataTable.setValue(2, 4, 15766);
		dataTable.setValue(2, 5, "Gallantors");
		dataTable.setValue(2, 6, "First Encounter");
		dataTable.setValue(3, 0, DateUtils.create(2314, 2, 18));
		dataTable.setValue(3, 1, 12284);
		dataTable.setValue(3, 2, "Lalibertines");
		dataTable.setValue(3, 3, "Attack on our crew!");
		dataTable.setValue(3, 4, 34334);
		dataTable.setValue(3, 5, "Gallantors");
		dataTable.setValue(3, 6, "Statement of shared principles");
		dataTable.setValue(4, 0, DateUtils.create(2314, 2, 19));
		dataTable.setValue(4, 1, 8476);
		dataTable.setValue(4, 2, "Lalibertines");
		dataTable.setValue(4, 3, "Heavy casualties");
		dataTable.setValue(4, 4, 66467);
		dataTable.setValue(4, 5, "Gallantors");
		dataTable.setValue(4, 6, "Mysteries revealed");
		dataTable.setValue(5, 0, DateUtils.create(2314, 2, 20));
		dataTable.setValue(5, 1, 0);
		dataTable.setValue(5, 2, "Lalibertines");
		dataTable.setValue(5, 3, "All crew lost");
		dataTable.setValue(5, 4, 79463);
		dataTable.setValue(5, 5, "Gallantors");
		dataTable.setValue(5, 6, "Omniscience achieved");

		// Set options
		AnnotationChartOptions options = AnnotationChartOptions.create();
		options.setDisplayAnnotations(true);

		// Draw the chart
		chart.draw(dataTable, options);
	}
}
