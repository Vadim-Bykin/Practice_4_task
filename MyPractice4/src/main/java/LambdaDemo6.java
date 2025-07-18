import java.util.function.Supplier;
import java.util.Random;

public class LambdaDemo6 {
    public static void main(String[] args) {
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(11); // [0;10]

        System.out.println("Случайное число: " + randomSupplier.get());
    }
}
