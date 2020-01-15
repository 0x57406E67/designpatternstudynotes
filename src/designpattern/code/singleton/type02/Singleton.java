package designpattern.code.singleton.type02;

/**
 * 单例：懒汉式-线程不安全
 * 起到了Lazy loading（懒加载）的效果，但只能在单线程下使用
 * 如果在多线程下，一个线程进入if判断语句块，还未来得及往下执行
 * 另一个线程也通过了这个判断语句块，便会产生多个实例
 * 结论：实际开发中不可使用
 * @author 0x57
 * 
 */
public class Singleton {

	private Singleton() {
	}

	private static Singleton instance;

	// 提供一个公有静态方法，当试用该方法时才创建instance
	// 即懒汉式
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
