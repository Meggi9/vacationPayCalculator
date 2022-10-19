package com.magatella.vacationpaycalculator;

import com.magatella.vacationpaycalculator.models.Vacation;
import com.magatella.vacationpaycalculator.services.CalculateVacationServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationTest {

    @Test
    void calculate(){
        Vacation vacationPay = new Vacation(35000, 18);
        CalculateVacationServiceImpl calculatorSalaryService = new CalculateVacationServiceImpl();

        int result = (int) calculatorSalaryService.vacationPayCalculator(vacationPay);
        int expected = 21501;
        assertEquals(expected, result);
    }
}
