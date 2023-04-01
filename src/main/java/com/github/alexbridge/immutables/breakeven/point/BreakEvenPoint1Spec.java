package com.github.alexbridge.immutables.breakeven.point;

import com.github.alexbridge.immutables.breakeven.input.BreakEvenInputSpec;
import org.immutables.value.Value;

public interface BreakEvenPoint1Spec extends BreakEvenInputSpec {
    @Value.Lazy
    default String getBreakEvenPoint1() {

        return "Point 1: %s".formatted(
                getCalculationDate()
        );
    }
}
