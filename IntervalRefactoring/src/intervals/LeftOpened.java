package intervals;

public class LeftOpened extends Interval{

    public LeftOpened(double minimum, double maximum) {
        super(minimum, maximum);
    }

    @Override
    public Opening getOpening() {
        return Opening.LEFT_OPENED;
    }

    @Override
    public boolean includes(double value) {
        return (value > this.minimum && value <= this.maximum);
    }

    @Override
    public boolean includes(Interval interval) {
        return interval.includes(this);
    }

    @Override
    public boolean includes(BothOpened interval) {
        return (interval.minimum <= this.minimum && interval.maximum > this.maximum);
    }

    @Override
    public boolean includes(LeftOpened interval) {
        return (interval.minimum <= this.minimum && interval.maximum >= this.maximum);
    }

    @Override
    public boolean includes(RightOpened interval) {
        return (interval.minimum <= this.minimum && interval.maximum > this.maximum);
    }

    @Override
    public boolean includes(Unopened interval) {
        return (interval.minimum <= this.minimum && interval.maximum >= this.maximum);
    }
}
