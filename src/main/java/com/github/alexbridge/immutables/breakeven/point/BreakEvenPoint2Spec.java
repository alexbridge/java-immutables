package com.github.alexbridge.immutables.breakeven.point;

import com.github.alexbridge.immutables.breakeven.input.BreakEvenInput;
import com.github.alexbridge.immutables.breakeven.input.BreakEvenInputSpec;
import org.immutables.value.Value;

public interface BreakEvenPoint2Spec extends BreakEvenInput, BreakEvenInputSpec, BreakEvenPoint1Spec {
    @Value.Lazy
    default String getBreakEvenPoint2() {
        return "Point 2 %s > %s: %s".formatted(
                getCalculationDate(),
                getName(),
                getBreakEvenPoint1()
        );
    }
}
