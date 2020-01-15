package designpattern.code.singleton.type04;

/**
 * 单例：懒汉式-线程安全-双重检查
 * 线程安全|懒加载|效率高
 * 结论：实际开发中推荐使用
 * @author 0x57
 * 
 */
public class Singleton {

	private Singleton() {
	}

	// volatile保证了不同线程对这个变量进行操作时的可见性
	// 即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的。（实现可见性）
	private static volatile Singleton instance;

	// 提供一个公有静态方法，当试用该方法时才创建instance
	// 即懒汉式
	// 加入双重检查代码，解决线程安全，也解决懒加载问题，同时保证效率
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {// 代码块同步，效率比方法同步高
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
