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
package com.googlecode.gwt.charts.client;

/**
 * A column role describes the purpose of the data in that column: for example, a column might hold data describing
 * tooltip text, data point annotations, or uncertainty indicators.
 * @see <a href="http://developers.google.com/chart/interactive/docs/roles.html">DataTable Roles</a>
 */
public enum RoleType {
	/**
	 * You should not need to assign this role explicitly unless designing a multi-domain chart (shown here); the basic
	 * format of the data table enables the charting engine to infer which columns are domain columns. However, you
	 * should be aware of which columns are domain columns so that you know which other columns can modify it. Domain
	 * columns specify labels along the major axis of the chart. Multiple domain columns can sometimes be used to
	 * support multiple scales within the same chart. Data type: Usually string, but occasionally number or date
	 */
	DOMAIN("domain"),
	/**
	 * 
	 You should not need to assign this role explicitly; the basic format of the data table enables the charting
	 * engine to infer which columns are domain columns. However, you sould be aware of which columns are data columns
	 * so that you know which other columns can modify it. Data role columns specify series data to render in the chart.
	 * For most charts, one column = one series, but this can vary by chart type (for example, scatter charts require
	 * two data columns for the first series, and an additional one for each additional series; candlestick charts
	 * require four data columns for each series). Data type: number
	 */
	DATA("data"),
	/**
	 * Text to display on the chart near the associated data point. The text displays without any user interaction.
	 * Annotations and annotation text can be assigned to both data points and categories (axis labels). There are two
	 * styles of annotations: letter (default), which draws the annotation text near the specified point, and line,
	 * which draws the annotation text on a line that bisects the chart area. Line annotations only apply to domain
	 * values, not data values. You can specify the line style by setting this chart option: annotation: {'column_id':
	 * {style: 'line'}} Data type: string Default: Empty string
	 */
	ANNOTATION("annotation"),
	/**
	 * Extended text to display when the user hovers over the associated annotation. Annotations and annotation text can
	 * be assigned to both data points and categories (axis labels). If you have an annotationText column, you must also
	 * have an annotation column. Tooltip text, in contrast, is displayed when the user hovers over the associated data
	 * point on the chart. Data type: string Default: Empty string
	 */
	ANNOTATIONTEXT("annotationText"),
	/**
	 * Indicates potential data range for a specific point. Intervals are usually displayed as I-bar style range
	 * indicators. Interval columns are numeric columns; add interval columns in pairs, marking the low and high value
	 * of the bar. Interval values should be added in increasing value, from left to right. Data type: number Default:
	 * No interval
	 */
	INTERVAL("interval"),
	/**
	 * Text to display when the user hovers over the data point associated with this row. Data type: string Default:
	 * Data point value
	 */
	TOOLTIP("tooltip"),
	/**
	 * 
	 Indicates whether a data point is certain or not. How this is displayed depends on the chart type—for example, it
	 * might be indicated by dashed lines or a striped fill. For line and area charts, the segment between two data
	 * points is certain if and only if both data points are certain. Data type: boolean, where true is certain, false
	 * is uncertain. Default: true
	 */
	CERTAINTY("certainty"),
	/**
	 * Emphasizes specified chart data points. Displayed as a thick line and/or large point. For line and area charts,
	 * the segment between two data points is emphasized if and only if both data points are emphasized. Data type:
	 * boolean Default: false
	 */
	EMPHASIS("emphasis"),
	/**
	 * Indicates whether a point is in or out of scope. If a point is out of scope, it is visually de-emphasized. For
	 * line and area charts, the segment between two data points is in scope if either endpoint is in scope. Data type:
	 * boolean, where true means in scope. Default: true
	 */
	SCOPE("scope");

	/**
	 * Get a RoleType by providing its name.
	 * 
	 * @param name the RoleType name.
	 * @return a RoleType corresponding to the provided name.
	 */
	public static RoleType findByName(String name) {
		for (RoleType roleType : RoleType.values()) {
			if (roleType.getName().equals(name)) {
				return roleType;
			}
		}
		return null;
	}

	private final String name;

	private RoleType(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the RoleType.
	 * @return the name of the RoleType.
	 */
	public String getName() {
		return name;
	}
}
