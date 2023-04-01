package com.github.alexbridge.immutables.breakeven.input;

import org.immutables.value.Value;

import java.time.LocalDate;

public interface BreakEvenInputSpec extends BreakEvenInput {
    @Value.Lazy
    default LocalDate getCalculationDate() {
        System.out.println("Calculate lazy date");
        return getDateTime().toLocalDate();
    }
}
