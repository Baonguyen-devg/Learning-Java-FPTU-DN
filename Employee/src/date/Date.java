package date;

import valid.ValidDate;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date() {
    }

    public Date(int day, int month, int year) {
        if (year >= 1900) {
            this.year = year;
        } else {
            System.out.println("Year wrong.");
        }
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Month wrong.");
        }
        if (day >= 1 && day <= sumOfDayInMonth(month, year)) {
            this.day = day;
        } else {
            System.out.println("Day wrong.");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= sumOfDayInMonth(month, year)) {
            this.day = day;
        } else {
            System.out.println("Day wrong.");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Month wrong.");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
        if (year >= 1900) {
            this.year = year;
        } else {
            System.out.println("Year wrong.");
        }
    }

    public void input() {
        int m, d, y;
        y = ValidDate.validDateInputYear();
        m = ValidDate.validDateInputInt("month", 1, 12);
        d = ValidDate.validDateInputInt("day", 1, sumOfDayInMonth(m, y));
        year = y;
        month = m;
        day = d;
    }

    public void output() {
        String d = day + "";
        String m = month + "";
        if (day < 10) {
            d = "0" + d;
        }
        if (month < 10) {
            m = "0" + m;
        }
        System.out.println(d + "/" + m + "/" + year);

    }

    public boolean leapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public int sumOfDayInMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (leapYear(year)) {
                    return 29;
                }
                return 28;
        }
        return 0;
    }

    public Date nextDay() {
        int d = day + 1;
        int m = month;
        int y = year;
        if (d > sumOfDayInMonth(m, y)) {
            d = 1;
            m++;
        }
        if (m > 12) {
            m = 1;
            y++;
        }
        return new Date(d, m, y);
    }

    public Date preriousDay() {
        int d = day - 1;
        int m = month;
        int y = year;
        if (d < 1) {
            m--;
            if (m < 1) {
                m = 12;
                y--;
                d = 31;
            } else if (m == 2) {
                if (leapYear(y)) {
                    d = 29;
                } else {
                    d = 28;
                }
            } else {
                d = sumOfDayInMonth(m, y);
            }
        }
        return new Date(d, m, y);
    }
}
