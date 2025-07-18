import java.util.function.Consumer;

class HeavyBox {
    int weight;
    HeavyBox(int weight) {
        this.weight = weight;
    }
}

public class LambdaDemo4 {
    public static void main(String[] args) {
        Consumer<HeavyBox> shipBox = box -> System.out.println("Отгрузили ящик с весом " + box.weight);
        Consumer<HeavyBox> sendBox = box -> System.out.println("Отправляем ящик с весом " + box.weight);

        Consumer<HeavyBox> combined = shipBox.andThen(sendBox);

        HeavyBox box = new HeavyBox(25);
        combined.accept(box);
    }
}
