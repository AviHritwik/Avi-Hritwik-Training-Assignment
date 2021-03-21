import java.util.ArrayList;
import java.util.Scanner;

public class Assignment2Q2 {
    private final int salary;
    public Assignment2Q2()
    {
        salary = 10000;
    }

    public int getSalary(){
        return salary;
    }

    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
        return employeeSalaries.stream().mapToInt(i -> i).sum();
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> employeeSalaries=new ArrayList<>();
        Assignment2Q2 employee =new Assignment2Q2();
        Manager manager=new Manager();
        Labour labour=new Labour();
        System.out.println("Fixed salary of employee :"+employee.getSalary());
        System.out.println("Salary for Manager(with initiative) :"+manager.getSalary());
        System.out.println("Salary for Labour (with overtime) :"+labour.getSalary());
        System.out.println("**************************************************************");
        System.out.println("Enter employee list:");
        while(true)
        {
            System.out.println("Enter \n\t1 : Manager\n\t2 : Labour");
            int choice=input.nextInt();
            switch (choice)
            {
                case 1: employeeSalaries.add(manager.getSalary());
                        break;
                case 2: employeeSalaries.add(labour.getSalary());
                        break;
                default:
                    System.out.println("!!Invalid input!!");
            }
            System.out.println("Enter \n\t1: More Records\n\t2: Exit");
            if(input.nextInt()==2)
            {
                break;
            }
        }
        System.out.println("Total salary of employee :"+employee.totalEmployeesSalary(employeeSalaries));
    }
}
