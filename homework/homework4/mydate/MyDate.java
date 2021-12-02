package homework.homework4.mydate;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] MONTHS = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
            "Dec" };
    public static final String[] DAYS = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
            "Saturday" };
    public static final int[] DAYS_IN_MONTHS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            return true;
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if ((year < 1 || year > 9999) || (month < 0 || month > 12) || (day < 0 || day > 31))
            return false;
        if (isLeapYear(year)) {
            if ((month == 2 && day > 29) || (month != 2 && day > DAYS_IN_MONTHS[month - 1]))
                return false;
        } else if ((day > DAYS_IN_MONTHS[month - 1]))
            return false;
        return true;
    }

    public static int[] numberNonLeapYear = { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
    public static int[] numberLeapYear = { 6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };

    public static int getDayOfWeek(int year, int month, int day) {
        String stringYear = Integer.toString(year);
        int beginYear = Integer.parseInt(stringYear.charAt(0) + "" + stringYear.charAt(1));
        int sodu = beginYear % 4;
        int soCen = 0;
        int dayOfWeek = 0;
        switch (sodu) {
            case 0:
                soCen = 6;
                break;
            case 1:
                soCen = 4;
                break;
            case 2:
                soCen = 2;
                break;
            case 3:
                soCen = 0;
                break;
        }

        int endYear = Integer.parseInt(stringYear.charAt(2) + "" + stringYear.charAt(3));
        if (isLeapYear(year)) {
            dayOfWeek = (soCen + endYear + endYear / 4 + numberLeapYear[month - 1] + day) % 7;
        } else {
            dayOfWeek = (soCen + endYear + endYear / 4 + numberNonLeapYear[month - 1] + day) % 7;
        }
        return dayOfWeek;
    }

    public MyDate(int year, int month, int day) {
        try {
            if (isValidDate(year, month, day)) {
                this.year = year;
                this.month = month;
                this.day = day;
            } else {
                throw new IllegalArgumentException("Invalid year, month, or day!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    public void setDate(int year, int month, int day) {
        try {
            if (isValidDate(year, month, day)) {
                this.year = year;
                this.month = month;
                this.day = day;
            } else {
                throw new IllegalArgumentException("Invalid year, month, or day!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        try {
            if (year >= 1 && year <= 9999) {
                this.year = year;
            } else {
                throw new IllegalArgumentException("Invalid year!");
            }
        } catch (IllegalArgumentException e) {
           System.out.println(e);
        }
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        try {
            if (month >= 1 && month <= 12) {
                this.month = month;
            } else {
                throw new IllegalArgumentException("Invalid month!");
            }
        } catch (IllegalArgumentException e) {
           System.out.println(e);
        }
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        try {
            if ((isLeapYear(year) && month == 2 && day >= 1 && day <= 29)
                    || (!isLeapYear(year) && day >= 1 && day <= DAYS_IN_MONTHS[month - 1])) {
                this.day = day;
            } else {
                throw new IllegalArgumentException("Invalid day!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);;
        }

    }

    public static String[] strDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday " };

    public String toString() {
        String stringDay = Integer.toString(day);
        String stringYear = Integer.toString(year);
        String res = strDays[getDayOfWeek(year, month, day)] + "  " + stringDay + "  " + MONTHS[month - 1] + "  "
                + stringYear;
        return res;

    }

    public MyDate nextDay() {
        if (isLeapYear(year) && month == 2 && day == 29) {
            day = 1;
            month = 3;
            return this;
        }
        if (day == 31 && month == 12) {
            day = 1;
            month = 1;
            year++;
            return this;
        }
        if (!(isLeapYear(year)) && day == DAYS_IN_MONTHS[month - 1]) {
            day = 1;
            month++;
            return this;
        }
        day++;
        return this;
    }

    public MyDate nextMonth() {
        if (isLeapYear(year) && month == 1) {
            day = 29;
            month = 2;
            return this;
        }
        if (month == 12) {
            day = DAYS_IN_MONTHS[0];
            month = 1;
            year++;
            return this;
        }
        if (!(isLeapYear(year))) {
            day = DAYS_IN_MONTHS[month];
            month++;
            return this;
        }
        month++;
        return this;
    }

    public MyDate nextYear() {
        if (isLeapYear(year) && month == 2) {
            day = 28;
            month = 2;
            year++;
            return this;
        }
        year++;
        return this;
    }

    public MyDate previousDay() {
        if (isLeapYear(year) && month == 3 && day == 1) {
            day = 29;
            month = 2;
            return this;
        }
        if (day == 1 && month == 1) {
            day = 31;
            month = 12;
            year--;
            return this;
        }
        if (!(isLeapYear(year)) && day == 1) {
            day = DAYS_IN_MONTHS[month - 2];
            month--;
            return this;
        }
        day--;
        return this;
    }

    public MyDate previousMonth() {
        if (isLeapYear(year) && month == 3) {
            day = 29;
            month = 2;
            return this;
        }
        if (month == 1) {
            day = 31;
            month = 12;
            year--;
            return this;
        }
        if (!(isLeapYear(year))) {
            day = DAYS_IN_MONTHS[month - 2];
            month--;
            return this;
        }
        month--;
        return this;
    }

    public MyDate previousYear() {
        if (isLeapYear(year) && month == 2) {
            day = 28;
            month = 2;
            year--;
            return this;
        }
        year--;
        return this;
    }

}
