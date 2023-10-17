import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

public class task5 {
    public static void main(String[] args) {
        BigDecimal product_cost = new BigDecimal(9.99);
        System.out.println("Product cost(net): "+product_cost);
        BigDecimal product_cost_gross = product_cost.multiply(valueOf(1.23));
        System.out.println("Product cost(gross): "+product_cost_gross);
        BigDecimal product_cost_gross_mul = product_cost_gross.multiply(valueOf(10_000));
        System.out.println("Product cost(gross) after multiplication(10 000): "+product_cost_gross);
        BigDecimal product_cost_result = product_cost_gross_mul.divide(valueOf(1.23));
        System.out.println("Product cost(net) after multiplication(10 000): "+product_cost_result);
        //Last output: Product cost(net) after multiplication(10 000): 99900.0000000000021316282072803005576133728027343750000
    }
}
