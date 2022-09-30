public class Main {
    public static void main(String[] args) {

        int dayOfWeekNumber = 5;

        switch (dayOfWeekNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Такого дня не существует");
        }

        System.out.println();
        System.out.println("Задание 1");
        System.out.println();
        int clientOS = 2;

        if (clientOS == 2) {
            System.out.println("Добро пожаловать на сайт нашего банка!");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
        System.out.println("Задание 2");
        System.out.println();

        int clientDeviceYear = 2014;
        int clientOS1 = 1;
        if (clientDeviceYear >= 2015 && clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS1 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS1 == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS1 == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println();
        System.out.println("задание 3");
        System.out.println();

        int years = 2020;
        if (years % 4 ==0 && years % 100 != 0 || years % 400 == 0) {
            System.out.println(years + " " + "год является високосным");
        }else {
            System.out.println(years + " " + "год не является високосным");
        }

        System.out.println();
        System.out.println("Задание 4");
        System.out.println();

        int deliveryDistance = 95;
        int timeDelivery = 0;
        timeDelivery = timeDelivery + 1;

        if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            timeDelivery = timeDelivery + 1;

            System.out.println("Потребуется дней:" + " " + timeDelivery);

        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            timeDelivery = timeDelivery + 2;
            System.out.println("Потребуется дней:" + " " + timeDelivery);

        } else if (deliveryDistance >= 100) {
            timeDelivery = timeDelivery + 3;
            System.out.println("Потребуется дней:" + " " + timeDelivery);

        }

        System.out.println();
        System.out.println("задание 5");
        System.out.println();

        int numberMonth = 7;

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
                System.out.println("Такого дня не существует");
        }
        switch (numberMonth) {
            case 12:
                System.out.println("Декабрь");
                break;
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
        }


    }

}



