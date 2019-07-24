package chuxiao.designpattern.observe;

public class ClockDriveTest {
    public static void main(String[] args) {
        MockTimeSource mockTimeSource = new MockTimeSource();
        MockTimeSink mockTimeSink = new MockTimeSink();
        //ClockDrive clockDrive = new ClockDrive(mockTimeSource, mockTimeSink);
        mockTimeSource.setObserve(mockTimeSink);

        mockTimeSource.setTime(1, 1, 1);
        assert (mockTimeSink.getHour() == 1);
        assert (mockTimeSink.getMin() == 1);
        assert (mockTimeSink.getSec() == 1);
        System.out.println("ok");




        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace.length);
        for(int i = 0; i < stackTrace.length; i++){
            System.out.println(stackTrace[i].getMethodName());
            System.out.println(stackTrace[i].getClassName());
            System.out.println(stackTrace[i].getLineNumber());
            System.out.println(stackTrace[i].getFileName());

        }

    }
}




