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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Animation Transition behavior settings.
 * 
 * @see <a href="http://developers.google.com/chart/interactive/docs/animation.html">Transition Animation</a>
 */

public class Animation extends JavaScriptObject {

	protected Animation() {
	}

	/**
	 * 
	 * @param duration The duration of the animation, in milliseconds
	 */
	public final native void setDuration(int duration) /*-{
		this.duration = duration;
	}-*/;

	/**
	 * 
	 * @param easing The easing function applied to the animation (default: linear).
	 */
	public final void setEasing(AnimationEasing easing) {
		setEasing(easing.getName());
	}

	private final native void setEasing(String easing) /*-{
		this.easing = easing;
	}-*/;
}
