package com.googlecode.gwt.charts.showcase.client.others;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayMixed;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.treemap.TreeMap;
import com.googlecode.gwt.charts.client.treemap.TreeMapOptions;

public class TreeMapExample extends DockLayoutPanel {
	private TreeMap treeMap;

	public TreeMapExample() {
		super(Unit.PX);
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.TREEMAP);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				treeMap = new TreeMap();
				add(treeMap);
				draw();
			}
		});
	}

	private void draw() {
		JsArray<JsArrayMixed> dataArray = JsonUtils
			.unsafeEval("[['Global',null,0,0],['America','Global',0,0],['Europe','Global',0,0],['Asia','Global',0,0],['Australia','Global',0,0],['Africa','Global',0,0],['Brazil','America',11,10],['USA','America',52,31],['Mexico','America',24,12],['Canada','America',16,-23],['France','Europe',42,-11],['Germany','Europe',31,-2],['Sweden','Europe',22,-13],['Italy','Europe',17,4],['UK','Europe',21,-5],['China','Asia',36,4],['Japan','Asia',20,-12],['India','Asia',40,63],['Laos','Asia',4,34],['Mongolia','Asia',1,-5],['Israel','Asia',12,24],['Iran','Asia',18,13],['Pakistan','Asia',11,-52],['Egypt','Africa',21,0],['S. Africa','Africa',30,43],['Sudan','Africa',12,2],['Congo','Africa',10,12],['Zair','Africa',8,10]]");

		// Prepare the data
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.STRING, "Location");
		dataTable.addColumn(ColumnType.STRING, "Parent");
		dataTable.addColumn(ColumnType.NUMBER, "Market trade volume (size)");
		dataTable.addColumn(ColumnType.NUMBER, "Market increase/decrease (color)");

		dataTable.addRows(dataArray);

		// Set options
		TreeMapOptions options = TreeMapOptions.create();
		options.setMinColor("#ff7777");
		options.setMidColor("#ffff77");
		options.setMaxColor("#77ff77");
		options.setHeaderHeight(15);
		options.setShowScale(true);

		// Draw the chart
		treeMap.draw(dataTable, options);
	}
}
