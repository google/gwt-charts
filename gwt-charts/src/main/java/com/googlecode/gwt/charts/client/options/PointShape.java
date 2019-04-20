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
 * An object to configure various aspects of the point shape.
 */
public class PointShape extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object
	 */
	public static PointShape create() {
		return createObject().cast();
	}

	protected PointShape() {
	}

	/**
	 * Stars can be further customized with the dent option, which controls how concave the star is. When the dent is
	 * close to zero, the star will be starfish-like; as the dent approaches one, it'll bloat past an equilateral
	 * polygon.
	 * 
	 * @param dent a value from 0.0 to 1.0
	 */
	public final native void setDent(double dent) /*-{
		this.dent = dent;
	}-*/;

	/**
	 * Sets shape rotation.
	 * 
	 * @param rotation a value in degrees
	 */
	public final native void setRotation(int rotation) /*-{
		this.rotation = rotation;
	}-*/;

	/**
	 * Sets the number of sides.
	 * Works for {@link PointShapeType#STAR} and {@link PointShapeType#POLYGON}.
	 * 
	 * @param sides defaults to 5
	 */
	public final native void setSides(int sides) /*-{
		this.sides = sides;
	}-*/;

	/**
	 * Sets the type of point.
	 * 
	 * @param type
	 */
	public final void setType(PointShapeType type) {
		setType(type.getName());
	}

	private final native void setType(String type) /*-{
		this.type = type;
	}-*/;

}
