package intervals;

public class Unopened extends Interval{

    public Unopened(double minimum, double maximum) {
        super(minimum, maximum);
    }

    @Override
    public Opening getOpening() {
        return Opening.UNOPENED;
    }

    @Override
    public boolean includes(double value) {
        return (value >= this.minimum & value <= this.maximum);
    }

    @Override
    public boolean includes(Interval interval) {
        return interval.includes(this);
    }

    @Override
    public boolean includes(BothOpened interval) {
        return (interval.minimum >= this.minimum & interval.maximum <= this.maximum);
    }

    @Override
    public boolean includes(LeftOpened interval) {
        return (interval.minimum >= this.minimum & interval.maximum <= this.maximum);
    }

    @Override
    public boolean includes(RightOpened interval) {
        return (interval.minimum >= this.minimum & interval.maximum <= this.maximum);
    }

    @Override
    public boolean includes(Unopened interval) {
        return (interval.minimum >= this.minimum & interval.maximum <= this.maximum);
    }

}
