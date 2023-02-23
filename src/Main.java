import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
            /*task4();
            task5();
            task6();
            task7();
            task8();*/
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        System.out.println(number[1]);
        float[] number2 = new float[]{1.57f, 7.654f, 9.986f};
        System.out.println(number2[0]);
        String[] text = {"Hello", "word", "Java"};
        System.out.println(text[1]);


    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < number.length; i++) {
            if (i == number.length - 1) {
                System.out.println(number[i]);
                break;
            }
            System.out.print(number[i] + " , ");
        }
        float[] number2 = new float[]{1.57f, 7.654f, 9.986f};
        for (int i = 0; i < number2.length; i++) {
            if (i == number2.length - 1) {
                System.out.println(number2[i]);
                break;
            }
            System.out.print(number2[i] + " , ");
        }
        String[] text = {"Hello", "word", "Java"};
        System.out.println(String.join(", ", text));

    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        int f = number.length;
        int c;
        for (int i = 0; i < f / 2; i++) {
            c = number[f - i - 1];
            number[f - i - 1] = number[i];
            number[i] = c;
        }
        for (int i = 0; i < number.length; i++) {
            if (i == number.length - 1) {
                System.out.println(number[i]);
                break;
            }
            System.out.print(number[i] + " , ");
        }
        float[] number2 = new float[]{1.57f, 7.654f, 9.986f};
        int q = number2.length;
        float w;
        for (int i = 0; i < q / 2; i++) {
            w = number2[q - i - 1];
            number2[q - i - 1] = number2[i];
            number2[i] = w;
        }
        for (int i = 0; i < number2.length; i++) {
            if (i == number2.length - 1) {
                System.out.println(number2[i]);
                break;
            }
            System.out.print(number2[i] + " , ");
            }

        String[] text = {"Hello", "word", "Java"};
        int n = text.length;
        String temp;
        for (int i = 0; i < n / 2; i++) {
            temp = text[n - i - 1];
            text[n - i - 1] = text[i];
            text[i] = temp;
        }
        for (int i = 0; i < text.length; i++) {
            if (i == text.length - 1) {
                System.out.print(text[i]);
                break;
            }
            System.out.print(text[i] + " , ");
        }

    }
}





