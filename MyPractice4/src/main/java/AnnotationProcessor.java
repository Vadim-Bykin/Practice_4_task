import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) {
        checkDeprecated(OldService.class);
    }

    public static void checkDeprecated(Class<?> clazz) {
        if (clazz.isAnnotationPresent(DeprecatedEx.class)) {
            DeprecatedEx ann = clazz.getAnnotation(DeprecatedEx.class);
            System.out.println("Внимание: класс '" + clazz.getSimpleName() + "' устарел. Альтернатива: '" + ann.message() + "'");
        }

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(DeprecatedEx.class)) {
                DeprecatedEx ann = method.getAnnotation(DeprecatedEx.class);
                System.out.println("Внимание: метод '" + method.getName() + "' устарел. Альтернатива: '" + ann.message() + "'");
            }
        }
    }
}
