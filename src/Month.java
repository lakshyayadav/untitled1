/*   Created by IntelliJ IDEA.
 *   Author: Lakshya Yadav
 *   Date: 27-10-2020
 *   Time: 21:43
 *   File: Month.java
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

enum Months {
    JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBE(30), OCTOBER(31),
    NOVEMBER(30), DECEMBER(31);

    private final int numberOfDays;

    Months(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }
}

public class Month {
    public static void main(String[] args) {
        int currentMonthNumber = new GregorianCalendar().get(Calendar.MONTH);
        int currentDate = new GregorianCalendar().get(Calendar.DATE);
        String[] monthsName = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER",
                "OCTOBER", "NOVEMBER", "DECEMBER"};
        String currentMonth = monthsName[currentMonthNumber];
        Months month = Months.valueOf(currentMonth);
        int totalNumberOfDays = month.getNumberOfDays();
        System.out.println(month);
        System.out.println(totalNumberOfDays + " - " + currentDate + " = " + (totalNumberOfDays - currentDate));
    }
}