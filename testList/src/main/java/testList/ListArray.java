package testList;

import java.util.ArrayList;
import java.util.List;

public class  ListArray {
	private ArrayList<String> list;
	
	public ListArray() {}
	
	public void ListArrayInfo() {
		for(int i=0;i<list.size();i++) {
			System.out.println(i+"번째 요소: "+list.get(i));
		}
	}

	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		// 다운캐스팅: 부모 List가 자식 ArrayList를 가져와 사용하는 것
		this.list = (ArrayList<String>) list;
	}
}
