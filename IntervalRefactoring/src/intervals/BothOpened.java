package intervals;

public class BothOpened extends Interval{

    public BothOpened(double minimun, double maximum) {
        super(minimun, maximum);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Opening getOpening() {
        return Opening.BOTH_OPENED;
    }

}
