package intervals;

public class Unopened extends Interval{

    public Unopened(double minimun, double maximum) {
        super(minimun, maximum);
    }

    @Override
    public Opening getOpening() {
        return Opening.UNOPENED;
    }

}
