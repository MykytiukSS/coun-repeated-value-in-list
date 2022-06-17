package countD;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

public class CountDoubles<E> {

	public void countD(ArrayList<E> list) {
		Map<E, Integer> doubles = new HashMap<>();
		int count = 1;
		for (E e : list) {

			for (E t : list) {
				if (e == t || e.equals(t)) {
					count++;
				}
			}
			if (count != 1) {
				doubles.put(e, count);
				count = 1;

			}
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
