package intervals;

public class OpenPoint extends Point{

    public OpenPoint(double value) {
        super(value);
    }

    @Override
    public boolean isLowerThan(Point point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isLowerThan(ClosePoint point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isLowerThan(OpenPoint point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isGreaterThan(Point point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isGreaterThan(ClosePoint point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isGreaterThan(OpenPoint point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isLowerOrEqualsThan(Point point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isLowerOrEqualsThan(ClosePoint point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isLowerOrEqualsThan(OpenPoint point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isGreaterOrEqualsThan(Point point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isGreaterOrEqualsThan(ClosePoint point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isGreaterOrEqualsThan(OpenPoint point) {
        // TODO Auto-generated method stub
        return false;
    }

}
