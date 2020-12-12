public class Main {
    public static void main(String[] args) {
        int expenses = 5_888_88;
        int percent = 1;
        int hundreds = 100_00;
        int cashback = expenses / hundreds * hundreds * percent / 100;

        int limit = 3_000;
        if (cashback > limit) {
            cashback = limit;
        }
        System.out.println(cashback);
    }
}
