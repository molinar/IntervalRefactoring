package intervals;

public class LeftOpened extends Interval{

    public LeftOpened(double minimum, double maximum) {
        super();
        this.minimum = new OpenPoint(minimum);
        this.maximum = new ClosePoint(maximum);    
    }

    @Override
    public Opening getOpening() {
        return Opening.LEFT_OPENED;
    }

    @Override
    public boolean includes(double value) {
        Point included = new ClosePoint(value);
        return (this.minimum.isLowerOrEqualsThan(included) && this.maximum.isGreaterOrEqualsThan(included));
    }
}
