import java.util.Scanner;

public class z4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Сколько чисел в массиве: ");
        int size = sc.nextInt();
        int array[] = new int[size];

        System.out.println("Введите числа в массив:");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Вывод чисел:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();

        System.out.println("Введите элемент для двоичного поиска: ");
        int item = sc.nextInt();
        int first = 0;
        int last = size - 1;
        binarySearch(array, first, last, item);
    }
    public static void binarySearch(int[] array, int first, int last, int item) {
        int position;
        int comparisonCount = 1;


        position = (first + last) / 2;

        while ((array[position] != item) && (first <= last)) {
            comparisonCount++;
            if (array[position] > item) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(item + " является " + ++position + " элементом в массиве");
            System.out.println("Метод двоичного поиска нашел число после " + comparisonCount +
                    " сравнений");
        }
        else {
            System.out.println("Элемента нет в массиве. Метод двоичного поиска закончил работу после "
                    + comparisonCount + " сравнений");
        }
    }
}
