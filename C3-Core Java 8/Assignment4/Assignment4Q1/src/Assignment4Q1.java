public class Assignment4Q1 {
    public double addition(int num1,int num2){
        Calculate add;
        add = (a, b) -> {return a+b;};
        return add.calculate(num1,num2);
    }
    public double subtraction(int num1,int num2){
        Calculate sub;
        sub = (a, b) -> {return a-b;};
        return sub.calculate(num1,num2);
    }
    public double multiplication(int num1,int num2){
        Calculate mul;
        mul = (a, b) -> {return a*b;};
        return mul.calculate(num1,num2);
    }
    public double division(int num1,int num2){
        if(num2==0)
            return 0.0;
        Calculate div;
        div = (a, b) -> {return a/b;};
        return div.calculate(num1,num2);
    }
    public static void main(String[] args) {
        Assignment4Q1 obj=new Assignment4Q1();
        System.out.println(obj.addition(8,13));
    }
}
