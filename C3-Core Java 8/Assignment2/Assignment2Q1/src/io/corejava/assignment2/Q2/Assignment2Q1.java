package io.corejava.assignment2.Q2;

public class Assignment2Q1 {
    public static void main(String[] args) {
        SingletonHasAClass obj=new SingletonHasAClass();

        System.out.println(obj.singleton);
        System.out.println(obj.msgChild);
        obj.singleton.msg=obj.singleton.msg+" (Update by instance of singlton in obj";
        System.out.println("Printing from SingleHasAClass Instace :"+obj.singleton.msg);
        SingletonClassInheritanceCheck singleton= SingletonClassInheritanceCheck.SingletonClassInheritanceCheck();
        System.out.println("Printing from main instance of sinleton : "+singleton.msg);
        System.out.println("Both are same as same instance is provided to both");
    }
}
