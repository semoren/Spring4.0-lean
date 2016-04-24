package com.sermo.highlight_spring4.ch2.prepost;
/**
 * 使用 @Bean 形式的 bean
 * @author rq
 */
public class BeanWayService {
	public void init(){
		System.out.println("@Bean-init-mehtod");
	}
	
	public BeanWayService(){
		super();
		System.out.println("初始化构造函数-BeanWayService");
	}
	
	public void destroy(){
		System.out.println("@Bean-destory-method");
	}
}
