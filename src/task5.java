import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.math.BigDecimal.valueOf;

public class task5 {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("Double type:");
        double product_cost_double = 9.99;
        System.out.println("Product cost(net): "+Math.round(product_cost_double));
        double product_cost_gross_double = product_cost_double*1.23;
        System.out.println("Product cost(gross): "+Math.round(product_cost_gross_double));
        double product_cost_gross_mul_double = product_cost_gross_double*10_000;
        System.out.println("Product cost(gross) after multiplication(10 000): "+Math.round(product_cost_gross_mul_double));
        double product_cost_result_double = product_cost_gross_mul_double/1.23;
        System.out.println("Product cost(net) after multiplication(10 000): "+Math.round(product_cost_result_double));
        System.out.println("----------------------------------------------------\n");

        System.out.println("----------------------------------------------------");
        System.out.println("BigDecimal type:");
        BigDecimal product_cost = new BigDecimal(9.99);
        BigDecimal product_cost_rounded = product_cost.setScale(2, RoundingMode.FLOOR);
        System.out.println("Product cost(net): "+product_cost_rounded);
        BigDecimal product_cost_gross = product_cost.multiply(valueOf(1.23));
        BigDecimal product_cost_gross_rounded = product_cost_gross.setScale(2, RoundingMode.FLOOR);
        System.out.println("Product cost(gross): "+product_cost_gross_rounded);
        BigDecimal product_cost_gross_mul = product_cost_gross.multiply(valueOf(10_000));
        BigDecimal product_cost_gross_mul_rounded = product_cost_gross_mul.setScale(2, RoundingMode.FLOOR);
        System.out.println("Product cost(gross) after multiplication(10 000): "+product_cost_gross_mul_rounded);
        BigDecimal product_cost_result = product_cost_gross_mul.divide(valueOf(1.23));
        BigDecimal product_cost_result_rounded = product_cost_result.setScale(2, RoundingMode.FLOOR);
        System.out.println("Product cost(net) after multiplication(10 000): "+product_cost_result_rounded);
        // Last output: Product cost(net) after multiplication(10 000): 99900
        System.out.println("----------------------------------------------------\n");

        System.out.println("----------------------------------------------------");
        System.out.println("Comparison of result values");
        System.out.printf("Double     result: %.20f %n",product_cost_result_double);
        System.out.printf("BigDecimal result: %.20f %n",product_cost_result);
        if (product_cost_result.compareTo(valueOf(product_cost_result_double)) == 0){
            System.out.println("The result of double value and BigDecimal value is equal");
        } else if (product_cost_result.compareTo(valueOf(product_cost_result_double)) == -1) {
            System.out.println("The result of double value is bigger than BigDecimal value");
        }else{
            System.out.println("The result of double value is smaller than BigDecimal value");
        }
        System.out.println("----------------------------------------------------");
    }
}
