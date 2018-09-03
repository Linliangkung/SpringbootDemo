package com.jskao.springboot;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyScan.class);
		//创建普通bean
		MyBean bean1 = context.getBean(MyBean.class);
		System.out.println(bean1);
		MyBean bean2=(MyBean) context.getBean("myBean");
		System.out.println(bean2);
		
		
		//创建FactoryBean
		Runnable runnable=(Runnable) context.getBean("myRunnable");
		System.out.println(runnable);
		
		//获取FactoryBean本身
		RunnableFactoryBean factoryBean = (RunnableFactoryBean) context.getBean("&myRunnable");
		System.out.println(factoryBean);
		
		//不继承FactoryBean方式创建工厂
		Car car1=(Car) context.getBean("createCar");
		Car car2=context.getBean(Car.class);
		
		System.out.println(car1);
		System.out.println(car2);
		
		//下面列举三种初始化和销毁的方法
		
		//1.InitializingBean接口和DisposableBean接口的执行时机(构造方法=>=>afterPropertiesSet=>=>destory)
		System.out.println(context.getBean("createCat"));
		
		//2.自定义init和destory方法
		System.out.println(context.getBean("createDog"));
		
		//3.在方法上使用@PostConstruct和@PreDestroy
		System.out.println(context.getBean("createAnimal"));
		
		
		//依赖注入
		UserDao userDao1=(UserDao) context.getBean("userdao");
		UserDao userDao2= (UserDao) context.getBean("createUserDao");
		UserService userService=(UserService) context.getBean("userService");
		System.out.println("userDao1:"+userDao1);
		System.out.println("userDao2:"+userDao2);
		System.out.println(userService);
		
		userService.serivce();

		context.close();

	}
}
