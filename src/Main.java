public class Main {
    public static void main(String[] args) {
        // Домашнее задание - 1.
        System.out.println("   ДЗ 1.");
        // Задание - 1.
        System.out.println("   Задание - 1.");
        int moneyPerMonth = 15_000;
        int accumulation = 0;
        int months = 1;
        while (accumulation < 2_459_000) {
            months++;
            accumulation += moneyPerMonth + accumulation * 0.01;
            System.out.println("Месяц " + months + " сумма накоплений равна " + accumulation + " рублей");
        }


        // Задание - 2.
        System.out.println("   Задание - 2.");
        int q = 1;
        while (q <= 10) {
            System.out.print(q + " ");
            q++;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задание - 3.
        System.out.println("   Задание - 3.");
        int population = 12_000_000;
        float birthrate = (float) 17 / 1000;
        float mortality = (float) 8 / 1000;
        int w = 0;
        while (w < 10) {
            population = population + Math.round(population * birthrate) - Math.round(population * mortality);
            w++;
            System.out.println("Год " + w + " численность населения составляет " + population);
        }


        // Домашнее задание - 2.

        System.out.println("   ДЗ 2.");
        // Задание - 1.
        System.out.println("   Задание - 1.");
        int month = 1;
        int contribution = 15_000;
        while (contribution < 12_000_000) {
            contribution += contribution * 0.07;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + contribution + " рублей.");
        }


        // Задание - 2.
        System.out.println("   Задание - 2.");
        int halfYear = 1;
        int cash = 15_000;
        while (cash < 12_000_000) {
            cash += cash * 0.07;
            if (halfYear % 6 == 0) {
                System.out.println("Месяц " + halfYear + " сумма накоплений равна " + cash + " рублей.");
            }
            halfYear++;
        }


        // Задание - 3.
        System.out.println("   Задание - 3.");
        int sixMonths = 1;
        int finances = 15_000;
        while (sixMonths < 9 * 12) {
            finances += finances * 0.07;
            if (sixMonths % 6 == 0) {
                System.out.println("Месяц " + sixMonths + " сумма накоплений равна " + finances + " рублей.");
            }
            sixMonths++;
        }


        // Задание - 4.
        System.out.println("   Задание - 4.");
        int lastDayOfTheMonth = 31;
        int Friday = 5;
        while (Friday <= lastDayOfTheMonth) {
            System.out.println("Сегодня пятница, " + Friday + "-е число. Необходимо подготовить отчет.");
            Friday += 7;
        }


        // Домашнее задание - 3.

        System.out.println("   ДЗ 3.");
        // Задание - 1.
        System.out.println("   Задание - 1.");
        int nowadays = 2022;
        int year = nowadays - 200;
        int future = nowadays + 100;
        for (int i = year; i <= future; i++){
            if (i % 79 ==0){
                System.out.println(i);
            }
        }

        // Задание - 2.
        System.out.println("   Задание - 2.");
        for (int factor = 1; factor <= 10; factor++) {
            System.out.println("2 * " + factor + " = " + 2 * factor);
        }
    }
}
