package ex1_xml1;

public class MessageBeanEnImpl implements MessageBean {

	public MessageBeanEnImpl() {
		System.out.println("MesageBeanEnImpl 생성자 호출");
	}
	
	@Override
	public void sayHello(String name) {
		System.out.println("hi~~~~"+name);
	}

}
