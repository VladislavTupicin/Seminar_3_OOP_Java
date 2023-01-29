package Task3;

public class GenericsTest {
    public static void main(String[] args) {
        SomeTest<Integer> isFactor = (a, d) -> (a % d) == 0;

        if (isFactor.test(10, 2)) {
            System.out.println("2 это делитель 10");
        }
        if (!isFactor.test(10, 3)) {
            System.out.println("3 не делитель 10");
        }
        System.out.println("");

        SomeTest<Double> isFactorDouble = (a, d) -> (a % d) == 0;

        if (isFactorDouble.test(10.2, 2.3)) {
            System.out.println("2 это делитель 10");
        }
        if (!isFactorDouble.test(10.5, 3.6)) {
            System.out.println("3 не делитель 10");
        }
        System.out.println("");

        SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1;
        String str = "Обощенный функциональный интерфейс";
        System.out.println("Тстируемая строка" + str);
        if (isIn.test(str, "Слово")) {
            System.out.println("Найдено!");
        }
        else {
            System.out.println("Не найденно");
        }
    }
}