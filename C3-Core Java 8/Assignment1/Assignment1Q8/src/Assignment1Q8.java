import java.util.Scanner;

public class Assignment1Q8 {

    public static void main(String[] args) {
        int lengthOfString;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of Array: ");
        lengthOfString = input.nextInt();
        int[] ar = new int[lengthOfString];
        for (int i = 1; i <= lengthOfString; i++) {
            System.out.print("\tEnter element [" + i + "] : ");
            ar[i - 1] = input.nextInt();
        }

        BubbleSort arrayBubble = new BubbleSort(ar, lengthOfString);
        System.out.print("Provided Array : ");
        arrayBubble.getAr();
        System.out.println("Do you want to sort the array : (1-for yes, 0-for no)");
        int temp=input.nextInt();
        if(temp==1)
        {
            arrayBubble.sort();
            System.out.println("!!Array is sorted!!");
            arrayBubble.getAr();
        }
    }

}
