import java.util.function.Predicate;

public class LambdaDemo3 {
    public static void main(String[] args) {
        Predicate<String> checkStart = s -> s.startsWith("J") || s.startsWith("N");
        Predicate<String> checkEnd = s -> s.endsWith("A");

        Predicate<String> combined = checkStart.and(checkEnd);

        String test = "JavaA";
        System.out.println("Результат: " + combined.test(test)); // true
    }
}
