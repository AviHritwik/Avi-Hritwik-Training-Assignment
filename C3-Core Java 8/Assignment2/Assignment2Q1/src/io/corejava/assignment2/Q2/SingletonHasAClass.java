package io.corejava.assignment2.Q2;

public class SingletonHasAClass {
    SingletonClassInheritanceCheck singleton;
    String msgChild;

    public SingletonHasAClass() {
        singleton=SingletonClassInheritanceCheck.SingletonClassInheritanceCheck();
        msgChild="A singleton class cannot be inherited as there are no public constructor available";
    }
}
