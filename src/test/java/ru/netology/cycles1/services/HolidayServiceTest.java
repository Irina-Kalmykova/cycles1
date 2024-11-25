package ru.netology.cycles1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HolidayServiceTest {

    @Test
    public void test1() {
        HolidayService service = new HolidayService();

        int expected = 3;
        int actual = service.calcHoliday(10_000, 3_000, 20_000);
        //System.out.println("1. " + expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        HolidayService service = new HolidayService();

        int expected = 2;
        int actual = service.calcHoliday(100_000, 60_000, 150_000);
        //System.out.println("2. " + expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }
}