package org.ml;

import java.io.IOException;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;
import tech.tablesaw.plotly.traces.BoxTrace;
import tech.tablesaw.plotly.traces.HistogramTrace;

import tech.tablesaw.api.Table;

public class DataAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Initial Summary");
		try {
			Table gasData = Table.read().csv("C:\\Users\\Dell\\eclipse-workspace\\org.ml\\src\\main\\java\\org\\ml\\Gasprice.csv");
			
			System.out.println(gasData.shape());
			System.out.println(gasData.first(5));
			System.out.println(gasData.last(5));
			System.out.println(gasData.structure());
			System.out.println(gasData.summary());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
