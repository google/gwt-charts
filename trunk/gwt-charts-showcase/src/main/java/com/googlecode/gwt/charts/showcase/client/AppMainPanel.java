package com.googlecode.gwt.charts.showcase.client;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RequiresResize;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.gwt.charts.showcase.client.controls.CategoryFilterExample;
import com.googlecode.gwt.charts.showcase.client.controls.ChartRangeFilterExample;
import com.googlecode.gwt.charts.showcase.client.controls.DateRangeFilterExample;
import com.googlecode.gwt.charts.showcase.client.controls.NumberRangeFilterExample;
import com.googlecode.gwt.charts.showcase.client.controls.StringFilterExample;
import com.googlecode.gwt.charts.showcase.client.corechart.AreaChartExample;
import com.googlecode.gwt.charts.showcase.client.corechart.BarChartExample;
import com.googlecode.gwt.charts.showcase.client.corechart.BubbleChartExample;
import com.googlecode.gwt.charts.showcase.client.corechart.CandlestickChartExample;
import com.googlecode.gwt.charts.showcase.client.corechart.ColumnChartExample;
import com.googlecode.gwt.charts.showcase.client.corechart.ComboChartExample;
import com.googlecode.gwt.charts.showcase.client.corechart.HistogramExample;
import com.googlecode.gwt.charts.showcase.client.corechart.LineChartExample;
import com.googlecode.gwt.charts.showcase.client.corechart.PieChartExample;
import com.googlecode.gwt.charts.showcase.client.corechart.ScatterChartExample;
import com.googlecode.gwt.charts.showcase.client.corechart.SteppedAreaChartExample;
import com.googlecode.gwt.charts.showcase.client.diffchart.DiffBarChartExample;
import com.googlecode.gwt.charts.showcase.client.diffchart.DiffColumnChartExample;
import com.googlecode.gwt.charts.showcase.client.diffchart.DiffPieChartExample;
import com.googlecode.gwt.charts.showcase.client.diffchart.DiffScatterChartExample;
import com.googlecode.gwt.charts.showcase.client.others.AnnotationChartExample;
import com.googlecode.gwt.charts.showcase.client.others.CalendarExample;
import com.googlecode.gwt.charts.showcase.client.others.GaugeExample;
import com.googlecode.gwt.charts.showcase.client.others.GeoChartExample;
import com.googlecode.gwt.charts.showcase.client.others.IntervalExample;
import com.googlecode.gwt.charts.showcase.client.others.MapExample;
import com.googlecode.gwt.charts.showcase.client.others.OrgChartExample;
import com.googlecode.gwt.charts.showcase.client.others.SankeyExample;
import com.googlecode.gwt.charts.showcase.client.others.TableExample;
import com.googlecode.gwt.charts.showcase.client.others.TimelineExample;
import com.googlecode.gwt.charts.showcase.client.others.TreeMapExample;

public class AppMainPanel extends Composite implements ValueChangeHandler<String>, RequiresResize {
	private SplitLayoutPanel splitLayoutPanel;
	private DockLayoutPanel dockLayoutPanel;
	private DockLayoutPanel headerPanel;
	private SideMenu sideMenu;
	private ExampleWidget simpleLayoutPanel;

	public AppMainPanel() {
		super();
		initialize();
	}

	private void initialize() {
		initWidget(getDockLayoutPanel());
	}

	private DockLayoutPanel getDockLayoutPanel() {
		if (dockLayoutPanel == null) {
			dockLayoutPanel = new DockLayoutPanel(Unit.PX);
			dockLayoutPanel.addNorth(getHeaderPanel(), 70);
			dockLayoutPanel.add(getSplitLayoutPanel());
		}
		return dockLayoutPanel;
	}

	private SplitLayoutPanel getSplitLayoutPanel() {
		if (splitLayoutPanel == null) {
			splitLayoutPanel = new SplitLayoutPanel(6);
			splitLayoutPanel.addWest(getSideMenu(), 150);
			splitLayoutPanel.add(getSimpleLayoutPanel());
		}
		return splitLayoutPanel;
	}

	private DockLayoutPanel getHeaderPanel() {
		if (headerPanel == null) {
			headerPanel = new DockLayoutPanel(Unit.PX);
			headerPanel.addWest(new Image(Resources.INSTANCE.headerLogo()), 70);
			Label label = new Label("GWT Charts - Unofficial Google Chart Tools API for Google Web Toolkit");
			label.setStyleName(Resources.INSTANCE.css().headerText());
			headerPanel.add(label);
		}
		return headerPanel;
	}

	private ExampleWidget getSimpleLayoutPanel() {
		if (simpleLayoutPanel == null) {
			simpleLayoutPanel = new ExampleWidget();
		}
		return simpleLayoutPanel;
	}

	private SideMenu getSideMenu() {
		if (sideMenu == null) {
			sideMenu = new SideMenu();
			sideMenu.add("Charts");
			sideMenu.add("Annotation", "annotation");
			sideMenu.add("Area", "area");
			sideMenu.add("Bar", "bar");
			sideMenu.add("Bubble", "bubble");
			sideMenu.add("Calendar", "calendar");
			sideMenu.add("Candlestick", "candlestick");
			sideMenu.add("Column", "column");
			sideMenu.add("Combo", "combo");
			sideMenu.add("Gauge", "gauge");
			sideMenu.add("Geo Chart", "geochart");
			sideMenu.add("Histogram", "histogram");
			sideMenu.add("Line", "line");
			sideMenu.add("Map", "map");
			sideMenu.add("Org Chart", "orgchart");
			sideMenu.add("Pie", "pie");
			sideMenu.add("Sankey Diagram", "sankey");
			sideMenu.add("Scatter", "scatter");
			sideMenu.add("Stepped Area", "steppedarea");
			sideMenu.add("Table", "table");
			sideMenu.add("Timeline", "timeline");
			sideMenu.add("Tree Map", "treemap");
			sideMenu.add("Diff Charts");
			sideMenu.add("Bar", "diffbar");
			sideMenu.add("Column", "diffcolumn");
			sideMenu.add("Pie", "diffpie");
			sideMenu.add("Scatter", "diffscatter");
			sideMenu.add("Other Charts");
			sideMenu.add("Interval", "interval");
			sideMenu.add("Controls");
			sideMenu.add("Category Filter", "categoryfilter");
			sideMenu.add("Chart Range Filter", "chartrangefilter");
			sideMenu.add("Date Range Filter", "daterangefilter");
			sideMenu.add("Number Range Filter", "numberrangefilter");
			sideMenu.add("String Filter", "stringfilter");
			sideMenu.addSelectionHandler(new SelectionHandler<String>() {

				@Override
				public void onSelection(SelectionEvent<String> event) {
					History.newItem(event.getSelectedItem(), true);
				}
			});
		}
		return sideMenu;
	}

	private void fireSelectionChanged(String key) {
		Widget widget = null;
		if (key.equals("area")) {
			widget = new AreaChartExample();
		} else if (key.equals("bar")) {
			widget = new BarChartExample();
		} else if (key.equals("bubble")) {
			widget = new BubbleChartExample();
		} else if (key.equals("candlestick")) {
			widget = new CandlestickChartExample();
		} else if (key.equals("column")) {
			widget = new ColumnChartExample();
		} else if (key.equals("combo")) {
			widget = new ComboChartExample();
		} else if (key.equals("histogram")) {
			widget = new HistogramExample();
		} else if (key.equals("line")) {
			widget = new LineChartExample();
		} else if (key.equals("pie")) {
			widget = new PieChartExample();
		} else if (key.equals("scatter")) {
			widget = new ScatterChartExample();
		} else if (key.equals("steppedarea")) {
			widget = new SteppedAreaChartExample();
		} else if (key.equals("diffbar")) {
			widget = new DiffBarChartExample();
		} else if (key.equals("diffcolumn")) {
			widget = new DiffColumnChartExample();
		} else if (key.equals("diffpie")) {
			widget = new DiffPieChartExample();
		} else if (key.equals("diffscatter")) {
			widget = new DiffScatterChartExample();
		} else if (key.equals("annotation")) {
			widget = new AnnotationChartExample();
		} else if (key.equals("calendar")) {
			widget = new CalendarExample();
		} else if (key.equals("gauge")) {
			widget = new GaugeExample();
		} else if (key.equals("geochart")) {
			widget = new GeoChartExample();
		} else if (key.equals("interval")) {
			widget = new IntervalExample();
		} else if (key.equals("map")) {
			widget = new MapExample();
		} else if (key.equals("orgchart")) {
			widget = new OrgChartExample();
		} else if (key.equals("sankey")) {
			widget = new SankeyExample();
		} else if (key.equals("table")) {
			widget = new TableExample();
		} else if (key.equals("timeline")) {
			widget = new TimelineExample();
		} else if (key.equals("treemap")) {
			widget = new TreeMapExample();
		} else if (key.equals("categoryfilter")) {
			widget = new CategoryFilterExample();
		} else if (key.equals("chartrangefilter")) {
			widget = new ChartRangeFilterExample();
		} else if (key.equals("daterangefilter")) {
			widget = new DateRangeFilterExample();
		} else if (key.equals("numberrangefilter")) {
			widget = new NumberRangeFilterExample();
		} else if (key.equals("stringfilter")) {
			widget = new StringFilterExample();
		}

		simpleLayoutPanel.setSampleWidget(widget);
	}

	@Override
	public void onResize() {
		dockLayoutPanel.onResize();
	}

	@Override
	public void onValueChange(ValueChangeEvent<String> event) {
		sideMenu.setSelection(event.getValue(), false);
		fireSelectionChanged(event.getValue());
	}
}
