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
        return (value > this.minimum & value <= this.maximum);
    }

    @Override
    public boolean includes(Interval interval) {
        switch (interval.getOpening()) {
        case LEFT_OPENED:
            return (interval.minimum >= this.minimum & interval.maximum <= this.maximum);
        case RIGHT_OPENED:
            return (interval.minimum > this.minimum & interval.maximum <= this.maximum);
        case BOTH_OPENED:
            return (interval.minimum >= this.minimum & interval.maximum <= this.maximum);
        case UNOPENED:
            return (interval.minimum > this.minimum & interval.maximum <= this.maximum);
        default:
            throw new IllegalArgumentException("Incorrect type code value");
        }
    }
}
