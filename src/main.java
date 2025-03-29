import org.w3c.dom.ls.LSOutput;

public class main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else System.out.println("Ваша ОС не поддерживается");
        System.out.println();
        System.out.println("Задание 2");

        int clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Ваша ОС не поддерживается");}
        System.out.println();
        System.out.println("Задание 3");
        int year = 2022;
        if ((year >= 1584 && year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else if (year < 1584) {
            System.out.println("В " + year + " году ещё не было понятия високосных годов");
        } else {
            System.out.println(year + " год не является високосным");

            System.out.println();
            System.out.println("Задание 4");
            int deliveryDistance = 66;
            System.out.print("Потребуется дней: ");
            if (deliveryDistance < 20) {
                System.out.print(1);
            } else if (deliveryDistance < 60) {
                System.out.print(2);
            } else if (deliveryDistance <= 100) {
                    System.out.print(3);
            } else
                System.out.print("Доставка невозможна");
            System.out.println();
            System.out.println();
            System.out.println("Задание 5");
            int monthNumber = 11;
            if (monthNumber <= 12) {
                switch (monthNumber) {
                    case 1:
                        System.out.print("Зима");
                        break;
                    case 2:
                        System.out.print("Зима");
                        break;
                    case 3:
                        System.out.print("Весна");
                        break;
                    case 4:
                        System.out.print("Весна");
                        break;
                    case 5:
                        System.out.print("Весна");
                        break;
                    case 6:
                        System.out.print("Лето");
                        break;
                    case 7:
                        System.out.print("Лето");
                        break;
                    case 8:
                        System.out.print("Лето");
                        break;
                    case 9:
                        System.out.print("Осень");
                        break;
                    case 10:
                        System.out.print("Осень");
                        break;
                    case 11:
                        System.out.print("Осень");
                        break;
                    case 12:
                        System.out.print("Зима");
                        break;
                    default:
                        break;
                }

            } else {
                System.out.print("Время года неизвестно");
            }
        }
    }
}




