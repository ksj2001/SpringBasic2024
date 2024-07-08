package testMap;

import java.util.Map;

public class TestMap {
	private Map<String,String> myMap;
	
	public TestMap() {}
	
	public void mapInfo() {
		for(String key: myMap.keySet()) {
			String value= myMap.get(key);
			System.out.println(key+":"+value);
		}
	}

	public Map<String, String> getMyMap() {
		return myMap;
	}
	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}
}
