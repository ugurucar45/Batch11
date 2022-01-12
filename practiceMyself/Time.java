package practiceMyself;

public class Time {
    public int hour;
    public int minute;
    public int second;
    public int month;
    public int year;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public Time(int hour, int minute, int second, int month, int year) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.month = month;
        this.year = year;
    }

    public void getHour() {
        hour += 1;
    }

    public void getMinute() {
        minute += 1;
    }

    public void getSecond() {
        second += 1;
    }

    public void getMonth() {
        month += 1;
    }

    public void getYear() {
        year += 1;
    }

    public void setHour() {
        if (hour < 0 || hour > 24) {
            hour = 0;
        }
    }

    public void setMinute() {
        if (minute < 0 || minute > 60) {
            minute = 0;
        }
    }

    public void setSecond() {
        if (second < 0 || second > 60) {
            second = 0;
        }
    }

    public void setMonth() {
        if (month < 0 || month > 12) {
            month = 0;
        }
    }

    public void setYear() {
        if (year < 0) {
            year = 0;
        }
    }

    public String amPm(int hour) {
        if (hour > 12) {
            return "pm";
        } else {
            return "am";
        }
    }

    public String season(int month) {
        if (month <= 0 || month > 12) {
            return "No Season Found";
        } else if (month == 12) {
            return "December is Winter";
        } else if (month == 1) {
            return "January is Winter";
        } else if (month == 2) {
            return "February is Winter";
        } else if (month == 3) {
            return "March is Spring";
        } else if (month == 4) {
            return "April is Spring";
        } else if (month == 5) {
            return "May is Spring";
        } else if (month == 6) {
            return "June is Summer";
        } else if (month == 7) {
            return "July is Summer";
        } else if (month == 8) {
            return "August is Summer";
        } else if (month == 9) {
            return "September is Autumn";
        } else if (month == 10) {
            return "October is Autumn";
        } else {
            return "November is Autumn";
        }

    }

    public String timeInfo(int minute, int hour, int second) {
        String a = hour + ":" + minute + ":" + second;
        return a;
    }

    public String timeInfo() {
        String c = hour + ":" + minute + ":" + second;
        return c;
    }

    public String date(int month, int year) {
        String b = month + "/" + year;
        return b;
    }

    public String date() {
        String b = month + "/" + year;
        return b;
    }

    public String toString() {
        String d = hour + ":" + minute + ":" + second+" - "+month + "/" + year;
        return d;
    }

}
