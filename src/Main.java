public class Main {
    public static void main(String[] args) {

        System.out.println(" Задание 1 ");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(" Итерация цикла " + i);
        }

        System.out.println(" Задание 2 ");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(" Итерация цикла " + i);
        }

        System.out.println(" Задание 3 ");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(" Четные числа  " + i);
        }

        System.out.println(" Задание 4 ");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(" Итерация цикла " + i);
        }

        System.out.println(" Задание 5 ");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным ");
        }

        System.out.println(" Задание 6 ");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println(" Задание 7 ");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println(" Задание 8 ");
        int total = 0;
        int salary = 29000;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;

            System.out.println("Месяц " + i + " Итого " + total);
        }
        System.out.println(total);


        System.out.println(" Задание 9 ");
        int salary1 = 29000;
        double total1 = 0;
        int salaryWithPenny = salary1 * 100;
        int totalWithPenny = 0;
        for (int i = 1; i <= 12; i++) {
            totalWithPenny = totalWithPenny + totalWithPenny / 100;
            totalWithPenny = totalWithPenny + salaryWithPenny;

            total1 = totalWithPenny / 100.;
            System.out.println("Месяц " + i + " Итого " + total1);
        }
        System.out.println(total1);


        System.out.println(" Задание 10 ");
        int namber = 2;
        for (int j = 2; j <= 20; j = j + 2) {
                System.out.println(j);

            }
        }

    }



