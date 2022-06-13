package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SqrtServiceTest {

    @Test
    public void shouldCalcExact() {
        SqrtService service = new SqrtService();

        int expected = 3;
        int actual = service.calcSqrt(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExact_0_0() {
        SqrtService service = new SqrtService();

        int expected = 0;
        int actual = service.calcSqrt(0, 0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExact_100_200() {
        SqrtService service = new SqrtService();

        int expected = 5;
        int actual = service.calcSqrt(100, 200);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExact_100_100() {
        SqrtService service = new SqrtService();

        int expected = 1;
        int actual = service.calcSqrt(100, 100);

        Assertions.assertEquals(expected, actual);
    }
}
