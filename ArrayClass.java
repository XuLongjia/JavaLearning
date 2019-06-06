/*
 * Java 数组
 * Java 语言中提供的数组是用来存储固定大小的同类型元素。
 * 声明数组变量:  dataType[] arrayRefVar;   // 首选的方法
 * 			   ataType arrayRefVar[];  // 效果相同，但不是首选方法
 * 创建数组: arrayRefVar = new dataType[arraySize];
 * 声明和创建数组可以用一条指令来完成：dataType[] arrayRefVar = new dataType[10];
 * 也可以使用这样的方式来创建数组： dataType[] arrayRefVar = {value0,value1,value2...};
 * 多维数组初始化： type[][] typeName = new type[typeLength1][typeLength2]
 * 比如 int[][] a = int[2][3];
 * 
 * */
public class ArrayClass {
	public static void main(String[] args) {
		double[] myList = new double[5];
		myList[0] = 5.6;
		myList[1] = 1.2;
		myList[2] = 2.4;
		myList[3] = 4.5;
		myList[4] = 7.8;
		
		//打印所有元素：
		for(int i = 0; i < myList.length; i++) {
			System.out.println(myList[i]);
		}
		
		//求所有元素的和
		double total = 0;
		for(int i = 0; i<myList.length; i++) {
			total += myList[i];
		}
		System.out.println("total is " + total);
		
		//找最大值
		double max = myList[0];
		for(int i = 1; i < myList.length; i++) {
			if (myList[i] > max) {
				max = myList[i];
			}
		}
		System.out.println("max is " + max);
		
		//使用For-each循环来打印所有元素
		for(double element : myList) {
			System.out.println(element);
		}
		
		//创建一个二维数组，而且第二维不同
		String[][] s = new String[2][];
		s[0] = new String[2];
		s[1] = new String[3];
		s[0][0] = new String("good");
		s[0][1] = new String("luck");
		s[1][0] = new String("to");
		s[1][1] = new String("you");
		s[1][2] = new String("!");
		
		for (String sele:s[1]) {
			System.out.println(sele);
		}
	}
}
/*
 * Arrays类：
 * java.util.Arrays类能方便地操作数组，他提供的所有方法都是静态的
 * 具有以下功能：
 * 	给数组赋值：通过fill方法
 * 	给数组排序：通过sort方法，默认升序
 * 	比较数组：通过equals方法比较数组中元素值是否相同
 * 	查找数组元素：通过binarySearch方法能够对排序号的数组进行二分查找法操作。
 * */
