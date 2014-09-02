package com.googlecode.gwt.charts.client.util;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayBoolean;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.JsArrayMixed;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.core.client.JsDate;

import java.util.Date;
import java.util.List;

/**
 * A set of utility array methods.
 */
public class ArrayHelper {

	/**
	 * Converts a java boolean array into a javascript array (JsArray).
	 * 
	 * @param array the array containing values
	 * @return a corresponding JsArrayBoolean
	 */
	public static JsArrayBoolean createArray(boolean... array) {
		JsArrayBoolean jsArray = JavaScriptObject.createArray().cast();
		for (int i = 0; i < array.length; i++) {
			jsArray.set(i, array[i]);
		}
		return jsArray;
	}

	/**
	 * Converts a java date array into a javascript array (JsArray).
	 * 
	 * @param array the array containing values
	 * @return a corresponding JsArray
	 */
	public static JsArray<JsDate> createArray(Date... array) {
		JsArray<JsDate> jsArray = JavaScriptObject.createArray().cast();
		for (int i = 0; i < array.length; i++) {
			jsArray.set(i, DateHelper.getJsDate(array[i]));
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
		JsArrayNumber jsArray = JavaScriptObject.createArray().cast();
		for (int i = 0; i < array.length; i++) {
			jsArray.set(i, array[i]);
		}
		return jsArray;
	}

	/**
	 * Converts a java object array into a javascript array (JsArray).
	 * 
	 * @param <E> the type of array
	 * @param array the array containing values
	 * @return a corresponding JsArray
	 */
	@SafeVarargs
	public static <E extends JavaScriptObject> JsArray<E> createArray(E... array) {
		JsArray<E> jsArray = JavaScriptObject.createArray().cast();
		for (int i = 0; i < array.length; i++) {
			jsArray.set(i, array[i]);
		}
		return jsArray;
	}

	/**
	 * Converts a java int array into a javascript array (JsArray).
	 * 
	 * @param array the array containing values
	 * @return a corresponding JsArrayNumber
	 */
	public static JsArrayInteger createArray(int... array) {
		JsArrayInteger jsArray = JavaScriptObject.createArray().cast();
		for (int i = 0; i < array.length; i++) {
			jsArray.set(i, array[i]);
		}
		return jsArray;
	}

	/**
	 * Converts a list of java objects into a javascript array (JsArray).
	 * 
	 * @param <E> the type of array
	 * @param array the array containing values
	 * @return a corresponding JsArray
	 */
	public static <E extends JavaScriptObject> JsArray<E> createArray(List<E> array) {
		JsArray<E> jsArray = JavaScriptObject.createArray().cast();
		for (E object : array) {
			jsArray.push(object);
		}
		return jsArray;
	}

	/**
	 * Converts a java object array into a mixed javascript array (JsArrayMixed).
	 * 
	 * @param array the array containing values
	 * @return a corresponding JsArrayMixed
	 */

	public static JsArrayMixed createArray(Object... array) {
		JsArrayMixed jsArray = JavaScriptObject.createArray().cast();
		for (int i = 0; i < array.length; i++) {
			Object object = array[i];
			if (object == null) {
				jsArray.set(i, (String) null);
			} else if (object instanceof Integer) {
				arraySet(jsArray, i, ((Integer) object).intValue());
			} else if (object instanceof Double) {
				arraySet(jsArray, i, ((Double) object).doubleValue());
			} else if (object instanceof String) {
				arraySet(jsArray, i, (String) object);
			} else if (object instanceof Date) {
				jsArray.set(i, DateHelper.getJsDate((Date) object));
			} else if (object instanceof JavaScriptObject) {
				jsArray.set(i, (JavaScriptObject) object);
			} else {
				throw new RuntimeException("invalid value type");
			}
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
		JsArrayString jsArray = JavaScriptObject.createArray().cast();
		for (int i = 0; i < array.length; i++) {
			jsArray.set(i, array[i]);
		}
		return jsArray;
	}

	private static final native void arraySet(JsArrayMixed array, int index, double value) /*-{
		array[index] = value;
	}-*/;

	private static final native void arraySet(JsArrayMixed array, int index, int value) /*-{
		array[index] = value;
	}-*/;

	private static final native void arraySet(JsArrayMixed array, int index, String value) /*-{
		array[index] = value;
	}-*/;
}
