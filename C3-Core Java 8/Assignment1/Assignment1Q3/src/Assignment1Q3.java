import java.util.Scanner;

public class Assignment1Q3 {
    public static void main(String[] args) {
        int time;
        double interestRate,principleAmount;
        Scanner input=new Scanner(System.in);
        SiCi object=new SiCi();
        System.out.print("Enter principle amount : ");
        principleAmount = input.nextDouble();
        System.out.print("Enter duration of loan : ");
        time = input.nextInt();
        System.out.print("Enter the rate of interest :");
        interestRate = input.nextDouble();

        System.out.println("(1)Simple Interest :");
        System.out.println(object.simpleInterest(principleAmount, time, interestRate));

        System.out.println("(2)Compound Interest :");
        System.out.println(object.compoundInterest(principleAmount, time, interestRate));
    }
}

