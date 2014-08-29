package com.googlecode.gwt.charts.showcase.client.controls;

import com.google.gwt.core.client.JsArrayMixed;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ChartType;
import com.googlecode.gwt.charts.client.ChartWrapper;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.controls.Dashboard;
import com.googlecode.gwt.charts.client.controls.filter.StringFilter;
import com.googlecode.gwt.charts.client.controls.filter.StringFilterOptions;
import com.googlecode.gwt.charts.client.table.TableOptions;
import com.googlecode.gwt.charts.client.util.ChartHelper;

public class StringFilterExample extends DockLayoutPanel {
	private Dashboard dashboard;
	private ChartWrapper<TableOptions> tableWrapper;
	private StringFilter stringFilter;

	public StringFilterExample() {
		super(Unit.PX);
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CONTROLS);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				addNorth(getDashboardWidget(), 0);
				addNorth(getStringFilter(), 30);
				add(getTableWrapper());
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

	private ChartWrapper<TableOptions> getTableWrapper() {
		if (tableWrapper == null) {
			tableWrapper = new ChartWrapper<TableOptions>();
			tableWrapper.setChartType(ChartType.TABLE);
		}
		return tableWrapper;
	}

	private StringFilter getStringFilter() {
		if (stringFilter == null) {
			stringFilter = new StringFilter();
		}
		return stringFilter;
	}

	private void draw() {
		// Set control options
		StringFilterOptions stringFilterOptions = StringFilterOptions.create();
		stringFilterOptions.setFilterColumnIndex(0);
		stringFilter.setOptions(stringFilterOptions);

		// Generate data
		JsArrayMixed dataArray = JsonUtils
			.unsafeEval("[['Name', 'Age'],['Michael' , 12],['Elisa', 20],['Robert', 7],['John', 54],['Jessica', 22],['Aaron', 3],['Margareth', 42],['Miranda', 33]]");

		// Prepare the data
		DataTable dataTable = ChartHelper.arrayToDataTable(dataArray);

		// Draw the chart
		dashboard.bind(stringFilter, tableWrapper);
		dashboard.draw(dataTable);
	}
}
