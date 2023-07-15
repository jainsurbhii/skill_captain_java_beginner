import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int array[]=new int[5];
        int sum=0;
        int average,minimum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<5; i++){
            array[i]=sc.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for (int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        System.out.println("Sum is "+sum);
        average = sum / 5;
        System.out.println("average is "+average);

        for (int i=0;i<array.length;i++){
            if(array[i] > max)
                max = array[i];

        }
        System.out.println("maximum value is "+max);
        for (int i=0;i<array.length;i++){
            if(array[i] < min)
                min = array[i];
        }
        System.out.println("minimum value is "+min);
    }

}



