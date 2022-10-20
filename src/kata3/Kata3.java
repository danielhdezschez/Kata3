/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kata3;

/**
 *
 * @author yadai
 */
public class Kata3 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

        Histogram<String> histogram = new Histogram<String>();

        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        histogram.increment("hotmail.com");
        histogram.increment("gmail.com");

        //view
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM DISPLAY", histogram);
        histogramDisplay.execute();
    }
}
