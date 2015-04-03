package intervals;

public class RightOpened extends Interval{

    public RightOpened(double minimun, double maximum) {
        super(minimun, maximum);
    }

    @Override
    public Opening getOpening() {
        return Opening.RIGHT_OPENED;
    }

}
