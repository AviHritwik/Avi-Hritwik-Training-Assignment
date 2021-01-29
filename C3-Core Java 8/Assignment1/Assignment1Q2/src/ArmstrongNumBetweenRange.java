import java.util.ArrayList;
import java.lang.Math;
class ArmstrongNumBetweenRange {
    private int min;
    private int max;
    public ArmstrongNumBetweenRange(int min, int max)
    {
        this.min=min;
        this.max=max;
    }
    public ArmstrongNumBetweenRange()
    {
        this.min=100;
        this.max=999;
    }
    public ArrayList<Integer> armstrongNumberBetween()
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int tempDigit,tempCube,sumOfCube,number;
        for(int i=100;i<=999;i++)
        {
            sumOfCube=0;
            number=i;
            while(number!=0)
            {
                tempDigit=number%10;
                number/=10;
                sumOfCube+=(int)Math.pow(tempDigit,3);
            }

            if (i==sumOfCube)
            {
                numbers.add(i);
            }

        }
        return numbers;

    }
}
