import java.util.Scanner;

public class Larger {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number");
        int first= sc.nextInt();
        System.out.print("Enter second number");
        int second= sc.nextInt();
        if(first>second){
            System.out.print(first);
        }else {
            System.out.print(second);
        }

    }
}
