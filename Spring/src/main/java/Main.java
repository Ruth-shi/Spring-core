import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main (String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee emp = (Employee) context.getBean("empbean");
        emp.display();

        Question myQ = (Question) context.getBean("q");
        myQ.print();
    }
}
