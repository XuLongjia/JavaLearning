import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


//Java����ʱ��
/*
 *java.util ���ṩ�� Date ������װ��ǰ�����ں�ʱ�䡣 Date ���ṩ�������캯����ʵ���� Date ����
 * ��һ�����캯��ʹ�õ�ǰ���ں�ʱ������ʼ������  Date()
 * �ڶ������캯������һ���������ò����Ǵ�1970��1��1����ĺ������� Date(long millisec)
*/

public class TimeClass {
	public static void main(String[] args) {
		//��ʼ������
		Date date = new Date();
		
		//ʹ�� toString() ������ʾ����ʱ��
		System.out.println("��ӡʱ�䣺" + date.toString());
		
		//ֱ�Ӵ�ӡdate��ͬ�� date.toString()
	    System.out.println(date);
	    
	    //ʹ��printf��ʽ������: ʹ��������ĸ��ʽ������ %t ��ͷ�������������е�һ����ĸ��β�� ��ĸ������c F D r T R
	    System.out.println("");
	    System.out.println("------------��ʽ���ַ�����--------------------------");
	    //c��ʹ��  
	    System.out.printf("ȫ�����ں�ʱ����Ϣ��%tc%n",date);          
	    //f��ʹ��  
	    System.out.printf("��-��-�ո�ʽ��%tF%n",date);  
	    //d��ʹ��  
	    System.out.printf("��/��/���ʽ��%tD%n",date);  
	    //r��ʹ��  
	    System.out.printf("HH:MM:SS PM��ʽ��12ʱ�ƣ���%tr%n",date);  
	    //t��ʹ��  
	    System.out.printf("HH:MM:SS��ʽ��24ʱ�ƣ���%tT%n",date);  
	    //R��ʹ��  
	    System.out.printf("HH:MM��ʽ��24ʱ�ƣ���%tR%n",date);
	    System.out.println("");
		
	    //����ת������
	    //�������ڸ�ʽ��ת��������ʹ����ͨ��ָ����ת�����������ַ�����
	    System.out.println("------------����ת������--------------------------");
	    //b��ʹ�ã��·ݼ��  
        String str=String.format(Locale.US,"Ӣ���·ݼ�ƣ�%tb",date);       
        System.out.println(str);                                                                              
        System.out.printf("�����·ݼ�ƣ�%tb%n",date);  
        //B��ʹ�ã��·�ȫ��  
        str=String.format(Locale.US,"Ӣ���·�ȫ�ƣ�%tB",date);  
        System.out.println(str);  
        System.out.printf("�����·�ȫ�ƣ�%tB%n",date);  
        //a��ʹ�ã����ڼ��  
        str=String.format(Locale.US,"Ӣ�����ڵļ�ƣ�%ta",date);  
        System.out.println(str);  
        //A��ʹ�ã�����ȫ��  
        System.out.printf("�������ڵļ�ƣ�%tA%n",date);  
        //C��ʹ�ã���ǰ��λ  
        System.out.printf("���ǰ��λ���֣�������λǰ�油0����%tC%n",date);  
        //y��ʹ�ã������λ  
        System.out.printf("��ĺ���λ���֣�������λǰ�油0����%ty%n",date);  
        //j��ʹ�ã�һ�������  
        System.out.printf("һ���е�����������ĵڼ��죩��%tj%n",date);  
        //m��ʹ�ã��·�  
        System.out.printf("��λ���ֵ��·ݣ�������λǰ�油0����%tm%n",date);  
        //d��ʹ�ã��գ���λ���������㣩  
        System.out.printf("��λ���ֵ��գ�������λǰ�油0����%td%n",date);  
        //e��ʹ�ã��գ�һλ�����㣩  
        System.out.printf("�·ݵ��գ�ǰ�治��0����%te%n",date);  
	    
        
		//��һ�������ĺ�����
	    System.out.println("");
	    System.out.println("------------��һ�������ĺ�����--------------------------");
		System.out.println("��ӡ���룺" + date.getTime());
		System.out.println("��ӡHash: " + date.hashCode());
		
		//ʹ�� SimpleDateFormat ��ʽ������
		//SimpleDateFormat ��һ�������Ի������еķ�ʽ����ʽ���ͷ������ڵ��ࡣSimpleDateFormat ������ѡ���κ��û��Զ�������ʱ���ʽ�����С����磺
		System.out.println("");
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
		System.out.println("��ǰʱ�䣺" + ft.format(dNow));
		
		
	}
}
