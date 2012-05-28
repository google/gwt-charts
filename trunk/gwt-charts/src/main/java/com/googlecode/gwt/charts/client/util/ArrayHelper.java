package com.googlecode.gwt.charts.client.util;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;

/**
 * A set of utility array methods.
 */
public class ArrayHelper {

	/**
	 * Converts a java object array into a javascript array (JsArray).
	 * 
	 * @param <E> the type of array
	 * @param array the array containing values
	 * @return a corresponding JsArray
	 */
	public static <E extends JavaScriptObject> JsArray<E> createArray(E... array) {
		JsArray<E> jsArray = JsArray.createArray().cast();
		for (int i = 0; i < array.length; i++) {
			jsArray.set(i, array[i]);
		}
		return jsArray;
	}

	/**
	 * Converts a java String array into a javascript array (JsArray).
	 * 
	 * @param array the array containing values
	 * @return a corresponding JsArrayString
	 */
	public static JsArrayString createArray(String... array) {
		JsArrayString jsArray = JsArray.createArray().cast();
		for (int i = 0; i < array.length; i++) {
			jsArray.set(i, array[i]);
		}
		return jsArray;
	}

	/**
	 * Converts a java double array into a javascript array (JsArray).
	 * 
	 * @param array the array containing values
	 * @return a corresponding JsArrayNumber
	 */
	public static JsArrayNumber createArray(double... array) {
		JsArrayNumber jsArray = JsArray.createArray().cast();
		for (int i = 0; i < array.length; i++) {
			jsArray.set(i, array[i]);
		}
		return jsArray;
	}
}
