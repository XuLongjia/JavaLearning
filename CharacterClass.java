/*
 *Java Character ��
 *Character �����ڶԵ����ַ����в�����
 *Character ���ڶ����а�װһ���������� char ��ֵ 
 *char ch = 'a';    char[] charArray ={ 'a', 'b', 'c', 'd', 'e' };
 *ʵ�ʿ��������У����Ǿ�����������Ҫʹ�ö��󣬶����������������͵������
 *Ϊ�˽��������⣬Java����Ϊ������������char�ṩ�˰�װ��Character�ࡣ
 *Character ch = new Character('a');
 *��ĳЩ����£�Java���������Զ�����һ��Character����
 *���磬��һ��char���͵Ĳ������ݸ���Ҫһ��Character���Ͳ����ķ���ʱ����ô���������Զ��ؽ�char���Ͳ���ת��ΪCharacter���� ����������Ϊװ�䣬��������Ϊ���䡣
 *
 */
public class CharacterClass {
	public static void main(String[] args) {
		char a = 'A';
		char b = '1';
		char c = '\n';
		char d = 'D';
		char e = 'e';
		char f = 'f';
		char g = 'G';
		char h = 'h';
		System.out.println(Character.isLetter(a));
		System.out.println(Character.isDigit(b));
		System.out.println(Character.isWhitespace(c));
		System.out.println(Character.isUpperCase(d));
		System.out.println(Character.isLowerCase(e));
		System.out.println(Character.toUpperCase(f));
		System.out.println(Character.toLowerCase(g));
		System.out.println(Character.toString(h));		
	}
}
