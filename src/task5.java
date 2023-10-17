import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

public class task5 {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("Double type:");
        double product_cost_double = 9.99;
        System.out.printf("Product cost(net): %.5f %n",product_cost_double);
        double product_cost_gross_double = product_cost_double*1.23;
        System.out.printf("Product cost(gross): %.5f %n",product_cost_gross_double);
        double product_cost_gross_mul_double = product_cost_gross_double*10_000;
        System.out.printf("Product cost(gross) after multiplication(10 000): %.5f %n",product_cost_gross_mul_double);
        double product_cost_result_double = product_cost_gross_mul_double/1.23;
        System.out.printf("Product cost(net) after multiplication(10 000): %.5f %n",product_cost_result_double);
        System.out.println("----------------------------------------------------\n");

        System.out.println("----------------------------------------------------");
        System.out.println("BigDecimal type:");
        BigDecimal product_cost = new BigDecimal(9.99);
        System.out.printf("Product cost(net): %.5f %n",product_cost);
        BigDecimal product_cost_gross = product_cost.multiply(valueOf(1.23));
        System.out.printf("Product cost(gross): %.5f %n",product_cost_gross);
        BigDecimal product_cost_gross_mul = product_cost_gross.multiply(valueOf(10_000));
        System.out.printf("Product cost(gross) after multiplication(10 000): %.5f %n",product_cost_gross_mul);
        BigDecimal product_cost_result = product_cost_gross_mul.divide(valueOf(1.23));
        System.out.printf("Product cost(net) after multiplication(10 000): %.5f %n",product_cost_result);
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
