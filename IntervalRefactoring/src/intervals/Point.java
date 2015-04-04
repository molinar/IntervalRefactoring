package intervals;

public abstract class Point {

    protected double value;
    
    public Point(double value){
        this.value = value;
    }
    
    public abstract boolean isLowerThan(Point point);
    
    public abstract boolean isLowerThan(ClosePoint point);
    
    public abstract boolean isLowerThan(OpenPoint point);
    
    public abstract boolean isGreaterThan(Point point);
    
    public abstract boolean isGreaterThan(ClosePoint point);
    
    public abstract boolean isGreaterThan(OpenPoint point);
    
    public abstract boolean isLowerOrEqualsThan(Point point);
    
    public abstract boolean isLowerOrEqualsThan(ClosePoint point);
    
    public abstract boolean isLowerOrEqualsThan(OpenPoint point);
    
    public abstract boolean isGreaterOrEqualsThan(Point point);
    
    public abstract boolean isGreaterOrEqualsThan(ClosePoint point);
    
    public abstract boolean isGreaterOrEqualsThan(OpenPoint point);
}
