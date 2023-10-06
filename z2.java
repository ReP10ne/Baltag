import java.util.Scanner;

public class z2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите 1 число: ");
        long n1 = sc.nextLong();

        System.out.print("Введите 2 число: ");
        long n2 = sc.nextLong();

        System.out.print("Введите ваше действие +, -, *, /: ");
        String operator = sc.next();

        long result;

        switch (operator) {
            case "+":
                result = n1 + n2;
                    System.out.println("Результат: " + result);
                    break;
                case "-": result = n1 - n2;
                    System.out.println("Результат: " + result);
                    break;
                case "*":
                    result = n1 * n2;
                    System.out.println("Результат: " + result);
                    break;
                case "/":
                    if (n2 == 0) {
                        System.out.println("Делить на 0 нельзя");
                    }
                    else {
                        result = n1 / n2;
                        System.out.println("Результат: " + result);
                    }
                    break;
                default:
                    System.out.println("Неверное действие");
            }
        }
    }