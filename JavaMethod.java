/*
 * ��ǰ�漸���½������Ǿ���ʹ�õ� System.out.println()����ô����ʲô�أ�
 * println() ��һ��������
 * System ��ϵͳ�ࡣ
 * out �Ǳ�׼�������
 * ��仰���÷��ǵ���ϵͳ�� System �еı�׼������� out �еķ��� println()��
 * ��ôʲô�Ƿ����أ�
 * Java���������ļ��ϣ�������һ��ִ��һ�����ܡ�
 * �����ǽ��һ������Ĳ�����������
 * ������������������
 * �����ڳ����б��������������ط�������
 * ��������������:���������ֵĵ�һ������Ӧ��Сд��ĸ��Ϊ��ͷ������ĵ������ô�д��ĸ��ͷд����ʹ�����ӷ�
 * 
 * */
public class JavaMethod {
	//�ɱ����
	public static void main(String[] args) {
		printMax(23,12,123,2222,2222,44444);
		printMax(new double[] {2,3,4,5,6});
	}
	
	public static void printMax(double... numbers) {
		if (numbers.length == 0) {
			System.out.println("No argument passed");
			return;
		}
		
		double result = numbers[0];
		
		for(int i = 1; i < numbers.length; i++) {
			if (numbers[i] > result) {
				result = numbers[i];
			}
		}
		
		System.out.println("the max value is :" + result );
	}

}
