package examples;

public class ConcurrencyThreadRaceConditionReadWriteMain {

    public static void main(String[] args) {

        ConcurrencyThreadRaceConditionReadWriteBankAccount bankAccount =
                new ConcurrencyThreadRaceConditionReadWriteBankAccount(1000.0, "Special Customer");

// Problematic
        ConcurrencyThreadRaceConditionReadWriteDecrementMoneyProblematicThread decrementMoneyThread1 =
                new ConcurrencyThreadRaceConditionReadWriteDecrementMoneyProblematicThread(bankAccount, 700.0);
        ConcurrencyThreadRaceConditionReadWriteDecrementMoneyProblematicThread decrementMoneyThread2 =
                new ConcurrencyThreadRaceConditionReadWriteDecrementMoneyProblematicThread(bankAccount, 200.0);
        ConcurrencyThreadRaceConditionReadWriteDecrementMoneyProblematicThread decrementMoneyThread3 =
                new ConcurrencyThreadRaceConditionReadWriteDecrementMoneyProblematicThread(bankAccount, 50.0);

// Sync Solution
//        ConcurrencyThreadRaceConditionReadWriteDecrementMoneySyncThread decrementMoneyThread1 =
//                new ConcurrencyThreadRaceConditionReadWriteDecrementMoneySyncThread(bankAccount, 700.0);
//        ConcurrencyThreadRaceConditionReadWriteDecrementMoneySyncThread decrementMoneyThread2 =
//                new ConcurrencyThreadRaceConditionReadWriteDecrementMoneySyncThread(bankAccount, 200.0);
//        ConcurrencyThreadRaceConditionReadWriteDecrementMoneySyncThread decrementMoneyThread3 =
//                new ConcurrencyThreadRaceConditionReadWriteDecrementMoneySyncThread(bankAccount, 50.0);

        decrementMoneyThread1.start();
        decrementMoneyThread2.start();
        decrementMoneyThread3.start();

    }
}
