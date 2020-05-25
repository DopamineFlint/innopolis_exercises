package ru.baryshnikov.task14;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class WeatherParser {
    private static String link = "post your link here";

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL(link);
        ObjectMapper mapper = new ObjectMapper();

        try {
            Weather weather = mapper.readValue(url, Weather.class);

            System.out.println(weather.getName());
            System.out.println(weather.getTimezone());
            System.out.println(weather.getMain().getTemp_min());
            System.out.println(weather.getMain().getTemp_max());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
