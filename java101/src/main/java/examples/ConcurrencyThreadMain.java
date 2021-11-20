package examples;

public class ConcurrencyThreadMain {
    public static void main(String[] args) {
        System.out.println("Thread \n" +
                Thread.currentThread().getId() + "\n" +
                Thread.currentThread().getName() + "\n" +
                Thread.currentThread().getState() + "\n" +
                Thread.currentThread().getPriority() + "\n" +
                Thread.currentThread().getThreadGroup() + "\n");
    }
}
