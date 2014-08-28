package com.googlecode.gwt.charts.showcase.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootLayoutPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Showcase implements EntryPoint {
	private AppMainPanel appMainPanel;

	/**
	 * This is the entry point method.
	 */
	@Override
	public void onModuleLoad() {
		Window.enableScrolling(false);
		Window.setMargin("0px");
		Resources.INSTANCE.css().ensureInjected();
		RootLayoutPanel.get().add(getAppMainPanel());
	}

	private AppMainPanel getAppMainPanel() {
		if (appMainPanel == null) {
			appMainPanel = new AppMainPanel();
		}
		return appMainPanel;
	}


}
