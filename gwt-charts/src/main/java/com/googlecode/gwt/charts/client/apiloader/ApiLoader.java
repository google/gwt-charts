/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

/*
 * Refactored by Satoshi Eguchi on 2019 April 19
*/

package com.googlecode.gwt.charts.client.apiloader;

import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.user.client.Window;

import java.util.Collection;

/**
 * A wrapper for the <a href="https://developers.google.com/chart/interactive/docs/basic_load_libs">Loader of Google Chart libraries</a>.
 */
public class ApiLoader extends Object {
	// True if the loader code is already injected.
	private static boolean alreadyInjected = false;

	private String url = null;
	private String version = null;
	private ApiLoaderOptions options = null;
	private Collection<Runnable> callbacks = null;

	public ApiLoader() {
		super();
	}

	/**
	 * Checks whether the loader code is already injected.
	 *
	 * @return true if the code is already injected
	 */
	public static boolean isAlreadyInjected() {
		return alreadyInjected;
	}

	/**
	 * Sets the status whether the loader code is already injected.
	 *
	 * @param alreadyInjected true if the code is already injected
	 */
	protected static void setAlreadyInjected(boolean alreadyInjected) {
		ApiLoader.alreadyInjected = alreadyInjected;
	}

	/**
	 * Gets the URL to the API.
	 *
	 * @return the URL to the API
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets the URL to the API.
	 *
	 * @param url the URL to the API
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Gets the version of the API.
	 *
	 * @return the version of the API
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Sets the version of the API.
	 *
	 * @param version the version of the API
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * Gets the ApiLoaderOptions.
	 *
	 * @return the ApiLoaderOptions
	 */
	public ApiLoaderOptions getOptions() {
		return options;
	}

	/**
	 * Sets the ApiLoaderOptions.
	 *
	 * @param options the ApiLoaderOptions
	*/
	public void setOptions(ApiLoaderOptions options) {
		this.options = options;
	}

	/**
	 * Gets the callbacks which are called when a loading process finishes.
	 *
	 * @return the callbacks
	 */
	public Collection<Runnable> getCallbacks() {
		return callbacks;
	}

	/**
	 * Sets the callbacks which are called when a loading process finished.
	 *
	 * @param callbacks the callbacks
	 */
	public void setCallbacks(Collection<Runnable> callbacks) {
		this.callbacks = callbacks;
	}

	/**
	 * Wrapper for internal {@link #onLoad()} callback.
	 *
	 * @return a native function expression of {@link #onLoad()}
	 */
	protected native JavaScriptObject getOnLoadForNative(ApiLoader loader) /*-{
		return function() {
					loader.@com.googlecode.gwt.charts.client.apiloader.ApiLoader::onLoad()();
				};
	}-*/;

	/**
	 * Calls native google.charts.load() and google.charts.setOnLoadCallback() functions.
	 *
	 * @param version the version of the API to load
	 * @param options options passed as the 2nd parameter of google.charts.load(), originating from ApiLoaderOptions class
	 * @param callback the native representation of {@link #onLoad()} method
	*/
	protected native void callNativeLoad(String version, JavaScriptObject options, JavaScriptObject callback) /*-{
		$wnd.google.charts.load(version, options);
		$wnd.google.charts.setOnLoadCallback(callback);
	}-*/;

	/**
	 * The callback invoked when the injection failed.
	 *
	 * @param reason the cause of the failure
	 */
	protected void onInjectionFailure(Exception reason) {
		Window.alert("loader code injection failed.");
	}

	/**
	 * The callback invoked when the injection of the script element is succeeded.
	 *
	 * @param skipped true if the code was already injected and {@link #injectLoaderCode()} method was skipped
	 */
	protected void onInjectionSuccess(boolean skipped) {
		callNativeLoad(version, options, getOnLoadForNative(this));
	}

	/**
	 * Injects a script element to the DOM that loads the API Loader main script.
	 * This method will not be called when the code is already injected.
	 */
	protected void injectLoaderCode() {
		ScriptInjector.fromUrl(getUrl()).setCallback(
			new Callback<Void, Exception>() {
				@Override
				public void onFailure(Exception reason) {
					onInjectionFailure(reason);
				}

				@Override
				public void onSuccess(Void result) {
					setAlreadyInjected(true);
					onInjectionSuccess(false);
				}
			}
		).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}

	/**
	 * Launches an API load request.
	 */
	public void loadApi() {
		if (isAlreadyInjected()) {
			onInjectionSuccess(true);
		} else {
			injectLoaderCode();
		}
	}

	/**
	 * Called back when the loading process finished.
	 */
	protected void onLoad() {
		for (Runnable r : callbacks) {
			r.run();
		}
	}
}
