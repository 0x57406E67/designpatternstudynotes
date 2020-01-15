package designpattern.code.singleton.type03;

/**
 * 单例：懒汉式-线程安全-同步方法
 * 解决线程不安全问题
 * 效率太低，每个线程想要获得实例时，执行getInstance()方法都要执行同步
 * 方法进行同步效率太低
 * 结论：实际开发中不推荐使用
 * @author 0x57
 * 
 */
public class Singleton {

	private Singleton() {
	}

	private static Singleton instance;

	// 提供一个公有静态方法，当试用该方法时才创建instance
	// 即懒汉式
	// 加入同步代码，解决线程不安全问题
	public static synchronized Singleton getInstance() {// 方法同步
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
