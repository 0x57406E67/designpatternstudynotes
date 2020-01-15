package designpattern.code.factory.factorymethod;

public class DasAutoFactory implements CarFactory {

	@Override
	public Car getCar() {
		return new DasAuto();
	}

}
