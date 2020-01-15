package designpattern.code.factory.factorymethod;

public class CarTest {
	// 工厂方法模式
	// 不需要修改，只需进行扩展
	// 每新增一款车，需要新增一个对应的类和对应的类工厂。
	public static void main(String[] args) {
		Car buick = new BuickCarFactory().getCar();
		Car dasauto = new DasAutoFactory().getCar();
		Car tesla = new TeslaFacotry().getCar();
		
		buick.name();
		dasauto.name();
		tesla.name();
	}
}
