package ex4_javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ex4_javabased")
public class AppConfig {
	@Bean
	MemberBean memberBean() {
	return new MemberBean("홍동우", 20 , "오늘도 멀쩡히 하자요");
}
	@Bean
	MemberDao memberDao() {
		return new MemberDao(memberBean());
	}
}
