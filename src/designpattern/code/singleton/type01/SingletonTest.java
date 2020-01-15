package designpattern.code.singleton.type01;

public class SingletonTest {
	public static void main(String[] args) {
		
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println("--饿汉式-静态常量--");
		System.out.println(instance1 == instance2);
		System.out.println("instance1.hashCode=" + instance1.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}
}
