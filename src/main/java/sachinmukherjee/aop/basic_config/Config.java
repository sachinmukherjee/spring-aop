package sachinmukherjee.aop.basic_config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("sachinmukherjee.aop.*")
@PropertySource("classpath:owner.properties")
public class Config {
	
}
