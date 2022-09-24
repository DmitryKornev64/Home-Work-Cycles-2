import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        // Домашнее задание - 1.
        System.out.println("   ДЗ 1.");
        // Задание - 1.
        System.out.println("   Задание - 1.");
        int moneyPerMonth1 = 15_000;
        int accumulation1 = 0;
        int o = 0;
        while (accumulation1 < 2_459_000) {
            o++;
            accumulation1 = accumulation1 + accumulation1 / 100;
            accumulation1 = accumulation1 + moneyPerMonth1;
            System.out.println("Месяц " + o + " сумма накоплений равна " + accumulation1 + " рублей");
        }


        // Задание - 2.
        System.out.println("   Задание - 2.");
        int q = 0;
        while (q < 10){
            q++;
            System.out.print(q + " ");
        }
        System.out.println();
        int i = 10;
        for (; i >= 1 ; i--){
            System.out.print(i + " ");
        }
        System.out.println();

        // Задание - 3.
        System.out.println("   Задание - 3.");
        int population = 12_000_000;
        int birthrate = 17;
        int mortality = 8;
        int w = 0;
        while (w < 10) {
            population += population * (birthrate - mortality) / 1000;
            w++;
            population++;
            System.out.println("Год " + w + " численность населения составляет " + population);
        }


        // Домашнее задание - 2.

        System.out.println("   ДЗ 2.");
        // Задание - 1.
        System.out.println("   Задание - 1.");
        int contribution = 15_000;
        int v = 0;
        while (contribution < 12_000_000) {
            contribution = contribution + contribution/100*7;
            v++;
            System.out.println("Месяц " + v + " сумма накоплений равна " + contribution + " рублей.");
        }


        // Задание - 2.
        System.out.println("   Задание - 2.");
        int contribution1 = 15_000;
        int v1 = 0;
        while (contribution1 < 12_000_000) {
            contribution1 = contribution1 + contribution1/100*7;
            v1++;
            if (v1 % 6 == 0) {
                System.out.println("Месяц " + v1 + " сумма накоплений равна " + contribution1 + " рублей.");

            }
        }


        // Задание - 3.
        System.out.println("   Задание - 3.");
        int contribution2 = 15_000;
        int v2 = 0;
        while (v2 < 108){
            contribution2 = contribution2 + contribution2/100*7;
            v2++;
            if (v2 % 6 == 0) {
                System.out.println("Месяц " + v2 + " сумма накоплений равна " + contribution2 + " рублей.");
            }
        }


        // Задание - 4.
        System.out.println("   Задание - 4.");
        int Friday = 7;
        while (Friday <= 31){
            Friday = Friday + 7;
            System.out.println("Сегодня пятница, "+ Friday +"-е число. Необходимо подготовить отчет.");
        }


        // Домашнее задание - 3.

        System.out.println("   ДЗ 3.");
        // Задание - 1.
        System.out.println("   Задание - 1.");
        int year = 1817;
        int cometFlybyYear = 79;
        int nowadays = 2022;
        while (year < nowadays) {
            year = year + cometFlybyYear;
            System.out.println(year);
        }


        // Задание - 2.
        System.out.println("   Задание - 2.");
        int factor = 0;
        while (factor < 10){
          factor++;
            System.out.println("2 * " + factor + " = " + factor * 2);
        }
    }
}

