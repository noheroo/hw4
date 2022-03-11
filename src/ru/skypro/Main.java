package ru.skypro;

public class Main {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }
    public static void exercise1() {
        int k = 1;
        System.out.println("Задача 1");
        while (k<11){
            System.out.print(k+" ");
            k++;
        }
        System.out.println("\n");
        for (int l=10; l>0; l--){
            System.out.print(l+" ");
        }
    }

    public static void exercise2() {
        int firstFriday=3;
        System.out.println("\n");
        System.out.println("Задача 2");
    for (; firstFriday<32; firstFriday+=7){
        System.out.println("Сегодня пятница "+firstFriday+"-е число. Необходимо подготовить отчет.");
    }
    }

    public static void exercise3() {
        //Немного модифицировал вывод в консоль, чтобы были не просто цифры
        int currentYear = 2022;
        int startYear = currentYear - 200;
        int finishYear = currentYear + 100;
        int cometYear = 0;
        System.out.println("\n");
        System.out.println("Задача 3");
        for (; cometYear <= finishYear; cometYear += 79) {
            if (cometYear >= startYear) {
                if (cometYear < currentYear) {
                    System.out.println("Комета пролетала в " + cometYear + " году");
                } else
                    System.out.println("Комета будет пролетать в " + cometYear + " году");
            }
        }
    }

    public static void exercise4() {
        System.out.println("\n");
        System.out.println("Задача 4");
        int j = 1;
        for (; j < 31; j++) {
            if (j%3==0 && j%5==0){
                System.out.println(j + ": ping pong");
            } else if (j % 3 == 0) {
                System.out.println(j + ": ping");
            } else if (j % 5 == 0) {
                System.out.println(j + ": pong");
            } else
                System.out.println(j + ":");
        }
    }

    public static void exercise5() {
        int a=0;
        int b=1;
        int c=2; //counter
        System.out.println("\n");
        System.out.println("Задача 5");

        System.out.print(a + " ");
        System.out.print(b + " ");
        while (c!=10) {
            a = a + b;
            b = a + b;
            c += 2;
            System.out.print(a + " ");
            System.out.print(b + " ");
        }
    }
}
