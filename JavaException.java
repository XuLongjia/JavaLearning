//Java �쳣����
/*
 * �쳣�ǳ����е�һЩ���󣬵����������еĴ������쳣�����Ҵ�����ʱ���ǿ��Ա���ġ�
 * �쳣������ԭ���кܶ࣬ͨ���������¼����ࣺ
 * 	�û������˷Ƿ����ݡ�
 * 	Ҫ�򿪵��ļ������ڡ�
 * 	����ͨ��ʱ�����жϣ�����JVM�ڴ������
 * ���е��쳣���Ǵ� java.lang.Exception ��̳е����ࡣ
 * Exception ���� Throwable ������ࡣ����Exception���⣬Throwable����һ������Error ��
 * Java ����ͨ����������󡣴���һ�㷢�������ع���ʱ��������Java������ķ���֮��
 * �쳣����������Ҫ�����ࣺIOException ��� RuntimeException �ࡣ
 * 
 * ʹ�� try �� catch �ؼ��ֿ��Բ����쳣��try/catch ���������쳣���ܷ����ĵط���
 * try/catch������еĴ����Ϊ�������룬ʹ�� try/catch ���﷨����
 * 
 * */
public class JavaException {
	public static void main(String[] args) {
		JavaException test = new JavaException();
		test.demo2();
		test.demo1();
	}
	void demo1() {
		try {
			int a[] = new int[2];
			System.out.println("Access element three: " + a[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown:" + e);
		}
		System.out.println("Out of the block");
	}
	/*
	 * ������ try ������������������� catch �顣
	 * ������������з����쳣���쳣���׸���һ�� catch �顣
	 * ����׳��쳣������������ ExceptionType1 ƥ�䣬��������ͻᱻ����
	 * �����ƥ�䣬���ᱻ���ݸ��ڶ��� catch �顣
	 * ��ˣ�ֱ���쳣���������ͨ�����е� catch �顣
	 * */
	/*
		try{
			   // �������
			}catch(�쳣����1 �쳣�ı�����1){
			  // �������
			}catch(�쳣����2 �쳣�ı�����2){
			  // �������
			}catch(�쳣����2 �쳣�ı�����2){
			  // �������
			}
	}
	*/
	
	//finally�ؼ���
	//�����Ƿ����쳣��finally ������еĴ����ܻᱻִ�С�
	//finally ���������� catch ��������
	void demo2() {
		int a[] = new int[2];
		try {
			System.out.println("Access element three:" + a[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown:" + e);
		}
		finally {
			a[0] = 6;
			System.out.println("First elemtn value:" + a[0]);
			System.out.println("the finally statement is exceuted");
		}
	}
}

/*
 * �����Զ����쳣
 * �� Java ��������Զ����쳣����д�Լ����쳣��ʱ��Ҫ��ס����ļ��㡣
 * �����쳣�������� Throwable �����ࡣ
 * ���ϣ��дһ��������쳣�࣬����Ҫ�̳� Exception �ࡣ
 * �������дһ������ʱ�쳣�࣬��ô��Ҫ�̳� RuntimeException �ࡣ
 * class MyException extends Exception{ }
 * */
 