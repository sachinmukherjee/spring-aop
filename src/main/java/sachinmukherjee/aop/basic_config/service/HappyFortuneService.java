package sachinmukherjee.aop.basic_config.service;

import org.springframework.stereotype.Component;

@Component("happyFortuneService")
public class HappyFortuneService implements Service {
	
	public String getDailyFortune() {
		return "Today will be your day";
	}
}
