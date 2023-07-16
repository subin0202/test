package ex3_autowiring;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class MessageBeanImpl implements MessageBean {

//  @Autowired // setter나 생성자 인자 없이도 DI 가능
//  @Qualifier("outputer2")  // @Autowired 와 같이 기술
//  @Resource(name="outputer2")
	
	private String name;
	private String message;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Autowired
	@Qualifier("outputer2")
	private Outputer out;
	
	public void sayHello() {
		System.out.println(name + "님께" + message);
		
		try {
			out.writeMessage(name + "님께" + message);
		}catch(IOException e){
			
		}
			
		}
	}

