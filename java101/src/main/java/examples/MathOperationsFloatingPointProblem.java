package examples;

public class MathOperationsFloatingPointProblem {

    public static void main(String[] args) {

        int salaryInt = 100;
        int partInt = 3;

        int month1Int = salaryInt/partInt;
        int month2Int = salaryInt/partInt;
        int month3Int = salaryInt/partInt;

        System.out.println(month1Int);
        System.out.println(month2Int);
        System.out.println(month3Int);

        int resultInt = month1Int + month2Int + month3Int;

        System.out.println(resultInt);
        System.out.println(" Where is my 1 ? ");


//////////////////////////////////////////////// //////////////////////// ////////////////////////

        // 64 bit
        double salary = 100.00;
        double part = 3.00;

        // 64 bit
        double month1 = salary/part;
        double month2 = salary/part;
        double month3 = salary/part;

        System.out.println(month1);
        System.out.println(month2);
        System.out.println(month3);

        double result = month1 + month2 + month3;

        System.out.println(result);

//////////////////////////////////////////////////////////////////////////////////////////


        // 32 bit
        float salaryF = 100.00f;
        float partExF = 3.00f;

        // 64 bit
        float month1F = salaryF/partExF;
        float month2F = salaryF/partExF;
        float month3F = salaryF/partExF;

        System.out.println(month1F);
        System.out.println(month2F);
        System.out.println(month3F);

        float resultF = month1F + month2F + month3F;

        System.out.println(resultF);


//////////////////////////////////////////////////////////////////////////////////////////


        // 32 bit
        float salaryEx = 100.00f;
        float partEx = 3.00f;

        // 64 bit
        double month1Ex = salaryEx/partEx;
        double month2Ex = salaryEx/partEx;
        double month3Ex = salaryEx/partEx;

        System.out.println(month1Ex);
        System.out.println(month2Ex);
        System.out.println(month3Ex);

        double resultEx = month1Ex + month2Ex + month3Ex;

        System.out.println(resultEx);

    }
}
