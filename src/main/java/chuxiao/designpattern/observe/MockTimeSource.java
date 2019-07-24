package chuxiao.designpattern.observe;

public class MockTimeSource implements TimeSource {
    private ClockObserve clockObserve;

    public void setObserve(ClockObserve clockObserve) {
        this.clockObserve = clockObserve;
    }

    public void setTime(int hour, int min, int sec) {
        this.clockObserve.update(hour, min, sec);
    }
}
