public class Main {
    public static void main(String[] args) {

        // Задача 1

        int[] payments = {1500, 2000, 3000, 1200, 2500}; //  массив с выплатами

        int sum = 0;
        for (int payment : payments) {
            sum += payment;
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        //Задача 2

        int[] payments1 = {1500, 200, 5000, 1200, 2500};

        int minPayment = payments1[0];
        int maxPayment = payments1[0];

        for (int i = 1; i < payments1.length; i++) {
            if (payments1[i] < minPayment) {
                minPayment = payments1[i];
            }
            if (payments1[i] > maxPayment) {
                maxPayment = payments1[i];
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + minPayment + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + maxPayment + " рублей.");

        // Задача 3

        int[] payments2 = {1500, 2000, 300, 1200, 2500};
        int sum1 = 0;

        for (int payment : payments2) {
            sum1 += payment;
        }

        double average = (double) sum1 / payments2.length;

        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

    }


}