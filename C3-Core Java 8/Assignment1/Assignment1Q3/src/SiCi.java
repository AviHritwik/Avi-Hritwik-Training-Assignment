import java.lang.Math;
public class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
        double sI = principalAmount * time * interestRate;
        sI=sI/100;
        return sI;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
        double cI=principalAmount* Math.pow(1+interestRate/100,time) -principalAmount;
        return cI;
    }
}
