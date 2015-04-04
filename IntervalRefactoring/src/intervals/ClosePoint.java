package intervals;

public class ClosePoint extends Point{

    public ClosePoint(double value) {
        super(value);
    }

    @Override
    public boolean isLowerOrEqualsThan(Point point) {
        return point.isLowerOrEqualsThan(this);
    }

    @Override
    public boolean isLowerOrEqualsThan(ClosePoint point) {
        return point.value <= this.value;
    }

    @Override
    public boolean isLowerOrEqualsThan(OpenPoint point) {
        return point.value < this.value;
    }

    @Override
    public boolean isGreaterOrEqualsThan(Point point) {
        return point.isGreaterOrEqualsThan(this);
    }

    @Override
    public boolean isGreaterOrEqualsThan(ClosePoint point) {
        return point.value >= this.value;
    }

    @Override
    public boolean isGreaterOrEqualsThan(OpenPoint point) {
        return point.value > this.value;
    }

}
