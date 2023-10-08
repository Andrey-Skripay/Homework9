public class Main {
    public static void main(String[] args) {
        int[] payments = {1500, 2000, 3000, 1200, 2500}; //  массив с выплатами

        int sum = 0;
        for (int payment : payments) {
            sum += payment;
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }
}