package ru.netology.cycles1.services;

public class HolidayService {

    public int calcHoliday(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // отдыхаем
                money -= expenses;
                money /= 3;
                count++;
            } else { // работаем
                money += income;
                money -= expenses;
            }
        }
        return count;
    }
}
