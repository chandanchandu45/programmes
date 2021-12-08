package map;
import java.util.HashMap;
public class hashmap {
public static void main(String[] args) {
	HashMap map=new HashMap();
	map.put(1,"hi");
	map.put(2, 101);
	map.put(3, "hi");
	map.put(4, null);
	System.out.println(map);
	Object ob=map.get(2);
	System.out.println(ob);
	Object ob1=map.remove(1);
	System.out.println(ob1);
	System.out.println(map);
	boolean b=map.containsKey(1);
	boolean b1=map.containsValue(1);
	System.out.println(b);
	System.out.println(b1);
	System.out.println(map.size());
	map.clear();
	System.out.println(map.isEmpty());
	System.out.println(map);
}
}
