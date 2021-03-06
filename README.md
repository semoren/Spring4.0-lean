#Spring Boot 实战 学习
##Spring Boot 具有以下特征
  * 遵循“习惯优于配置”原则, 使用Spring Boot 只需要很少的配置, 大部分时候可以使用默认配置
  * 项目快速搭建, 可无配置整合第三方框架
  * 可完全不使用 xml 配置, 只使用自动配置和 Java Config
  * 内嵌 Servlet (如 Tomcat) 容器, 应用可用 jar 包运行 (java -jar)
  * 运行中应用状态的监控

##第一部分：点睛 Spring 4.x
###第一章 Spring 基础
####1.3 Spring基础配置
##### 1.3.1
###第二章 Spring 常用配置
####2.1 Bean 的 Scope
   * @Scope("singleton") 单例  默认值
   * @Scope("protorype") 多列
   
####2.2 Spring EL 和资源调用
   * @Value
   * 注入普通字符串
   * 注入操作系统属性
   * 注入表达式结果
   * 注入其他 Bean 属性
   * 注入文件资源
   * 注入网址资源
   * 注入配置文件
   
####2.3 Bean 的初始化和销毁
   * Java 配置方法：使用 @Bean 的 initMethod 和 destoryMethod （相当于 xml 配置的 init-method 和 destory-method）
   * 注解方式：利用 JSR-250 的 @PostConstruct 和 @PreDestroy
   
####2.4 Profile
   * 通过设定 Environment 的ActiveProfiles 来设定当前 context 需要使用的配置环境, 在开发中使用 @Profile 注解类或者方法, 达到在不同情况下选择实例化不同的Bean
   * 通过设定 jvm 的spring.profiles.active 参数来设置配置环境
   * Web 项目设置在 Servlet 的 context parameter 中
   
####2.5 事件 (Application Event)
Spring 的事件 (Application Event) 为 Bean 与 Bean 之间的消息通信提供了支持, 当一个 Bean 处理完一个任务之后, 希望另一个 Bean 知道并能做相应的处理,这时我们就需要让另一个 Bean 监听当前 Bean 所发送的事件

Spring 的事件需要遵循如下流程

   1. 自定义事件, 集成 ApplicationEvent
   2. 定义事件监听器, 实现 ApplicationListener
   3. 使用容器发布事件
   
###第三章 Spring 高级话题
#### 3.1 Spring Aware
使用 Spring Aware 让你的 Bean 和 Spring 框架耦合

| 名称        | 作用           |
| ------------- |:-------------:|
|BeanNameAware  |获取到容器中的 Bean 的名称|
|BeanFactoryAware|获取当前 bean factory, 这样可以调用容器的服务|
|ApplicationContextAware*|当前的 application context， 这样可以调用容器的服务|
|MessageSourceAware|获得 message source, 这样可以获取文本信息|
|ApplicationEventPublisherAware|应用事件发布器, 可以发布事件|
|ResourceLoaderAware|获取资源加载器, 可以获得外部资源文件|
####3.2 多线程
Spring 通过任务执行器 (TaskExecutor) 来实现多线程和并发编程. 使用 ThreadPoolTaskExecutor 可实现一个基于线程的 TaskExecutor. 在配置类中通过@EnableAsync 开启对异步任务的支持, 并通过在实际执行的 Bean 的方法中使用@Async 注解来声明其是一个异步任务
####3.3 计划任务
   * 对计划任务提供支持
   * 使用 @EnableScheduling 开启计划任务支持
   * 使用 @Scheduled 来注解计划任务的方法
   
####3.4 条件注解 @Conditional
####3.5 组合注解与元注解
####3.6 @Enable* 注解的工作原理
##### 第一部分
   * @EnableAspectJAutoProxy 开启对 AspectJ 自动代理的支持
   * @EnableAsync 开启异步方法的支持
   * @EnableScheduling 开启计划任务的支持
   
##### 第二部分
   * @EnableWebMvc 开启 Web MVC 的配置支持
   
##### 第三部分
   * @EnableConfigurationProperties 开启对 @ConfigurationProperties 注解配置 Bean 的支持
   * @EnableJpaRepositories 开启对 Spring Data JPA Repository 的支持
   * @EnableTransactionManagement 开启注解式事务的支持
   * @EnableCaching 开启注解式的缓存支持
    
所有的@Enable*注解都有一个@Import 注解    
   1. 直接导入配置类
   2. 依据条件选择配置类
   3. 动态注册 Bean
   
####3.7 测试