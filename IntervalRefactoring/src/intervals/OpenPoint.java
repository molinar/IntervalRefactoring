package intervals;

public class OpenPoint extends Point{

    public OpenPoint(double value) {
        super(value);
    }

    @Override
    public boolean isLowerThan(Point point) {
        return point.isLowerThan(this);
    }

    @Override
    public boolean isLowerThan(ClosePoint point) {
        return point.value > this.value;
    }

    @Override
    public boolean isLowerThan(OpenPoint point) {
        return point.value > this.value;
    }

    @Override
    public boolean isGreaterThan(Point point) {
        return point.isGreaterThan(this);
    }

    @Override
    public boolean isGreaterThan(ClosePoint point) {
        return point.value < this.value;
    }

    @Override
    public boolean isGreaterThan(OpenPoint point) {
        return point.value < this.value;
    }

    @Override
    public boolean isLowerOrEqualsThan(Point point) {
        return point.isLowerOrEqualsThan(this);
    }

    @Override
    public boolean isLowerOrEqualsThan(ClosePoint point) {
        return point.value > this.value;
    }

    @Override
    public boolean isLowerOrEqualsThan(OpenPoint point) {
        return point.value >= this.value;
    }

    @Override
    public boolean isGreaterOrEqualsThan(Point point) {
        return point.isLowerOrEqualsThan(point);
    }

    @Override
    public boolean isGreaterOrEqualsThan(ClosePoint point) {
        return point.value < this.value;
    }

    @Override
    public boolean isGreaterOrEqualsThan(OpenPoint point) {
        return point.value <= this.value;
    }

}
