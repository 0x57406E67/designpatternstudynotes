package designpattern.code.factory.factorymethod;

public class BuickCarFactory implements CarFactory {

	@Override
	public Car getCar() {
		return new Buick();
	}

}
