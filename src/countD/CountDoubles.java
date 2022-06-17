package countD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDoubles<E> {

	public void countD(List<E> stringList) {
		Map<E, Integer> doubles = new HashMap<>();
		int count = 0;
		for (E e : stringList) {

			for (E t : stringList) {
				if (e.equals(t) || e == t) {
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
		for (Map.Entry<E, Integer> entry : doubles.entrySet()) {
			E key = entry.getKey();
			Integer val = entry.getValue();

			System.out.println(key + " - " + val + " times");
			;
		}

	}

}
