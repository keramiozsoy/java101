package examples;

public class ConcurrencyThreadSyncDividedMultipleMain {

    public static void main(String[] args) {

        TwoSums twoSums = new TwoSums();

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                twoSums.add(1, 1);
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                twoSums.addMultipleSync(100, 100);
            }
        };

        Thread thread1 = new Thread(runnable1, "T1");
        Thread thread2 = new Thread(runnable1, "T2");

        thread1.start();
        thread2.start();

        Thread thread3 = new Thread(runnable2, "T3");
        Thread thread4 = new Thread(runnable2, "T4");

        thread3.start();
        thread4.start();


    }

    public static class TwoSums {
        private int sum1 = 0;
        private int sum2 = 0;

        private Integer sum3 = 0;
        private Integer sum4 = 0;

        // simultaneously only one thread
        public void add(int val1, int val2) {

            synchronized (this) {
                this.sum1 += val1;
                this.sum2 += val2;
                System.out.println("Thread " + Thread.currentThread().getName() + " Results sum1 : " + sum1 + " - sum2 : " + sum2);
            }


        }

        // simultaneously two threads
        public void addMultipleSync(int val3, int val4) {
            synchronized (this.sum3) {
                this.sum3 += val3;
                System.out.println("Thread " + Thread.currentThread().getName() + " Results sum3 : " + sum3 + " - sum4 : " + sum4);
            }
            synchronized (this.sum4) {
                this.sum4 += val4;
                System.out.println("Thread " + Thread.currentThread().getName() + " Results sum3 : " + sum3 + " - sum4 : " + sum4);
            }
        }
    }
}