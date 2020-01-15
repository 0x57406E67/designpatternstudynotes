package designpattern.code.singleton.type01;

/**
 * 单例：饿汉式-静态常量
 * 优点： 写法简单，类装载时候就完成实例化，避免线程同步问题
 * 缺点：没有达到Layz loading（懒加载）效果。
 * 结论：可用,但可能会造成内存浪费。
 * @author 0x57
 * 
 */
public class Singleton {

	// 1.私有化构造器，外部不能new
	private Singleton() {
	}

	// 2.本类内部创建对象实例
	private static final Singleton instance = new Singleton();

	// 3.提供一个公有静态方法，返回实例对象
	public static Singleton getInstance() {
		return instance;
	}
}
