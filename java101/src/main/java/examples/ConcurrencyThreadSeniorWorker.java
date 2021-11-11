package examples;

public class ConcurrencyThreadSeniorWorker extends ConcurrencyThreadWorker {
    // ConcurrencyThreadSeniorWorker has design problem.
    //  - We have to call first super keyword when we used inheritance
    //  - It will call directly ConcurrencyThreadWorker run(), count 1 by 1
    //  after
    //  Run method of this class will invoke. count 2 by 2
    //  ConcurrencyThreadSeniorWorker will work unnecessary and overload


    @Override
    public void run() {
        super.run();

        for(int i = 0; i <= 50; i = i + 2){

            System.out.println(
                     "PID - " + this.getId() + " - " + this.getName() + " - "  + i
            );
            if (i == 50){
                System.out.println("==============================================");
            }

        }

    }
}
