package Task1;

public class LamdaDemo {
    public static void main(String[] args) {
        NomericTest isFactor = (n, d) -> (n % d) == 0;
        if (isFactor.test(10, 2)) {
            System.out.println("2 это делитель 10");
        }
        if (!isFactor.test(10, 3)) {
            System.out.println("3 не делитель 10");
        }
        System.out.println("");

        NomericTest isFactor2 = (m, n) -> (n < m);
        if (isFactor2.test(2, 10)) {
            System.out.println("2 меньше 10");
        }
        if (!isFactor2.test(10, 2)) {
            System.out.println("10 не меньше 2");
        }
        System.out.println("");

        NomericTest absEqual = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);

        if (absEqual.test(4, -4)) {
            System.out.println("4 = |-4|");
        }
        if (!absEqual.test(4, -5)) {
            System.out.println("4 != |-5|");
        }
    }
}
