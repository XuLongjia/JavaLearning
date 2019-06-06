//强制类型转换
public class QiangZhiZhuanHuan {
	public static void main(String[] args) {
		int i1 = 123;
		byte b = (byte)i1;
		System.out.println("int强制类型转换为byte后的值等于" + b);
		
	}
}

// 隐含强制类型转换
// 1、整数的默认类型是int
// 2、浮点型不存在这种情况，因为在定义float类型是必须在数字后面跟上F 或者f
