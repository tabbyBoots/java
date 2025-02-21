package topic08;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex01 {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet(); //TreeSet 有順序性，不可重複
		set.add(" 項目一"); // 加入一個 項目一
		set.add(" 項目二");
		set.add(" 項目三");
		set.add(" 項目四");
		set.add(" 項目一"); // 再加入一個 項目一
		System.out.println("TreeSet 的內容是：" + set);
		System.out.println("TreeSet 的第一個元素是：" + set.first());
		System.out.println("TreeSet 的最後一個元素是：" + set.last());
	}

}
