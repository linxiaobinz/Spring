import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.util.Date;

public class T {

    @Test
    public void t1(){
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");

        Object beans = context.getBean("beans");
        System.out.println(beans);
    }
    @Test
    public void t2(){
         ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");

        Person person = (Person) context.getBean("person");
//       System.out.println(person.getDate1());
        System.out.println(person.getName());
//        Date d = new Date();
//        Date d1 = new Date(2014-1900, 6-1, 12);
//        System.out.println(d);
//        System.out.println(d1);

    }
    @Test
    public void t3() {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        UserService imp = (UserService) context.getBean("imp");
        System.out.println(imp.login("你好", "wode"));
        imp.register(new User());
    }
}
