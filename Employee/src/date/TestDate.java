package date;

import valid.ToanHoc;

public class TestDate {

    public static void main(String[] args) {
        Date d1 = new Date();
        int year = ToanHoc.validYearInput();
        int month = ToanHoc.validMonthOrDay("month", 1, 12);
        int day = ToanHoc.validMonthOrDay("day", 1, d1.sumOfDayInMonth(month, year));
        d1.setYear(year);
        d1.setMonth(month);
        d1.setDay(day);
        Date nd1 = d1.nextDay();
        nd1.output();
        Date pd1 = d1.preriousDay();
        pd1.output();

        Date d2 = new Date();
        d2.input();
        Date nd2 = d2.nextDay();
        nd2.output();
        Date pd2 = d2.preriousDay();
        pd2.output();
    }
}
