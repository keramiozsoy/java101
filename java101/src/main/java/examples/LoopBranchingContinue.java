package examples;

public class LoopBranchingContinue {
    public static void main(String[] args) {
       for (int i = 0; i < 5000; i++ ){

           if ( i < 5 ) {
               continue;
           }

           if ( i % 5 == 0){
               System.out.println(i);
           }
       }
    }
}
