package ru.baryshnikov.task14;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class WeatherParser {
    private static String link = "http://api.openweathermap.org/data/2.5/weather?q=Kazan&appid=7d172c3813ebdc93470b4d86c62575b3";

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL(link);
        ObjectMapper mapper = new ObjectMapper();

        try {
            Weather weather = mapper.readValue(url, Weather.class);

            System.out.println(weather.getName());
            System.out.println(weather.getTimezone());
            System.out.println(weather.getMin());
            System.out.println(weather.getMax());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
