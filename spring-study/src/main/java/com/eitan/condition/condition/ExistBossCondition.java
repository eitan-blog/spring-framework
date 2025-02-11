package com.eitan.condition.condition;

import com.eitan.condition.entity.Boss;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ExistBossCondition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		return context.getBeanFactory().containsBeanDefinition(Boss.class.getSimpleName().toLowerCase());
	}
}
