package designpattern.code.factory.factorymethod;

public class TeslaFacotry implements CarFactory {

	@Override
	public Car getCar() {
		return new Tesla();
	}

}
