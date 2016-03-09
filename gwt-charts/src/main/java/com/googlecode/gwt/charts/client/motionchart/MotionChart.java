package com.googlecode.gwt.charts.client.motionchart;

import com.google.gwt.dom.client.Element;
import com.googlecode.gwt.charts.client.ChartObject;
import com.googlecode.gwt.charts.client.ChartWidget;
import com.googlecode.gwt.charts.client.DataSource;
import com.googlecode.gwt.charts.client.event.ErrorHandler;
import com.googlecode.gwt.charts.client.event.HandlerRef;
import com.googlecode.gwt.charts.client.event.ReadyHandler;
import com.googlecode.gwt.charts.client.event.StateChangeHandler;


/**
 * A dynamic chart to explore several indicators over time. The chart is rendered within the browser using Flash
 */
public class MotionChart  extends ChartWidget<MotionChartOptions> {

    private boolean isResponsive = true;

    /**
     * Creates a new chart widget.
     */
    public MotionChart() {
        super();
    }

    /**
     * Adds an handler that listens for error events.
     *
     * @param handler the class to call when the event is fired
     * @return the handler reference
     */
    public HandlerRef addErrorHandler(ErrorHandler handler) {
        return addHandler(handler);
    }

    /**
     * Adds an handler that listens for ready events.
     *
     * @param handler the class to call when the event is fired
     * @return the handler reference
     */
    public HandlerRef addReadyHandler(ReadyHandler handler) {
        return addHandler(handler);
    }

    /**
     * Adds an handler that listens when user has interacted with the chart in some way.
     * Call getState() to learn the current state of the chart.

     *
     * @param handler the class to call when the event is fired
     * @return the handler reference
     */
    public HandlerRef addStateChangeHandler(StateChangeHandler handler) {
        return addHandler(handler);
    }


    @Override
    protected void redrawNow() {
        if (isResponsive) {
            int height = getParent().getOffsetHeight();
            if (height > 0) {
                options.setHeight(height);
            }
            int width = getParent().getOffsetWidth();
            if (width > 0) {
                options.setWidth(width);
            }
        }
        super.redrawNow();
    }

    @Override
    public void draw(DataSource data, MotionChartOptions options) {
        this.isResponsive = options.getHeight() == null && options.getWidth() == null;
        super.draw(data, options);
    }

    /**
     * Returns the current state of the motionchart, serialized to a JSON string.
     * To assign this state to the chart, assign this string to the state option in the draw() method.
     * This is often used to specify a custom chart state on startup, instead of using the default state.
     *
     * @return the state of the charts
     */
    public native final String getState() /*-{
         return this.getState();
    }-*/;

    @Override
    protected native ChartObject createChartObject(Element container) /*-{
        return new $wnd.google.visualization.MotionChart(container);
    }-*/;
}
