package examples;

public class DecisionMakingIfElseIncludeIfElse {
    public static void main(String[] args) {
        int age = 19;
        boolean hasMoney = true;

        if ( age > 18 ){
            if ( hasMoney ){
                System.out.println("Let's go to buy car !!! ");
            }else {
                System.out.println(" Please wait !!");
            }
        } else {
            System.out.println(" You have to wait until reach 18 ");
        }

    }
}
