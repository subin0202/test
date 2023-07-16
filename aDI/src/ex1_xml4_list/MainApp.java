package ex1_xml4_list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		//스프링 설정 파일 연결
				ApplicationContext context = new
						ClassPathXmlApplicationContext("ex1_xml4_list/applicationContext.xml");
				
				ListBean bb = (ListBean)context.getBean("bean");
				
				for(Integer i : bb.getIntList()) {
					System.out.println(i);
				}
				for(MemberBean m : bb.getMemberList()) {
					System.out.println(m.getName() + ":" + m.getMessage());
				}
	}
}
