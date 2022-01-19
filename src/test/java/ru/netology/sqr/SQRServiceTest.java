package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void shouldCalcSqrServiceRangeHundred() {
        SQRService service = new SQRService();
        int expected = 5;
        int actual = service.calcNumber(100, 200);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcSqrServiceRangeFiveHundred() {
        SQRService service = new SQRService();
        int expected = 9;
        int actual = service.calcNumber(500, 1000);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcSqrServiceRangeThousand() {
        SQRService service = new SQRService();
        int expected = 24;
        int actual = service.calcNumber(100, 1100);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcSqrServiceUpperBound() {
        SQRService service = new SQRService();
        int expected = 90;
        int actual = service.calcNumber(10, 9801);

        assertEquals(expected, actual);
    }
    @Test
    public void shouldCalcSqrServiceLimitValue() {
        SQRService service = new SQRService();
        int expected = 89;
        int actual = service.calcNumber(10, 9604);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcSqrServiceLowerBound() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calcNumber(10, 50);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcSqrServiceLimitValueLow() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calcNumber(500, 550);

        assertEquals(expected, actual);
    }


}