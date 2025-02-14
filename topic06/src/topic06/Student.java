package topic06;

interface ITemp {
	void test();
}

public class Student {

	Birthday b = new Birthday();
	int year = b.getYear();
	int month = b.getMonth();
	int day = b.getDay();
	
	void print() {
		System.out.println("birth year:  " + year + "/" + month + "/" + day);
	}
	
	void print(ITemp it) {
		it.test();
	}
	class Birthday {
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public int getMonth() {
			return month;
		}
		public void setMonth(int month) {
			this.month = month;
		}
		public int getDay() {
			return day;
		}
		public void setDay(int day) {
			this.day = day;
		}
		int year, month, day;
	}
}
