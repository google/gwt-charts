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
package com.googlecode.gwt.charts.client.apiloader;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.ScriptElement;
import com.google.gwt.user.client.Window;

import java.util.Vector;

/**
 * A wrapper for the <a href="https://developers.google.com/loader/">Google Loader/a>.
 */
public class ApiLoader {
	private static String HOSTNAME = "www.google.com";

	/**
	 * Launches an API load request.
	 * 
	 * @param api the name of the API to load
	 * @param version the API version to load
	 * @param onLoad a callback that will be invoked when the API is finished
	 *        loaded. Do not make any calls into the API being loaded until
	 *        this call returns.
	 * @param optionalSettings an object containing additional settings.
	 */
	public static void loadApi(final String api, final String version, Runnable onLoad,
			ApiLoaderOptions optionalSettings) {
		ApiLoader loader = new ApiLoader();

		// Set the onLoad callback into the
		assert (onLoad != null);
		ApiLoaderOptions settings = optionalSettings;
		if (settings == null) {
			settings = ApiLoaderOptions.create();
		}
		settings.setCallback(onLoad);
		final ApiLoaderOptions copyOfSettings = settings;

		// Define a Runnable that will run the actual load.
		Runnable apiLoad = new Runnable() {

			@Override
			public void run() {
				loadApi(api, version, copyOfSettings);
			}
		};

		if (loader.loaded) {
			// jsapi is finished loading, start the individual API load now.
			apiLoad.run();
		} else {
			// Defer the load until jsapi is finished.
			loader.queuedApiLoads.add(apiLoad);
		}
	}

	/**
	 * Wrapper for ApiLoader google.load() native method.
	 */
	private static native void loadApi(String api, String version, JavaScriptObject settings) /*-{
		$wnd.google.load(api, version, settings);
	}-*/;

	// NativeCreateCallback already ran, or someone injected the API outside of
	// this program.
	private boolean alreadyInjected = false;
	// Set to true if the init(key) method has been called.
	private boolean initialized = false;

	// True if the JavaScript __gwt_charts_AjaxLoader_onLoad callback has already run.
	// This function is registered on the window in createCallback()
	private boolean loaded = false;

	private Vector<Runnable> queuedApiLoads = new Vector<Runnable>();

	/**
	 * Initialize the API without specifying a key.
	 */
	public ApiLoader() {
		this(null);
	}

	/**
	 * Initialize the API with a supplied key value.<br>
	 * See https://code.google.com/apis/console
	 * 
	 * @param apiKey API key value.
	 */
	public ApiLoader(String apiKey) {
		if (initialized == true) {
			return;
		}
		boolean alreadyLoaded = injectJsApi(apiKey);

		// In IE, the above script can execute immediately if its already in the
		// cache, so don't touch the loaded variable unless we bypassed loading
		// the script completely
		if (alreadyLoaded) {
			loaded = true;
		}
		initialized = true;
	}

	/**
	 * Creates a function to be registered for a callback after jsapi loads.
	 */
	private native boolean createCallback(ApiLoader loader) /*-{
		if ($wnd['google'] && $wnd.google['load']) {
			// The API has already been loaded.
			return true;
		}
		$wnd.__gwt_charts_AjaxLoader_onLoad = function() {
			loader.@com.googlecode.gwt.charts.client.apiloader.ApiLoader::onLoadCallback()();
		}
		// The application must wait for a callback.
		return false;
	}-*/;

	/**
	 * Adds a script element to the DOM that loads the API Loader main script "jsapi".
	 * 
	 * @param apiKey
	 *        Optional API key value (pass null to omit the key). See
	 *        http://code.google.com/apis/ajaxsearch/signup.html
	 * @returns <code>true</code> if the API has already been loaded. Otherwise,
	 *          returns <code>false</code>, meaning that the application should
	 *          wait for a callback.
	 */
	private boolean injectJsApi(String apiKey) {
		if (alreadyInjected) {
			return true;
		}
		boolean alreadyLoaded = createCallback(this);
		alreadyInjected = true;
		if (alreadyLoaded) {
			return true;
		}
		Document doc = Document.get();
		String key = (apiKey == null) ? "" : ("key=" + apiKey + "&");
		String protocol = (Window.Location.getProtocol().equals("https:")) ? "https:" : "http:";
		String src = protocol + "//" + HOSTNAME + "/jsapi?" + key + "callback=__gwt_charts_AjaxLoader_onLoad";
		ScriptElement script = doc.createScriptElement();
		script.setSrc(src);
		script.setType("text/javascript");
		doc.getBody().appendChild(script);
		return false;
	}

	/**
	 * Called back when the jsapi is finished loaded. It must kick of any API
	 * loads that have been queued while waiting on jsapi to finish loading.
	 */
	protected void onLoadCallback() {
		loaded = true;
		for (Runnable r : queuedApiLoads) {
			r.run();
		}
		queuedApiLoads.clear();
	}
}
