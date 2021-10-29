package spring.greeting2;

import org.springframework.stereotype.Component;

@Component
public class MorningGreeting implements Greeting {
	public String greeting = "good morning";
	public MorningGreeting() {
		super();
		System.out.print(greeting);
	}
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting() {
		this.greeting = greeting;
	}
	public String greet() {
		return greeting;
	}

}
