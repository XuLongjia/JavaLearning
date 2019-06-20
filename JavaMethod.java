/*
 * 在前面几个章节中我们经常使用到 System.out.println()，那么它是什么呢？
 * println() 是一个方法。
 * System 是系统类。
 * out 是标准输出对象。
 * 这句话的用法是调用系统类 System 中的标准输出对象 out 中的方法 println()。
 * 那么什么是方法呢？
 * Java方法是语句的集合，它们在一起执行一个功能。
 * 方法是解决一类问题的步骤的有序组合
 * 方法包含于类或对象中
 * 方法在程序中被创建，在其他地方被引用
 * 方法的命名规则:方法的名字的第一个单词应以小写字母作为开头，后面的单词则用大写字母开头写，不使用连接符
 * 
 * */
public class JavaMethod {
	//可变参数
	public static void main(String[] args) {
		printMax(23,12,123,2222,2222,44444);
		printMax(new double[] {2,3,4,5,6});
	}
	
	public static void printMax(double... numbers) {
		if (numbers.length == 0) {
			System.out.println("No argument passed");
			return;
		}
		
		double result = numbers[0];
		
		for(int i = 1; i < numbers.length; i++) {
			if (numbers[i] > result) {
				result = numbers[i];
			}
		}
		
		System.out.println("the max value is :" + result );
	}

}
