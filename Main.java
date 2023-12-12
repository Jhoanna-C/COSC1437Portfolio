import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get input for the number of adult meals orders
        System.out.print("Enter the number of adult meals orders: ");
        int adultMeal = input.nextInt();

        // Get input for the number of child meals orders
        System.out.print("Enter the number of child meal orders: ");
        int childMeal = input.nextInt();

        // Gte input for the number of cookies orders
        System.out.print("Enter the number of cookies orders: ");
        int dessertOne = input.nextInt();

        // Get input for the number of brownie orders
        System.out.print("Enter the number of brownie orders: ");
        int dessertTwo = input.nextInt();

        // Calculate the cost of each category
        double adultMealCost = adultMeal * 4.75;
        double childMealCost = childMeal * 3.75;
        double dessertOneCost = dessertOne * 1.00;
        double dessertTwoCost = dessertTwo * 0.75;


        // Display the total money collected for each category
        System.out.println("The total money collected for adult meal orders: $" + adultMealCost);
        System.out.println("The total money collect+ed for child meal orders: $" + childMealCost);
        System.out.println("The total money collected for cookies orders: $" + dessertOneCost);
        System.out.println("The total money collected for brownie orders: $" + dessertTwoCost);

        // Display the total profit earned
        System.out.println("The total profit earned: $" + (adultMealCost + childMealCost + dessertOneCost + dessertTwoCost));

    }
}