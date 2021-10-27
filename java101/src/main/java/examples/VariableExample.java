package examples;

import java.util.Calendar;

public class VariableExample {

    // Each instance of VariableExample class has different instanceVariable
    Calendar instanceVariable = Calendar.getInstance();

    // Each instance of VariableExample class has same staticVariable
    static Calendar staticVariable = Calendar.getInstance();

    public static void main(String[] args) {
        // Method will not let you access out of method
        Calendar localVariable = Calendar.getInstance();

    }

    void calculateCalender(Calendar parameterCalender){
        // we use parameterCalender only here.
        // wen can't account out of this scope.
    }


}

