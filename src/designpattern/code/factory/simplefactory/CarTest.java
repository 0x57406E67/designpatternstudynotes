package designpattern.code.factory.simplefactory;

public class CarTest {
	// 简单工厂模式
	// 不符合开闭原则，增加新车需要修改工厂类
	public static void main(String[] args) {
		// 方法一，传参获取
		Car buick = CarFactory.getCar("buick");
		Car tesla = CarFactory.getCar("tesla");
		Car dasauto = CarFactory.getCar("dasauto");
		Car mobike = CarFactory.getCar("mobike");
		
		try {
			buick.name();
			tesla.name();
			dasauto.name();
			mobike.name();
		} catch (Exception e) {
			System.out.println("not exist");
			e.printStackTrace();
		}
		// 方法二，直接获取
		Car buick1 = CarFactory.getBuick();
		Car tesla1 = CarFactory.getTesla();
		Car dasauto1 = CarFactory.getDasAuto();
		Car mobike1 = CarFactory.getMobike();
		
		buick1.name();
		tesla1.name();
		dasauto1.name();
		mobike1.name();
	}
}
