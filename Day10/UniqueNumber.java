import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Integer> nameset = new HashSet<Integer>();
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            int intputValue=in.nextInt();
            if(nameset.contains(intputValue))
            {
                System.out.println("Duplicate");
            }
            else {
                System.out.println("Unique");
                nameset.add(intputValue);
            }
            in.close;
        }
    }

}


