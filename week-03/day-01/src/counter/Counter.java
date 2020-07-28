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
        value = value + number; // lehet így és akkor a zárójelben lévő számot fogja hozzáadni, ha csak nem i-t írunk bele mert akkor növekvő számok adódnak hozzá
//        ++value; // így pedig egyet ad hozzá bármi áll is a (zárójelben)
    }

    public void get() {
        System.out.println("The current value is: " +value);
    }
    public void reset() {
        value = defaultValue;
        System.out.println("Counter has been reset to: " + value);
    }
//    here we come tomorrow:)
}
