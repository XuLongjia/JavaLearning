//java��ѭ���ṹ�� whileѭ����do while ѭ����for ѭ��
// ���� while �����ԣ�������������������ܽ���ѭ��������ʱ��������Ҫ��ʹ������������Ҳ����ִ��һ�Ρ�
// do��while ѭ���� while ѭ�����ƣ���ͬ���ǣ�do��while ѭ�����ٻ�ִ��һ�Ρ�
public class Cycle {
	public static void main(String[] args) {
		int x = 10;
		while( x < 15) {
			System.out.println("value of x:" + x);
			x++;
		}
		
		System.out.print("\n");
		int y = 10;
		do {
			System.out.println("value of y:" + y);
			y++;
		} while (y < 20);
		
		System.out.print("\n");
		for(int z = 10; z <20; z+=1) {
			System.out.println("value of z:" + z);
		}
		
		int [] numbers = {10, 20, 30, 40, 50};
	    for(int a : numbers ){
	         System.out.print( a );
	         System.out.print(",");
	    }
	    System.out.print("\n");
	    
	    String [] names ={"James", "Larry", "Tom", "Lacy"};
	    for( String name : names ) {
	         System.out.print( name );
	         System.out.print(",");
	    }		
	}
}
