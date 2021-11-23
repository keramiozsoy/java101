package examples;

import java.time.LocalTime;

public class ConcurrencySignalWaiter implements Runnable{

    private ConcurrencySignalMessage msg;

    public ConcurrencySignalWaiter(ConcurrencySignalMessage m){
        this.msg=m;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (msg) {
            try{
                System.out.println(name+" started wait() at time:" + LocalTime.now());
                msg.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name+" got notified at time: " + LocalTime.now());
            //process the message now
            System.out.println(name+" processed: " + msg.getMsg());
        }
    }
}
