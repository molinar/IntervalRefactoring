package intervals;

public class Unopened extends Interval{

    public Unopened(double minimum, double maximum) {
        super();
        this.minimum = new OpenPoint(minimum);
        this.maximum = new OpenPoint(maximum);    }

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
        return (this.minimum.isGreaterOrEqualsThan(interval.minimum) && this.maximum.isLowerOrEqualsThan(interval.maximum));
    }
}
