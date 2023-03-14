/*
 * Programmer Name: Marcus Brown
 * Class Name: Projet1E
 * Date: 2/06/2023
 * Course CIS1500 A1513
 * Purpose Statement: Produce an application that encrypts a four-digit integer.
 */

 import java.util.Scanner;

public class Project1E {
    public static void main(String[] args)  {
        Scanner keyboard = new Scanner(System.in); // keyboard scanner name declared

        int number, fourthDigit, thirdDigit, secondDigit, firstDigit;
        System.out.println("Enter a four-digit integer: ");
        number = keyboard.nextInt();

        // Pulling each individual digit

        fourthDigit = number % 10;
        thirdDigit = ((number / 10) % 10);
        secondDigit = (number / 100) % 10;
        firstDigit = (number / 1000) % 10;
        
        

        // Perfoming actual encryption (add 7, mod 10 to each digit).

        fourthDigit = (fourthDigit + 7) % 10;
        thirdDigit = (thirdDigit + 7) % 10;
        secondDigit = (secondDigit + 7) % 10;
        firstDigit = (firstDigit + 7) % 10;
        

       

        // Final encryption step (replacing first with third, & second with fourth)
        int new1 = thirdDigit;
        int new2 = fourthDigit;
        int newNumber = (new1 * 1000) + (new2 * 100) + (firstDigit * 10) + secondDigit;
        System.out.println(String.format("%04d", newNumber));

        


        
    }
}
