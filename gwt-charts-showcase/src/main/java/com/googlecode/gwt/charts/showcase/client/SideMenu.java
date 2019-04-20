package com.googlecode.gwt.charts.showcase.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

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

public class SideMenu extends Composite implements HasSelectionHandlers<String> {
	private FlowPanel flowPanel;
	private Map<String, Widget> keyMap;

	public SideMenu() {
		super();
		initialize();
	}

	public void add(String string) {
		Label label = new Label(string);
		label.setStyleName(Resources.INSTANCE.css().menuHeader());
		flowPanel.add(label);
	}

	public void add(String string, String key) {
		final Label label = new Label(string);
		label.setStyleName(Resources.INSTANCE.css().menuItem());
		label.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				setSelection(label, true);
			}
		});
		keyMap.put(key, label);
		flowPanel.add(label);
	}

	@Override
	public HandlerRegistration addSelectionHandler(SelectionHandler<String> handler) {
		return addHandler(handler, SelectionEvent.getType());
	}

	public void setSelection(String key, boolean fireEvents) {
		for (int i = 0; i < flowPanel.getWidgetCount(); i++) {
			Label label = (Label) flowPanel.getWidget(i);
			if (keyMap.get(key) == label) {
				label.addStyleName(Resources.INSTANCE.css().menuItemSelected());
			} else {
				label.removeStyleName(Resources.INSTANCE.css().menuItemSelected());
			}
		}
		if (fireEvents) {
			SelectionEvent.fire(this, key);
		}
	}

	public void setSelection(Widget widget, boolean fireEvents) {
		for (Entry<String, Widget> entry : keyMap.entrySet()) {
			if (entry.getValue().equals(widget)) {
				setSelection(entry.getKey(), fireEvents);
			}
		}
	}

	private FlowPanel getFlowPanel() {
		if (flowPanel == null) {
			flowPanel = new FlowPanel();
			flowPanel.getElement().getStyle().setOverflow(Overflow.AUTO);
		}
		return flowPanel;
	}

	private void initialize() {
		initWidget(getFlowPanel());
		keyMap = new HashMap<String, Widget>();
	}
}
