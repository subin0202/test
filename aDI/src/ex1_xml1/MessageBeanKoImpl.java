
package ex1_xml1;

public class MessageBeanKoImpl implements MessageBean{

		public void sayHello(String name){
			System.out.println(name+", Good morning!!!!");
		}
		
		public MessageBeanKoImpl(){
			System.out.println("KO 생성자 함수");
		}		
}
