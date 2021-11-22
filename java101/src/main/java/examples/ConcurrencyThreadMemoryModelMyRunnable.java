package examples;

public class ConcurrencyThreadMemoryModelMyRunnable implements Runnable {

    private int globalCount = 0;
    private ConcurrencyThreadMemoryModelMyCustomObject globalObject = null;

    public ConcurrencyThreadMemoryModelMyRunnable(ConcurrencyThreadMemoryModelMyCustomObject paramGlobalObject){
        this.globalObject = paramGlobalObject;
    }

    @Override
    public void run() {

        int localCount = 0;
        ConcurrencyThreadMemoryModelMyCustomObject localObject = new ConcurrencyThreadMemoryModelMyCustomObject();

        for (int i = 0; i < 1_000_000; i++) {
            this.globalCount++;
            localCount++;
        }

        System.out.println(
                Thread.currentThread().getName() + " \n " +
                " Global Object : " + this.globalObject + " \n " +
                " Local Object : " + localObject + " \n " +
                " Global Count : " + this.globalCount + " \n " +
                " Local Count    : " + localCount
        );
    }
}
