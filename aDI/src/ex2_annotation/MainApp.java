package ex2_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class MainApp {
		
		public static void main(String[] args) {
			ApplicationContext context = new  ClassPathXmlApplicationContext("ex2_annotation/applicationContext.xml");
			
//	      MemberBean bean = context.getBean("memberBean", MemberBean.class);
//	      bean.setName("홍순이");
//	      bean.setAge(33);
//	      bean.setMessage("오늘도 만족한가");
	      
//	      MemberDAO dao = context.getBean("memberDAO", MemberDAO.class);
//	      dao.insert()
			
			MemberDao dao = context.getBean("dao",MemberDao.class);
			dao.insert();
			
}
	}
