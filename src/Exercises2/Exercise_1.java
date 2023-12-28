package Exercises2;

import java.util.Scanner;
public class Exercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your purchase amount:");
        float purchaseAmount = sc.nextFloat();
        System.out.print("\n");
        float discount = 0;
        if(purchaseAmount > 1000)
        {
            if (purchaseAmount > 2000)
            {
                discount = 0.2f;
                purchaseAmount -= discount * purchaseAmount;
            }
            else
            {
                discount = 0.1f;
                purchaseAmount -= discount * purchaseAmount;
            }
        }
        System.out.println("Your final purchase amount is: "+purchaseAmount);
    }
}
