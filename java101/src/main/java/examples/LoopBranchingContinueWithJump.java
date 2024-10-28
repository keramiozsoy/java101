package examples;

public class LoopBranchingContinueWithJump {
    public static void main(String[] args) {

        jump :
        for( int i = 0; i < 6; i++){

                for ( int j = 0; j < 5; j++){
                    if ( j == 3 ) {
                        continue jump;
                    }

                    System.out.println(" j " + j);
                }

            System.out.println(" This line will never appear ");
            System.out.println(i);

        }


    }
}
