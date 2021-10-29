package spring.greeting2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Greetingservice {
	@Autowired
	@Qualifier("morningGreeting")
	Greeting grt;
public Greetingservice() {
	super();
	
}
public Greeting getGrt() {
	return grt;
}
public void setGrt() {
	this.grt = grt;
}
public void greeting() {
	grt.greet();
}
	

}
