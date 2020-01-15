package designpattern.code.factory.oldschoolwithoutpattern;

public class CarTest {
	/**
	 * 没有使用设计模式
	 */
	public static void main(String[] args) {
		Car buick = new Buick();
		Car dasauto = new DasAuto();
		Car tesla = new Tesla();
		
		buick.name();
		dasauto.name();
		tesla.name();
	}
}
