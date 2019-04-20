package com.googlecode.gwt.charts.showcase.client.controls;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ChartType;
import com.googlecode.gwt.charts.client.ChartWrapper;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.controls.Dashboard;
import com.googlecode.gwt.charts.client.controls.filter.DateRangeFilter;
import com.googlecode.gwt.charts.client.controls.filter.DateRangeFilterOptions;
import com.googlecode.gwt.charts.client.controls.filter.DateRangeFilterUi;
import com.googlecode.gwt.charts.client.format.DateFormatOptions;
import com.googlecode.gwt.charts.client.table.TableOptions;
import com.googlecode.gwt.charts.client.util.ChartHelper;
import com.googlecode.gwt.charts.showcase.client.util.DateUtils;

public class DateRangeFilterExample extends DockLayoutPanel {
	private Dashboard dashboard;
	private ChartWrapper<TableOptions> tableWrapper;
	private DateRangeFilter dateRangeFilter;

	public DateRangeFilterExample() {
		super(Unit.PX);
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CONTROLS);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				addNorth(getDashboardWidget(), 0);
				addNorth(getDateRangeFilter(), 30);
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

	private DateRangeFilter getDateRangeFilter() {
		if (dateRangeFilter == null) {
			dateRangeFilter = new DateRangeFilter();
		}
		return dateRangeFilter;
	}

	private void draw() {
		// Set control options
		DateRangeFilterOptions dateRangeFilterOptions = DateRangeFilterOptions.create();
		dateRangeFilterOptions.setFilterColumnLabel("Year");
		DateRangeFilterUi dateRangeFilterUi = DateRangeFilterUi.create();
		dateRangeFilterUi.setFormat(DateFormatOptions.create("yyyy"));
		dateRangeFilterOptions.setUi(dateRangeFilterUi);
		dateRangeFilter.setOptions(dateRangeFilterOptions);

		// Set chart options
		TableOptions tableOptions = TableOptions.create();
		tableWrapper.setOptions(tableOptions);

		// Generate data
		Object[][] dataArray = new Object[][] {
				{ "Extrasolar planet", "Comment", "Year" },
				{ "Gamma Cephei Ab", "Deduced from radial velocity variations of the star Gamma Cephei",
						DateUtils.create(1988, 6, 13) },
				{ "HD 114762 b", "At least 11 times the mass of Jupiter", DateUtils.create(1989, 4, 4) },
				{ "PSR B1257+12", "First confirmed discovery of an extrasolar planet", DateUtils.create(1992, 0, 22) },
				{ "51 Pegasi b", "Hot Jupiter with a 4.2 day orbit", DateUtils.create(1995, 9, 6) },
				{ "47 Ursae Majoris b", "First long-period planet discovered", DateUtils.create(1996, 0, 17) },
				{ "Upsilon Andromedae", "First multiple planetary system around a main sequence star",
						DateUtils.create(1996, 7, 12) },
				{ "Gliese 876 b", "First planet found orbiting a red dwarf", DateUtils.create(1998, 5, 23) },
				{ "HD 209458 b", "First exoplanet seen transiting its parent star", DateUtils.create(1999, 10, 5) },
				{ "Iota Draconis b", "Provided evidence that planets can exist around giant stars",
						DateUtils.create(2002, 0, 8) },
				{ "PSR B1620-26 b", "12.7 billion year old planet orbiting a binary star system",
						DateUtils.create(2003, 6, 10) },
				{ "2M1207 b", "First planet found orbiting a brown dwarf", DateUtils.create(2004, 6, 22) },
				{ "Mu Arae c", "Hot Neptune", DateUtils.create(2004, 7, 25) },
				{ "TrES-1 and HD 209458 b", "First detection of light from exoplanets", DateUtils.create(2005, 2, 22) },
				{ "OGLE-2005-BLG-390Lb", "Detected used gravitational microlensing", DateUtils.create(2006, 1, 25) },
				{ "Gliese 581 c", "Inhospitable due to runaway greenhouse effect", DateUtils.create(2007, 3, 4) },
				{ "Fomalhaut b", "First exoplanet directly imaged by optical telescope", DateUtils.create(2008, 10, 13) },
				{ "GJ 1214 b", "Might be 75% water and 25% rock", DateUtils.create(2009, 11, 16) },
				{ "HD 10180", "Seven planets orbiting a sun-like star", DateUtils.create(2010, 7, 24) },
				{ "55 Cancri e", "Orbital period of just 0.73 days", DateUtils.create(2011, 3, 27) },
				{ "Alpha Centauri Bb", "Earth-mass planet in the star system closest to ours",
						DateUtils.create(2012, 9, 16) },
				{ "PH2 b", "Potentially habitable Jupiter-sized planet", DateUtils.create(2013, 0, 13) },
				{ "Kepler-69c", "First potentially habitable Earth-sized planet orbiting a sun-sized star",
						DateUtils.create(2013, 3, 18) } };

		// Prepare the data
		DataTable dataTable = ChartHelper.arrayToDataTable(dataArray);

		// Draw the chart
		dashboard.bind(dateRangeFilter, tableWrapper);
		dashboard.draw(dataTable);
	}
}
