/* In this program we are checking the Student age
 * if the student age<12 and weight <40 then our program 
 * should return that the student is not eligible for registration.
 */
import java.util.Scanner;

class ThrowExample {
  static void checkEligibility(int age, int weight) {
    if(age < 12 && weight < 40) {
      throw new ArithmeticException("Student is not eligible for registration.");
    } else {
      System.out.println("Student is valid!");
    }
  }

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Welcome to the registration process.");
    System.out.print("Your name: ");
    String name = myObj.nextLine();
    System.out.print("Enter age: ");
    int age = myObj.nextInt();
    System.out.print("Enter weight: ");
    int weight = myObj.nextInt();
    checkEligibility(age, weight);
    System.out.println("Have a nice day " + name + "!");
  }
}