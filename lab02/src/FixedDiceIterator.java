import java.util.Iterator;

public class FixedDiceIterator implements Iterator<Integer> {

    private final int[] shakes = {1, 2, 3, 4, 5, 6};

    private int index = 0;

    @Override
    public boolean hasNext() {
        return index < shakes.length;
    }

    @Override
    public Integer next() {
        return shakes[index++];
    }
}