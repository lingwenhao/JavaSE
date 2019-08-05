package structure.decorator.decorator_a;

/**  
 * 测试装饰者模式
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class Client {
	public static void main(String[] args) {
		/**
		 * 创建真实角色 
		 */
		Car car = new Car();
		car.run();
		
		System.out.println("给普通车增加新的功能:飞行--------");
		SuperCar flyCar = new FlyCar(car);
		flyCar.run();
		
		
		System.out.println("给普通车增加新的功能:自动驾驶--------");
		/*
		 * 装饰普通Car，新增加自动驾驶功能-->陆地跑、自动驾驶
		 */
		SuperCar aiCar = new AICar(car);
		aiCar.run();
		
		System.out.println("给有飞行功能的普通车增加新的功能:自动驾驶--------");
		/*
		 * 装饰FlyCar，增加自动驾驶功能-->陆地跑、飞行、自动驾驶
		 */
		SuperCar aiAndFlyCar = new AICar(new FlyCar(new Car()));
		aiAndFlyCar.run();
	}
}
