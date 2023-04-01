package com.github.alexbridge.immutables.breakeven.point;

import com.github.alexbridge.immutables.breakeven.input.BreakEvenInputSpec;
import org.immutables.value.Value;

public interface BreakEvenPoint3Spec extends BreakEvenInputSpec, BreakEvenPoint2Spec {
    @Value.Lazy
    default String getBreakEvenPoint3() {
        return "Point 3 %s > %s".formatted(
                getCalculationDate(),
                getBreakEvenPoint2()
        );
    }
}
