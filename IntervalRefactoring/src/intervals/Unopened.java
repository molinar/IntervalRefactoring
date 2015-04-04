package intervals;

public class Unopened extends Interval{

    public Unopened(double minimum, double maximum) {
        super();
        this.minimum = new ClosePoint(minimum);
        this.maximum = new ClosePoint(maximum);    }

    @Override
    public Opening getOpening() {
        return Opening.UNOPENED;
    }

    @Override
    public boolean includes(double value) {
        Point included = new ClosePoint(value);
        return (this.minimum.isLowerOrEqualsThan(included) && this.maximum.isGreaterOrEqualsThan(included));
    }
}
