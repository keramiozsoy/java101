package examples;

public class ConcurrencyThreadLambdaMain {
    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("First Thread: "+ Thread.currentThread().getName());
            }
        });

        Thread tLambda = new Thread(() -> {
            System.out.println("Second Thread: "+ Thread.currentThread().getName());
        });

//        Thread tLambda = new Thread(
//                () -> System.out.println("Second Thread: "+ Thread.currentThread().getName())
//        );

        t.start();
        tLambda.start();
    }
}
