package chuxiao.designpattern.observe;

public class MockTimeSink implements ClockObserve {

    private int hour;
    private int min;
    private int sec;

    public void update(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMin() {
        return this.min;
    }

    public int getSec() {
        return this.sec;
    }
}
