package examples;

import java.util.HashMap;

public class ThreadAccessSharedMemory extends Thread {

    private HashMap<String, Integer> sharedMap;
    private String key;

    public ThreadAccessSharedMemory(HashMap<String, Integer> sharedMap, String key) {
        this.sharedMap = sharedMap;
        this.key = key;
    }

    @Override
    public void run() {
        process();
        //syncProcess();
    }


    private void process() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (this.sharedMap.containsKey(key)) {
            final Integer removed = sharedMap.remove(key);
            System.out.println(" CountOfFruits " + removed + " Ready deliver to customer ");
            if (removed == null) {
                System.out.println(" there isn't enough key");
            }
        } else {
            // Order of Five Fruits created To Deliver From Supplier To SuperMarket
            sharedMap.put(key, 5);
            System.out.println("=== Five Fruits were added" + sharedMap.toString());
        }
    }

    private void syncProcess() {
        synchronized (this.sharedMap) {
            process();
        }
    }

}
