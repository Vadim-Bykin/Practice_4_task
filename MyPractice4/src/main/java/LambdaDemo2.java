import java.util.function.Predicate;

public class LambdaDemo2 {
    public static void main(String[] args) {
        Predicate<String> isNotNull = str -> str != null;
        Predicate<String> isNotEmpty = str -> !str.isEmpty();

        Predicate<String> isValid = isNotNull.and(isNotEmpty);

        String test = "Java";

        System.out.println("Результат проверки: " + isValid.test(test)); // true
    }
}
