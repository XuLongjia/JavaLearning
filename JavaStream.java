import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Java ��(Stream)���ļ�(File)��IO
 * Java.io ���������������в������롢�����Ҫ���ࡣ������Щ�������������Դ�����Ŀ�ꡣ
 * Java.io ���е���֧�ֺܶ��ָ�ʽ�����磺�������͡����󡢱��ػ��ַ����ȵȡ�
 * һ�����������Ϊһ�����ݵ����С���������ʾ��һ��Դ��ȡ���ݣ��������ʾ��һ��Ŀ��д���ݡ�
 * Java Ϊ I/O �ṩ��ǿ��Ķ�����֧�֣�ʹ����㷺��Ӧ�õ��ļ�������������С�
 * ��ȡ����̨���룺
 * Java �Ŀ���̨������ System.in ��ɡ�
 * Ϊ�˻��һ���󶨵�����̨���ַ���������԰� System.in ��װ��һ�� BufferedReader ������������һ���ַ�����
 * �����Ǵ��� BufferedReader �Ļ����﷨��
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * BufferedReader ���󴴽������Ǳ����ʹ�� read() �����ӿ���̨��ȡһ���ַ��������� readLine() ������ȡһ���ַ�����
 * 
 * �ӿ���̨��ȡ���ַ�����
 * �� BufferedReader �����ȡһ���ַ�Ҫʹ�� read() �����������﷨���£�int read( ) throws IOException
 * ÿ�ε��� read() ������������������ȡһ���ַ����Ѹ��ַ���Ϊ����ֵ���ء� ����������ʱ�򷵻� -1���÷����׳� IOException��
 * 
 * �ӿ���̨��ȡ�ַ���
 * �ӱ�׼�����ȡһ���ַ�����Ҫʹ�� BufferedReader �� readLine() ������
 * ����һ���ʽ�ǣ�
 * String readLine( ) throws IOException
 * 
 * */
public class JavaStream {
	public static void main(String[] args) throws IOException {
		//bRead();
		bReadLines();
		
	}
	//����ĳ���ʾ������ read() �����ӿ���̨���϶�ȡ�ַ�ֱ���û����� "q"��
	public static void bRead() throws IOException{
		char c;
		//ʹ��System.in ����BufferReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�����ַ������¡�q'���˳���");
		//��ȡ�ַ�
		do {
			c = (char) br.read();   //intת����char
			System.out.println(c);
			
		} while (c != 'q');
		
	}
	
	//����ĳ����ȡ����ʾ�ַ���ֱ���������˵���"end"��
	public static void bReadLines() throws IOException {
		// ʹ�� System.in ���� BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));		
	}

}
