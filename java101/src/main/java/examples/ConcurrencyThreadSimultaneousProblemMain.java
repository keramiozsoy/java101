package examples;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrencyThreadSimultaneousProblemMain {

    public static void main(String[] args) {
        ReadAndRemoveAtSimultaneouslyArrayList();
        ReadAndRemoveAtSimultaneouslyHashMap();

        // Solution
        ReadAndRemoveAtSimultaneouslyConcurrentHashMap();
    }




    private static void ReadAndRemoveAtSimultaneouslyArrayList() {
        try {
            List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

            // Solution
            // ArrayList -> private class Itr  -> next()

            for (String element : list) {
                final String removedZero = list.remove(0);
                System.out.println(" ELEMENT WAS DELETED !!!! " + removedZero);
                final String removedFirst = list.remove(1);
                System.out.println(" ELEMENT WAS DELETED !!!!" + removedFirst);
            }
        } catch (ConcurrentModificationException e) {
            e.printStackTrace();
        }
    }

    private static void ReadAndRemoveAtSimultaneouslyHashMap() {
        try {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("key1", "value1");
            hashMap.put("key2", "value2");
            hashMap.put("key3", "value3");

            // Solution
            // class HashIterator -> nextNode()

            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                final String valueOfKey = hashMap.remove(key);
                if (value.equals(valueOfKey)) {
                    System.out.println(" ELEMENT WAS DELETED !!!!");
                }
            }
        } catch (ConcurrentModificationException e) {
            e.printStackTrace();
        }
    }


    private static void ReadAndRemoveAtSimultaneouslyConcurrentHashMap() {
        try {
            ConcurrentHashMap<String, String> hashMap = new ConcurrentHashMap<>();
            hashMap.put("key1", "value1");
            hashMap.put("key2", "value2");
            hashMap.put("key3", "value3");


            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                final String valueOfKey = hashMap.remove(key);
                if (value.equals(valueOfKey)) {
                    System.out.println(" ELEMENT WAS DELETED !!!!");
                }
            }
        } catch (ConcurrentModificationException e) {
            e.printStackTrace();
        }
    }
}
