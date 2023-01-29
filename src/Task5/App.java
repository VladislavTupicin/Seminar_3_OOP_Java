package Task5;

import Task2.Inter;

public class App {
    public static void main(String[] args) {
        BinaryOperator<Integer> ob = (x, y) -> x * y;
        System.out.println(ob.apply(2, 3));
        System.out.println(ob.apply(12, 11));
    }
}
