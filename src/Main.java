import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        float balance = 100;
        float bonus;
        System.out.println("Баланс составляет: " + balance);
        System.out.println("Внесите средства на счет: ");
        Scanner scanner = new Scanner(System.in);
        float plusMoney = (float) scanner.nextDouble();
        float totalBalance;
        if (plusMoney >= 1000) {
            bonus = (int) plusMoney / 100;
            System.out.println("Начисленные бонусы: " + bonus);
            totalBalance = balance + plusMoney + bonus;
            System.out.println("Баланс составляет: " + totalBalance);
        } else {
            totalBalance = balance + plusMoney;
            System.out.println("Баланс составляет: " + totalBalance);
        }

    }
}

