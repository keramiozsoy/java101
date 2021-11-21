package examples;

public class ConcurrencyThreadRaceConditionReadWriteBankAccount {
    private Double totalMoney;
    private String accountOwner;

    public ConcurrencyThreadRaceConditionReadWriteBankAccount(Double totalMoney, String accountOwner) {
        this.totalMoney = totalMoney;
        this.accountOwner = accountOwner;
    }

    public void decrementMoney(Double money){
        calculate(money);
    }

    private void calculate(Double money) {
        if (money <= totalMoney) {
            totalMoney -= money;

            System.out.println("Dear" + accountOwner + " decrement money : " + money);
            System.out.println("Dear" + accountOwner + " total money : " + totalMoney);
        } else {
            System.out.println("Dear" + accountOwner + " hasn't enough money : " + money);
        }
    }

    public synchronized void decrementSyncMoney(Double money){
        calculate(money);
    }


}
