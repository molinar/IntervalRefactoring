package intervals;

public class RightOpened extends Interval{

    public RightOpened(double minimum, double maximum) {
        super(minimum, maximum);
    }

    @Override
    public Opening getOpening() {
        return Opening.RIGHT_OPENED;
    }

}
