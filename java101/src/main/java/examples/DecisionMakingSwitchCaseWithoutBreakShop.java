package examples;

public class DecisionMakingSwitchCaseWithoutBreakShop {
    public static void main(String[] args) {
        int yearOfWorkingAsAWorkerFive = 5;
        int yearOfWorkingAsAWorkerThree = 3;
        int yearOfWorkingAsAWorkerOne = 1;


        switch (yearOfWorkingAsAWorkerOne){
            case 5: System.out.println("Item Delete");

            case 4: System.out.println("Item Insert");

            case 3: System.out.println("Item Update");

            case 2: System.out.println("Item Detail View");

            case 1: System.out.println("Item Count");
        }
    }
}
