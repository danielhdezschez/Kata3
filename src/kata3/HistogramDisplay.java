/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata3;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

import javax.swing.*;
import java.awt.*;

public class HistogramDisplay extends ApplicationFrame {

    /**
     *
     */
    public HistogramDisplay() {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }

    public void execute(){
        setVisible(true);
    }
    
    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataSet()));
        chartPanel.setPreferredSize(new Dimension(500, 400));
        return chartPanel;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart("Histogram Display",
                "Dominios email",
                "Nº emails", dataset,
                PlotOrientation.VERTICAL, false,
                false, false);
        return chart;
    }
    
    private DefaultCategoryDataset createDataSet() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(2, "", "ulpgc.es");
        dataset.addValue(5, "", "yahho.com");
        dataset.addValue(8, "", "outlook.es");
        dataset.addValue(5, "", "gmail.com");
        dataset.addValue(2, "", "hotmail.com");
        return dataset;
    }

    

        
}
