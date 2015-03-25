package intervals;

public class Interval {

    private double minimun, maximum;

    private Opening opening;

    public Interval(double minimun, double maximum, Opening opening) {
        this.minimun = minimun;
        this.maximum = maximum;
        this.opening = opening;
    }

    public double midPoint() {
        return (this.minimun + this.maximum) / 2;
    }

    public boolean includes(double value) {
        switch (this.opening) {
        case LEFT_OPENED:
            return (value > this.minimun & value <= this.maximum);
        case RIGHT_OPENED:
            return (value >= this.minimun & value < this.maximum);
        case BOTH_OPENED:
            return (value > this.minimun & value < this.maximum);
        case UNOPENED:
            return (value >= this.minimun & value <= this.maximum);
        }
        return false;
    }

    public boolean includes(Interval interval) {
        switch (this.opening) {
        case LEFT_OPENED:
            switch (interval.opening) {
            case LEFT_OPENED:
                return (interval.minimun >= this.minimun & interval.maximum <= this.maximum);
            case RIGHT_OPENED:
                return (interval.minimun > this.minimun & interval.maximum <= this.maximum);
            case BOTH_OPENED:
                return (interval.minimun >= this.minimun & interval.maximum <= this.maximum);
            case UNOPENED:
                return (interval.minimun > this.minimun & interval.maximum <= this.maximum);
            }
        case RIGHT_OPENED:
            switch (interval.opening) {
            case LEFT_OPENED:
                return (interval.minimun >= this.minimun & interval.maximum < this.maximum);
            case RIGHT_OPENED:
                return (interval.minimun >= this.minimun & interval.maximum <= this.maximum);
            case BOTH_OPENED:
                return (interval.minimun >= this.minimun & interval.maximum <= this.maximum);
            case UNOPENED:
                return (interval.minimun >= this.minimun & interval.maximum < this.maximum);
            }
        case BOTH_OPENED:
            switch (interval.opening) {
            case LEFT_OPENED:
                return (interval.minimun >= this.minimun & interval.maximum < this.maximum);
            case RIGHT_OPENED:
                return (interval.minimun > this.minimun & interval.maximum <= this.maximum);
            case BOTH_OPENED:
                return (interval.minimun >= this.minimun & interval.maximum <= this.maximum);
            case UNOPENED:
                return (interval.minimun > this.minimun & interval.maximum < this.maximum);
            }
        case UNOPENED:
            return (interval.minimun >= this.minimun & interval.maximum <= this.maximum);
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
