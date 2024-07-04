package assignments;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("jay",211);
		map.put("ron",341);
		map.put("abhay",252);
		map.put("vasi",236);
		System.out.println(map);
		
		Set<Map.Entry<String,Integer>> set =map.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry ele = (Map.Entry)i.next();
			System.out.println(ele.getKey());
		}
		
	}

}
