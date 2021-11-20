package examples;

public class ConcurrencyThreadRaceConditionDecrementMoneyProblematicThread extends Thread {
    private ConcurrencyThreadRaceConditionBankAccount bankAccount;
    private double willDecrementMoney;

    public ConcurrencyThreadRaceConditionDecrementMoneyProblematicThread(ConcurrencyThreadRaceConditionBankAccount bankAccount, double willDecrementMoney) {
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
