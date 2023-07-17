package ru.netology.javaqa.cycles_hw.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/resources/Vacation.csv")

    public void shouldCalculateVacationDays(int income, int expenses, int threshold) {
        VacationService service = new VacationService();

        int counts = service.calculate(income, expenses, threshold);

        System.out.println("Можем отдыхать "+counts+ " месяца/ев");

    }
}
