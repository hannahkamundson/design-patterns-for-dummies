package patterns.iterator.vp;

import java.util.Iterator;

public class DivisionIterator implements Iterator {
    private VP[] VPs;
    private int location = 0;

    public DivisionIterator(VP[] v) {
        this.VPs = v;
    }

    @Override
    public boolean hasNext() {
        return location < VPs.length && VPs[location] != null;
    }

    @Override
    public VP next() {
        return VPs[location++];
    }

    @Override
    public void remove() {
    }
}
