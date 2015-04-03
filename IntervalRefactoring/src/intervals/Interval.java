package intervals;

public abstract class Interval {

    private double minimum, maximum;

    private Opening opening;

    public Interval(double minimum, double maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }
    
    public abstract Opening getOpening();

    public double midPoint() {
        return (this.minimum + this.maximum) / 2;
    }

    public boolean includes(double value) {
        switch (this.opening) {
        case LEFT_OPENED:
            return (value > this.minimum & value <= this.maximum);
        case RIGHT_OPENED:
            return (value >= this.minimum & value < this.maximum);
        case BOTH_OPENED:
            return (value > this.minimum & value < this.maximum);
        case UNOPENED:
            return (value >= this.minimum & value <= this.maximum);
        }
        return false;
    }

    public boolean includes(Interval interval) {
        switch (this.opening) {
        case LEFT_OPENED:
            switch (interval.opening) {
            case LEFT_OPENED:
                return (interval.minimum >= this.minimum & interval.maximum <= this.maximum);
            case RIGHT_OPENED:
                return (interval.minimum > this.minimum & interval.maximum <= this.maximum);
            case BOTH_OPENED:
                return (interval.minimum >= this.minimum & interval.maximum <= this.maximum);
            case UNOPENED:
                return (interval.minimum > this.minimum & interval.maximum <= this.maximum);
            }
        case RIGHT_OPENED:
            switch (interval.opening) {
            case LEFT_OPENED:
                return (interval.minimum >= this.minimum & interval.maximum < this.maximum);
            case RIGHT_OPENED:
                return (interval.minimum >= this.minimum & interval.maximum <= this.maximum);
            case BOTH_OPENED:
                return (interval.minimum >= this.minimum & interval.maximum <= this.maximum);
            case UNOPENED:
                return (interval.minimum >= this.minimum & interval.maximum < this.maximum);
            }
        case BOTH_OPENED:
            switch (interval.opening) {
            case LEFT_OPENED:
                return (interval.minimum >= this.minimum & interval.maximum < this.maximum);
            case RIGHT_OPENED:
                return (interval.minimum > this.minimum & interval.maximum <= this.maximum);
            case BOTH_OPENED:
                return (interval.minimum >= this.minimum & interval.maximum <= this.maximum);
            case UNOPENED:
                return (interval.minimum > this.minimum & interval.maximum < this.maximum);
            }
        case UNOPENED:
            return (interval.minimum >= this.minimum & interval.maximum <= this.maximum);
        }
        return false;
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
