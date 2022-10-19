package com.magatella.vacationpaycalculator.services;

import com.magatella.vacationpaycalculator.models.Vacation;

public interface CalculateVacationService {
    double vacationPayCalculator(Vacation vacation);
}
