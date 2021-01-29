import java.util.Scanner;

public class Login {
    private final String userId;
    private String password;
    private int attemptCount;
    public Login()
    {
        userId="Ajay";
        password="password";
        attemptCount=0;
    }
    public String loginUser(String user,String pass)
    {
        Scanner input=new Scanner(System.in);
        while(true) {
            if (pass.equals(this.password) && user.equals(this.userId)) {
                return "Welcome " + userId + "\n" + "Enjoy your session";
            }
            else {
                attemptCount++;
                if(attemptCount>=3)
                    return "You have entered wrong credentials 3 times \nContact Admin";
                System.out.println("You have entered wrong credentials ,please enter the right credentials.");
                System.out.print("Enter userId : ");
                user=input.next();
                System.out.print("Enter password : ");
                pass=input.next();
            }

        }
    }
}
