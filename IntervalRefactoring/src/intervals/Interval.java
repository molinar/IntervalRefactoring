package intervals;

public abstract class Interval {

    protected double minimum, maximum;

    public Interval(double minimum, double maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }
    
    public abstract Opening getOpening();

    public double midPoint() {
        return (this.minimum + this.maximum) / 2;
    }

    public abstract boolean includes(double value);

    public abstract boolean includes(Interval interval);
    
    public abstract boolean includes(BothOpened);
    
    public abstract boolean includes(LeftOpened);
      
    public abstract boolean includes(RightOpened);
    
    public abstract boolean includes(Unopened);

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
