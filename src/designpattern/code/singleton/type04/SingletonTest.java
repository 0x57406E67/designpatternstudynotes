package designpattern.code.singleton.type04;

public class SingletonTest {
	public static void main(String[] args) {
		
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();

		System.out.println("--懒汉式-线程安全-双重检查--");
		System.out.println(instance1 == instance2);
		System.out.println("instance1.hashCode=" + instance1.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}
}
