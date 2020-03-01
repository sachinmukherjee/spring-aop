package sachinmukherjee.aop.basic_config.coach;

import org.springframework.stereotype.Component;

@Component("cricketCoach")
public class Cricket implements Coach {

	public String getDailyTips() {
		return "Play With Straight Hand";
	}

}
