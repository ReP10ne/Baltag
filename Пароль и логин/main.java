import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = sc.nextLine();
        System.out.print("Введите пароль: ");
        String password = sc.nextLine();
        System.out.print("Введите пароль повторно: ");
        String confirmPassword = sc.nextLine();

        try {
            if (isValidLoginAndPassword(login, password, confirmPassword)) {
                System.out.println("Логин и пароль введены правильно");
            } else {
                System.out.println("Логин и/или пароль введены неправильно");
            }
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean isValidLoginAndPassword(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        try {
            if (!login.matches("[a-zA-Z0-9_]+") || login.length() >= 20) {
                throw new WrongLoginException("Неправильный логин");
            }
            if (!password.matches("[a-zA-Z0-9_]+") || password.length() >= 20 || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Неправильно введен пароль или подтверждение пароля");
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            return false;
        }

        return true;
    }
}

class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Неправильный логин");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Неправильный пароль");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
