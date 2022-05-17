package ai.jobiak.usesourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ai.jobiak.ifaces.BDigital;

public class TestAppContext {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		context.registerShutdownHook();
		BDigital bDigital = (BDigital) context.getBean("bDigital");
		bDigital.publish();
		System.out.println(bDigital.hashCode());
		BDigital bDigital2 = (BDigital) context.getBean("bDigital");
		bDigital.publish();
		//Singleton design pattern
		System.out.println(bDigital2.hashCode());	//by using scope="prototype we get the differt hashcode"
	}

}



