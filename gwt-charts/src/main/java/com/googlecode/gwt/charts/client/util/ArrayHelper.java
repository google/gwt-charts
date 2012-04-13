package com.googlecode.gwt.charts.client.util;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

public class ArrayHelper {

	public static <E extends JavaScriptObject> JsArray<E> createArray(E... array) {
		JsArray<E> jsArray = JsArray.createArray().cast();
		for (int i = 0; i < array.length; i++) {
			jsArray.set(i, array[i]);
		}
		return jsArray;
	}
	
	public static JsArrayString createArray(String... array) {
		JsArrayString jsArray = JsArray.createArray().cast();
		for (int i = 0; i < array.length; i++) {
			jsArray.set(i, array[i]);
		}
		return jsArray;
	}
}
