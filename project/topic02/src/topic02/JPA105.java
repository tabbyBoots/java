package topic02;
import java.util.Scanner;

public class JPA105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//JPA105 存錢筒
		//(1) 有一位小朋友從小就開始把 1 元、5 元、10 元、50 元的零用錢，投進自己的存錢筒裡。請計算出存錢筒中金錢的總額。
		//(2) 程式執行時，首先要求輸入姓名，顯示【請輸入您的姓名：】，顯示如執行結果參考畫面 (1)。
		//(3) 姓名輸入完畢，要求輸入銅板個數，顯示如執行結果參考畫面 (2)。
		//(4) 依序要求輸入 1 元、5 元、10 元、50 元硬幣的數量，待輸入完才可再顯示下一列，顯示如執行結果參考畫面 (3)。
		//(5) 金額輸入完畢，輸出總額，顯示如執行結果參考畫面 (4)。
		//---------------------------------------------------------------------------------------------------------
		//(1) 程式執行時，首先要求輸入姓名。
//		    請輸入您的姓名：   ex:林佳儀
		//(2) 姓名輸入完畢，要求輸入銅板個數。
//		    Hi, 林佳儀,請輸入您的銅板的個數：    
		//(3) 依序要求輸入 1 元、5 元、10 元、50 元硬幣的數量，待輸入完才可再顯示下一列
//		    請輸入1元的數量：         ex:80
//		    請輸入5元的數量：         ex:70
//		    請輸入10元的數量：        ex:55
//		    請輸入50元的數量：        ex:38
		//(4) 金額輸入完畢，輸出總額。
//		    您的錢總共有：2 千 8 百 8 十 0 元
		
		int one=0, five=0, ten=0, fifty=0, sum=0; 
		String name="";
		
		Scanner s= new Scanner(System.in);
		
		System.out.print("請輸入您的姓名：");
		name = s.next();
		
		System.out.println("Hi, " + name + ",請輸入您的銅板的個數：");
		
		System.out.print("請輸入1元的數量：");
		one = s.nextInt();
		
		System.out.print("請輸入5元的數量：");
		five = s.nextInt();
		
		System.out.print("請輸入10元的數量：");
		ten = s.nextInt();
		
		System.out.print("請輸入50元的數量：");
		fifty = s.nextInt();
		
		sum = one + five * 5 + ten * 10 + fifty * 50;
		System.out.printf("您的錢總共有：%d 千 %d 百 %d 十 %d 元", sum / 1000, sum / 100 % 10, sum / 10 % 10, sum % 10);
	}

}
