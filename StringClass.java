/*
 *Java String ��
 * String����11�ֹ��췽�������紫��һ��char���� ��
 * ע�⣺String���ǲ��ɸı�ģ�һ������String����ֵ���޷��ı���
 * ���Ҫ���ַ������ܶ��޸ģ���ôӦ��ѡ��ʹ��StringBuffer&StringBuilder��
 *
*/
public class StringClass {
	public static void main(String[] args) {
		char[] helloArray = {'r','u','n','o','o','b'};
		String helloString = new String(helloArray); //���췽��1
		System.out.println(helloString);
		String helloString2 = "runoob"; // ���췽��2
		System.out.println(helloString2);
		//String.lenght() ��ȡ�ַ�������
		// String.concat()���Խ������ַ���ƴ�ӵ�һ��Ҳ����ֱ����+
		System.out.println("helloString2���ַ�������Ϊ��" + helloString.length());
		//String ������
		
		
	}

}
