import java.math.BigDecimal;

import static java.math.BigDecimal.*;

public class tasks {
    public static void main(String[] args) {
        //task2();
        //task3();
        //task4();
        //task5();
    }
    public static void task2(){
        float earthWeightOgnianyk;
        float marsWeightOgnianyk;
        int intMarsWeightOgnianyk;
        double doubleMarsWeightOgnianyk;

        earthWeightOgnianyk = 42;
        marsWeightOgnianyk = 42*0.38F;
        System.out.println("My mass on Earth: "+earthWeightOgnianyk+"; My mass on Mars: "+marsWeightOgnianyk);

        doubleMarsWeightOgnianyk = marsWeightOgnianyk;
        System.out.println("My mass on Mars (float->double): "+doubleMarsWeightOgnianyk);
        System.out.printf("My mass on Mars (only 4 digits): %.4f%n",doubleMarsWeightOgnianyk );

        intMarsWeightOgnianyk = (int)doubleMarsWeightOgnianyk;
        System.out.println("My mass on Mars (double->int): "+intMarsWeightOgnianyk);

        char character = (char)intMarsWeightOgnianyk;
        System.out.println("My mass on Mars (int->char): "+character);

        int some_operation = character + 12;
        System.out.println("Some operation was done; result in (int) is: "+ some_operation);
    }
    public static void task3(){
        int random = (int)(Math.random()*100+1);
        System.out.println("Random number is: "+random);
        if(random%2 == 0){
            System.out.println("Random number is even.");
        }else{
            System.out.println("Random number is odd.");
        }
    }
    public static void task4(){
        int amountOfBricks = (int)Math.floor(Math.random() * (50+1) + 50);
        System.out.println("Amount of bricks: "+amountOfBricks);
        int containerCapacity = (int)Math.floor(Math.random() * (5+1) + 5);
        System.out.println("Container capacity: "+containerCapacity);

        int amountOfAllContainers;
        int amountOfFullContainers;
        int amountOfBricksInNotFullContainer;

        if(amountOfBricks%containerCapacity == 0){
            amountOfAllContainers = amountOfBricks/containerCapacity;
            System.out.println("Amount of all containers: "+amountOfAllContainers);

            amountOfFullContainers = amountOfAllContainers;
            System.out.println("Amount of full containers: "+amountOfFullContainers);

            System.out.println("Amount of bricks in 'not full container': There is no 'not full container' ");
        }
        else{
            amountOfAllContainers = amountOfBricks/containerCapacity+1;
            System.out.println("Amount of all containers: "+amountOfAllContainers);

            amountOfFullContainers = amountOfAllContainers-1;
            System.out.println("Amount of full containers: "+amountOfFullContainers);

            amountOfFullContainers = amountOfBricks%containerCapacity;
            System.out.println("Amount of bricks in 'not full container': "+amountOfFullContainers);
        }


    }
    public static  void task5(){
        BigDecimal product_cost = new BigDecimal(9.99);
        System.out.println("Product cost(net): "+product_cost);
        BigDecimal product_cost_gross = product_cost.multiply(valueOf(1.23));
        System.out.println("Product cost(gross): "+product_cost_gross);
        BigDecimal product_cost_gross_mul = product_cost_gross.multiply(valueOf(10_000));
        System.out.println("Product cost(gross) after multiplication(10 000): "+product_cost_gross);
        BigDecimal product_cost_result = product_cost_gross_mul.divide(valueOf(1.23));
        System.out.println("Product cost(net) after multiplication(10 000): "+product_cost_result);
    }
}
