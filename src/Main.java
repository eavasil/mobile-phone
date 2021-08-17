import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        float balance = 100;
        float bonus;
        System.out.println("Баланс составляет: " + balance);
        System.out.println("Внесите средства на счет: ");
        Scanner scanner = new Scanner(System.in);
        float plus_money = (float) scanner.nextDouble();
        float total_balance;
        if (plus_money >= 1000) {
            bonus = (int) plus_money / 100;
            System.out.println("Начисленные бонусы: " + bonus);
            total_balance = balance + plus_money + bonus;
            System.out.println("Баланс составляет: " + total_balance);
        } else {
            total_balance = balance + plus_money;
            System.out.println("Баланс составляет: " + total_balance);
        }

    }
}

