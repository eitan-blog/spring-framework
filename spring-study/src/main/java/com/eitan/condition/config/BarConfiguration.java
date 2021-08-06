package com.eitan.condition.config;

import com.eitan.condition.condition.ExistBossCondition;
import com.eitan.condition.entity.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {
	@Bean
	@Conditional(ExistBossCondition.class)
	public Bar bar() {
		return new Bar();
	}
}
