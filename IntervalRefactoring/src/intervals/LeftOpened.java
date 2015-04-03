package intervals;

public class LeftOpened extends Interval{

    public LeftOpened(double minimun, double maximum) {
        super(minimun, maximum);
    }

    @Override
    public Opening getOpening() {
        return Opening.LEFT_OPENED;
    }

}
