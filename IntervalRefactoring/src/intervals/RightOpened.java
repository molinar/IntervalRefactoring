package intervals;

public class RightOpened extends Interval{

    public RightOpened(double minimum, double maximum) {
        super();
        this.minimum = new ClosePoint(minimum);
        this.maximum = new OpenPoint(maximum);
    }

    @Override
    public Opening getOpening() {
        return Opening.RIGHT_OPENED;
    }

    @Override
    public boolean includes(double value) {
        Point included = new ClosePoint(value);
        return (this.minimum.isLowerOrEqualsThan(included) && this.maximum.isGreaterOrEqualsThan(included));
    }
}
