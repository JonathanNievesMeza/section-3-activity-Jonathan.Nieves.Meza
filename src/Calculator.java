import com.sun.tools.javac.jvm.ClassWriter;

import java.util.Scanner;

public class Calculator {
    public Calculator() {
        super();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int again;
        do {
            System.out.print("What operation? (+, -, *. /) ");
            String operation = scanner.next();

            System.out.print("What is the first number? ");
            double firstNumber = scanner.nextDouble();

            System.out.print("What is the second number? ");
            double secondNumber = scanner.nextDouble();

            double result = 0;
            if (operation.equals("+")) {
                result = firstNumber + secondNumber;
            } else if (operation.equals("-")) {
                result = firstNumber - secondNumber;
            } else if (operation.equals("*")) {
                result = firstNumber * secondNumber;
            } else if (operation.equals("/")) {
                result = firstNumber / secondNumber;
            }


            System.out.println("the result is ");
            System.out.println(result);
            System.out.print("Do you wanna try again? 1 for yes 2 for no ");
            again = scanner.nextInt();
        } while(again == 1);
    }
}
