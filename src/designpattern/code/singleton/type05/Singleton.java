package designpattern.code.singleton.type05;

/**
 * 单例：静态内部类
 * 采用类装载机制保证初始化时只有一个线程（线程安全）
 * 静态内部类方式在Singleton被装载的时候不会立即实例化，而是在调用getInstance方法时，
 * 才会装载SingletonInstance类，从而完成Singleton的实例化（懒加载）
 * 类的静态属性只会在第一次加载类的时候初始化，所以这里，JVM保证了线程的安全性，在类进行初始化时，别的线程无法进入
 * 线程安全|利用静态内部类特点实现懒加载|效率高
 * 结论：实际开发中推荐使用
 * @author 0x57
 * 
 */
public class Singleton {

	private Singleton() {
	}

	// 静态内部类，该类中有一个静态属性Singleton
	private static class SingletonInstance {
		private static final Singleton INSTANCE = new Singleton();
	}
	
	// 提供一个静态公有方法， 直接返回SingletonInstance.INSTANCE
	public static Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}
}
