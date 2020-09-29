package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа делимое и делитель");
        while(true) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            if (y == 0)
                break;
            System.out.println(x/y);
        }
    }
}

