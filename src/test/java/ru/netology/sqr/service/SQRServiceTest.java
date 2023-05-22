package ru.netology.sqr.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    private static SQRService sqrService;

    @BeforeAll
    public static void init() {
        sqrService = new SQRService();
    }

    @Test
    void shouldReturnZero_ifUpperBoundLessSqrt10() {
        int lowerBound = 0;
        int upperBound = 0;

        int expected = 0;

        int actual = sqrService.calcSqrt(lowerBound, upperBound);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnOne_ifLowerBoundLessSqrt10AndUpperBoundEquals10() {
        int lowerBound = 0;
        int upperBound = 100;

        int expected = 1;

        int actual = sqrService.calcSqrt(lowerBound, upperBound);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnOne_ifBothBoundInRange10And99() {
        int lowerBound = 121;
        int upperBound = 140;

        int expected = 1;

        // 11 * 11 = 121
        // 12 * 12 = 144

        int actual = sqrService.calcSqrt(lowerBound, upperBound);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnTwo_ifBothBoundInRange10And99() {
        int lowerBound = 200;
        int upperBound = 300;

        int expected = 3;

        // 14 * 14 = 196 - не попадает в диапазон
        // 15 * 15 = 225
        // 16 * 16 = 256
        // 17 * 17 = 289
        // 18 * 18 = 324 - не попадает в диапазон

        int actual = sqrService.calcSqrt(lowerBound, upperBound);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnOne_ifLowerBoundEqualsSqrt99AndUpperBoundMore99() {
        int lowerBound = 9_801;
        int upperBound = 10_000;

        int expected = 1;

        int actual = sqrService.calcSqrt(lowerBound, upperBound);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnZero_ifLowerBoundMoreSqrt99() {
        int lowerBound = 10_000;
        int upperBound = 11_000;

        int expected = 0;

        int actual = sqrService.calcSqrt(lowerBound, upperBound);

        assertEquals(expected, actual);
    }
}