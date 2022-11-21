public class Main {
    public static void main(String[] args) {

        boolean success = Data.validate("login", "asdasd", "asdasd");
        if (success) {
            System.out.println("Данные верны!");
        } else {
            System.out.println("Данные не верны!");
        }
    }
}