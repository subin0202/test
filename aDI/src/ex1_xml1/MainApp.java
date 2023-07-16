package ex1_xml1;

import java.applet.AppletContext;

import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
		//0.기존 자바 방식(pojo 방식)
		//MessageBeankoImpl bean = new MessageBeankoImpl();
		//bean.sayHello("홍동우");
		
		// MessageBeanEnImpl bean = new MessageBeanEnImpl();
		// bean.sayHello("홍동우");
		
		//1. 스프링 설정파일 연결
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ex1_xml1/applicationContext.xml");
		
		//2. DI : 스프링컨테이너에서 빈 가져오기(아이디 ko대신 별칭 (a,b,c) 가능 	
		MessageBean bean = context.getBean("a",MessageBean.class);
		bean.sayHello("홍동우");
		
		MessageBean bean2 = context.getBean("en",MessageBean.class);
		MessageBean bean3 = context.getBean("ko",MessageBean.class);
		
	}
}
