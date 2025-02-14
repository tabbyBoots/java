package topic06;

public class Ex07_inner_class {

	public static void main(String[] args) {
		
		//這裡如果inner class設定private後，就不能用了
		Student s01 = new Student();
		
		//具名寫法
		Student.Birthday sb01 = s01.new Birthday(); 
		
		//匿名寫法		
		Student.Birthday sb02 = new Student().new Birthday();
		sb01.setYear(1991);
		//(new Student()).print();//
		
		s01.print();
		s01.print( new ITemp() {			
			@Override
			public void test() {
				System.out.println("interface:AAA");
			}
		} );
		s01.print( new ITemp() {			
			@Override
			public void test() {
				System.out.println("interface:BBB");				
			}
		});
		
		System.out.println("END");
	}

}
