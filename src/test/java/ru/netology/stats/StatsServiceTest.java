package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        float actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }


    @Test
    void AverageSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;
        double actual = service.averageSumSales(sales);
        assertEquals(expected, actual);
    }



    @Test
    void numMonthMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.numMonthMaxSales(sales);
        assertEquals(expected, actual);
    }



@Test
    void numMonthMinSales(){
            StatsService service=new StatsService();
            long[]sales={8,15,13,15,17,20,19,20,7,14,14,18};
            long expected=9;
            long actual=service.numMonthMinSales(sales);
            assertEquals(expected,actual);}



@Test
    void sumMonthAboveAverage(){StatsService service=new StatsService();
            long[]sales={8,15,13,15,17,20,19,20,7,14,14,18};
            long expected=5;
            long actual=service.sumMonthAboveAverage(sales);
            assertEquals(expected,actual);}



@Test
    void sumMonthBelowAverage(){{StatsService service=new StatsService();
            long[]sales={8,15,13,15,17,20,19,20,7,14,14,18};
            long expected=5;
            long actual=service.sumMonthBelowAverage(sales);
            assertEquals(expected,actual);}
            }


            }