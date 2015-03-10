# Getting started with GWT Charts #

## Requirements ##
  * Java 1.7 or above
  * GWT 2.x (2.6 preferred)

## Getting the code ##

### Standalone ###
  * Download the latest jar version from the [project download page](http://code.google.com/p/gwt-charts/downloads/list).
  * Include the jar in your project classpath

### Maven ###
Since version 0.9.8, gwt-charts is available in the [Central Repository](http://search.maven.org/#search%7Cga%7C1%7Ca%3A%22gwt-charts%22).

Just add the following dependency to your pom.xml:
```
<dependency>
    <groupId>com.googlecode.gwt-charts</groupId>
    <artifactId>gwt-charts</artifactId>
    <version>0.9.10</version>
</dependency>
```

## Project Setup ##
Inherit the module `com.googlecode.gwt.charts.Charts` in the your XML definition file
```xml

<inherits name="com.googlecode.gwt.charts.Charts"/>
```
Call the `com.googlecode.gwt.charts.client.ChartLoader` class for loading the appropriate packages into your GWT module, **before** you use any type of chart.
See the following snippet:
```java

ChartLoader chartLoader = new ChartLoader(ChartPackage.CORECHART);
chartLoader.loadApi(new Runnable() {
@Override
public void run() {
// call method to create and show the chart
}
});
```

## A Simple Example ##
It's better to load them on startup (onModuleLoad), so you don't have to constantly worry about it.

```
package com.googlecode.gwt.charts.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.gwt.charts.client.corechart.PieChart;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class SimplePieChart implements EntryPoint {
	private SimpleLayoutPanel layoutPanel;
	private PieChart pieChart;

	/**
	 * This is the entry point method.
	 */
	@Override
	public void onModuleLoad() {
		Window.enableScrolling(false);
		Window.setMargin("0px");

		RootLayoutPanel.get().add(getSimpleLayoutPanel());

		// Create the API Loader
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CORECHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				getSimpleLayoutPanel().setWidget(getPieChart());
				drawPieChart();
			}
		});
	}

	private SimpleLayoutPanel getSimpleLayoutPanel() {
		if (layoutPanel == null) {
			layoutPanel = new SimpleLayoutPanel();
		}
		return layoutPanel;
	}

	private Widget getPieChart() {
		if (pieChart == null) {
			pieChart = new PieChart();
		}
		return pieChart;
	}

	private void drawPieChart() {
		// Prepare the data
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.STRING, "Name");
		dataTable.addColumn(ColumnType.NUMBER, "Donuts eaten");
		dataTable.addRows(4);
		dataTable.setValue(0, 0, "Michael");
		dataTable.setValue(1, 0, "Elisa");
		dataTable.setValue(2, 0, "Robert");
		dataTable.setValue(3, 0, "John");
		dataTable.setValue(0, 1, 5);
		dataTable.setValue(1, 1, 7);
		dataTable.setValue(2, 1, 3);
		dataTable.setValue(3, 1, 2);

		// Draw the chart
		pieChart.draw(dataTable);
	}
}

```