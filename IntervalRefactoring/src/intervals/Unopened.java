package intervals;

public class Unopened extends Interval{

    public Unopened(double minimum, double maximum) {
        super(minimum, maximum);
    }

    @Override
    public Opening getOpening() {
        return Opening.UNOPENED;
    }

}
