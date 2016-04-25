package com.sermo.highlight_spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
	
	/*
	 * 通过 @Async 注解表明该方法是个异步方法
	 */
	@Async
	public void executeAsyncTask(Integer i){
		System.out.println("执行异步任务：" + i);
	}
	
	@Async
	public void executeAsyncTaskPlus(Integer i){
		System.out.println("执行异步任务+1：" + i);
	}
}
