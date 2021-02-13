import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        Customer customer;
        customer= (Customer) context.getBean("customer");
        System.out.println("************************************************");
        System.out.println("Customer 1 (By setter injection):");
        System.out.println(customer);
        Customer customerConstructorInjection;
        customerConstructorInjection= (Customer) context.getBean("customerConstructorInjection");
        System.out.println("**************************************************");
        System.out.println("Customer 1 (By constructor injection):");
        System.out.println(customerConstructorInjection);
    }
}
