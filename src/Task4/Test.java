package Task4;

import Task2.Inter;
import java.util.function.Predicate;
public class Test {
    public static void main(String[] args) {
        Predicate<Integer> ob = x -> x > 0;
        System.out.println(ob.test(4));
        System.out.println(ob.test(-4));
    }
}
