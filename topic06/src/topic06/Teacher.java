package topic06;

public class Teacher {
	String name;
	int rate;
	int totalHours;
		
	//建構子
	public Teacher(String name, int rate, int totalHours) {
		super();
		this.name = name;
		this.rate = rate;
		this.totalHours = totalHours;
	}
	//方法
	double salary() {
		return 0;
	}
}

//介面1-Tax
interface Tax{
	double appliedRate = 0.3;	//介面的資料為 Final，所以必須給初始值，然後就不會變動了
	double calcTax();			//介面中的方法僅提供名稱，實際功能要在實際使用的類別中寫	
}

//介面2-Dummy-可做為身分識別用
interface Dummy{}

class FullTime extends Teacher implements Tax, Dummy{ //介面要加 [implements] 才能用，還需要選取 Source->Overrite/implements methods
	
	
//	Dummy = (Dummy)FullTime{}
	
	@Override // implement interface Tax
	public double calcTax() {
		// TODO Auto-generated method stub		
		return salary() * appliedRate;
	}
	
	public FullTime(String name, int rate, int totalHours) {
		super(name, rate, totalHours);
		// TODO Auto-generated constructor stub
	}

	@Override
	double salary() {
		// TODO Auto-generated method stub
		return 9 * rate + (totalHours-9) * rate * 0.8;
	}	
}

class Time extends Teacher{

	public Time(String name, int rate, int totalHours) {
		super(name, rate, totalHours);
		// TODO Auto-generated constructor stub
	}

	@Override
	double salary() {
		// TODO Auto-generated method stub
		return totalHours*rate;
	}
	
	double calcTax() {		
		return salary() * 0.1;
	}
}