package spring_learn.spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.teach.ioc.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appCtx = new ClassPathXmlApplicationContext("Spring-Module.xml");//(xmlPath);
    	HelloWorld helloWorld = (HelloWorld)appCtx.getBean("helloBean");
    	helloWorld.printHello();
    }
}
