
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class grocerylist {
    public static void main(String[] args) {
        List<String> grocerylist = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the items to added");
        String a;
        for(int i=0;i<6;i++){
            a =sc.nextLine();
            grocerylist.add(a);
        }
        System.out.println("Enter the items to removed");
        a=sc.nextLine();
        grocerylist.remove(a);

        System.out.println("Enter the item to check ");
        String b=sc.nextLine();
        boolean containsElement = grocerylist.contains(b);
        System.out.println("Contains Element: " + containsElement);

        System.out.println("Grocery List" + grocerylist);
        grocerylist.clear();
        boolean isEmpty = grocerylist.isEmpty();
        System.out.println("List is empty: " + isEmpty);
    }
}
