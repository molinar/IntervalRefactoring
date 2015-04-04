package intervals;

public abstract class Point {

    protected double value;
    
    public Point(double value){
        this.value = value;
    }
    
    public abstract boolean isLowerOrEqualsThan(Point point);
    
    public abstract boolean isLowerOrEqualsThan(ClosePoint point);
    
    public abstract boolean isLowerOrEqualsThan(OpenPoint point);
    
    public abstract boolean isGreaterOrEqualsThan(Point point);
    
    public abstract boolean isGreaterOrEqualsThan(ClosePoint point);
    
    public abstract boolean isGreaterOrEqualsThan(OpenPoint point);
}
