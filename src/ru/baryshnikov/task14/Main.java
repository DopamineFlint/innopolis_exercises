package ru.baryshnikov.task14;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {
    private double temp_min;
    private double temp_max;

    public double getTemp_min() {
        return this.temp_min;
    }

    public double getTemp_max() {
        return this.temp_max;
    }
}
