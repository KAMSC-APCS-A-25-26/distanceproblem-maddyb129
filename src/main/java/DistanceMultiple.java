/*
 * TODO: APCS-A Distance Program
 *
 * Write a program that:
 *  1. Asks the user how many inputs (pairs of points) they want to enter.
 *  2. For each input, prompt them to enter two points in the format:
 *         (x1,y1)(x2,y2)
 *     Example: (2,3)(7,3)
 *
 *  3. Use Scanner with a custom delimiter:
 *     This should ignore parentheses, commas, and spaces so only numbers remain.
 *
 *  4. Extract x1, y1, x2, y2 as doubles.
 *
 *  5. Compute the distance between the two points:
 *
 *  6. Print the results
 * 
 *  7. Repeat until all inputs have been processed.
 *
 * Example Inputs:
 *  How many inputs? 3
 *  Enter input 1 (like (x1,y1)(x2,y2)): (2,3)(7,3)
 *  Enter input 2 (like (x1,y1)(x2,y2)): (4,5)(8,8)
 *  Enter input 3 (like (x1,y1)(x2,y2)): (-1,-2)(0,7)
 *
 */
/**
 * NAME                 : Madilyn Ball
 * GROUP                : APCS-A
 * LAST MODIFIED        : 11 September 2025
 * PROBLEM ID           : Lewis 2.8 Distance Problem
 * PROBLEM DESCRIPTION  : An application that reads the (x,y) coordinates for
 *                        two points, and computes the distance between them
 *                        using the distance formula.
 * SOURCES I USED       : Lewis Java Software Solutions 3rd Edition
 * PEOPLE I HELPED      : Syeda Khadija
 * PEOPLE WHO HELPED ME : Mr Houtrouw, Mr Afsal, Syeda Khadija, Lizzie Bippley
 */
import java.util.Scanner;
public class DistanceMultiple
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[(),\\s]+");
        System.out.print("Madilyn Ball\nAPCS-A\nLewis Problem 2.8\n");
        System.out.print("Enter the number of times you want to run the program: ");
        int numRuns = sc.nextInt();
        for (int j = 0; j < numRuns; j++)
        {
            System.out.print("\nEnter point 1: ");
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();

            System.out.print("Enter point 2: ");
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            System.out.println("The distance between the two points is: " + distance);
        }
        sc.close();
    }

}