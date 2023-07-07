
/**
 *
 * @author facu
 */
public class Counter {

    private int value;

    public Counter(int initialValue) {
        this.value = initialValue;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return value;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value += increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.value -= decreaseBy;
        }
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease() {
        this.decrease(1);
    }
}
