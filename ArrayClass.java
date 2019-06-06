/*
 * Java ����
 * Java �������ṩ�������������洢�̶���С��ͬ����Ԫ�ء�
 * �����������:  dataType[] arrayRefVar;   // ��ѡ�ķ���
 * 			   ataType arrayRefVar[];  // Ч����ͬ����������ѡ����
 * ��������: arrayRefVar = new dataType[arraySize];
 * �����ʹ������������һ��ָ������ɣ�dataType[] arrayRefVar = new dataType[10];
 * Ҳ����ʹ�������ķ�ʽ���������飺 dataType[] arrayRefVar = {value0,value1,value2...};
 * ��ά�����ʼ���� type[][] typeName = new type[typeLength1][typeLength2]
 * ���� int[][] a = int[2][3];
 * 
 * */
public class ArrayClass {
	public static void main(String[] args) {
		double[] myList = new double[5];
		myList[0] = 5.6;
		myList[1] = 1.2;
		myList[2] = 2.4;
		myList[3] = 4.5;
		myList[4] = 7.8;
		
		//��ӡ����Ԫ�أ�
		for(int i = 0; i < myList.length; i++) {
			System.out.println(myList[i]);
		}
		
		//������Ԫ�صĺ�
		double total = 0;
		for(int i = 0; i<myList.length; i++) {
			total += myList[i];
		}
		System.out.println("total is " + total);
		
		//�����ֵ
		double max = myList[0];
		for(int i = 1; i < myList.length; i++) {
			if (myList[i] > max) {
				max = myList[i];
			}
		}
		System.out.println("max is " + max);
		
		//ʹ��For-eachѭ������ӡ����Ԫ��
		for(double element : myList) {
			System.out.println(element);
		}
		
		//����һ����ά���飬���ҵڶ�ά��ͬ
		String[][] s = new String[2][];
		s[0] = new String[2];
		s[1] = new String[3];
		s[0][0] = new String("good");
		s[0][1] = new String("luck");
		s[1][0] = new String("to");
		s[1][1] = new String("you");
		s[1][2] = new String("!");
		
		for (String sele:s[1]) {
			System.out.println(sele);
		}
	}
}
/*
 * Arrays�ࣺ
 * java.util.Arrays���ܷ���ز������飬���ṩ�����з������Ǿ�̬��
 * �������¹��ܣ�
 * 	�����鸳ֵ��ͨ��fill����
 * 	����������ͨ��sort������Ĭ������
 * 	�Ƚ����飺ͨ��equals�����Ƚ�������Ԫ��ֵ�Ƿ���ͬ
 * 	��������Ԫ�أ�ͨ��binarySearch�����ܹ�������ŵ�������ж��ֲ��ҷ�������
 * */
