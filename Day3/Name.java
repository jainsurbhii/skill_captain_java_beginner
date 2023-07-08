import java.util.Scanner;

public class Name {

    public static void main(String[] args) {
        int Age;
        String name;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Age");
        Age= sc.nextInt();
        System.out.print("Enter Name");
        name=sc.next();


        System.out.println("Hello, " +name+ "! You are " +Age+ "years old.");
    }
}
