package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testTemperatureAveradgeWithMock() {
        //Given
        Map<String, Double> temperaturesAvr = new HashMap<>();
        temperaturesAvr.put("Rzeszow", 25.5);
        temperaturesAvr.put("Krakow", 26.2);
        temperaturesAvr.put("Wroclaw", 24.8);
        temperaturesAvr.put("Warszawa", 25.2);
        temperaturesAvr.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesAvr);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double myTemeratureAvg;
        myTemeratureAvg = weatherForecast.averageTemperature();

        //Then
        Assertions.assertEquals(25.56, myTemeratureAvg);
    }

    @Test
    void testTemperatureMedianWithMock() {
        //Given
        Map<String, Double> temperaturesMedian = new HashMap<>();
        temperaturesMedian.put("Rzeszow", 25.5);
        temperaturesMedian.put("Krakow", 26.2);
        temperaturesMedian.put("Wroclaw", 24.8);
        temperaturesMedian.put("Warszawa", 25.2);
        temperaturesMedian.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMedian);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double myTemperaturesMedian;
        myTemperaturesMedian = weatherForecast.medianTemperature();

        //Then
        Assertions.assertEquals(25.5, myTemperaturesMedian);
    }

    @Test
    void testTemperatureMedianWithMock2() {
        //Given
        Map<String, Double> temperaturesMedian = new HashMap<>();
        temperaturesMedian.put("Rzeszow", 25.5);
        temperaturesMedian.put("Krakow", 26.2);
        temperaturesMedian.put("Wroclaw", 24.8);
        temperaturesMedian.put("Warszawa", 25.2);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMedian);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double myTemperaturesMedian;
        myTemperaturesMedian = weatherForecast.medianTemperature();

        //Then
        Assertions.assertEquals(25.35, myTemperaturesMedian);
    }
}

