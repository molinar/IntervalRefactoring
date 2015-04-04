package intervals;

public class Interval {

    protected Point minimum, maximum;

    public Interval(Point minimum, Point maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }
    
    public double midPoint() {
        return (this.minimum.value + this.maximum.value) / 2;
    }

    public boolean includes(double value){
        Point included = new ClosePoint(value);
        return (this.minimum.isLowerOrEqualsThan(included) && this.maximum.isGreaterOrEqualsThan(included));
    }

    public boolean includes(Interval interval){
        return (this.minimum.isLowerOrEqualsThan(interval.minimum) && this.maximum.isGreaterOrEqualsThan(interval.maximum));
    }

    public boolean intersectsWith(Interval interval) {
        // TODO
        return false;
    }

    public Interval intersection(Interval interval) {
        // TODO
        return null;
    }

    @Override
    public String toString() {
        // TODO
        return null;
    }

    @Override
    public boolean equals(Object object) {
        // TODO
        return false;
    }
}
