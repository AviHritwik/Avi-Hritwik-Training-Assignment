import java.util.Scanner;

public class Assignment1Q6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String user=new String();
        String pass=new String();
        System.out.print("Enter userId : ");
        user=input.next();
        System.out.print("Enter password : ");
        pass=input.next();
        Login user1=new Login();
        System.out.println(user1.loginUser(user,pass));
    }
}
