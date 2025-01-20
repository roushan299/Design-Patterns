package structure.adapter.adapters;

import structure.adapter.round.RoundPeg;
import structure.adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg){
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        double result;
        result = Math.sqrt(Math.pow(this.squarePeg.getWidth()/2, 2)*2);
        return result;
    }
}
