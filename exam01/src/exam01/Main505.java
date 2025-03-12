package exam01;

public class Main505 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JPA505 反轉陣列
		//(1) 程式內有一陣列 {“A”, “B”, “C”, “D”, “E”, “F”, “G”, “H”, I”, “J”}。
		//(2) 請用陣列方式寫出反轉陣列的程式，顯示 {“J”, “I”, “H”, “G”, “F”, “E”, “D”, “C”, “B”, “A”}。
		//(3) 顯示如執行結果參考畫面。
		//-----------------------------------------------------------------------------------------
		// 反轉陣列資料之前： A B C D E F G H I J 
		// 反轉陣列資料之後： J I H G F E D C B A
		
		String[] orgAry = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
		String[] newAry = new String[10];
		
		for(int i = 0; i < 10;i++) {
			newAry[i] = orgAry[9-i];
		}		
		
		System.out.print("反轉陣列資料之前： ");
		for(int i =0; i<10; i++) {
			System.out.printf(orgAry[i] + " ");
		}
		System.out.println();
		System.out.print("反轉陣列資料之後： ");
		for(int i =0; i<10; i++) {
			System.out.printf(newAry[i] + " ");
		}
		System.out.println();		
		
	}

}
