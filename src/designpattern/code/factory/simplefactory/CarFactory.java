package designpattern.code.factory.simplefactory;

public class CarFactory {
	// 方法一
	public static Car getCar(String carname) {
		if ("buick".equals(carname)) {
			return new Buick();
		}
		if ("tesla".equals(carname)) {
			return new Tesla();
		}
		if ("dasauto".equals(carname)) {
			return new DasAuto();
		}
		if ("mobike".equals(carname)) {
			return new Mobike();
		}
		return null;
	}
	// 方法二
	public static Car getBuick() {
		return new Buick();
	}
	
	public static Car getTesla() {
		return new Tesla();
	}
	
	public static Car getDasAuto() {
		return new DasAuto();
	}
	
	public static Car getMobike() {
		return new Mobike();
	}
}
