package intervals;

public class BothOpened extends Interval{

    public BothOpened(double minimum, double maximum) {
        super(minimum, maximum);
    }

    @Override
    public Opening getOpening() {
        return Opening.BOTH_OPENED;
    }

}
