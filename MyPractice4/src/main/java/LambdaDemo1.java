public class LambdaDemo1 {
    public static void main(String[] args) {
        Printable printable = () -> System.out.println("Печать через лямбда-выражение!");
        printable.print();
    }
}
