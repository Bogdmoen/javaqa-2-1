public class main {
    public static void main(String[] args) {
        int balance = 2_000_000_000; // текущий баланс
        int transfer = 500_000_000;  // сумма пополнения (перевода)
        int balance_sum = balance + transfer;
        System.out.println(balance_sum);
    }
}