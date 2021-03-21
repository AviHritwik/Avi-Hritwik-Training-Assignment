import java.util.ArrayList;
import java.util.Scanner;

public class Assignment4Q4 {
    public static ArrayList<String> removeOddLength(ArrayList<String> employeeList){
        employeeList.removeIf(employee -> employee.length()%2!=0);
        return employeeList;
    }
    public static void main(String[] args) {
        ArrayList<String> employeeList=new ArrayList<>();
        int i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter \n\t1:- for custom input\n\t2:- for default input");
        i=input.nextInt();
        if(i==1) {
            System.out.println("Enter employee name : ");
            int count=1;
            while (true) {
                System.out.println("Employee "+count+" name: ");
                employeeList.add(input.next());
                System.out.println("Enter \n\t0:- To exit\n\t1:- for more record");
                if(input.nextInt()==0)
                    break;
            }
        }
        else{
            employeeList.add("Sam");
            employeeList.add("Sammy");
            employeeList.add("Hari");
            employeeList.add("Rubina");
            employeeList.add("Fin");
            System.out.println("Custom List : ");
            employeeList.forEach(employee-> System.out.println(employee));
        }
        ArrayList<String> evenLenName=Assignment4Q4.removeOddLength(employeeList);
        System.out.print("Employee with even length : ");
        System.out.print(evenLenName);
    }
}
