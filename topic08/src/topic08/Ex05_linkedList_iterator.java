package topic08;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex05_linkedList_iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.add(" 項目一");
		list.add(" 項目二");
		list.add(new Integer(8));
		list.addFirst(" 項目零"); // 加在第1 個
		list.addLast(" 項目四"); // 加在最後1 個
		//System.out.println("ArrayList 的內容是：" + list);
		
		Iterator it = list.iterator();
		while( it.hasNext() ) {
			System.out.println("ArrayList 的內容是：" + it.next() );
		}	
		
	}

}
