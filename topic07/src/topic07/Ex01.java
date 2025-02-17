package topic07;

public class Ex01 {

	public static void main(String[] args) {
		
		Data01 d01 = new Data01();
		
		//do1執行序
		d01.start();
		
		//t2執行序
		Data02 d02 = new Data02();
		Thread t2 = new Thread(d02);
		t2.start();	
		
		//t (main) 執行序			
		System.out.println("GGG: 資料" + Thread.currentThread() );
		System.out.println("MMM: 科學" + Thread.currentThread() );
		System.out.println("VVV: 中心" + Thread.currentThread() );
		
			
	}
}
