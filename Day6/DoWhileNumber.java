import java.util.Scanner;

public class number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        do{
            System.out.print("Enter a number between 1 to 10");
            num= scanner.nextInt();

        }
        while (num< 1 || num > 10);
        System.out.println("You have entered: " + num);
    }
}
