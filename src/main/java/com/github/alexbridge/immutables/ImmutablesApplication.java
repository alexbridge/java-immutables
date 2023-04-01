package com.github.alexbridge.immutables;

import com.github.alexbridge.immutables.breakeven.BreakEvenBaseProfiler;

import java.time.OffsetDateTime;

public class ImmutablesApplication {

    public static void main(String[] args) {
        var breakEven = BreakEvenBaseProfiler.of(
                "Immutables",
                OffsetDateTime.now()
        );

        System.out.printf("Point 1: %s%n", breakEven.getBreakEvenPoint1());
        System.out.printf("Point 2: %s%n", breakEven.getBreakEvenPoint2());
        System.out.printf("Point 3: %s%n", breakEven.getBreakEvenPoint3());
    }

}
