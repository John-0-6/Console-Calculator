import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    double firstNumber = 0;
    double secondNumber = 0;
    String userOperator = "";
    boolean validInput = false;

    while(!validInput){
      try{
      System.out.print("Enter your first number: ");
      firstNumber = scanner.nextDouble();

      validInput = true;
      }
      catch(InputMismatchException e){
        System.out.println("Invalid input");
        scanner.nextLine();
      }
    }

    String[] operators = {"+", "-", "*", "/"};

    validInput = false;
    while(!validInput){
      System.out.print("Enter the operator: ");
      userOperator = scanner.nextLine();

      for(String operator : operators){
        if(operator.equals(userOperator)){
          validInput = true;
          break;
        }
      }
    }

    validInput = false;
    while(!validInput){
      try{
      System.out.print("Enter your second number: ");
      secondNumber = scanner.nextDouble();

      if(userOperator.equals("/") && secondNumber == 0){
        System.out.println("You can't divide be 0");
        continue;
      }

      validInput = true;
      }
      catch(InputMismatchException e){
        System.out.println("Invalid input");
        scanner.nextLine();
      }
    }

    result(firstNumber, secondNumber, userOperator);

    scanner.close();
  }
  static void result(double firstNumber, double secondNumber, String operator){

    double result = firstNumber + secondNumber;

    switch (operator) {
      case "+" -> {
        result = firstNumber + secondNumber;
        System.out.printf("%.2f %s %.2f = %.2f%n", firstNumber, operator, secondNumber, result);
      }
      case "-" -> {
        result = firstNumber - secondNumber;
        System.out.printf("%.2f %s %.2f = %.2f%n", firstNumber, operator, secondNumber, result);
      }
      case "*" -> {
        result = firstNumber * secondNumber;
        System.out.printf("%.2f %s %.2f = %.2f%n", firstNumber, operator, secondNumber, result);
      }
      case "/" -> {
        result = firstNumber / secondNumber;
        System.out.printf("%.2f %s %.2f = %.2f%n", firstNumber, operator, secondNumber, result);
      }
    }
  }
}
