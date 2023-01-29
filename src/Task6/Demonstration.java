package Task6;

public class Demonstration {
    public static void main(String[] args) {
        UnaryOperator<Integer> ob = x -> x * x;
        System.out.println(ob.apply(5));
    }
}
