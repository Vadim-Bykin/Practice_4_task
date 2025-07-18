@DeprecatedEx(message = "Используйте NewService вместо этого.")
class OldService {

    @DeprecatedEx(message = "Метод устарел, используйте newMethod()")
    public void oldMethod() {
        System.out.println("Old method");
    }

    public void newMethod() {
        System.out.println("New method");
    }
}
