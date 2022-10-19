package com.magatella.vacationpaycalculator.services;

import com.magatella.vacationpaycalculator.models.Vacation;
import org.springframework.stereotype.Service;

@Service
public class CalculateVacationServiceImpl implements CalculateVacationService{
    @Override
    public double vacationPayCalculator(Vacation vacation) {
        double days = 12 * 29.3;
        double dayCost = vacation.getAverageSalary() * 12 / days;

        return dayCost * vacation.getNumberOfVacationDays();
    }
}
