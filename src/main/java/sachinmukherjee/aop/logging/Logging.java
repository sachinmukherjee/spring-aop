package sachinmukherjee.aop.logging;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component("logging")
public class Logging {
	
	@Before("execution(public String getDailyTips())")
	public void accessDateTime() {
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/mm/YYYY HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(date.format(now));
		System.out.println("Hello World");
	}
	
}
