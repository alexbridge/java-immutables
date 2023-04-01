package com.github.alexbridge.immutables.breakeven;

import com.github.alexbridge.immutables.breakeven.input.BreakEvenInput;
import com.github.alexbridge.immutables.breakeven.point.BreakEvenPoint1Spec;
import com.github.alexbridge.immutables.breakeven.point.BreakEvenPoint2Spec;
import com.github.alexbridge.immutables.breakeven.point.BreakEvenPoint3Spec;
import org.immutables.value.Value;

import java.time.OffsetDateTime;

@Value.Immutable(copy = false, builder = false)
@Value.Style(allParameters = true)
public abstract class BreakEvenBaseProfiler implements BreakEvenInput,
        BreakEvenPoint1Spec,
        BreakEvenPoint2Spec,
        BreakEvenPoint3Spec {

    public static ImmutableBreakEvenBaseProfiler of(String name, OffsetDateTime dateTime) {
        return ImmutableBreakEvenBaseProfiler.of(name, dateTime);
    }

}
