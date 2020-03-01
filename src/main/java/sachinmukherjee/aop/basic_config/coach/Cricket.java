package sachinmukherjee.aop.basic_config.coach;

import org.springframework.stereotype.Component;

import sachinmukherjee.aop.basic_config.service.Service;

@Component("cricketCoach")
public class Cricket implements Coach {

	private Service service;
	
	public Cricket(Service service) {
		this.service = service;
	}
	
	public String getDailyTips() {
		return "Play With Straight Hand";
	}

	public String getDailyFortune() {
		return service.getDailyFortune();
	}

}
