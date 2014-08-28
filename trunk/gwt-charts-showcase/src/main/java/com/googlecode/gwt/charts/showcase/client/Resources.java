package com.googlecode.gwt.charts.showcase.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;

public interface Resources extends ClientBundle {
	Resources INSTANCE = GWT.create(Resources.class);

	public interface Stylesheet extends CssResource {
		String menuHeader();

		String menuItem();

		String menuItemSelected();

		String headerText();
	}

	@Source("showcase.css")
	Stylesheet css();

	ImageResource headerLogo();

}
