public class VariableMutation {
    private static boolean TrueOrFalse;

    public static void main(String[] args) {
        int a = 3;
        a += 10;
        System.out.println(a);

        int b = 100;
        b -= 7;
        System.out.println(b);

        int c = 44;
        c *= 2;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        int e = 8;
        e *= e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean TrueOrFalse = f1 > f2;
        System.out.println(TrueOrFalse);

        int g1 = 350;
        int g2 = 200;
        boolean TrueOrFalse2 = g2*2 < g1;
        System.out.println(TrueOrFalse2);

        int h = 135798745;
        boolean TrueOrFalse3 = 0 == (h % 11);
        System.out.println(TrueOrFalse3);
        // tell if it has 11 as a divisor (print as a boolean)

        int i1 = 10;
        int i2 = 3;
        boolean TrueOrFalse4 = i2*i2*i2 > i1 && i1  > i2*i2;
        System.out.println(TrueOrFalse4);


        int j = 1521;
        boolean TrueOrFalse5 = j % 3 == 0 || j % 5 == 0;
        System.out.println(TrueOrFalse5);



    }
}
