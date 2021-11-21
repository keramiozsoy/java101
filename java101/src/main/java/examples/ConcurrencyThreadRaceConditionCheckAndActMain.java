package examples;

import java.util.HashMap;

public class ConcurrencyThreadRaceConditionCheckAndActMain {
    public static void main(String[] args) {
        HashMap<String, Integer> sharedMap = new HashMap<>();
        sharedMap.put("lemons",3);
        sharedMap.put("mandarins",5);
        System.out.println(sharedMap.toString());

        ThreadAccessSharedMemory thread1 = new ThreadAccessSharedMemory(sharedMap, "apples");
        thread1.start();

        ThreadAccessSharedMemory thread2 = new ThreadAccessSharedMemory(sharedMap, "apples");
        thread2.start();

    }



}
