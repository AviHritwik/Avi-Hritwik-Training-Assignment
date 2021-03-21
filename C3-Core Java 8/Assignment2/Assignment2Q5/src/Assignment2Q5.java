/**
 * implementing polymorphism by using parent object for all child class
 */
public class Assignment2Q5 {

    public static void main(String[] args) {
        Shape5 parentObject =new Cube5();
        System.out.println("For cube : \n\t"+parentObject.draw());
        parentObject=null;
        parentObject=new Line5();
        System.out.println("For Line : \n\t"+parentObject.draw());
        parentObject=null;
        parentObject=new Rectangle5();
        System.out.println("For rectangle :\n\t"+parentObject.draw());
    }
}
