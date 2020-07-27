package counter;

public class Counter {
    private int defaultValue;
    private int addNumber;
    private int value;

    public Counter() {
        this.defaultValue = 0;
        this.value = defaultValue;
    }

    public void add(int number) {
        value = value + number;
    }

    public void get() {
        System.out.println(value);
    }
    public void reset() {
        value = defaultValue;
        System.out.println("Counter has been reset to: " + value);
    }
//    here we come tomorrow:)
}
