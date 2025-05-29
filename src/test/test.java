package test;

public class test {

	public static void main(String[] args) {
		int integer;
		integer = 2;
		
		/* integer = 3.2; 暗黙の型変換が出来ないのでエラーになる
		 double　OR　floatにする　よく間違える
		 * */
		
		System.out.println(integer);
		//３aaa
		System.out.println(1+2+"aaa");
		//aaa12
		System.out.println("aaa"+1+2);
	}

}
