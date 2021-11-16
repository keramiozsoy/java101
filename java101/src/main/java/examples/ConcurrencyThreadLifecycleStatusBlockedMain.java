package examples;

import java.nio.IntBuffer;
import java.util.Scanner;

public class ConcurrencyThreadLifecycleStatusBlockedMain {
    public static void main(String[] args) {
        Runnable runnable = () -> {

            Scanner console = new Scanner(System.in);

            System.out.println("Thread has blocked.Thread is doing input/output operation.");
            System.out.println("  Please Enter random number : " );

            int length = console.nextInt();
            System.out.println(length);

        };

        Thread thread = new Thread(runnable,"T1");
        thread.start();

        IntBuffer
    }
}
