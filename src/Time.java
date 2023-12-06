public class Time {

    private int hour, minute, seconds;

    public Time(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void tick() {
        seconds++;
        fixTime();
    }

    public void add(Time adding) {
        hour += adding.getHour();
        minute += adding.getMinute();
        seconds += adding.getSeconds();
        fixTime();
    }

    public void fixTime() {
        if (seconds >= 60) {
            seconds = seconds - 60;
            minute++;
        }
        if (minute >= 60) {
            minute -= 60;
            hour++;
        }
        if (hour >= 24) {
            hour -= 24;
        }
    }

    public String toString() {
        String sHour = Integer.toString(hour);
        String sMinute = Integer.toString(minute);
        String sSeconds = Integer.toString(seconds);

        if (hour < 10) {
            sHour = "0" + hour;
        }
        if (minute < 10) {
            sMinute = "0" + minute;
        }
        if (seconds < 10) {
            sSeconds = "0" + seconds;
        }
        return sHour + ":" + sMinute + ":" + sSeconds;
    }
}
