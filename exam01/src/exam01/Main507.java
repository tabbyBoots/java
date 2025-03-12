package exam01;

public class Main507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JPA507 停車費用計算
		//(1) 請用陣列方式寫出停車費用計算的程式。
		//(2) 假設停車時段分為：
//		    a. 2 小時以內 (含 2 小時)，每小時以 30 元計算。
//		    b. 2 小時以上不足 4 小時，每小時以 50 元計算。
//		    c. 4 小時以上不足 6 小時，每小時以 80 元計算。
//		    d. 6 小時以上，每小時以 100 元計算。
		//(3) 請輸入停車時數並計算出停車費用，分別計算 2 小時、3 小時、5 小時及 8 小時的應繳費用，顯示如執行結果參考畫面。
		//-------------------------------------------------------------------------------------------------
		// 停車時數：2小時
		// 應繳費用：60元整
		// --------------------
		// 停車時數：3小時
		// 應繳費用：110元整
		// --------------------
		// 停車時數：5小時
		// 應繳費用：240元整
		// --------------------
		// 停車時數：8小時
		// 應繳費用：520元整
		System.out.println("--------------------");
		dispParkingFee(2);
		dispParkingFee(3);
		dispParkingFee(5);
		dispParkingFee(8);
	}
	
	static void dispParkingFee(int hrs) {
		
		int rate = 30;
		int ttlCost = 0;
		
		if( hrs > 2 && hrs < 4 ) {
			rate = 50;
		}else if( hrs >= 4 && hrs < 6 ) {
			rate = 80;
		}else if( hrs >= 6 ) {
			rate = 100;
		}
		ttlCost = hrs * rate;
		
		System.out.printf("停車時數：%d小時%n", hrs);
		System.out.printf("應繳費用：%d元整%n", ttlCost);
		System.out.println("--------------------");
	}

}
