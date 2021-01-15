package MoneyTransfer;

public class MoneyTransfer {
    public static void main(String[] args) {
        int  balance = 2_000_000_000;
        int transfer = 500_000_000;
        int total_balance = balance + transfer;
        System.out.println("Баланс счета = " + total_balance);
    }
}
