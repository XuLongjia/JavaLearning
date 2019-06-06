// 自动类型转换
//整型、实型、字符型数据可以混合运算。运算中，不同类型的数据先转化为同一类型，然后进行运算。
//转换从低级到高级
// byte,short,char → int → long → float → double
/*
 * 数据类型转换必须满足如下规则：
 * 1、不能对boolearn类型进行类型转换
 * 2、不能把对象类型转换成不相关类的对象
 * 3、在把容量大的类型转化为容量小的类型时，必须使用强制类型转换
 * 4、转换过程中可能导致溢出或损失精度
 * 5、浮点数到整数的转换是通过舍弃小数得到，而不是四舍五入
 * */
/**
 * @author a6752
 *
 */
public class ZiDongLeiZhuan {
	public static void main(String[] args)  {
		char c1 = 'a'; //定义一个char类型
		int i1 = c1; //char自动转换成为int类型
		System.out.println("char自动类型转换为int后的值等于" + i1);
		char c2 = 'A';
		int i2 = c2;
		System.out.println("A转换为int类型是：" + i2);
		int i3 = c2+1;
		System.out.println("char类型和int类型计算后的值等于" + i3);
	}

}
