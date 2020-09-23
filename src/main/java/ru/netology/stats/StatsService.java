package ru.netology.stats;

public class StatsService {


    public float calculateSum(long[] sales) {
        long sumSales = 0;

        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;

    }

    public double averageSumSales(long[] sales) {
        double avgSumSales = calculateSum(sales) / sales.length;
        return avgSumSales;
    }

    public long numMonthMaxSales(long[] sales) {
        int countMonth = 0;
        int maxSalesMonth = 0;
        long currentMax = sales[0];

        for (long sale : sales) {
            countMonth++;
            if (currentMax <= sale) {
                currentMax = sale;
                maxSalesMonth = countMonth;
            }
        }
        return maxSalesMonth;
    }


    public long numMonthMinSales(long[] sales) {
        int countMonth = 0;
        int minSalesMonth = 0;
        long currentMin = sales[0];

        for (long sale : sales) {
            countMonth++;
            if (currentMin >= sale) {
                currentMin = sale;
                minSalesMonth = countMonth;
            }
        }
        return minSalesMonth;
    }

    public long sumMonthAboveAverage(long[] sales) {
        long sumSales = 0;
        int sumMonthAbove = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        long avgSumSales = sumSales / sales.length;
        for (long sale : sales) {
            if (avgSumSales < sale) {
                sumMonthAbove++;
            }
        }
        return sumMonthAbove;

    }

    public long sumMonthBelowAverage(long[] sales) {
        long sumSales = 0;
        int sumMonthBelow = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        long avgSumSales = sumSales / sales.length;
        for (long sale : sales) {
            if (avgSumSales > sale) {
                sumMonthBelow++;
            }
        }
        return sumMonthBelow;

    }



















}
