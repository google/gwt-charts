/*
 * Copyright 2012 Rui Afonso
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.googlecode.gwt.charts.client.corechart;

import com.google.gwt.core.client.JsArray;

import com.googlecode.gwt.charts.client.ChartWidget;
import com.googlecode.gwt.charts.client.Selection;
import com.googlecode.gwt.charts.client.event.AnimationFinishHandler;
import com.googlecode.gwt.charts.client.event.ErrorHandler;
import com.googlecode.gwt.charts.client.event.HandlerRef;
import com.googlecode.gwt.charts.client.event.OnMouseOutHandler;
import com.googlecode.gwt.charts.client.event.OnMouseOverHandler;
import com.googlecode.gwt.charts.client.event.ReadyHandler;
import com.googlecode.gwt.charts.client.event.SelectHandler;
import com.googlecode.gwt.charts.client.options.Options;

public abstract class CoreChartWidget<T extends Options> extends ChartWidget<T> {
	private JsArray<Selection> selection;

	public CoreChartWidget() {
		super();
	}

	public final HandlerRef addAnimationFinishHandler(AnimationFinishHandler handler) {
		return addHandler(handler);
	}

	public final HandlerRef addErrorHandler(ErrorHandler handler) {
		return addHandler(handler);
	}

	public final HandlerRef addOnMouseOutHandler(OnMouseOutHandler handler) {
		return addHandler(handler);
	}

	public final HandlerRef addOnMouseOverHandler(OnMouseOverHandler handler) {
		return addHandler(handler);
	}

	public final HandlerRef addReadyHandler(ReadyHandler handler) {
		return addHandler(handler);
	}

	public final HandlerRef addSelectHandler(SelectHandler handler) {
		return addHandler(handler);
	}

	public final JsArray<Selection> getSelection() {
		return chartObject.getSelection();
	}

	public final void setSelection(JsArray<Selection> selection) {
		this.selection = selection;
		chartObject.setSelection(selection);
	}

	@Override
	protected void recreate() {
		super.recreate();
		if (selection != null) {
			chartObject.setSelection(selection);
		}
	}

}
