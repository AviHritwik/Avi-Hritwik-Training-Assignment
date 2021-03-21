package io.corejava.assignment2.Q2;

public class SingletonClassInheritanceCheck {
    private static SingletonClassInheritanceCheck singleInstance;
    String msg;
    private SingletonClassInheritanceCheck()
    {
        msg="A single instance is created which is passed every where";
    }
    public static SingletonClassInheritanceCheck SingletonClassInheritanceCheck(){
        singleInstance=new SingletonClassInheritanceCheck();
        return singleInstance;
    }

    @Override
    public String toString() {
        return "SingletonClassInheritanceCheck{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
