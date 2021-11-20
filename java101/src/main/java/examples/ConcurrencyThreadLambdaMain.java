package examples;

public class ConcurrencyThreadLambdaMain {
    public static void main(String[] args) {

        System.out.println("Thread: "+ Thread.currentThread().getName() + " - " + Thread.currentThread().getId());

        new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println("Thread: "+ Thread.currentThread().getName() + " - " + Thread.currentThread().getId());
            }
        }.start();



        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread: "+ Thread.currentThread().getName() + " - " + Thread.currentThread().getId());
            }
        });

        t.start();




        // Java 8
        Thread tLambdaMultiLine = new Thread(() -> {
            System.out.println("Thread: "+ Thread.currentThread().getName() + " - " + Thread.currentThread().getId());
            System.out.println("Thread Multiline : "+ Thread.currentThread().getName() + " - " + Thread.currentThread().getId());
        });

        tLambdaMultiLine.start();





        // Java 8
        Thread tLambdaWithoutCurlyBrackets = new Thread(
                () -> System.out.println("Thread: "+ Thread.currentThread().getName() + " - " + Thread.currentThread().getId())
                // Below line Will not work
                // System.out.println("Thread Multiline : "+ Thread.currentThread().getName());
        );

        tLambdaWithoutCurlyBrackets.start();

    }
}
