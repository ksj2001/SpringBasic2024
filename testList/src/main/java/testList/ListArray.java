package testList;

import java.util.ArrayList;
import java.util.List;

public class  ListArray {
	private ArrayList<String> list;
	
	public ListArray() {}
	
	public void ListArrayInfo() {
		for(int i=0;i<list.size();i++) {
			System.out.println(i+"��° ���: "+list.get(i));
		}
	}

	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		// �ٿ�ĳ����: �θ� List�� �ڽ� ArrayList�� ������ ����ϴ� ��
		this.list = (ArrayList<String>) list;
	}
}
