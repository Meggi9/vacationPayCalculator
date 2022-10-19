package com.magatella.vacationpaycalculator.controllers;

import com.magatella.vacationpaycalculator.models.Vacation;
import com.magatella.vacationpaycalculator.services.CalculateVacationServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {

    final CalculateVacationServiceImpl vacantionService;

    public CalculateController(CalculateVacationServiceImpl calculateVacantionService) {
        this.vacantionService = calculateVacantionService;
    }

    @GetMapping("/calculacte")
    public double calculate(
            @RequestParam Integer yearSalary,
            @RequestParam Integer vacationDays
    ){
        Vacation vacationPay = new Vacation(yearSalary, vacationDays);
        return vacantionService.vacationPayCalculator(vacationPay);
    }
}
