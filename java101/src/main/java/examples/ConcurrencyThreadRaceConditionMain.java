package examples;

public class ConcurrencyThreadRaceConditionMain {

    public static void main(String[] args) {

        ConcurrencyThreadRaceConditionBankAccount bankAccount =
                new ConcurrencyThreadRaceConditionBankAccount(1000.0, "Special Customer");

// Problematic
        ConcurrencyThreadRaceConditionDecrementMoneyProblematicThread decrementMoneyThread1 =
                new ConcurrencyThreadRaceConditionDecrementMoneyProblematicThread(bankAccount, 700.0);
        ConcurrencyThreadRaceConditionDecrementMoneyProblematicThread decrementMoneyThread2 =
                new ConcurrencyThreadRaceConditionDecrementMoneyProblematicThread(bankAccount, 200.0);
        ConcurrencyThreadRaceConditionDecrementMoneyProblematicThread decrementMoneyThread3 =
                new ConcurrencyThreadRaceConditionDecrementMoneyProblematicThread(bankAccount, 50.0);

// Sync
//        ConcurrencyThreadRaceConditionDecrementMoneySyncThread decrementMoneyThread1 =
//                new ConcurrencyThreadRaceConditionDecrementMoneySyncThread(bankAccount, 700.0);
//        ConcurrencyThreadRaceConditionDecrementMoneySyncThread decrementMoneyThread2 =
//                new ConcurrencyThreadRaceConditionDecrementMoneySyncThread(bankAccount, 200.0);
//        ConcurrencyThreadRaceConditionDecrementMoneySyncThread decrementMoneyThread3 =
//                new ConcurrencyThreadRaceConditionDecrementMoneySyncThread(bankAccount, 50.0);

        decrementMoneyThread1.start();
        decrementMoneyThread2.start();
        decrementMoneyThread3.start();

    }
}
