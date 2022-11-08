package ex1_xml1;

public class MessageBeanKoImpl implements MessageBean {
	
	public MessageBeanKoImpl() {
		System.out.println("MessageBeanKoImpl 생성");
	}
	
	public void sayHello(String name) {
			System.out.println("하이룽~~~~"+name);		
	}
}
