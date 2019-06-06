/*
 * 一般地，当需要使用数字的时候，我们通常使用内置数据类型，如：byte、int、long、double 等。
 * 然而，在实际开发过程中，我们经常会遇到需要使用对象，而不是内置数据类型的情形。为了解决这个问题，Java 语言为每一个内置数据类型提供了对应的包装类。
 * 所有的包装类（Integer、Long、Byte、Double、Float、Short）都是抽象类 Number 的子类。
 * 这种由编译器特别支持的包装称为装箱，所以当内置数据类型被当作对象使用的时候，编译器会把内置类型装箱为包装类。
 * 相似的，编译器也可以把一个对象拆箱为内置类型。Number 类属于 java.lang 包。
 */

public class NumberMath {
	public static void main(String[] args) {
		Integer x = 5;  //当 x 被赋为整型值时，由于x是一个对象，所以编译器要对x进行装箱
		x = x + 10;  //为了使x能进行加运算，所以要对x进行拆箱。
		System.out.println(x);
		
		System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));  
        System.out.println("0度的余弦值：" + Math.cos(0));  
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));  
        System.out.println("1的反正切值： " + Math.atan(1));  
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));  
        System.out.println(Math.PI);  
        System.out.print("\n");
        
        double[] nums = { 1.4, 1.5, 1.6, -1.4, -1.5, -1.6 };   
        for (double num : nums) {   
          test(num);
          System.out.print("\n");
        }                
	}
	
	private static void test(double num) {   
	    System.out.println("Math.floor(" + num + ")=" + Math.floor(num));  //返回小于等于（<=）给定参数的最大整数 。
	    System.out.println("Math.round(" + num + ")=" + Math.round(num));  //它表示四舍五入，算法为 Math.floor(x+0.5)，即将原来的数字加上 0.5 后再向下取整
	    System.out.println("Math.ceil(" + num + ")=" + Math.ceil(num));    //返回大于等于( >= )给定参数的的最小整数，类型为双精度浮点型。
	}  

}
