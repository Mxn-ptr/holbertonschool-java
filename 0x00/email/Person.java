public class Person {
    public static boolean emailValid(String email) {
        return email.contains("@") && email.length() <= 50;
    }
}
