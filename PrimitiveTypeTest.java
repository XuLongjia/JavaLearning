/*Java������������
 * byte 8λ  ���磺byte a = 100��  
 * short 16λ ���磺short s = 1000;
 * int 32λ ���磺int a = 1000000;
 * long 64λ ���� long a = 100000L;
 * float 32λ IEEE 754��׼ ���� float f1 = 324.1f;
 * double 64 IEE 754��׼ ���� double d1 = 123.4;
 * boolean 1λ ���� char letter = 'A';
 * char 16λ Unicode�ַ� ���� char letter = 'A';
 * */
public class PrimitiveTypeTest {
    static  boolean bool;
    static byte by;
    static char ch;
    static double d;
    static float f;
    static int i;
    static long l;
    static short sh;
    static String str;
    
	public static void main(String[] args) {
		// byte  
        System.out.println("�������ͣ�byte ������λ����" + Byte.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Byte");  
        System.out.println("��Сֵ��Byte.MIN_VALUE=" + Byte.MIN_VALUE);  
        System.out.println("���ֵ��Byte.MAX_VALUE=" + Byte.MAX_VALUE);  
        System.out.println();  
  
        // short  
        System.out.println("�������ͣ�short ������λ����" + Short.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Short");  
        System.out.println("��Сֵ��Short.MIN_VALUE=" + Short.MIN_VALUE);  
        System.out.println("���ֵ��Short.MAX_VALUE=" + Short.MAX_VALUE);  
        System.out.println();  
  
        // int  
        System.out.println("�������ͣ�int ������λ����" + Integer.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Integer");  
        System.out.println("��Сֵ��Integer.MIN_VALUE=" + Integer.MIN_VALUE);  
        System.out.println("���ֵ��Integer.MAX_VALUE=" + Integer.MAX_VALUE);  
        System.out.println();  
  
        // long  
        System.out.println("�������ͣ�long ������λ����" + Long.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Long");  
        System.out.println("��Сֵ��Long.MIN_VALUE=" + Long.MIN_VALUE);  
        System.out.println("���ֵ��Long.MAX_VALUE=" + Long.MAX_VALUE);  
        System.out.println();  
  
        // float  
        System.out.println("�������ͣ�float ������λ����" + Float.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Float");  
        System.out.println("��Сֵ��Float.MIN_VALUE=" + Float.MIN_VALUE);  
        System.out.println("���ֵ��Float.MAX_VALUE=" + Float.MAX_VALUE);  
        System.out.println();  
  
        // double  
        System.out.println("�������ͣ�double ������λ����" + Double.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Double");  
        System.out.println("��Сֵ��Double.MIN_VALUE=" + Double.MIN_VALUE);  
        System.out.println("���ֵ��Double.MAX_VALUE=" + Double.MAX_VALUE);  
        System.out.println();  
  
        // char  
        System.out.println("�������ͣ�char ������λ����" + Character.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Character");  
        // ����ֵ��ʽ�������ַ���ʽ��Character.MIN_VALUE���������̨  
        System.out.println("��Сֵ��Character.MIN_VALUE="  
                + (int) Character.MIN_VALUE);  
        // ����ֵ��ʽ�������ַ���ʽ��Character.MAX_VALUE���������̨  
        System.out.println("���ֵ��Character.MAX_VALUE="  
                + (int) Character.MAX_VALUE);  
        
        //�������һ��ÿ���������͵�Ĭ��ֵ
        System.out.println();
        System.out.println("Bool:" + bool);
        System.out.println("Byte:" + by);
        System.out.println("Character:" + ch);
        System.out.println("Double :" + d);
        System.out.println("Float :" + f);
        System.out.println("Integer :" + i);
        System.out.println("Long :" + l);
        System.out.println("Short :" + sh);
        System.out.println("String :" + str);

        
	}
}

//Float��Double����Сֵ�����ֵ�����Կ�ѧ����������ʽ�����
//����3.14E3����3.14 �� 103 =3140��3.14E-3 ���� 3.14 x 10-3 =0.00314

//Java����
//��Java��ʹ��final�ؼ��������γ�����������ʽ�ͱ������ƣ�
// final double PI = 3.1415926

// byte��int��long����short��������ʮ���ơ�16�����Լ�8���Ƶķ�ʽ����ʾ��
// int decimal = 100;
// int otcal = 0144;
// int hexa = 0x64;
