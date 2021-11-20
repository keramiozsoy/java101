package examples;

public class ConcurrencyThreadRunMethodDirectInvoke {
    public static void main(String[] args) {


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("We have invoked Thread.run() method !!" +
                        " We couldn't create new thread !! " +
                        " lets check name of thread !! ");
                System.out.println("Thread: "+ Thread.currentThread().getName());
            }
        };

        System.out.println("Thread: "+ Thread.currentThread().getName());


        Thread thread = new Thread(runnable);
        thread.run(); // Instead of thread.run() we should use thread.start() to create new Thread

        System.out.println(" I coma back this line after run() method invoked.");

    }
}
