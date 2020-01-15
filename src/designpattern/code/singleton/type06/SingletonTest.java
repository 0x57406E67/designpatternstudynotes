package designpattern.code.singleton.type06;

public class SingletonTest {
	public static void main(String[] args) {
		
		Singleton instance1 = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;

		System.out.println("--枚举--");
		System.out.println(instance1 == instance2);
		System.out.println("instance1.hashCode=" + instance1.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
		
		instance1.sayOK();
		instance2.sayOK();
	}
}
