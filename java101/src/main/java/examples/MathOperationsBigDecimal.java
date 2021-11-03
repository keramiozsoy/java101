package examples;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathOperationsBigDecimal {

    public static void main(String[] args) {
        BigDecimal b = new BigDecimal("10.12556");

        System.out.println(b.setScale(2, BigDecimal.ROUND_UP));
        System.out.println(b.setScale(2, BigDecimal.ROUND_CEILING));
        System.out.println(b.setScale(2, BigDecimal.ROUND_DOWN));
        System.out.println(b.setScale(2, BigDecimal.ROUND_FLOOR));
        System.out.println(b.setScale(2, BigDecimal.ROUND_HALF_DOWN));
        System.out.println(b.setScale(2, BigDecimal.ROUND_HALF_EVEN));
        System.out.println(b.setScale(2, BigDecimal.ROUND_HALF_UP));


///////////////////////////////////////////////////////////////////////////////////////////////////

        BigDecimal bb = new BigDecimal(5.2);
        BigDecimal aa = new BigDecimal(2.0);

        final BigDecimal divide = bb.divide(aa);
        System.out.println(divide);

        final BigDecimal divide2 = bb.divide(aa,2,RoundingMode.HALF_UP);
        System.out.println(divide2);


///////////////////////////////////////////////////////////////////////////////////////////////////


        BigDecimal salary = new BigDecimal(100.00);
        BigDecimal part = BigDecimal.valueOf(3.00);

        BigDecimal month = salary.divide(part,3, RoundingMode.HALF_UP);
        BigDecimal month2 = salary.divide(part,3, RoundingMode.HALF_UP);
        BigDecimal month3 = salary.divide(part,3, RoundingMode.HALF_UP);

        System.out.println(month);
        System.out.println(month2);
        System.out.println(month3);

        final BigDecimal result = month.add(month2).add(month3);

        System.out.println(result);






    }
}
