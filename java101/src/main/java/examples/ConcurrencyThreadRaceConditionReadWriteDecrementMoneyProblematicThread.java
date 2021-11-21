package examples;

public class ConcurrencyThreadRaceConditionReadWriteDecrementMoneyProblematicThread extends Thread {
    private ConcurrencyThreadRaceConditionReadWriteBankAccount bankAccount;
    private double willDecrementMoney;

    public ConcurrencyThreadRaceConditionReadWriteDecrementMoneyProblematicThread(ConcurrencyThreadRaceConditionReadWriteBankAccount bankAccount, double willDecrementMoney) {
        this.bankAccount = bankAccount;
        this.willDecrementMoney = willDecrementMoney;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bankAccount.decrementMoney(willDecrementMoney);
    }
}
