import java.util.Scanner;

public class MiniProject4 {
    public static void main(String[] args){

        // Basic Calculator Program

        Scanner scanner = new Scanner(System.in);
        double input1;
        double input2;
        double result = 0;
        char operator;
        boolean validoperation = true;


        System.out.print("Enter the first number: ");
        input1 = scanner.nextDouble();
        System.out.print("Enter the operator (+ , - , * , / , ^): ");
        operator = scanner.next().charAt(0);
        System.out.print("Enter the second number: ");
        input2 = scanner.nextDouble();
        switch(operator){
            case '+' -> {
                result = input1 + input2;
                validoperation = true;
            }
            case '-' -> {
                result = input1 - input2;
                validoperation = true;
            }
            case '*' -> {
                result = input1 * input2;
                validoperation = true;
            }
            case '/' -> {
                if(input2 == 0){
                    System.out.print("Cannot divide by 0");
                    validoperation = false;
                }
                else{
                    result = input1 / input2;
                    validoperation = true;
                }
            }
            case '^' -> {
                result = Math.pow(input1 , input2);
                validoperation = true;
            }
            default -> {
                System.out.print("This operation is a invalid type😡");
                validoperation = false;
            }

        }
        if(validoperation){
            System.out.print(result);
        }
        scanner.close();
    }
}
