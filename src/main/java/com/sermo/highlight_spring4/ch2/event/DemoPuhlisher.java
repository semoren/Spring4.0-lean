package com.sermo.highlight_spring4.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 事件发布
 * @author rq
 * 注入 ApplicationContext 用来发布事件
 * 使用 ApplicationContext 的 publishEvent方法来发布
 */
@Component
public class DemoPuhlisher {
	@Autowired
	ApplicationContext applicationContext;
	
	public void publish(String msg){
		applicationContext.publishEvent(new DemoEvent(this, msg));
	}
}
