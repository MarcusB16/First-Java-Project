/* Programmer Name: Marcus Brown
 * Class Name: Projet1D
 * Date: 2/07/2023
 * Course CIS1500 A1513
 * Purpose Statement: Produce an application that decrypts a four-digit integer.
 */

import java.util.Scanner;


public class Project1D {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int number, firstNumber, secondNumber, thirdNumber, fourthNumber;
        System.out.println("Enter the four-digit encrypted integer below.");
        number = keyboard.nextInt();

        // Pulling each individual digit
        firstNumber = (number / 1000) % 10;
        secondNumber = (number / 100) % 10;
        thirdNumber = (number / 10) % 10;
        fourthNumber = number % 10;

        // rearranging numbers in correct order
        int new1 = thirdNumber;
        int new2 = fourthNumber;
        int new3 = firstNumber;
        int new4 = secondNumber;
        
        // Reversing number encrytion
        new1 = ((new1 + 10 - 7) % 10 ); // (x +10) % 10 to inverse mod. but subtract 7 first to get original numbers.
        new2 = ((new2 + 10 - 7) % 10);
        new3 = ((new3 + 10 - 7) % 10);
        new4 = ((new4 + 10 - 7) % 10);

        //Final number or Original number       
        int originalNumber = (new1 * 1000) + (new2 * 100) + (new3 * 10) + new4;
        System.out.println(String.format("%04d", originalNumber));



    }
}
