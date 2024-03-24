package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthMaxSale(long[] sales) {
        int monthPeak = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthPeak] <= sales[i]) {
             monthPeak = i;
            }
        }
        return monthPeak + 1;
    }

    public int monthMinSale(long[] sales) {
        int monthLow = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthLow]) {
                monthLow = i;
            }
        }
        return monthLow + 1;
    }

    public int monthsBelowAverage (long[] sales){
        long averageSale = average(sales);
        int counter = 0;
        for (long sale :sales) {
            if (sale < averageSale) {
                counter++;

            }
        }
        return counter;
    }

    public int monthsHighAverage (long[] sales){
        long averageSale = average(sales);
        int counter = 0;
        for (long sale :sales) {
            if (sale > averageSale) {
                counter++;

            }
        }
        return counter;
    }
}

