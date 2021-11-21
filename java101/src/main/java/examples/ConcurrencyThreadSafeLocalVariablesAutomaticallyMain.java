package examples;

import java.util.Random;

public class ConcurrencyThreadSafeLocalVariablesAutomaticallyMain {


    public static void main(String[] args) {
        LocalOrInstanceVariables var = new LocalOrInstanceVariables();
        new Thread(var).start();
        new Thread(var).start();
    }


    public static class LocalOrInstanceVariables implements Runnable {

        // it located on HEAP
        private int instanceField;

        @Override
        public void run() {
            // process();
            // open below or above
            // processSync();
        }

        private void processSync(){
            synchronized (this){
                process();
            }
        }

        private void process() {
            instanceField = new Random().nextInt();

            // it located on STACK
            int localVariableThreadSafe = new Random().nextInt();

            System.out.println(instanceField + " === " + localVariableThreadSafe);
        }


    }

}
