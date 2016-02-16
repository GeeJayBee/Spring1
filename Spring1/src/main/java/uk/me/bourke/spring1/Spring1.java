package uk.me.bourke.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring1 {

	static Worker worker;
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
                new String []{"spring-context.xml"});
		Fetcher b = ctx.getBean(Fetcher.class);
		System.out.println(b.getName());
		// add a shutdown hook for the above context...
        ctx.registerShutdownHook();

		worker = ctx.getBean(Worker.class);
		worker.doWork();
	}

}
