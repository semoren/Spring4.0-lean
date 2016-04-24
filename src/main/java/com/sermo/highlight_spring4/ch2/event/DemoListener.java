package com.sermo.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器
 * @author rq
 * 实现 ApplicationListener 接口，并指定监听的事件类型
 * 使用 onApplicationEvent 方法对消息进行接受处理
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{
	
	@Override
	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMsg();
		System.out.println("我(DemoListener)接收到了demoPublisher发布的消息：" + msg);
	}
}
