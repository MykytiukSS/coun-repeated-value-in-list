package countD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDoubles {

	public void countDString(List<String> stringList) {
		Map<String, Integer> doubles = new HashMap<>();
		int count = 0;
		for (String e : stringList) {

			for (String t : stringList) {
				if (e.equals(t)) {
					count++;
				}
			}
			if (count > 1) {
				doubles.put(e, count);
				

			}
			count = 0;
		}

		System.out.println("Repeated next values:");
		System.out.println();
		for (Map.Entry<String, Integer> entry : doubles.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();

			System.out.println(key + " - " + val + " times");
			;
		}

	}
	public void countDInteger(List<Integer> intList) {
		Map<Integer, Integer> doubles = new HashMap<>();
		int count = 0;
		for (Integer e : intList) {

			for (Integer t : intList) {
				if (e == t) {
					count++;
				}
			}
			if (count > 1) {
				doubles.put(e, count);
				

			}
			count = 0;
		}

		System.out.println("Repeated next values:");
		System.out.println();
		for (Map.Entry<Integer, Integer> entry : doubles.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();

			System.out.println(key + " - " + val + " times");
			;
		}

	}

}
