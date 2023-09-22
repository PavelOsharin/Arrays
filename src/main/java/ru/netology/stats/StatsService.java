package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) { // cумма продаж
        long totalSale = 0;
        for (long sale : sales) {
            totalSale = totalSale + sale;
        }
        return totalSale;
    }

    public long averageSum(long[] sales) { // средняя сумма месячных продаж
        return sumSales(sales) / sales.length;
    }

    public int maxSales(long[] sales) { // номер месяца с максимальными продажами
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) { // номер месяца с минимальными продажами
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int underAverage(long[] sales) { // кол-во месяцев с продажами ниже среднего
        int counter = 0;
        long averageSales = averageSum(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                counter++;
            }
        }
        return counter;
    }

    public int upperAverage(long[] sales) { // кол-во месяцев с продажами выше среднего
        int counter = 0;
        long averageSales = averageSum(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                counter++;
            }
        }
        return counter;
    }
}


