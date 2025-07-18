import java.util.function.Function;

public class LambdaDemo5 {
    public static void main(String[] args) {
        Function<Integer, String> checkSign = number -> {
            if (number > 0) return "Положительное число";
            else if (number < 0) return "Отрицательное число";
            else return "Ноль";
        };

        System.out.println(checkSign.apply(-5));
        System.out.println(checkSign.apply(0));
        System.out.println(checkSign.apply(12));
    }
}
