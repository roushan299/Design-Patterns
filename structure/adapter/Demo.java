package structure.adapter;

import structure.adapter.adapters.SquarePegAdapter;
import structure.adapter.round.RoundHole;
import structure.adapter.round.RoundPeg;
import structure.adapter.square.SquarePeg;

public class Demo {

    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        if(hole.fits(rpeg)){
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSquarePeg = new SquarePeg(2);
        SquarePeg largeSquarePeg =  new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSquarePeg);

        if(hole.fits(smallSqPegAdapter)){
            System.out.println("Square peg w2 fits round r5. ");
        }

        if(!hole.fits(largeSqPegAdapter)){
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
