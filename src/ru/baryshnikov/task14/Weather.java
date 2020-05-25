package ru.baryshnikov.task14;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
    private String name = null;
    private int timezone;
    private Main main = new Main();

    public String getName() {
        return this.name;
    }

    public int getTimezone() {
        return this.timezone;
    }

    public double getMin() {
        return main.getTemp_min();
    }

    public double getMax() {
        return main.getTemp_max();
    }
}
