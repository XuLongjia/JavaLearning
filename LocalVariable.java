/*
 * Java局部变量：
 * 1、局部变量声明在方法、构造方法或者语句块中
 * 2、局部变量在方法、构造方法、或者语句块被执行的时候创建，当他们执行完成后、变量将被自动销毁
 * 3、访问修饰符不能用于局部变量
 * 4、局部变量只在声明它的方法、构造方法或者语句块中可见；
 * 5、局部变量是在栈上分配的。
 * 6、局部变量没有默认值，所有局部变量被声明后，必须经过初始化，才可以使用
 * */
public class LocalVariable {
	public void pupAge() {
		int age = 0;
		age = age+5;
		System.out.println("小狗的年龄是：" + age);
	}
	
	public static void main(String[] args) {
		LocalVariable var = new LocalVariable();
		var.pupAge();	
	}
}
