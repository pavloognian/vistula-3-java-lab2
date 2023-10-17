import java.math.BigDecimal;
import java.math.MathContext;

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
        MathContext m1 = new MathContext(2);
        BigDecimal product_cost = new BigDecimal(9.99);
        System.out.println("Product cost(net): "+product_cost.round(m1));
        BigDecimal product_cost_gross = product_cost.multiply(valueOf(1.23));
        System.out.println("Product cost(gross): "+product_cost_gross.round(m1));
        MathContext m2= new MathContext(6);
        BigDecimal product_cost_gross_mul = product_cost_gross.multiply(valueOf(10_000));
        System.out.println("Product cost(gross) after multiplication(10 000): "+product_cost_gross_mul.round(m2));
        BigDecimal product_cost_result = product_cost_gross_mul.divide(valueOf(1.23));
        MathContext m3= new MathContext(5);
        System.out.println("Product cost(net) after multiplication(10 000): "+product_cost_result.round(m3));
        // Last output: Product cost(net) after multiplication(10 000): 99900.0000000000021316282072803005576133728027343750000
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
