public class Main {

   public static void main(String []args) {
      // One = sign ASSIGNS a value to a variable
      int age = 15;
      int year = 14;
      // Two == signs is CHECKING for EQUALITY
      boolean match = (age == year); // returns a boolean
      System.out.println("Does age match year? " + match);

      year = 15; // re-assigning
      System.out.println(age == year); // true

      // != means "is NOT equal to"
      System.out.println(age != year);


      // RELATIONAL OPERATORS
      // used in boolean expressions
      double pi = 3.14159;
      System.out.println(pi > 0); // checking if positive
      System.out.println(pi < 0); // checking if negative
      System.out.println(pi >= 3.14); // true
      System.out.println(pi <= 10); // true

      // IF STATEMENTS
      boolean isCold = true;
      if (isCold == true) {
         System.out.println("Bring a Jacket!");
      }
      System.out.println("Enjoy your walk!");

      // Magic 8 Ball Mini Program
      System.out.println("8 BALL");
      // 1. Generate random integer between 1-8
      double numberDoub = Math.random() * 8 + 1; // adjust the output range
      int numberInt = (int) numberDoub; // CASTING types

      // 2. Use that number in 8 if statements to print a different response
      if (numberInt == 1) {
         System.out.println("Yes totally!");
      }
      if (numberInt == 2) {
         System.out.println("No...");
      }
      if (numberInt == 3) {
         System.out.println("Maybe!");
      }
      if (numberInt == 4) {
         System.out.println("Ummm idk");
      }
      if (numberInt == 5) {
         System.out.println("Wait and see.");
      }
      if (numberInt == 6) {
         System.out.println("Come back later!");
      }
      if (numberInt == 7) {
         System.out.println("Ew loser");
      }
      if (numberInt == 8) {
         System.out.println("Go ask a real person");
      }


   }
}