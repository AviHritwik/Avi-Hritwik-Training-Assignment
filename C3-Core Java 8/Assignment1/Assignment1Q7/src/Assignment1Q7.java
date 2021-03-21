import java.util.Scanner;

public class Assignment1Q7 {
    public static void main(String[] args) {
        int lengthOfString;
        int searchElement;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the length of Array: ");
        lengthOfString=input.nextInt();
        int[] ar=new int[lengthOfString];
        for(int i=1;i<=lengthOfString;i++)
        {
            System.out.print("\tEnter element ["+i+"] : ");
            ar[i-1]=input.nextInt();
        }

        SearchArray search1 =new SearchArray(ar,lengthOfString);
        System.out.print("Provided Array : ");
        search1.getAr();

        System.out.print("Enter the element to search : ");
        searchElement= input.nextInt();
        if(search1.searchArray(searchElement))
            System.out.println("Number is present in Array");
        else
            System.out.println("Number is not present in Array");

    }
}
