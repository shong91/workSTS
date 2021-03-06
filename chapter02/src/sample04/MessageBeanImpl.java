package sample04;

public class MessageBeanImpl implements MessageBean {
	private String name; 
	private String phone; 
	private Outputter outputter; 

	public MessageBeanImpl(String name) {
		System.out.println("MessageBeanImpl constructor");
		this.name = name;
	}
	
	public void setPhone(String phone) {
		System.out.println("setPhone method");
		this.phone = phone;
	}

	public void setOutputter(Outputter outputter) {
		System.out.println("setOutputter method");
		this.outputter = outputter;
	}
	
	@Override
	public void helloCall() {
		System.out.println("helloCall method");
		outputter.output("이름: " + name + ", 전화번호: " + phone);
		
	}

}
