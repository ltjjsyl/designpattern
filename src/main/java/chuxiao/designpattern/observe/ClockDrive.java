package chuxiao.designpattern.observe;

public class ClockDrive implements ClockObserve {
    private TimeSink timeSink;

    public ClockDrive(TimeSource timeSource, TimeSink timeSink) {
        timeSource.setObserve(this);
        this.timeSink = timeSink;
    }

    public void update(int hour, int min, int sec){
        timeSink.setTime(hour, min, sec);
    }
}
