package topic06;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " 字串的操作ABc，\t\t字串方法的使用";
		String findStr = "串";
		
		System.out.println("01234567890123456789012345678");
		System.out.println("用用用用用用用用用用用用用用用用");
		System.out.println(str);
		
		System.out.println("要找的字是：" + findStr );
		System.out.println("第三個字是：" + str.charAt(2));
		System.out.println("字串的位置：" + str.indexOf(findStr));
		System.out.println("字最後位置：" + str.lastIndexOf(findStr));
		System.out.println( findStr + findStr.concat("_AAA_") );
		System.out.println( "length:\t\t" + findStr.length() );
		System.out.println( "lengthTrim:\t" + findStr.trim().length() );
	}
}
