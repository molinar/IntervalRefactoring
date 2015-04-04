package intervals;

public class BothOpened extends Interval{

    public BothOpened(double minimum, double maximum) {
        super();
        this.minimum = new OpenPoint(minimum);
        this.maximum = new OpenPoint(maximum); 
    }

    @Override
    public Opening getOpening() {
        return Opening.BOTH_OPENED;
    }

    @Override
    public boolean includes(double value) {
        Point included = new ClosePoint(value);
        return (this.minimum.isLowerOrEqualsThan(included) && this.maximum.isGreaterOrEqualsThan(included));
    }
}
