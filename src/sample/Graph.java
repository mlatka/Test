package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class Graph {

    @FXML
    private NumberAxis xAxis;

    @FXML
    private NumberAxis yAxis;

    @FXML
    private LineChart<Number,Number> figure;


    @FXML
    void btnDrawClicked(ActionEvent event) {

        XYChart.Series series1= new XYChart.Series();


        for(double x=0; x<6.28; x+=0.1)
            series1.getData().add(new XYChart.Data(x,Math.sin(x)));


        xAxis.setAutoRanging(false);
        yAxis.setAutoRanging(true);
        figure.getData().add(series1);



    }


    public void initialize(){

        xAxis.setLabel("t");
        yAxis.setLabel("value");


        xAxis.setAutoRanging(false);
        xAxis.setLowerBound(0);
        xAxis.setUpperBound(7);
        xAxis.setTickUnit(1);

        yAxis.setAutoRanging(false);
        yAxis.setLowerBound(-1);
        yAxis.setUpperBound(1);
        yAxis.setTickUnit(0.2);







    }

}
