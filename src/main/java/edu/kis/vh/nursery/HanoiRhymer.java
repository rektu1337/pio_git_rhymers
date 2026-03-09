package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

        int totalRejected = 0;

        public int reportRejected() {
            return totalRejected;
        }

<<<<<<< HEAD
        public void countIn(int in) {
            if (!callCheck() && in > Peekaboo())
                totalRejected++;
            else
                super.countIn(in);
        }
=======
    public void countIn(int in) {
        if (!callCheck() && in > Peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
>>>>>>> fd3dd8f (4.2 Poprawa nazw metod)
}
