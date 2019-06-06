//位运算符：& | ~ ^ << >> >>>
//Java定义了位运算符，应用于整数类型(int)，长整型(long)，短整型(short)，字符型(char)，和字节型(byte)等类型。
//位运算符作用在所有的位上，并且按位运算。假设a = 60，b = 13;它们的二进制格式表示将如下：
/*
A = 0011 1100
B = 0000 1101
A & B = 0000 1100   	#and，都是1才是1，否则为0
A | B = 0011 1101  		#or,有一个1就是1，否则为0
A ^ B = 0011 0001 		#异或，同位为0，不同位位1
~ A = 1100 0011 		#否，每位都反转
*/

// 按位左移运算符。 A << 2 得到240,即 1111 0000
// 按位右移运算符。 A >> 2 得到15,即 1111
// 按位右移补零操作符。 A >>> 2 得到15,即0000 1111

public class ByteOperator {
	public static void main(String[] args) {
		int a = 60; /* 60 = 0011 1100 */ 
		int b = 13; /* 13 = 0000 1101 */
		int c = 0;
		c = a & b;  /* 12 = 0000 1100 */
		System.out.println("a & b = " + c);
		
		c = a | b;       /* 61 = 0011 1101 */
	    System.out.println("a | b = " + c );
	 
	    c = a ^ b;       /* 49 = 0011 0001 */
	    System.out.println("a ^ b = " + c );
	 
	    c = ~a;          /*-61 = 1100 0011 */
	    System.out.println("~a = " + c );
	    
	    c = a << 2;     /* 240 = 1111 0000 */
	    System.out.println("a << 2 = " + c );
	 
	    c = a >> 2;     /* 15 = 1111 */
	    System.out.println("a >> 2  = " + c );
	  
	    c = a >>> 2;     /* 15 = 0000 1111 */
	    System.out.println("a >>> 2 = " + c );
	    
	    boolean d = true;
	    boolean e = false;
	    System.out.println("d && e = " + (d&&e));
	    System.out.println("d || e = " + (d||e) );
	    System.out.println("!(d && e) = " + !(d && e));
	}
}

/*
 逻辑运算符
&& 逻辑与运算符。当且仅当两个操作数都为真，条件才为真。
|| 逻辑或操作符。如果任何两个操作数任何一个为真，条件为真。
！ 逻辑非运算符。用来反转操作数的逻辑状态。
 */
