package examples;

public class ConcurrencyThreadLambdaMain {
    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("First Thread: "+ Thread.currentThread().getName());
            }
        });

        // Java 8
        Thread tLambdaMultiLine = new Thread(() -> {
            System.out.println("Second Thread: "+ Thread.currentThread().getName());
            System.out.println("Second Thread Multiline : "+ Thread.currentThread().getName());
        });

        // Java 8
        Thread tLambdaWithoutCurlyBrackets = new Thread(
                () -> System.out.println("Second Thread: "+ Thread.currentThread().getName())
                // Below line Will not work
                // System.out.println("Second Thread Multiline : "+ Thread.currentThread().getName());
        );

        t.start();
        tLambdaMultiLine.start();
        tLambdaWithoutCurlyBrackets.start();
    }
}
