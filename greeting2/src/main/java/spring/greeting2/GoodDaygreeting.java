package spring.greeting2;

import org.springframework.stereotype.Component;

@Component
public class GoodDaygreeting implements Greeting {
	public String greeting = "Have a Good Day!";
	public GoodDaygreeting() {
		super();
		System.out.println(greeting);
	}
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String greet() {
		return greeting;
	}

}
