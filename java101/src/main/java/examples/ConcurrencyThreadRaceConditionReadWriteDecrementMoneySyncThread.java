package examples;

public class ConcurrencyThreadRaceConditionReadWriteDecrementMoneySyncThread extends Thread {
    private ConcurrencyThreadRaceConditionReadWriteBankAccount bankAccount;
    private double willDecrementMoney;

    public ConcurrencyThreadRaceConditionReadWriteDecrementMoneySyncThread(ConcurrencyThreadRaceConditionReadWriteBankAccount bankAccount, double willDecrementMoney) {
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
        bankAccount.decrementSyncMoney(willDecrementMoney);
    }
}
