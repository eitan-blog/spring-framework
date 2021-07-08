package com.eitan.tag.handler;

import com.eitan.tag.paser.UserBeanDefinitionPaser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class UserNamespaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinitionPaser());
	}
}
