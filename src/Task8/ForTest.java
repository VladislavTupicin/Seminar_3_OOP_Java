package Task8;

public class ForTest {
    public static void main(String[] args) {
        Consumer<Integer> print = x -> System.out.printf("%d долларов\n", x);
        print.accept(600);
    }
}
