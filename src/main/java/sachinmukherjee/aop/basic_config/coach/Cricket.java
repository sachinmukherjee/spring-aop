package sachinmukherjee.aop.basic_config.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import sachinmukherjee.aop.basic_config.service.Service;

@Component("cricketCoach")
public class Cricket implements Coach {
	
	@Autowired
	private Service service;
	@Value("${owner.name}")
	private String coachName;
	@Value("${owner.nationality}")
	private String coachNationality;
	
	public Cricket(Service service) {
		this.service = service;
	}
	
	public String coachName() {
		return coachName;
	}
	
	public String coachNationality() {
		return coachNationality;
	}
	
	public String getDailyTips() {
		return "Play With Straight Hand";
	}

	public String getDailyFortune() {
		return service.getDailyFortune();
	}

}
