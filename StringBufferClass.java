/*
 * Java StringBuffer���StringBuilder��
 * �����ַ��������޸�ʱ����Ҫʹ��StringBuffer���StringBuilder��
 * ��String�಻ͬ��StringBuffer��StringBuilder��Ķ����ܹ�����ε��޸ģ����Ҳ������µ�δʹ�ö���
 * ���߲�ͬ��StringBuilder�ķ��������̰߳�ȫ�ģ�������ͬ������
 * ����StringBuilder���ٶ����ƣ���Ҫ���̰߳�ȫ��ʱ��һ�㶼ʹ��StringBuilder
 * */
public class StringBufferClass {
	public static void main(String[] args) {
		StringBuffer sBuffer = new StringBuffer("����̳̹�����");
		sBuffer.append("www");
		sBuffer.append(".runoob");
		sBuffer.append(".com");
		System.out.println(sBuffer);
	}

}

//StringBuffer֧�ֵķ����� www.runoob.com/java/java-stringbuffer.html
//������append() reverse() delete() insert() replace() capacity()
// charAt() ensureCapacity() getChars() indexOf() indexOf() lastIndexOf() length()
