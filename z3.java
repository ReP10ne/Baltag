import java.util.Scanner;
import java.util.Arrays;
public class z3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Сколько чисел в массиве: ");
        int size = sc.nextInt();
        int array[] = new int[size];

        System.out.println("Введите числа в массив:");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print ("Вывод чисел:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.println();
        boolean Sort = false;
        int buf;
        while(!Sort) {
            Sort = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    Sort = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println("Сортировка пузырьком:"+Arrays.toString(array));
    }
}
