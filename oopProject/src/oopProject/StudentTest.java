package oopProject;

public class StudentTest {
	public static void main(String[] args) {
		// 創建Student類別的對象
		Student st1 = new Student();
		st1.name = "Kitty";
		st1.height = 1.8;
		//System.out.println(st1.name);
		st1.study();
		st1.sleep();
	}
}
