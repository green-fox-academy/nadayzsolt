public class Swap {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;
        int tempA = a;
        a = b;
        b = tempA;
        System.out.println("'a' now: "+ a + " 'b' now: " + b);
        System.out.println(a);
        System.out.println(b);
    }
}
