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
package com.googlecode.gwt.charts.client.options;

public class HAxis extends Axis {
	public static HAxis create() {
		return createObject().cast();
	}

	protected HAxis() {
	}

	public final native void setMaxAlternation(int levels) /*-{
		this.maxAlternation = levels;
	}-*/;

	public final native void setShowTextEvery(int interval) /*-{
		this.showTextEvery = interval;
	}-*/;

	public final native void setSlantedText(boolean enabled) /*-{
		this.slantedText = enabled;
	}-*/;

	public final native void setSlantedTextAngle(int angle) /*-{
		this.slantedTextAngle = angle;
	}-*/;

}
