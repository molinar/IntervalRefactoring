package intervals;

public abstract class Interval {

    protected Point minimum, maximum;

    public Interval() {
    }
    
    public abstract Opening getOpening();

    public double midPoint() {
        return (this.minimum.value + this.maximum.value) / 2;
    }

    public abstract boolean includes(double value);

    public abstract boolean includes(Interval interval);

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
