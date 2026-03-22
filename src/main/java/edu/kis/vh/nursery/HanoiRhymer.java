package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

        int totalRejected = 0;

        public int reportRejected() {
            return totalRejected;
        }

        public void countIn(int in) {
            if (!callCheck() && in > Peekaboo())
                totalRejected++;
            else
                super.countIn(in);
        }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > Peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

}
