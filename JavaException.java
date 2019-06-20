//Java 异常处理
/*
 * 异常是程序中的一些错误，但并不是所有的错误都是异常，并且错误有时候是可以避免的。
 * 异常发生的原因有很多，通常包含以下几大类：
 * 	用户输入了非法数据。
 * 	要打开的文件不存在。
 * 	网络通信时连接中断，或者JVM内存溢出。
 * 所有的异常类是从 java.lang.Exception 类继承的子类。
 * Exception 类是 Throwable 类的子类。除了Exception类外，Throwable还有一个子类Error 。
 * Java 程序通常不捕获错误。错误一般发生在严重故障时，它们在Java程序处理的范畴之外
 * 异常类有两个主要的子类：IOException 类和 RuntimeException 类。
 * 
 * 使用 try 和 catch 关键字可以捕获异常。try/catch 代码块放在异常可能发生的地方。
 * try/catch代码块中的代码称为保护代码，使用 try/catch 的语法如下
 * 
 * */
public class JavaException {
	public static void main(String[] args) {
		JavaException test = new JavaException();
		test.demo2();
		test.demo1();
	}
	void demo1() {
		try {
			int a[] = new int[2];
			System.out.println("Access element three: " + a[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown:" + e);
		}
		System.out.println("Out of the block");
	}
	/*
	 * 可以在 try 语句后面添加任意数量的 catch 块。
	 * 如果保护代码中发生异常，异常被抛给第一个 catch 块。
	 * 如果抛出异常的数据类型与 ExceptionType1 匹配，它在这里就会被捕获。
	 * 如果不匹配，它会被传递给第二个 catch 块。
	 * 如此，直到异常被捕获或者通过所有的 catch 块。
	 * */
	/*
		try{
			   // 程序代码
			}catch(异常类型1 异常的变量名1){
			  // 程序代码
			}catch(异常类型2 异常的变量名2){
			  // 程序代码
			}catch(异常类型2 异常的变量名2){
			  // 程序代码
			}
	}
	*/
	
	//finally关键字
	//无论是否发生异常，finally 代码块中的代码总会被执行。
	//finally 代码块出现在 catch 代码块最后
	void demo2() {
		int a[] = new int[2];
		try {
			System.out.println("Access element three:" + a[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown:" + e);
		}
		finally {
			a[0] = 6;
			System.out.println("First elemtn value:" + a[0]);
			System.out.println("the finally statement is exceuted");
		}
	}
}

/*
 * 声明自定义异常
 * 在 Java 中你可以自定义异常。编写自己的异常类时需要记住下面的几点。
 * 所有异常都必须是 Throwable 的子类。
 * 如果希望写一个检查性异常类，则需要继承 Exception 类。
 * 如果你想写一个运行时异常类，那么需要继承 RuntimeException 类。
 * class MyException extends Exception{ }
 * */
 