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
        return (value >= this.minimum.value && value < this.maximum.value);
    }

    @Override
    public boolean includes(Interval interval) {
        return (this.minimum.isLowerOrEqualsThan(interval.minimum) && this.maximum.isGreaterOrEqualsThan(interval.maximum));
    }
}
