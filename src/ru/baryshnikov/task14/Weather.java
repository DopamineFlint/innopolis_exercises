package ru.baryshnikov.task14;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
    private String name = null;
    private int timezone;

    private Main main;

    public Main getMain() {
        return main;
    }

    public String getName() {
        return this.name;
    }

    public int getTimezone() {
        return this.timezone;
    }
}
