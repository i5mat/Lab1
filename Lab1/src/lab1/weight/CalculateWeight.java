package lab1.weight;
import java.util.Scanner;

public class CalculateWeight {

      public static void main(String[] args) {
        System.out.println(" ===== How much do I weigh on other planets? =====\n");
        weight();
        planetSelection();
    }

    static double weightlbs;
    static double weightkg;
    static int planetNumber;

    public static void weight() {
        boolean exit = false;
        Scanner in = new Scanner(System.in);
        System.out.printf("\n");
        System.out.println("\n1). Please type 1 and press enter, to know the weight in kg." + "\n2). Please type 2 to exit this program.");
        int choice = in.nextInt();
        if (choice == 1)
        {
          System.out.println("You have chosen weight in kg, please enter your weight in kilograms.");
          weightkg = in.nextDouble();
        }
        if (choice == 2)
        {
          System.out.println("Ooops.. Something is not quite right, please try again later!");
          exit = true;
        }
    }

    public static void planetSelection()     {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a Planet in our Solar System: \n 1). Mercury \n 2). Mars \n Select one planet from (1 or 2)");
        int choice = in.nextInt();
        if (choice == 1)
        {
            System.out.printf("Your weight on Mercury is: %.1f lbs", (weightkg * 0.4155));
            weight();
        }
        if (choice == 2)
        {
        	System.out.printf("\n");
        	System.out.printf("Your weight on Mars is: %.1f kg", (weightkg * 0.38));
        	System.out.printf("\n");
        	System.out.printf("Your weight on Earth is: %.1f kg", (weightkg));
            weight();
        }
    }
}