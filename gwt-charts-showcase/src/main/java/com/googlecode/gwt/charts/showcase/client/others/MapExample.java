package com.googlecode.gwt.charts.showcase.client.others;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.map.Map;
import com.googlecode.gwt.charts.client.map.MapOptions;
import com.googlecode.gwt.charts.client.util.ChartHelper;

public class MapExample extends DockLayoutPanel {
	private Map chart;

	public MapExample() {
		super(Unit.PX);
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.MAP);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				chart = new Map();
				add(chart);
				draw();
			}
		});
	}

	private void draw() {
		// Prepare the data
		Object[][] data = new Object[][] { { "Country", "Population" }, { "China", "China: 1,363,800,000" },
				{ "India", "India: 1,242,620,000" }, { "US", "US: 317,842,000" },
				{ "Indonesia", "Indonesia: 247,424,598" }, { "Brazil", "Brazil: 201,032,714" },
				{ "Pakistan", "Pakistan: 186,134,000" }, { "Nigeria", "Nigeria: 173,615,000" },
				{ "Bangladesh", "Bangladesh: 152,518,015" }, { "Russia", "Russia: 146,019,512" },
				{ "Japan", "Japan: 127,120,000" } };
		DataTable dataTable = ChartHelper.arrayToDataTable(data);

		// Set options
		MapOptions options = MapOptions.create();
		options.setShowTip(true);

		// Draw the chart
		chart.draw(dataTable, options);
	}
}
