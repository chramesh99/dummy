package collectionsexamples;

import java.util.HashMap;

public class Example {
	
	private HashMap<Integer,String> al;
	
	public Example() {
		al = new HashMap<Integer,String>();
		al.put(1,"batman");
		System.out.println(al + " in Example class and addAl method");
	}

	public HashMap<Integer, String> getAl() {
		return al;
	}

	public void setAl(HashMap<Integer, String> al) {
		this.al = al;
	}
}
