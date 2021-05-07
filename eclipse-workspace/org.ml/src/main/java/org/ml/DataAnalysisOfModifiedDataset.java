package org.ml;

import java.io.IOException;

import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;
import tech.tablesaw.plotly.traces.BarTrace;
import tech.tablesaw.plotly.traces.BoxTrace;
import tech.tablesaw.plotly.traces.HistogramTrace;

public class DataAnalysisOfModifiedDataset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		try {
			Table gasData = Table.read().csv("C:\\Users\\Dell\\eclipse-workspace\\org.ml\\src\\main\\java\\org\\ml\\GasPriceModified.csv");
			
			System.out.println(gasData.shape());
			System.out.println(gasData.first(5));
			System.out.println(gasData.last(5));
			System.out.println(gasData.structure());
			System.out.println(gasData.summary());
			Layout layout1 = Layout.builder().title("Distribution of Price").build();
		    HistogramTrace trace1 = HistogramTrace.builder(gasData.nCol("Price")).build();
		    Plot.show(new Figure(layout1, trace1));
		    
		    Layout layout2 = Layout.builder().title("price by year").build();
		    BoxTrace trace2 =BoxTrace.builder(gasData.categoricalColumn("year"), gasData.nCol("Price")).build();
		    Plot.show(new Figure(layout2, trace2));
		    
		    Layout layout3 = Layout.builder().title("price by day").build();
		    BoxTrace trace3 =BoxTrace.builder(gasData.categoricalColumn("day"), gasData.nCol("Price")).build();
		    Plot.show(new Figure(layout3, trace3));
		    
		    Layout layout4 = Layout.builder().title("price by month").build();
		    BoxTrace trace4 =BoxTrace.builder(gasData.categoricalColumn("month"), gasData.nCol("Price")).build();
		    Plot.show(new Figure(layout4, trace4));
		    
		    Layout layout5 = Layout.builder().title("price by year").build();
		    BarTrace trace5 =BarTrace.builder(gasData.categoricalColumn("year"), gasData.nCol("Price")).build();
		    Plot.show(new Figure(layout5, trace5));
		    
		    Layout layout6 = Layout.builder().title("price by day").build();
		    BarTrace trace6 =BarTrace.builder(gasData.categoricalColumn("day"), gasData.nCol("Price")).build();
		    Plot.show(new Figure(layout6, trace6));
		    
		    Layout layout7 = Layout.builder().title("price by month").build();
		    BarTrace trace7 =BarTrace.builder(gasData.categoricalColumn("month"), gasData.nCol("Price")).build();
		    Plot.show(new Figure(layout7, trace7));
		    
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
