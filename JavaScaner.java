/*
 * Java Scanner 类
 * java.util.Scanner 是 Java5 的新特征，我们可以通过 Scanner 类来获取用户的输入。
 * 下面是创建 Scanner 对象的基本语法：Scanner s = new Scanner(System.in);
 * 接下来我们演示一个最简单的数据输入，并通过 Scanner 类的 next() 与 nextLine() 方法获取输入的字符串，
 * 			在读取前我们一般需要 使用 hasNext 与 hasNextLine 判断是否还有输入的数据：
 * 
 * 
 * */
import java.util.Scanner;

public class JavaScaner {
	public static void main(String[] args) {
		//scanerDemo();
		//scanerDemo2();
		scannerAverage();
	}
	
	public static void scanerDemo() {
		Scanner scan = new Scanner(System.in);
		//从键盘接收数据
		
		//next的方式接收字符串
		System.out.println("next方式接收：");
		//判断是否还有输入
		if (scan.hasNext()) {
			String str1 = scan.next();
			System.out.println("输入的数据为：" + str1);
		}
		scan.close();
	}
	
	public static void scanerDemo2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("nextline方式接收：");
		if(scan.hasNextLine()) {
			String str2 = scan.nextLine();
			System.out.println("输入的数据为：" + str2);
		}
		scan.close();
	}
	
	//以下方法我们可以输入多个数字，并求其总和与平均数，每输入一个数字用回车确认，通过输入非数字来结束输入并输出执行结果：
	public static void scannerAverage() {
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		int m = 0;
		while (scan.hasNextDouble()) {  //最后需要输入一个end作为结束符
			double x = scan.nextDouble();
			m +=1;
			sum +=x;
		}
		System.out.println(m + "个数的和为" + sum);
		System.out.println(m + "个数的平均值是" + (sum / m));
		scan.close();
		
	}

}
