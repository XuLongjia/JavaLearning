/*
 *Java String 类
 * String类有11种构造方法，比如传入一个char数组 等
 * 注意：String类是不可改变的，一旦创建String对象，值就无法改变了
 * 如果要对字符串做很多修改，那么应该选择使用StringBuffer&StringBuilder类
 *
*/
public class StringClass {
	public static void main(String[] args) {
		char[] helloArray = {'r','u','n','o','o','b'};
		String helloString = new String(helloArray); //构造方法1
		System.out.println(helloString);
		String helloString2 = "runoob"; // 构造方法2
		System.out.println(helloString2);
		//String.lenght() 获取字符串长度
		// String.concat()可以将两个字符串拼接到一起，也可以直接用+
		System.out.println("helloString2的字符串长度为：" + helloString.length());
		//String 方法：
		
		
	}

}
