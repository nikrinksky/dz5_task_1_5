public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задча 1:");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию  приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию  приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задча 2:");
        byte clientOS = 0;
        int clientDeviseYear = 2014;

        if (clientOS == 0) {
            if (clientDeviseYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию  приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviseYear < 2015) {
                System.out.println("Установите облегчённую версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию  приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задча 3:");
        int year = 2023;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является высокосным");
        } else System.out.println(year + " год не является высокосный");
    }

    public static void task4() {
        System.out.println("Задча 4:");
        int deliveryDistance = 95;
        int day = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            day += 1;
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            day += 2;
            System.out.println("Потребуется дней: " + day);
        }

        if (deliveryDistance >= 100) {
            System.out.println("Доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задча 5:");
        int numberMonth = 10;

        switch (numberMonth) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Не правельно введены данные");
        }
    }
}