package com.googlecode.gwt.charts.showcase.client.others;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.table.Table;
import com.googlecode.gwt.charts.client.table.TableOptions;

public class TableExample extends DockLayoutPanel {
	private Table table;

	public TableExample() {
		super(Unit.PX);
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.TABLE);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				table = new Table();
				add(table);
				draw();
			}
		});
	}

	private void draw() {

		// Prepare the data
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.STRING, "Name");
		dataTable.addColumn(ColumnType.NUMBER, "Salary");
		dataTable.addColumn(ColumnType.BOOLEAN, "Full Time Employee");
		dataTable.addRows(4);
		dataTable.setCell(0, 0, "Mike");
		dataTable.setCell(0, 1, 10000, "$10,000");
		dataTable.setCell(0, 2, true);
		dataTable.setCell(1, 0, "Jim");
		dataTable.setCell(1, 1, 8000, "$8,000");
		dataTable.setCell(1, 2, false);
		dataTable.setCell(2, 0, "Alice");
		dataTable.setCell(2, 1, 12500, "$12,500");
		dataTable.setCell(2, 2, true);
		dataTable.setCell(3, 0, "Bob");
		dataTable.setCell(3, 1, 7000, "$7,000");
		dataTable.setCell(3, 2, true);

		// Set options
		TableOptions options = TableOptions.create();
		options.setAlternatingRowStyle(true);
		options.setShowRowNumber(true);

		// Draw the chart
		table.draw(dataTable, options);
	}
}
