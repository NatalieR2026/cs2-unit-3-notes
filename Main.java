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

      {
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

      // TWO WAY SELECTION: IF block coupled with an ELSE block
      // is like "if this is true, do something", OTHERWISE, "do something else"
      int myAge = 16;
      // BOOLEAN EXPRESSION here is "myAge >= 17"
      if (myAge >= 17) {
         System.out.println("You can get your license in NY!");
      }
      // else is coupled with the if statement above
      // so you do NOT need to specify a CONDITION/EXPRESSION
      else {
         System.out.println("You're too young to drive in NY!");
      }

      // MULTI-WAY SELECTION
      System.out.println("What type of costume are you thinking of? (Scary, cute, funny, other)");
      String choice = "scary";
      // Always start a "decision" with an IF statement
      if (choice.equals("scary")) {
         System.out.println("You should be a FINAL EXAM!");
      }
      else if (choice.equals("cute")) {
         System.out.println("You should be a PRINCESS!");
      }
      else if (choice.equals("funny")) {
         System.out.println("You should be PITBULL!");
      }
      // Provide a "catch-all" choice in case earlier conditions are not met
      else {
         System.out.println("Look on Pinterest!");
      }
      
      // AND && OPERATOR
      // Both conditions need to be true for the conditional body to be executed
      boolean didHomework = true;
      boolean cleanedRoom = true;
      if ((didHomework == true) && (cleanedRoom)) {
         System.out.println("You can go out!");
      }
      else {
         System.out.println("You're grounded!");
      }
      // OR || Operator
      // Evaluates to TRUE if AT LEAST one expression is true
      if ( (didHomework) || (cleanedRoom) ) {
         System.out.println("The more permissive parents say sure, go out and finish anything else later!");
      }
      else {
         System.out.println("No, you need to do at least one of your tasks first.");
      }

      // NOT ! Operator
      // Use this on just ONE condition to flip the boolean result
      boolean walkSignOn = true;
      // Condition body will execute only if condition is false
      if (!walkSignOn) {
         System.out.println("STOP CROSSING THE STREET!!!");
      }


   }
}