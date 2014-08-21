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

import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.i18n.client.LocaleInfo;

import com.googlecode.gwt.charts.client.ajaxloader.AjaxLoader;
import com.googlecode.gwt.charts.client.ajaxloader.AjaxLoader.AjaxLoaderOptions;

/**
 * Utility class for loading the Chart Tools API using the Google Ajax Loader.
 */
public class ChartLoader {
	private static final String API_NAME = "visualization";
	private static final String API_VERSION = "1.1";

	private ChartPackage[] packages;
	private String language;
	private String version;

	/**
	 * Creates a chart loader with the specified packages.
	 * 
	 * @param packages a list of ChartPackage's
	 */
	public ChartLoader(ChartPackage... packages) {
		setPackages(packages);
		setLanguage(LocaleInfo.getCurrentLocale().getLocaleName());
		setVersion(API_VERSION);
	}

	/**
	 * Returns the current language
	 * 
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Returns the current packages
	 * 
	 * @return the packages
	 */
	public ChartPackage[] getPackages() {
		return packages;
	}

	/**
	 * Returns the current version
	 * 
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Loads requested API libraries and calls an handler after finished.
	 * 
	 * @param callback the handler to be called
	 */
	public void loadApi(Runnable callback) {
		AjaxLoaderOptions options = AjaxLoaderOptions.newInstance();
		JsArrayString packagesArray = JsArrayString.createArray().cast();
		for (int i = 0; i < packages.length; i++) {
			packagesArray.push(packages[i].getName());
		}
		options.setPackages(packagesArray);
		if (language != null) {
			options.setLanguage(language);
		}
		AjaxLoader.loadApi(API_NAME, version, callback, options);
	}

	/**
	 * Sets the display language for the charts.
	 * Must be set before {@link #loadApi(Runnable)} is called.
	 * 
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * Sets the packages for loading
	 * Must be set before {@link #loadApi(Runnable)} is called.
	 * 
	 * @param packages the packages to load
	 */
	public void setPackages(ChartPackage... packages) {
		this.packages = packages;
	}

	/**
	 * Sets the api version for loading
	 * Must be set before {@link #loadApi(Runnable)} is called.
	 * 
	 * @param version the version to use
	 */
	public void setVersion(String version) {
		this.version = version;
	}

}
