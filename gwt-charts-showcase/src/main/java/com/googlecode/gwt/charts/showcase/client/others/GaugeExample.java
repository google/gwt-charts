package com.googlecode.gwt.charts.showcase.client.others;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.gauge.Gauge;
import com.googlecode.gwt.charts.client.gauge.GaugeOptions;

public class GaugeExample extends DockLayoutPanel {
	private Gauge gauge;
	
	public GaugeExample() {
		super(Unit.PX);
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.GAUGE);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				gauge = new Gauge();
				add(gauge);
				draw();
			}
		});
	}

	private void draw() {

		// Prepare the data
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.STRING, "LabelStyle");
		dataTable.addColumn(ColumnType.NUMBER, "Value");
		dataTable.addRows(3);
		dataTable.setValue(0, 0, "Memory");
		dataTable.setValue(0, 1, 80);
		dataTable.setValue(1, 0, "CPU");
		dataTable.setValue(1, 1, 55);
		dataTable.setValue(2, 0, "Network");
		dataTable.setValue(2, 1, 68);

		// Set options
		GaugeOptions options = GaugeOptions.create();
		options.setGreenFrom(0);
		options.setGreenTo(40);
		options.setYellowFrom(40);
		options.setYellowTo(80);
		options.setRedFrom(80);
		options.setRedTo(100);
		
		// Draw the chart
		gauge.draw(dataTable, options);
	}
}
