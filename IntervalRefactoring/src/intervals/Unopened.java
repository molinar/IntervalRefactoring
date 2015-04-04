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
        return (value >= this.minimum.value && value <= this.maximum.value);
    }

    @Override
    public boolean includes(Interval interval) {
        return (this.minimum.isLowerOrEqualsThan(interval.minimum) && this.maximum.isGreaterOrEqualsThan(interval.maximum));
    }
}
