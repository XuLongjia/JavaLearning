//java支持的三种变量类型
public class Variable {
	static int allClicks = 999; //类变量
	String str = "Hello World"; // 实例变量
	public void method() {
		int i = 0;  // 局部变量
		System.out.println("method内部的局部变量i的值为" + i);
	}
	
	public static void main(String[] args) {
		System.out.println("类变量:" + Variable.allClicks);
		System.out.println("类变量：" + allClicks);
		Variable var = new Variable();
		System.out.println("实例变量：" + var.str );
		var.method();
	}

}
