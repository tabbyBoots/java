package topic08;

import java.util.ArrayList;

public class EX02_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();//ArrayList 中元素可重覆，有順序性
		list.add("Item-1"); // 會依加入的順序顯示
		list.add("Item-2");
		list.add("Item-1"); // 又加入一個 Item-1
		list.add(new Integer(4)); // 加入不同型態的資料
		list.add(0, "Item-0"); // 將元素加在第1 個位置
		list.remove("Item-2"); // 移除 Item-2
		System.out.println("ArrayList 的內容...." + list);
		System.out.println("ArrayList 的第一個元素...." + list.get(0));
	}

}
