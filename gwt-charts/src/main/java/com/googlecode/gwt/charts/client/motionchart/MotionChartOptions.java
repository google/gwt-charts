package com.googlecode.gwt.charts.client.motionchart;

import com.googlecode.gwt.charts.client.options.Options;

/**
 * Configuration options for {@link MotionChart}.
 *
 * @see <a href="https://developers.google.com/chart/interactive/docs/gallery/motionchart#Configuration_Options">Motion Chart
 *      Configuration Options</a>
 */
public class MotionChartOptions extends Options {

    /**
     * Default constructor.
     *
     * @return a new object instance
     */
    public static MotionChartOptions create() {
        return createObject().cast();
    }

    protected MotionChartOptions() {
    }

    /**
     * An initial display state for the chart.
     * This is a serialized JSON object that describes zoom level, selected dimensions, selected bubbles/entities, and other state descriptions.
     * See Setting Initial State to learn how to set this.
     *
     * @param state (Default: null)
     */
    public final native void setState(String state) /*-{
        this.state = state;
    }-*/;

    /**
     * false hides the buttons that control the chart type (bubbles / lines / columns) at top right corner.
     *
     * @param showChartButtons (Default: true)
     */
    public final native void setShowChartButtons(boolean showChartButtons) /*-{
        this.showChartButtons = showChartButtons;
    }-*/;

    /**
     * false hides the title label of the entities (derived from the label of the first column in the data table).
     *
     * @param showHeader (Default: true)
     */
    public final native void setShowHeader(boolean showHeader) /*-{
        this.showHeader = showHeader;
    }-*/;

    /**
     * false hides the list of visible entities.
     *
     * @param showSelectListComponent (Default: true)
     */
    public final native void setShowSelectListComponent(boolean showSelectListComponent) /*-{
        this.showSelectListComponent = showSelectListComponent;
    }-*/;

    /**
     * false hides the right hand panel.

     * @param showSidePanel (Default: true)
     */
    public final native void setShowSidePanel(boolean showSidePanel) /*-{
        this.showSidePanel = showSidePanel;
    }-*/;

    /**
     * false hides the metric picker for x.
     *
     * @param showXMetricPicker (Default: true)
     */
    public final native void setShowXMetricPicker(boolean showXMetricPicker) /*-{
        this.showXMetricPicker = showXMetricPicker;
    }-*/;

    /**
     * false hides the metric picker for y.
     *
     * @param showYMetricPicker (Default: true)
     */
    public final native void setShowYMetricPicker(boolean showYMetricPicker) /*-{
        this.showYMetricPicker = showYMetricPicker;
    }-*/;

    /**
     * false hides the scale picker for x.
     *
     * @param showXScalePicker (Default: true)
     */
    public final native void setShowXScalePicker(boolean showXScalePicker) /*-{
        this.showXScalePicker = showXScalePicker;
    }-*/;

    /**
     * false hides the scale picker for y.
     *
     * @param showYScalePicker (Default: true)
     */
    public final native void setShowYScalePicker(boolean showYScalePicker) /*-{
        this.showYScalePicker = showYScalePicker;
    }-*/;

    /**
     * false disables the options compartment in the settings panel.
     *
     * @param showAdvancedPanel (Default: true)
     */
    public final native void setShowAdvancedPanel(boolean showAdvancedPanel) /*-{
        this.showAdvancedPanel = showAdvancedPanel;
    }-*/;


    public final native Integer getWidth() /*-{
        return this.width;
    }-*/;

    public final native Integer getHeight() /*-{
        return this.height;
    }-*/;


}
