import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a1, a2, a3, a4;
        System.out.print("Введите фамилию: ");
        a1 = scanner.next();
        System.out.print("Введите имя: ");
        a2 = scanner.next();
        System.out.print("Введите отчество: ");
        a3 = scanner.next();
        System.out.print("Введите номер группы: ");
        a4 = scanner.next();
        String a5 = "* Лабораторная работа №1";
        String a6 = "* Выполнил(а): ст. гр. ";
        String a7 = "Введите фамилию ";
        String a8 = "Введите имя: ";
        String a9 = "Введите отчество: ";
        String a10 = "* " + a1 + " " + a2 + " " + a3; // фио
        String a11 = a6 + a4;
        int     x1 = a1.length(), // фамилия
                x2 = a2.length(), // имя
                x3 = a3.length(), // отчество
                x4 = a4.length(), // номер группы
                x5 = a5.length(), // Лабораторная работа №1
                x6 = a6.length(), // Выполнил(а): ст. гр.
                x10 = a10.length(); // ФИО
        int b1 = x6 + x4,      //'вып ст гр' + группа
                b2 = x10, // ФИО + 3 пробела
                max = 0;

        if (x5 >= b1)
            max = x5;
        else max = b1;

        if (b2 > max)
            max = b2;

        for (int i = 0; i < max + 2; i++) { // верх рамки
            System.out.print("*");
        }

        for (; x5 <= max; x5++) { //лаб раб в рамке с  *
            a5 += " ";
        }

        for (; b1 <= max; b1++) { //вып ст + группа  с  *
            a11 += " ";
        }

        for (; b2 <= max; b2++) { //фио в рамке с  *
           a10 += " ";
        }

        System.out.println("\n" + a5 + "*"); // лаб раб №1
        System.out.println( a11 + "*" ); // вып ст гр
        System.out.println( a10 + "*"); // фио

        for (int i = 0; i < max + 2; i++) { //нижняя рамка
            System.out.print("*");
        }

    }
}