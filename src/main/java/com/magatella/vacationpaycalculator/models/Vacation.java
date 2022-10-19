package com.magatella.vacationpaycalculator.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vacation {
    private Integer averageSalary;
    private Integer numberOfVacationDays;
}
