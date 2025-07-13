import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первую строку : ");
        String a = sc.nextLine();

        System.out.print("Введите вторую строку : ");
        String b = sc.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        sc.close();
    }
}
