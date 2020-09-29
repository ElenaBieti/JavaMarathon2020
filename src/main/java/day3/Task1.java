package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название города или Stop для завершения программы");
        while (true) {
        String line = scanner.nextLine();
        switch (line) {
            case "Москва":
            case "Владивосток":
            case "Ростов":
                System.out.println("Россия");
                break;
            case "Рим":
            case "Милан":
            case "Турин":
                System.out.println("Италия");
                break;
            case "Ливерпуль":
            case "Манчестер":
            case "Лондон":
                System.out.println("Англия");
                break;
            case "Берлин":
            case "Мюнхен":
            case "Кельн":
                System.out.println("Германия");
                break;
            case "Stop":
            case "stop":
                System.out.println("Программа завершена");
                break;
            default:
                System.out.println("Неизвестная страна");

             }
        }
    }
}
