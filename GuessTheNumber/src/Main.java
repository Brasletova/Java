import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Попробуйте отгадать число, которые мы загадали: ");
        int attempt = new Scanner(System.in).nextInt();
        int value = new Random().nextInt(100);

        while (value != attempt) {
            if (attempt < value) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Загаданное число меньше");
            }
            attempt = new Scanner(System.in).nextInt();
        }
        System.out.println("Вы угадали!");
        }
    }
