package designpattern.code.singleton.type06;

/**
 * 单例：枚举
 * 借助枚举实现单例，不仅能避免多线程同步问题
 * 还能防止反序列化重新创建新的对象
 * Effective Java作者Josh Bloch提倡的方式
 * 结论：推荐使用
 * @author 0x57
 * 
 */
enum Singleton {
	INSTANCE;
	public void sayOK() {
		System.out.println("OK");
	}
}
