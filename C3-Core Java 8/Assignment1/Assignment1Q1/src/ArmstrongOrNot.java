import java.util.Scanner;

public class ArmstrongOrNot {
    private int number;
    public ArmstrongOrNot()
    {
        int number;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        number=input.nextInt();
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public boolean checkArmstrong()
    {
        int ord=(int)Math.log10(this.number)+1;
        int n=this.number;
        int tempDigit,tempCube;
        int sumOfCube=0;
        while(n!=0)
        {
            tempDigit=n%10;
            n/=10;
            tempCube=(int)Math.pow(tempDigit,ord);
            sumOfCube=sumOfCube+tempCube;
        }
        if(sumOfCube==this.number)
            return true;
        else
            return false;
    }


}
