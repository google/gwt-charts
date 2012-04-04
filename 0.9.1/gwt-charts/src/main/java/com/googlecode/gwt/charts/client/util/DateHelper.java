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
package com.googlecode.gwt.charts.client.util;

import com.google.gwt.core.client.JsDate;

import java.util.Date;

public class DateHelper {

	public static Date getDate(JsDate jsDate) {
		if (jsDate == null) {
			return null;
		}
		return new Date((long) jsDate.getTime());
	}
	
	public static JsDate getJsDate(Date date) {
		if (date == null) {
			return null;
		}
		return JsDate.create(date.getTime());
	}
}
