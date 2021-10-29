package examples;

public class DecisionMakingIfElse {
    public static void main(String[] args) {
        int score = 65;
        char result;

        if ( score >= 90 ){
            result = 'A';
        }else if ( score >= 80){
            result = 'B';
        }else if ( score >= 70){
            result = 'C';
        }else if ( score >= 60){
            result = 'D';
        }else {
            result = 'F';
        }

        System.out.println(" Result = " + result);

    }
}
