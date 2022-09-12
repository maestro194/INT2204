import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.println("Welcome to Calculator App ^^");

    // Using scanner.nextInt() to get input as an integer from the keyboard
    Scanner scanner = new Scanner(System.in);

    // Using calculator to perform operations
    Calculator calculator = new Calculator();

    /* Your code here */
    
    while(true) {
      int Input = scanner.nextInt();

      if(Input == 0) {
        System.out.println("Exit");
        return;
      } else if (Input == 1) {
        System.out.println("Add 2 numbers");
        int op1 = scanner.nextInt();
        int op2 = scanner.nextInt();
        
        int result = calculator.add(op1, op2);
        System.out.println("Add result: " + result);
      } else if (Input == 2) {
        System.out.println("Subtract 2 numbers");
        int op1 = scanner.nextInt();
        int op2 = scanner.nextInt();
        
        int result = calculator.subtract(op1, op2);
        System.out.println("Subtract result: " + result);
      } else if (Input == 3) {
        System.out.println("Multiply 2 numbers");
        int op1 = scanner.nextInt();
        int op2 = scanner.nextInt();
        
        int result = calculator.multiple(op1, op2);
        System.out.println("Multiply result: " + result);
      } else if (Input == 4) {
        System.out.println("Divide 2 numbers");
        int op1 = scanner.nextInt();
        int op2 = scanner.nextInt();
        
        float result = calculator.divide(op1, op2);
        System.out.println("Divide result: " + result);
      } else {
        System.out.println("Operator not supported");
      }
    }
  }
}