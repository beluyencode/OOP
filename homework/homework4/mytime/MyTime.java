package homework.homework4.mytime;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        if ((hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59) && (second >= 0 && second <= 59)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }

    public void setTime(int hour, int minute, int second) {
        if ((hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59) && (second >= 0 && second <= 59)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }

    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour!");
        }

    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid minute!");
        }

    }

    public int getSecond() {
        return this.second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;

        } else {
            throw new IllegalArgumentException("Invalid second!");
        }
    }

    public String toString() {
        String hour1 = String.valueOf(hour);
        String minute1 = String.valueOf(minute);
        String second1 = String.valueOf(second);
        if (hour < 10)
            hour1 = "0" + hour1;
        if (minute < 10)
            minute1 = "0" + minute1;
        if (second < 10)
            second1 = "0" + second1;
        return hour1 + ":" + minute1 + ":" + second1;
    }

    public MyTime nextSecond() {
        if (hour == 23 && minute == 59 && second == 59) {
            hour = 0;
            minute = 0;
            second = 0;
            return this;
        }
        if (minute == 59 && second == 59) {
            hour++;
            minute = 0;
            second = 0;
            return this;
        }
        if (second == 59) {
            minute++;
            second = 0;
            return this;
        }
        second++;
        return this;
    }

    public MyTime nextMinute() {
        if (hour == 23 && minute == 59) {
            hour = 0;
            minute = 0;
            return this;
        }
        if (minute == 59) {
            hour++;
            minute = 0;
            return this;
        }
        minute++;
        return this;
    }

    public MyTime nextHour() {
        if (hour == 23) {
            hour = 0;
            return this;
        }
        hour++;
        return this;
    }

    public MyTime previousSecond() {
        if (hour == 0 && minute == 0 && second == 0) {
            hour = 23;
            minute = 59;
            second = 59;
            return this;
        }
        if (minute == 0 && second == 0) {
            hour--;
            minute = 59;
            second = 59;
            return this;
        }
        if (second == 0) {
            minute--;
            second = 59;
            return this;
        }
        second--;
        return this;
    }

    public MyTime previousMinute() {
        if (hour == 0 && minute == 0) {
            hour = 23;
            minute = 59;
            return this;
        }
        if (minute == 0) {
            hour--;
            minute = 59;
            return this;
        }
        minute--;
        return this;
    }

    public MyTime previousHour() {
        if (hour == 0) {
            hour = 23;
            return this;
        }
        hour--;
        return this;
    }

}
