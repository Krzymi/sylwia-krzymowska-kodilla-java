package com.kodilla.testing.weather.stub;

import java.util.*;
import java.util.stream.Collectors;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemperature() {
        double sum = 0.00;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            sum += temperature.getValue();
        }
        double size = temperatures.getTemperatures().size();
        return sum/size;
    }

    public double medianTemperature() {
        double median = 0.00;
        List<Double> values = new ArrayList<Double>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            values.add(temperature.getValue());
        }

        Collections.sort(values);
        int size = values.size();

        if (size % 2 == 0) {
            int a = (size / 2) - 1;
            int b = size / 2;
            double aValue = values.get(a);
            double bValue = values.get(b);
            median =  (aValue + bValue) / 2.00;
        } else {
            double mySize = values.size();
            double c = (mySize / 2.00) - 0.5;
            int midle;
            midle = (int) c;
            double cValue = values.get(midle);
            median =  cValue;
        }
        return median;
    }
}