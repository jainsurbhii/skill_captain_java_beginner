import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Paragraph");
        String str= sc.nextLine();
        String[] words= str.split("\\s");
        Map <String ,Integer> wordCount=new HashMap <String,Integer>();
        for (int i=0;i<words.length;i++){
            if(wordCount.containsKey(words[i])){
                int count =wordCount.get(words[i]);
                wordCount.put(words[i], count+1);}
            else {
                wordCount.put(words[i], 1);
            }
        }
        System.out.println(wordCount);
        sc.close();
    }
}

