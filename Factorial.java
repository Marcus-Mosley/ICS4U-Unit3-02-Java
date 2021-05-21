import java.util.Scanner;

/**
* The Factorial program implements an application that
* outputs the factorial of an inputted integer.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-05-21
*/
public class Factorial {
  /**
  * The recFactorial method uses recursion to return the calculated factorial.
  */
  public static int recFactorial(int num) {
    if (num == 1) {
      return num;
    } else { 
      return num * recFactorial(num - 1);
    }
  }

  /**
  * The Main method receives input.
  */
  public static void main(String[] args) {
    int num;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    num = input.nextInt();
    
    System.out.println(recFactorial(num) + " is the factorial of " + num + ".");
  }
}
