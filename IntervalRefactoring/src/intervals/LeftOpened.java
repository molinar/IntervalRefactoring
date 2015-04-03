package intervals;

public class LeftOpened extends Interval{

    public LeftOpened(double minimum, double maximum) {
        super(minimum, maximum);
    }

    @Override
    public Opening getOpening() {
        return Opening.LEFT_OPENED;
    }

}
