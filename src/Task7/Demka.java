package Task7;

public class Demka {
    public static void main(String[] args) {
        Function<Integer, String> ob = x -> String.valueOf(x) + "$";
        System.out.println(ob.apply(4));
    }
}
