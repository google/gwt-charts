package com.googlecode.gwt.charts.showcase.client.util;

import java.util.Date;

public class DateUtils {

	@SuppressWarnings("deprecation")
	public static Date create(int year, int month, int day) {
		return new Date(year - 1900, month, day);
	}

}
