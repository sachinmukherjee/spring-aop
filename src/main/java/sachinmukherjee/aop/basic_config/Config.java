package sachinmukherjee.aop.basic_config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("sachinmukherjee.aop.basic_config.*")
@PropertySource("classpath:owner.properties")
public class Config {
	
}
