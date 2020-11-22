package com.kodilla.testing.weather.stub;

import java.util.*;

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
            resultMap.put(temperature.getKey(), temperature.getValue());
        }
        return resultMap;
    }

    public double avgTemp() {
        double sum = 0.0;
        int count = 0;
        List<Double> values = new ArrayList<>(calculateForecast().values());
            for (Double t: values) {
                sum += t;
                count++;
            }
        return sum / count;
    }

    public double medianTemp() {
        List<Double> values = new ArrayList<>(calculateForecast().values());
        values.sort(null);
        int middle = values.size() / 2;
            if (values.size() % 2 == 1) {
                return values.get(middle);
            } else {
                return (values.get(middle - 1) + values.get(middle)) / 2.0;
            }
        }
}
