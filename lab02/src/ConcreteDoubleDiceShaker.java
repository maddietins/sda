public class ConcreteDoubleDiceShaker extends AbstractDiceShaker {
    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public int next() {
        return shakeSingleDie() + shakeSingleDie();
    }
}