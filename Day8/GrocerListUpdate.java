
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class grocerylist {
    public static List<String> grocerylist = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please select:Enter your choice (1-5):");
            System.out.println("1 Add item");
            System.out.println("2 Remove item");
            System.out.println("3 Grocery list");
            System.out.println("4 Check Item");
            System.out.println("5 Clear List");
            int choice = sc.nextInt();
            sc.nextLine();


            switch (choice) {
                case 1:
                    addItem(sc);
                    break;
                case 2:
                    removeItem(sc);
                    break;
                case 3:
                    groceryList(sc);
                    break;
                case 4:
                    checkItem(sc);
                    break;
                case 5:
                    ClearList(sc);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void addItem(Scanner sc){
        System.out.print("Enter the item to add: ");
        String item = sc.next();
        grocerylist.add(item);
    }
    public static void removeItem(Scanner sc){
        System.out.print("Enter the item to remove: ");
        String item = sc.next();
        grocerylist.remove(item);
    }
    public static void groceryList(Scanner sc){
        System.out.println("Grocery List:");
        for (int i = 0; i < grocerylist.size(); i++) {
            System.out.println((i + 1) + ". " + grocerylist.get(i));
        }
    }
    public static void checkItem(Scanner sc) {
        String b=sc.nextLine();
        boolean containsElement = grocerylist.contains(b);
        System.out.println("Contains Element: " + containsElement);
    }
    public static void ClearList(Scanner sc) {
        grocerylist.clear();
        boolean isEmpty = grocerylist.isEmpty();
        System.out.println("List is empty: " + isEmpty);
    }

}
