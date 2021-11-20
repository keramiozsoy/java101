package examples;



public class ConcurrencyThreadStateTerminatedRunnable implements Runnable {

    private boolean running = true;

    public synchronized void customStop() {
        this.running = false;
    }

    private synchronized boolean checkRunningStatus() {
        return this.running == true;
    }


    @Override
    public void run() {
        while (checkRunningStatus()) {
            System.out.println("Running");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
