public class Main {
    public static void main(String[] args) {
        System.out.println("Cycle0710!");
    }

    public static void task1() {

        // task 1
        int i = 1;
        while (i < 11) {
            System.out.println(i + " ");
            i++;
        }
        System.out.println();
        for (int k = 10; k > 0; k--) {
            System.out.println(k + " ");
        }
        public static void task2 () {

            // task 2
            int population = 12000000;
            double birthRate = (double) 17 / 1000;
            double deathRate = (double) 8 / 1000;
            for (int i = 0; i < 10; i++) {
                population = population + (int) (population * birthRate) - (int) (population * deathRate);
                System.out.println("Year -" + i + "Population:" + population);
            }
            public static void task3 () {

                // task 3
                System.out.println("Задание 10");
                int cash = 29000;
                int totalSum = 0;
                while (totalSum <= 2459000) {
                    totalSum += totalSum / 100; //+1%
                    totalSum += cash;
                    i++;
                    System.out.println("Месяц" + i + "сумма накоплений равна" + total + "рублей");
                }
            }
        }
    }
}