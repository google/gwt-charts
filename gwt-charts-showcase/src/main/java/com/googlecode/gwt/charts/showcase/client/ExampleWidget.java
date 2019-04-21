package com.googlecode.gwt.charts.showcase.client;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.logical.shared.BeforeSelectionEvent;
import com.google.gwt.event.logical.shared.BeforeSelectionHandler;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class ExampleWidget extends TabLayoutPanel {
	private SimpleLayoutPanel layoutPanel;
	private ScrollPanel scrollPanel;
	private HTML sourceCodeWidget;

	public ExampleWidget() {
		super(30, Unit.PX);
		initialize();
	}

	public void setSampleWidget(Widget widget) {
		layoutPanel.setWidget(widget);
		loadSource();
	}

	private SimpleLayoutPanel getLayoutPanel() {
		if (layoutPanel == null) {
			layoutPanel = new SimpleLayoutPanel();
		}
		return layoutPanel;
	}

	private ScrollPanel getScrollPanel() {
		if (scrollPanel == null) {
			scrollPanel = new ScrollPanel();
			scrollPanel.setWidget(getSourceCodeWidget());
		}
		return scrollPanel;
	}

	private HTML getSourceCodeWidget() {
		if (sourceCodeWidget == null) {
			sourceCodeWidget = new HTML();
		}
		return sourceCodeWidget;
	}

	private void initialize() {
		add(getLayoutPanel(), "Example");
		add(getScrollPanel(), "Source Code");
		addBeforeSelectionHandler(new BeforeSelectionHandler<Integer>() {
			
			@Override
			public void onBeforeSelection(BeforeSelectionEvent<Integer> event) {
				if (event.getItem() == 1) {
					loadSource();
				}
			}
		});
		addSelectionHandler(new SelectionHandler<Integer>() {
			
			@Override
			public void onSelection(SelectionEvent<Integer> event) {
				if (event.getSelectedItem() == 0) {
					layoutPanel.onResize();
				}
			}
		});
	}

	protected void loadSource() {
		RequestCallback callback = new RequestCallback() {

			@Override
			public void onError(Request request, Throwable exception) {
				// TODO Auto-generated method stub
			}

			@Override
			public void onResponseReceived(Request request, Response response) {
				setSource(response.getText());
			}
		};
		try {
			String className = layoutPanel.getWidget().getClass().getName();
			className = className.substring(className.lastIndexOf(".") + 1);

			RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, "source/" + className + ".java");
			builder.setCallback(callback);
			builder.send();
		} catch (RequestException e) {
			callback.onError(null, e);
		}
	}

	protected void setSource(String text) {
		SafeHtmlBuilder builder = new SafeHtmlBuilder();
		builder.appendHtmlConstant("<pre>");
		builder.appendEscaped(text);
		builder.appendHtmlConstant("</pre>");
		sourceCodeWidget.setHTML(builder.toSafeHtml());
	}

}
