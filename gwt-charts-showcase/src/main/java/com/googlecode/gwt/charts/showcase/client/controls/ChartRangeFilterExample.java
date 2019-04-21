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
import com.googlecode.gwt.charts.client.controls.filter.ChartRangeFilter;
import com.googlecode.gwt.charts.client.controls.filter.ChartRangeFilterOptions;
import com.googlecode.gwt.charts.client.controls.filter.ChartRangeFilterState;
import com.googlecode.gwt.charts.client.controls.filter.ChartRangeFilterStateRange;
import com.googlecode.gwt.charts.client.controls.filter.ChartRangeFilterUi;
import com.googlecode.gwt.charts.client.corechart.LineChartOptions;
import com.googlecode.gwt.charts.client.options.ChartArea;
import com.googlecode.gwt.charts.client.options.Legend;
import com.googlecode.gwt.charts.client.options.LegendPosition;
import com.googlecode.gwt.charts.showcase.client.util.DateUtils;

public class ChartRangeFilterExample extends DockLayoutPanel {
	private Dashboard dashboard;
	private ChartWrapper<LineChartOptions> lineChart;
	private ChartRangeFilter numberRangeFilter;

	public ChartRangeFilterExample() {
		super(Unit.PX);
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CONTROLS);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				addNorth(getDashboardWidget(), 0);
				addSouth(getNumberRangeFilter(), 100);
				add(getLineChart());
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

	private ChartWrapper<LineChartOptions> getLineChart() {
		if (lineChart == null) {
			lineChart = new ChartWrapper<LineChartOptions>();
			lineChart.setChartType(ChartType.LINE);
		}
		return lineChart;
	}

	private ChartRangeFilter getNumberRangeFilter() {
		if (numberRangeFilter == null) {
			numberRangeFilter = new ChartRangeFilter();
		}
		return numberRangeFilter;
	}

	private void draw() {
		// Set control options
		ChartRangeFilterOptions chartRangeFilterOptions = ChartRangeFilterOptions.create();
		chartRangeFilterOptions.setFilterColumnIndex(0); // Filter by the date axis
		LineChartOptions controlChartOptions = LineChartOptions.create();
		controlChartOptions.setHeight(100);
		ChartArea chartArea = ChartArea.create();
		chartArea.setWidth("90%");
		chartArea.setHeight("90%");
		controlChartOptions.setChartArea(chartArea);
		ChartRangeFilterUi chartRangeFilterUi = ChartRangeFilterUi.create();
		chartRangeFilterUi.setChartType(ChartType.LINE);
		chartRangeFilterUi.setChartOptions(controlChartOptions);
		chartRangeFilterUi.setMinRangeSize(2 * 24 * 60 * 60 * 1000); // 2 days in milliseconds
		chartRangeFilterOptions.setUi(chartRangeFilterUi);
		ChartRangeFilterStateRange stateRange = ChartRangeFilterStateRange.create();
		stateRange.setStart(DateUtils.create(2012, 2, 9));
		stateRange.setEnd(DateUtils.create(2012, 3, 20));
		ChartRangeFilterState controlState = ChartRangeFilterState.create();
		controlState.setRange(stateRange);
		numberRangeFilter.setState(controlState);
		numberRangeFilter.setOptions(chartRangeFilterOptions);

		// Set chart options
		LineChartOptions lineChartOptions = LineChartOptions.create();
		lineChartOptions.setLineWidth(3);
		lineChartOptions.setLegend(Legend.create(LegendPosition.NONE));
		lineChartOptions.setChartArea(chartArea);
		lineChart.setOptions(lineChartOptions);

		// Generate random data
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.DATE, "Date");
		dataTable.addColumn(ColumnType.NUMBER, "Stock value");
		dataTable.addRows(121);

		double open, close = 300;
		double low, high;
		for (int day = 1; day < 121; ++day) {
			double change = (Math.sin(day / 2.5 + Math.PI) + Math.sin(day / 3) - Math.cos(day * 0.7)) * 150;
			change = change >= 0 ? change + 10 : change - 10;
			open = close;
			close = Math.max(50, open + change);
			low = Math.min(open, close) - (Math.cos(day * 1.7) + 1) * 15;
			low = Math.max(0, low);
			high = Math.max(open, close) + (Math.cos(day * 1.3) + 1) * 15;
			dataTable.setValue(day, 0, DateUtils.create(2012, 1, day));
			dataTable.setValue(day, 1, Math.round(high));
		}

		// Draw the chart
		dashboard.bind(numberRangeFilter, lineChart);
		dashboard.draw(dataTable);
	}
}
