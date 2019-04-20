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

import com.google.gwt.i18n.client.LocaleInfo;
import com.google.gwt.user.client.Window;

import com.googlecode.gwt.charts.client.apiloader.ApiLoader;
import com.googlecode.gwt.charts.client.apiloader.ApiLoaderOptions;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Utility class for loading the Chart Tools API using the Google Ajax Loader.
 */
public class ChartLoader {
	private static final String DEFAULT_API_HOST = "www.gstatic.com";
	private static final String DEFAULT_API_PATH = "/charts/loader.js";
	private static final String DEFAULT_API_VERSION = "current";

	private ChartPackage[] packages = null;
	private String language = null;
	private String url = null;
	private String version = null;
	private String mapsApiKey = null;
	private ApiLoader apiLoader = null;

	/**
	 * Generates a URL referring to the location of Google Charts API.
	 *
	 * @param scheme the scheme. This mus be either "http" or "https". If null, it is determined automatically.
	 * @param host the host name. This must be like "www.gstatic.com". If null, the default value is used.
	 * @param path the path to the API. This must be like "/charts/loader.js".If null, the default value is used.
	 * @return the URL to the API.
	 */
	public static String generateApiUrl(String scheme, String host, String path) {
		if (scheme == null) {
			scheme = (Window.Location.getProtocol().equals("https:")) ? "https" : "http";
		}
		if (host == null) {
			host = DEFAULT_API_HOST;
		}
		if (path == null) {
			path = DEFAULT_API_PATH;
		}

		return scheme + "://" + host + path;
	}

	/**
	 * Creates a chart loader with the specified packages.
	 * 
	 * @param packages a list of ChartPackage's
	 */
	public ChartLoader(ChartPackage... packages) {
		setPackages(packages);
		setLanguage(LocaleInfo.getCurrentLocale().getLocaleName());
		setApiUrl(generateApiUrl(null, null, null));
		setVersion(DEFAULT_API_VERSION);
	}

	/**
	 * Returns the current language.
	 * 
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Returns the current packages.
	 * 
	 * @return the packages
	 */
	public ChartPackage[] getPackages() {
		return packages;
	}

	/**
	 * Returns the URL to the API.
	 *
	 * @return the URL
	 */
	public String getApiUrl() {
		return url;
	}

	/**
	 * Returns the current version.
	 * 
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Returns the current mapsApiKey, which is used during a loading process of Geochart and Map Chart.
	 * Note that null will be returned when {@link #setMapsApiKey(String)} is not called yet.
	 * @return the mapsApiKey
	 */
	public String getMapsApiKey() {
		return mapsApiKey;
	}

	/**
	 * Returns the current ApiLoader object.
	 * @return the ApiLoader
	 */
	public ApiLoader getApiLoader() {
		return apiLoader;
	}

	/**
	 * Loads requested API libraries and calls an handler after finished.
	 * 
	 * @param callback the handler to be called
	 */
	public void loadApi(Runnable callback) {
		assert (callback != null);
		final LinkedList<Runnable> callbackList = new LinkedList<Runnable>();
		callbackList.add(callback);
		loadApi(callbackList);
	}

	/**
	 * Loads requested API libraries and calls an handler after finished.
	 * 
	 * @param callbacks an array of the handlers to be called
	 */
	public void loadApi(Runnable[] callbacks) {
		assert (callbacks != null);
		loadApi(Arrays.asList(callbacks));
	}

	/**
	 * Loads requested API libraries and calls an handler after finished.
	 * 
	 * @param callbacks a collection of the handlers to be called
	 */
	public void loadApi(Collection<Runnable> callbacks) {
		assert (callbacks != null);

		if (apiLoader == null) {
			apiLoader = new ApiLoader();
		}

		boolean isMapsApiKeyRequired = false;
		String[] packagesArray = new String[packages.length];

		for (int i = 0; i < packages.length; i++) {
			packagesArray[i] = packages[i].getName();
			switch (packages[i]) {
				case GEOCHART:
				case MAP:
					isMapsApiKeyRequired = true;
					break;
			}
		}

		if (isMapsApiKeyRequired) {
			assert (mapsApiKey != null && !mapsApiKey.isEmpty());
		}

		ApiLoaderOptions options = ApiLoaderOptions.create();
		options.setPackages(packagesArray);

		if (language != null) {
			options.setLanguage(language);
		}

		if (mapsApiKey != null && !mapsApiKey.isEmpty()) {
			options.setMapsApiKey(mapsApiKey);
		}

		apiLoader.setUrl(url);
		apiLoader.setVersion(version);
		apiLoader.setOptions(options);
		apiLoader.setCallbacks(callbacks);

		apiLoader.loadApi();
	}

	/**
	 * Sets the display language for the charts.
	 * Must be set before {@link #loadApi(Collection) loadApi(Collection&lt;Runnable&gt;)} is called.
	 * 
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * Sets the packages for loading
	 * Must be set before {@link #loadApi(Collection) loadApi(Collection&lt;Runnable&gt;)} is called.
	 * 
	 * @param packages the packages to load
	 */
	public void setPackages(ChartPackage... packages) {
		this.packages = packages;
	}

	/**
	 * Sets the URL to the API.
	 *
	 * @param url the URL
	 */
	public void setApiUrl(String url) {
		this.url = url;
	}

	/**
	 * Sets the api version for loading
	 * Must be set before {@link #loadApi(Collection) loadApi(Collection&lt;Runnable&gt;)} is called.
	 * 
	 * @param version the version to use
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * Sets the mapsApiKey, which is used during a loading process of Geochart and Map Chart.
	 * Note that this method must be called before {@link #loadApi(Collection) loadApi(Collection&lt;Runnable&gt;)} is called when you use the GEOCHART and/or MAP packages.
	 *
	 * @param mapsApiKey mapsApiKey
	 */
	public void setMapsApiKey(String mapsApiKey) {
		this.mapsApiKey = mapsApiKey;
	}

	/**
	 * Sets the ApiLoader object.
	 * You can customize the initialization process of the Google Charts library by extending ApiLoader class.
	 *
	 * @param apiLoader an ApiLoader object
	 */
	public void setApiLoader(ApiLoader apiLoader)
	{
		this.apiLoader = apiLoader;
	}
}
