import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int result=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int first= sc.nextInt();
        System.out.println("Enter second number:");
        int second= sc.nextInt();
        System.out.println("Enter operation: +, -, *, /");
        String operation= sc.next();
        switch (operation){
            case "+":
                result=first+second;
                break;
            case "-":
                result=first-second;
                break;
            case "*":
                result=first*second;
                break;
            case "/":
                result=first/second;
                break;
            default:
                System.out.println("Invalid Input");
        }

        System.out.println(result);

    }
}
