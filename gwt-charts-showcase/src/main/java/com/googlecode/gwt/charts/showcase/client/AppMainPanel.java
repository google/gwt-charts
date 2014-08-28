package com.googlecode.gwt.charts.showcase.client;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RequiresResize;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.gwt.charts.showcase.client.controls.ChartRangeFilterExample;
import com.googlecode.gwt.charts.showcase.client.controls.NumberRangeFilterExample;
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
import com.googlecode.gwt.charts.showcase.client.others.AnnotationChartExample;
import com.googlecode.gwt.charts.showcase.client.others.CalendarExample;
import com.googlecode.gwt.charts.showcase.client.others.GaugeExample;
import com.googlecode.gwt.charts.showcase.client.others.GeoChartExample;
import com.googlecode.gwt.charts.showcase.client.others.MapExample;
import com.googlecode.gwt.charts.showcase.client.others.OrgChartExample;
import com.googlecode.gwt.charts.showcase.client.others.SankeyExample;
import com.googlecode.gwt.charts.showcase.client.others.TableExample;
import com.googlecode.gwt.charts.showcase.client.others.TimelineExample;
import com.googlecode.gwt.charts.showcase.client.others.TreeMapExample;

public class AppMainPanel extends Composite implements RequiresResize {
	private SplitLayoutPanel splitLayoutPanel;
	private DockLayoutPanel dockLayoutPanel;
	private DockLayoutPanel headerPanel;
	private SideMenu stackLayoutPanel;
	private ExampleWidget simpleLayoutPanel;

	public AppMainPanel() {
		super();
		initialize();
	}

	private void initialize() {
		initWidget(getDockLayoutPanel());
		fireSelectionChanged(101);
	}

	private DockLayoutPanel getDockLayoutPanel() {
		if (dockLayoutPanel == null) {
			dockLayoutPanel = new DockLayoutPanel(Unit.PX);
			dockLayoutPanel.addNorth(getHeaderPanel(), 70);
			//dockLayoutPanel.addWest(getStackLayoutPanel(), 150);
			dockLayoutPanel.add(getSplitLayoutPanel());
		}
		return dockLayoutPanel;
	}

	private SplitLayoutPanel getSplitLayoutPanel() {
		if (splitLayoutPanel == null) {
			splitLayoutPanel = new SplitLayoutPanel(6);
			splitLayoutPanel.addWest(getStackLayoutPanel(), 150);
			//splitLayoutPanel.getWidgetContainerElement(getCampaignMenu()).setClassName(Resources.INSTANCE.css().menu());
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

	private SideMenu getStackLayoutPanel() {
		if (stackLayoutPanel == null) {
			stackLayoutPanel = new SideMenu();
			stackLayoutPanel.add("Core Charts");
			stackLayoutPanel.add(101, "Area");
			stackLayoutPanel.add(102, "Bar");
			stackLayoutPanel.add(103, "Bubble");
			stackLayoutPanel.add(104, "Candlestick");
			stackLayoutPanel.add(105, "Column");
			stackLayoutPanel.add(106, "Combo");
			stackLayoutPanel.add(107, "Histogram");
			stackLayoutPanel.add(108, "Line");
			stackLayoutPanel.add(109, "Pie");
			stackLayoutPanel.add(110, "Scatter");
			stackLayoutPanel.add(111, "Stepped Area");
			stackLayoutPanel.add("Other Charts");
			stackLayoutPanel.add(201, "Annotation");
			stackLayoutPanel.add(202, "Calendar");
			stackLayoutPanel.add(203, "Gauge");
			stackLayoutPanel.add(204, "Geo Chart");
			stackLayoutPanel.add(205, "Map");
			stackLayoutPanel.add(206, "Org Chart");
			stackLayoutPanel.add(207, "Sankey Diagram");
			stackLayoutPanel.add(208, "Table");
			stackLayoutPanel.add(209, "Timeline");
			stackLayoutPanel.add(210, "Tree Map");
			stackLayoutPanel.add("Controls");
			stackLayoutPanel.add(301, "Chart Range Filter");
			stackLayoutPanel.add(302, "Number Range Filter");
			stackLayoutPanel.addSelectionHandler(new SelectionHandler<Integer>() {

				@Override
				public void onSelection(SelectionEvent<Integer> event) {
					fireSelectionChanged(event.getSelectedItem());
				}
			});
		}
		return stackLayoutPanel;
	}

	private void fireSelectionChanged(Integer index) {
		Widget widget = null;
		switch (index) {
			case 101:
				widget = new AreaChartExample();
				break;
			case 102:
				widget = new BarChartExample();
				break;
			case 103:
				widget = new BubbleChartExample();
				break;
			case 104:
				widget = new CandlestickChartExample();
				break;
			case 105:
				widget = new ColumnChartExample();
				break;
			case 106:
				widget = new ComboChartExample();
				break;
			case 107:
				widget = new HistogramExample();
				break;
			case 108:
				widget = new LineChartExample();
				break;
			case 109:
				widget = new PieChartExample();
				break;
			case 110:
				widget = new ScatterChartExample();
				break;
			case 111:
				widget = new SteppedAreaChartExample();
				break;
			case 201:
				widget = new AnnotationChartExample();
				break;
			case 202:
				widget = new CalendarExample();
				break;
			case 203:
				widget = new GaugeExample();
				break;
			case 204:
				widget = new GeoChartExample();
				break;
			case 205:
				widget = new MapExample();
				break;
			case 206:
				widget = new OrgChartExample();
				break;
			case 207:
				widget = new SankeyExample();
				break;
			case 208:
				widget = new TableExample();
				break;
			case 209:
				widget = new TimelineExample();
				break;
			case 210:
				widget = new TreeMapExample();
				break;
			case 301:
				widget = new ChartRangeFilterExample();
				break;
			case 302:
				widget = new NumberRangeFilterExample();
				break;
			default:
				break;
		}
		simpleLayoutPanel.setSampleWidget(widget);
	}

	@Override
	public void onResize() {
		dockLayoutPanel.onResize();
	}
}
