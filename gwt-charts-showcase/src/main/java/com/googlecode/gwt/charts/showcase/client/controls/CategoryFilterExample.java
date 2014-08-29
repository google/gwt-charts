package com.googlecode.gwt.charts.showcase.client.controls;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ChartType;
import com.googlecode.gwt.charts.client.ChartWrapper;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.controls.Dashboard;
import com.googlecode.gwt.charts.client.controls.filter.CategoryFilter;
import com.googlecode.gwt.charts.client.controls.filter.CategoryFilterOptions;
import com.googlecode.gwt.charts.client.controls.filter.CategoryFilterState;
import com.googlecode.gwt.charts.client.controls.filter.CategoryFilterUi;
import com.googlecode.gwt.charts.client.gauge.GaugeOptions;
import com.googlecode.gwt.charts.client.options.SelectedValuesLayout;

public class CategoryFilterExample extends DockLayoutPanel {
	private Dashboard dashboard;
	private ChartWrapper<GaugeOptions> gaugeWrapper;
	private CategoryFilter categoryFilter;

	public CategoryFilterExample() {
		super(Unit.PX);
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CONTROLS);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				addNorth(getDashboardWidget(), 0);
				addWest(getCategoryFilter(), 200);
				add(getGaugeWrapper());
				draw();
			}
		});
	}

	private Dashboard getDashboardWidget() {
		if (dashboard == null) {
			dashboard = new Dashboard();
		}
		return dashboard;
	}

	private ChartWrapper<GaugeOptions> getGaugeWrapper() {
		if (gaugeWrapper == null) {
			gaugeWrapper = new ChartWrapper<GaugeOptions>();
			gaugeWrapper.setChartType(ChartType.GAUGE);
		}
		return gaugeWrapper;
	}

	private CategoryFilter getCategoryFilter() {
		if (categoryFilter == null) {
			categoryFilter = new CategoryFilter();
		}
		return categoryFilter;
	}

	private void draw() {
		// Set control options
		CategoryFilterOptions categoryFilterOptions = CategoryFilterOptions.create();
		categoryFilterOptions.setFilterColumnIndex(0);
		CategoryFilterUi categoryFilterUi = CategoryFilterUi.create();
		categoryFilterUi.setAllowMultiple(true);
		categoryFilterUi.setAllowTyping(false);
		categoryFilterUi.setSelectedValuesLayout(SelectedValuesLayout.BELOW_STACKED);
		categoryFilterOptions.setUi(categoryFilterUi);
		categoryFilter.setOptions(categoryFilterOptions);
		CategoryFilterState categoryFilterState = CategoryFilterState.create();
		categoryFilterState.setSelectedValues("CPU", "Memory");
		categoryFilter.setState(categoryFilterState);

		// Set chart options
		GaugeOptions gaugeOptions = GaugeOptions.create();
		gaugeWrapper.setOptions(gaugeOptions);

		// Prepare the data
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.STRING, "Metric");
		dataTable.addColumn(ColumnType.NUMBER, "Value");
		dataTable.addRow("CPU" , 12);
		dataTable.addRow("Memory", 20);
		dataTable.addRow("Disk", 7);
		dataTable.addRow("Network", 54);

		// Draw the chart
		dashboard.bind(categoryFilter, gaugeWrapper);
		dashboard.draw(dataTable);
	}
}
