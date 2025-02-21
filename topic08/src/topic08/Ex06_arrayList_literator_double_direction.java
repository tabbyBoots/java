package topic08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ex06_arrayList_literator_double_direction {

	public static void main(String[] args) {

		//ArrayList list = new ArrayList();
		List list = new ArrayList();
		
		list.add(" 項目一");
		list.add(" 項目二");
		list.add(new Integer(8));
		list.addFirst(" 項目零"); // 加在第1 個
		list.addLast(" 項目四"); // 加在最後1 個
		//System.out.println("ArrayList 的內容是：" + list);

		ListIterator it = list.listIterator();
		while(it.hasNext()) {
			System.out.println("ArrayList 的內容是：" + it.next() );
		}
		
		System.out.println(" show Previous list ");		
		
		while (it.hasPrevious()) {
			System.out.println("ArrayList 的內容是：" + it.previous() );
		}
	}

}
