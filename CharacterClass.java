/*
 *Java Character 类
 *Character 类用于对单个字符进行操作。
 *Character 类在对象中包装一个基本类型 char 的值 
 *char ch = 'a';    char[] charArray ={ 'a', 'b', 'c', 'd', 'e' };
 *实际开发过程中，我们经常会遇到需要使用对象，而不是内置数据类型的情况。
 *为了解决这个问题，Java语言为内置数据类型char提供了包装类Character类。
 *Character ch = new Character('a');
 *在某些情况下，Java编译器会自动创建一个Character对象
 *例如，将一个char类型的参数传递给需要一个Character类型参数的方法时，那么编译器会自动地将char类型参数转换为Character对象。 这种特征称为装箱，反过来称为拆箱。
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
