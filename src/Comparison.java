/*
2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их. В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"
 */

import java.util.Scanner;

// Импортируем класс Scanner для ввода данных

public class Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Пользователь вводит данные
        System.out.print("Введите первую строку : ");
        String a = sc.nextLine();

        System.out.print("Введите вторую строку : ");
        String b = sc.nextLine();

        // Сравниваем значения
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        sc.close();
    }
}
