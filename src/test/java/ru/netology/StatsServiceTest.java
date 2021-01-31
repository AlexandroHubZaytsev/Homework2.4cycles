package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void shouldSum() {

        int expected = 180;
        int actual = service.sum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAverage() {
        int expected = 15;
        int actual = service.avg(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMaxAmountMonthSales() {
        int expected = 8;
        int actual = service.maxAmountMonthSales(purchases);
        assertEquals(expected, actual);

    }
    @Test
    void shouldReturnMinAmountMonthSales() {
        int expected = 9;
        int actual = service.minAmountMonthSales(purchases);
        assertEquals(expected, actual);
    }
    @Test
    void shouldMoreThanAverageSales() {
        int expected = 5;
        int actual = service.monthWithLessAverage(purchases);
        assertEquals(expected, actual);
    }
    @Test
    void shouldLessThanAverageSales() {
        int expected = 5;
        int actual = service.monthWithMoreAverage(purchases);
        assertEquals(expected, actual);
    }
}

