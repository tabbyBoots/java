package topic08;

import java.util.HashSet;
import java.util.Iterator;

public class Ex04_iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet list = new HashSet();
		list.add(" 項目一");
		list.add(" 項目二");
		list.add(new Integer(8));
		//list.addFirst(" 項目零"); // 加在第1 個
		//list.addLast(" 項目四"); // 加在最後1 個
		System.out.println("ArrayList 的內容是：" + list);
		//list.set(2, " 新增的項目"); // 設定第3 個元素
		//list.removeLast(); // 移除最後一個
		System.out.println("ArrayList 的內容是：" + list);
		
		Iterator it = list.iterator();
		
		while( it.hasNext() ) {
			System.out.println( "SET內容是：" + it.next() );
		}
	}

}
