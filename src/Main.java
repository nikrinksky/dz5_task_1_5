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
        int clientOS = 2;
        int iOs = 0;
        int android = 1;

        if (clientOS == iOs) {
            System.out.println("Установите версию  приложения для iOS по ссылке");
        } else if (clientOS == android) {
            System.out.println("Установите версию  приложения для Android по ссылке");
        } else {
            System.out.println("Эта ОС не поддерживается");
        }

    }

    public static void task2() {
        System.out.println("Задча 2:");
        int clientOS = 1;
        int iOs = 0;
        int android = 1;
        int clientDeviseYear = 2014;
        int checkYear = 2015;

        if (clientOS == iOs) {
            if (clientDeviseYear < checkYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию  приложения для iOS по ссылке");
            }
        } else if (clientOS == android) {
            if (clientDeviseYear < checkYear) {
                System.out.println("Установите облегчённую версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию  приложения для Android по ссылке");
            }
        } else {
            System.out.println("Эта ОС не поддерживается");
        }
    }

    public static void task3() {
        System.out.println("Задча 3:");
        int year = 2023;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосный");
        }
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
        } else if (deliveryDistance >= 100) {
            System.out.println("Доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задча 5:");
        int numberMonth = 1;

        switch (numberMonth) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Не правильно введены данные");
        }
    }
}
