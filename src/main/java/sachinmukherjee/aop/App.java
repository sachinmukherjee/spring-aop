package sachinmukherjee.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sachinmukherjee.aop.basic_config.Config;
import sachinmukherjee.aop.basic_config.coach.Coach;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Coach coach = context.getBean("cricketCoach",Coach.class);
        System.out.println(coach.getDailyTips());
        context.close();
    }
}
