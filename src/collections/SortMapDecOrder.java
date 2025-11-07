package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortMapDecOrder {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 3);
		map.put("b", 1);
		map.put("c", 4);
		// convert map entries into list
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		//System.out.println(list);
		list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
		Map<String, Integer> smap = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> entry : list) {
			smap.put(entry.getKey(), entry.getValue());
		}
		System.out.println(smap);

	}

}
