package designpattern.code.singleton.type02;

public class SingletonTest {
	public static void main(String[] args) {
		
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();

		System.out.println("--懒汉式-线程不安全--");
		System.out.println(instance1 == instance2);
		System.out.println("instance1.hashCode=" + instance1.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}
}
