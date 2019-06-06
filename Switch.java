//Java switch case 语句
//如果不加break语句，只要有一个满足条件，进入case后面的语句后，全部都输出


public class Switch {
	public static void main(String[] args) {
		int i = 1;
		switch(i) {
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("default");
		}
	}

}
