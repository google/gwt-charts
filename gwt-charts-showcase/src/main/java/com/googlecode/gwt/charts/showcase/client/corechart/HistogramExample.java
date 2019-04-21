package com.googlecode.gwt.charts.showcase.client.corechart;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.corechart.Histogram;
import com.googlecode.gwt.charts.client.corechart.HistogramOptions;
import com.googlecode.gwt.charts.client.options.Legend;
import com.googlecode.gwt.charts.client.options.LegendPosition;
import com.googlecode.gwt.charts.client.util.ChartHelper;

public class HistogramExample extends DockLayoutPanel {
	private Histogram chart;

	public HistogramExample() {
		super(Unit.PX);
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CORECHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				chart = new Histogram();
				add(chart);
				draw();
			}
		});
	}

	private void draw() {
		// Prepare the data
		Object[][] data = new Object[][] { { "Dinosaur", "Length" }, { "Acrocanthosaurus (top-spined lizard)", 12.2 },
				{ "Albertosaurus (Alberta lizard)", 9.1 }, { "Allosaurus (other lizard)", 12.2 },
				{ "Apatosaurus (deceptive lizard)", 22.9 }, { "Archaeopteryx (ancient wing)", 0.9 },
				{ "Argentinosaurus (Argentina lizard)", 36.6 }, { "Baryonyx (heavy claws)", 9.1 },
				{ "Brachiosaurus (arm lizard)", 30.5 }, { "Ceratosaurus (horned lizard)", 6.1 },
				{ "Coelophysis (hollow form)", 2.7 }, { "Compsognathus (elegant jaw)", 0.9 },
				{ "Deinonychus (terrible claw)", 2.7 }, { "Diplodocus (double beam)", 27.1 },
				{ "Dromicelomimus (emu mimic)", 3.4 }, { "Gallimimus (fowl mimic)", 5.5 },
				{ "Mamenchisaurus (Mamenchi lizard)", 21.0 }, { "Megalosaurus (big lizard)", 7.9 },
				{ "Microvenator (small hunter)", 1.2 }, { "Ornithomimus (bird mimic)", 4.6 },
				{ "Oviraptor (egg robber)", 1.5 }, { "Plateosaurus (flat lizard)", 7.9 },
				{ "Sauronithoides (narrow-clawed lizard)", 2.0 }, { "Seismosaurus (tremor lizard)", 45.7 },
				{ "Spinosaurus (spiny lizard)", 12.2 }, { "Supersaurus (super lizard)", 30.5 },
				{ "Tyrannosaurus (tyrant lizard)", 15.2 }, { "Ultrasaurus (ultra lizard)", 30.5 },
				{ "Velociraptor (swift robber)", 1.8 } };
		DataTable dataTable = ChartHelper.arrayToDataTable(data);

		// Set options
		HistogramOptions options = HistogramOptions.create();
		options.setTitle("Lengths of dinosaurs, in meters");
		options.setLegend(Legend.create(LegendPosition.NONE));

		// Draw the chart
		chart.draw(dataTable, options);
	}
}
