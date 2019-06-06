/*
 * һ��أ�����Ҫʹ�����ֵ�ʱ������ͨ��ʹ�������������ͣ��磺byte��int��long��double �ȡ�
 * Ȼ������ʵ�ʿ��������У����Ǿ�����������Ҫʹ�ö��󣬶����������������͵����Ρ�Ϊ�˽��������⣬Java ����Ϊÿһ���������������ṩ�˶�Ӧ�İ�װ�ࡣ
 * ���еİ�װ�ࣨInteger��Long��Byte��Double��Float��Short�����ǳ����� Number �����ࡣ
 * �����ɱ������ر�֧�ֵİ�װ��Ϊװ�䣬���Ե������������ͱ���������ʹ�õ�ʱ�򣬱����������������װ��Ϊ��װ�ࡣ
 * ���Ƶģ�������Ҳ���԰�һ���������Ϊ�������͡�Number ������ java.lang ����
 */

public class NumberMath {
	public static void main(String[] args) {
		Integer x = 5;  //�� x ����Ϊ����ֵʱ������x��һ���������Ա�����Ҫ��x����װ��
		x = x + 10;  //Ϊ��ʹx�ܽ��м����㣬����Ҫ��x���в��䡣
		System.out.println(x);
		
		System.out.println("90 �ȵ�����ֵ��" + Math.sin(Math.PI/2));  
        System.out.println("0�ȵ�����ֵ��" + Math.cos(0));  
        System.out.println("60�ȵ�����ֵ��" + Math.tan(Math.PI/3));  
        System.out.println("1�ķ�����ֵ�� " + Math.atan(1));  
        System.out.println("��/2�ĽǶ�ֵ��" + Math.toDegrees(Math.PI/2));  
        System.out.println(Math.PI);  
        System.out.print("\n");
        
        double[] nums = { 1.4, 1.5, 1.6, -1.4, -1.5, -1.6 };   
        for (double num : nums) {   
          test(num);
          System.out.print("\n");
        }                
	}
	
	private static void test(double num) {   
	    System.out.println("Math.floor(" + num + ")=" + Math.floor(num));  //����С�ڵ��ڣ�<=������������������� ��
	    System.out.println("Math.round(" + num + ")=" + Math.round(num));  //����ʾ�������룬�㷨Ϊ Math.floor(x+0.5)������ԭ�������ּ��� 0.5 ��������ȡ��
	    System.out.println("Math.ceil(" + num + ")=" + Math.ceil(num));    //���ش��ڵ���( >= )���������ĵ���С����������Ϊ˫���ȸ����͡�
	}  

}
