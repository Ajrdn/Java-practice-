package string;

public class StringTest2 {

	public static void main(String[] args) {
		
		String str1 = new String("java");
		String str2 = new String("android");
		
		System.out.println(System.identityHashCode(str1));
		str1 = str1.concat(str2);
		System.out.println(System.identityHashCode(str1));

	}

}
