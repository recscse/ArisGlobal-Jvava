package spring.greeting2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
      Greetingservice gt = context.getBean(Greetingservice.class);
      gt.greeting();
    }
}
