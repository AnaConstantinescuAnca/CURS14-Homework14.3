package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.fasttrackit.Exercise1.Temperatures;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.fasttrackit.Exercise1.Temperatures.celsiusToFahreinhert;
import static org.fasttrackit.Exercise1.Temperatures.fahreinhetToCelsius;

public class TDDTemperatures {
    @Test
    public void instantiateClass() {
        Temperatures temperatures = new Temperatures(0);

    }

    @Test
    public void callMethod() {
        Temperatures temperatures = new Temperatures(0);
        fahreinhetToCelsius(0.0);
    }

    @Test
    @DisplayName("WHEN temperature in grades Celsius is given THEN transform in grades Fahreinhert")
    public void methodCelsiusToFahreinhert() {
        //GIVEN
        double t = 0;
        Temperatures temperatures = new Temperatures(t);

        //WHEN
        //double result = temperatures.celsiusToFahreinhert(t) ;
        double result = celsiusToFahreinhert(t);
        //THEN
        Assertions.assertThat(result).isEqualTo(32.000000);
    }

    @Test
    @DisplayName("WHEN temperature in grades Fahreinhert is given THEN transform in grades Celsius")
    public void methodFahreinhertToCelsius() {
        //GIVEN
        double t = 0;
        Temperatures temperatures = new Temperatures(t);

        //WHEN
        double result = fahreinhetToCelsius(t);

        //THEN
        Assertions.assertThat(result).isEqualTo(-17.77777777777778);
    }

}
