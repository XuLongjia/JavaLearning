//java的循环结构： while循环、do while 循环、for 循环
// 对于 while 语句而言，如果不满足条件，则不能进入循环。但有时候我们需要即使不满足条件，也至少执行一次。
// do…while 循环和 while 循环相似，不同的是，do…while 循环至少会执行一次。
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
