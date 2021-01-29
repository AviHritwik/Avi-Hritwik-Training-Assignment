import java.util.Scanner;
public class Assignment1Q4 {
    public static void main(String[] args) {
        int marksSub1,marksSub2,marksSub3,temp;
        Scanner input= new Scanner(System.in);
        while(true) {
            System.out.print("Enter marks of Subject 1: ");
            marksSub1 = input.nextInt();
            System.out.print("Enter marks of Subject 2: ");
            marksSub2 = input.nextInt();
            System.out.print("Enter marks of Subject 3: ");
            marksSub3 = input.nextInt();
            ResultDeclaration sub = new ResultDeclaration(marksSub1, marksSub2, marksSub3);
            System.out.println("The Student is "+sub.resultCalculate());
            System.out.println("want to process more results : (press 0 for no more entry)");
            temp = input.nextInt();
            if (temp == 0)
                break;
        }
    }
}
