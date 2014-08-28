package com.googlecode.gwt.charts.showcase.client;

import java.util.HashMap;

import com.google.gwt.dom.client.Style.Overflow;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.HasSelectionHandlers;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class SideMenu extends Composite implements HasSelectionHandlers<Integer> {
	private FlowPanel flowPanel;
	private HashMap<Integer, Integer> keyMap;

	public SideMenu() {
		super();
		initialize();
	}

	@Override
	public HandlerRegistration addSelectionHandler(SelectionHandler<Integer> handler) {
		return addHandler(handler, SelectionEvent.getType());
	}

	private void initialize() {
		initWidget(getFlowPanel());
		keyMap = new HashMap<Integer, Integer>();
	}

	private FlowPanel getFlowPanel() {
		if (flowPanel == null) {
			flowPanel = new FlowPanel();
			flowPanel.getElement().getStyle().setOverflow(Overflow.AUTO);
		}
		return flowPanel;
	}

	public void add(String string) {
		Label label = new Label(string);
		label.setStyleName(Resources.INSTANCE.css().menuHeader());
		flowPanel.add(label);
	}

	public void add(int key, String string) {
		final Label label = new Label(string);
		label.setStyleName(Resources.INSTANCE.css().menuItem());
		label.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				fireSelectionChanged(label);
			}
		});
		keyMap.put(flowPanel.getWidgetCount(), key);
		flowPanel.add(label);
	}

	protected void fireSelectionChanged(Widget widget) {
		int widgetIndex = -1;
		for (int i = 0; i < flowPanel.getWidgetCount(); i++) {
			Label label = (Label) flowPanel.getWidget(i);
			if (label == widget) {
				label.addStyleName(Resources.INSTANCE.css().menuItemSelected());
				widgetIndex = i;
			} else {
				label.removeStyleName(Resources.INSTANCE.css().menuItemSelected());
			}
		}
		Integer integer = keyMap.get(widgetIndex);
		SelectionEvent.fire(this, integer);
	}

}
