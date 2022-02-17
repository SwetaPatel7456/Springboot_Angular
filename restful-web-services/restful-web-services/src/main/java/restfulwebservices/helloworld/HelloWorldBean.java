package restfulwebservices.helloworld;

public class HelloWorldBean {

	private String meassage;

	public HelloWorldBean(String format) {
		// TODO Auto-generated constructor stub
		this.meassage = format;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [meassage=" + meassage + "]";
	}

	public String getMeassage() {
		return meassage;
	}

	public void setMeassage(String meassage) {
		this.meassage = meassage;
	}

	public HelloWorldBean() {
		super();
		// TODO Auto-generated constructor stub
	}

}
