package com.eitan.supplier.beanFactoryPostProcessor;

import com.eitan.supplier.entity.User;
import com.eitan.supplier.supplier.CreateSupplier;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class SupplierBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("user");
		genericBeanDefinition.setInstanceSupplier(CreateSupplier::createUser);
	}
}
