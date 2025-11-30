package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    @Override
    public void start(Stage stage) {

        BorderPane layout = new BorderPane();

        BorderPane savingsPane = new BorderPane();

        Slider savingsSlider = new Slider(25, 250, 25);
        savingsSlider.setSnapToTicks(true);
        savingsSlider.setBlockIncrement(500);
        savingsSlider.setShowTickMarks(true);
        savingsSlider.setShowTickLabels(true);

        Label savingsInfo = new Label();
        savingsInfo.setText("" + savingsSlider.getValue());

        savingsPane.setLeft(new Label("Monthly savings"));
        savingsPane.setCenter(savingsSlider);
        savingsPane.setRight(savingsInfo);
        savingsPane.setPadding(new Insets(10));


        BorderPane interestPane = new BorderPane();

        Slider interestSlider = new Slider(0, 10, 0);
        interestSlider.setMinorTickCount(10);
        interestSlider.setShowTickMarks(true);
        interestSlider.setShowTickLabels(true);

        Label interestInfo = new Label();
        interestInfo.setText("" + interestSlider.getValue());

        interestPane.setLeft(new Label("Yearly interest rate"));
        interestPane.setCenter(interestSlider);
        interestPane.setRight(interestInfo);
        interestPane.setPadding(new Insets(10));

        VBox sliderVBox = new VBox();
        sliderVBox.getChildren().addAll(savingsPane, interestPane);

        layout.setTop(sliderVBox);

        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();

        LineChart<Number, Number> lineChart = new LineChart(xAxis, yAxis);
        lineChart.setAnimated(false);
        lineChart.setLegendVisible(false);
        lineChart.setTitle("Savings calulator");

        layout.setCenter(lineChart);

        XYChart.Series savingsSeries = new XYChart.Series();
        XYChart.Series savingsWithInterestSeries = new XYChart.Series();

        lineChart.getData().add(savingsSeries);
        lineChart.getData().add(savingsWithInterestSeries);


        savingsSlider.valueProperty().addListener((observable, oldvalue, newvalue) -> {
            int savings = newvalue.intValue();
            savingsInfo.setText("" + savings);

            updateSavings(savingsSlider.getValue(), interestSlider.getValue(), savingsSeries, savingsWithInterestSeries);
        });

        interestSlider.valueProperty().addListener((observable, oldvalue, newvalue) -> {
            interestInfo.setText("" + newvalue);

            updateSavings(savingsSlider.getValue(), interestSlider.getValue(), savingsSeries, savingsWithInterestSeries);
        });

        Scene view = new Scene(layout, 640, 480);

        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
        System.out.println("Hello world!");
    }


    private void updateSavings(double savings, double interest,
                           XYChart.Series<Number, Number> savingsSeries,
                           XYChart.Series<Number, Number> interestSeries) {

        savingsSeries.getData().clear();
        interestSeries.getData().clear();

        double noInterest = 0;
        double withInterest = 0;

        // year 0
        savingsSeries.getData().add(new XYChart.Data(0, 0));
        interestSeries.getData().add(new XYChart.Data(0, 0));

        for (int year = 1; year <= 30; year++) {

            // plain savings
            noInterest += savings * 12;

            // compounding
            withInterest = (withInterest + savings * 12) * (1 + interest / 100.0);

            savingsSeries.getData().add(new XYChart.Data(year, noInterest));
            interestSeries.getData().add(new XYChart.Data(year, withInterest));
    }
}



}