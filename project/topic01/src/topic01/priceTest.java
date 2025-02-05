package topic01;

public class priceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float miles =0f, total = 0f, milesDiff = 0f, milesDiffBy300 =0f, factorConvert=0f;
		
		//里程數
		miles = 1900f;
		System.out.println("miles: \t\t\t\t"+miles);
		
		//超過1000的里程數
		milesDiff = miles -1000f;
		System.out.println("miles difference: \t\t"+milesDiff);
		
		//加成因數
		milesDiffBy300 = milesDiff/300f;
		System.out.println("milesDiff divided By 300: \t"+ milesDiffBy300);
		
		//轉換後的因數(每達300就進位)*****利用型態轉換後值*****
		factorConvert =  (int)milesDiffBy300<0 ? 1 : (int)milesDiffBy300+1;
		System.out.println("factor After Conversion: \t"+ factorConvert);
		
		//計算總價//*******未滿1000，總價為80元，每超過300，加10元
		total=  ( miles <=1000f )  ? 80 : ( factorConvert ) * 10 + 80;
		System.out.println("total: \t\t\t\t"+total);
		
	}

}
