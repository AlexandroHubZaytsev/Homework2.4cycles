package ru.netology;

public class StatsService {
    public int sum(int[] items) {
        int result = 0;
        for (int item : items) {
            result = result + item;
        }
        return result;
    }

    public int avg(int[] items) {
        int sum = sum(items);
        return sum / items.length;
    }

    public int maxAmountMonthSales(int[] items) {
        int max = getMax(items);
        int maxAmountMonthSales = 0;
        int monthCount = 0;
        for (int item : items) {
            monthCount++;
            if (item == max) {
                maxAmountMonthSales = monthCount;
            }
        }
        return maxAmountMonthSales;
    }

    public int getMax(int[] items) {
        int max = items[0];
        for (int item : items) {
            if (max < item) {
                max = item;
            }
        }
        return max;
    }

    public int minAmountMonthSales(int[] items) {
        int min = getMin(items);
        int minAmountMonthSales = 0;
        int monthCount = 0;
        for (int item : items) {
            monthCount++;
            if (item == min) {
                minAmountMonthSales = monthCount;
            }
        }
        return minAmountMonthSales;
    }

    public int getMin(int[] items) {
        int min = items[0];
        for (int item : items) {
            if (min > item) {
                min = item;
            }
        }
        return min;
    }

    public int monthWithLessAverage(int[] items) {
        int avg = avg(items);
        int monthCount = 0;
        for (int item : items) {
            if(item < avg) {
                monthCount++;
            }
            }
            return monthCount;
        }

    public int monthWithMoreAverage(int[] items) {
        int avg = avg(items);
        int monthCount = 0;
        for (int item : items) {
            if(item > avg) {
                monthCount++;
            }
        }
        return monthCount;

    }
}
