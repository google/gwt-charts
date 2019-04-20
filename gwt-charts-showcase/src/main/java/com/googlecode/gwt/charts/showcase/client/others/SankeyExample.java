package com.googlecode.gwt.charts.showcase.client.others;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayMixed;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.options.TextStyle;
import com.googlecode.gwt.charts.client.sankey.Sankey;
import com.googlecode.gwt.charts.client.sankey.SankeyNode;
import com.googlecode.gwt.charts.client.sankey.SankeyOptions;
import com.googlecode.gwt.charts.client.util.ArrayHelper;

public class SankeyExample extends DockLayoutPanel {
	private Sankey sankey;

	public SankeyExample() {
		super(Unit.PX);
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.SANKEY);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				sankey = new Sankey();
				add(sankey);
				draw();
			}
		});
	}

	private void draw() {
		// Prepare the data
		Object[][] data = new Object[][] { { "Brazil", "Portugal", 5 }, { "Brazil", "France", 1 },
				{ "Brazil", "Spain", 1 }, { "Brazil", "England", 1 }, { "Canada", "Portugal", 1 },
				{ "Canada", "France", 5 }, { "Canada", "England", 1 }, { "Mexico", "Portugal", 1 },
				{ "Mexico", "France", 1 }, { "Mexico", "Spain", 5 }, { "Mexico", "England", 1 },
				{ "USA", "Portugal", 1 }, { "USA", "France", 1 }, { "USA", "Spain", 1 }, { "USA", "England", 5 },
				{ "Portugal", "Angola", 2 }, { "Portugal", "Senegal", 1 }, { "Portugal", "Morocco", 1 },
				{ "Portugal", "South Africa", 3 }, { "France", "Angola", 1 }, { "France", "Senegal", 3 },
				{ "France", "Mali", 3 }, { "France", "Morocco", 3 }, { "France", "South Africa", 1 },
				{ "Spain", "Senegal", 1 }, { "Spain", "Morocco", 3 }, { "Spain", "South Africa", 1 },
				{ "England", "Angola", 1 }, { "England", "Senegal", 1 }, { "England", "Morocco", 2 },
				{ "England", "South Africa", 7 }, { "South Africa", "China", 5 }, { "South Africa", "India", 1 },
				{ "South Africa", "Japan", 3 }, { "Angola", "China", 5 }, { "Angola", "India", 1 },
				{ "Angola", "Japan", 3 }, { "Senegal", "China", 5 }, { "Senegal", "India", 1 },
				{ "Senegal", "Japan", 3 }, { "Mali", "China", 5 }, { "Mali", "India", 1 }, { "Mali", "Japan", 3 },
				{ "Morocco", "China", 5 }, { "Morocco", "India", 1 }, { "Morocco", "Japan", 3 } };

		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.STRING, "From");
		dataTable.addColumn(ColumnType.STRING, "To");
		dataTable.addColumn(ColumnType.NUMBER, "Weight");
		
		JsArray<JsArrayMixed> dataJsArray = JavaScriptObject.createArray().cast();
		for (Object[] object : data) {
			dataJsArray.push(ArrayHelper.createArray(object));
		}
		dataTable.addRows(dataJsArray);

		// Set options
		SankeyOptions options = SankeyOptions.create();
		SankeyNode sankeyNode = SankeyNode.create();
		TextStyle textStyle = TextStyle.create();
		textStyle.setColor("red");
		sankeyNode.setLabel(textStyle);
		options.setNode(sankeyNode);

		// Draw the chart
		sankey.draw(dataTable, options);
	}
}
