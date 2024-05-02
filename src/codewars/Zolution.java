package codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Zolution {

	public static void main(String[] args) {

		List<Long> a = Arrays.asList(1L, 2L, 3L, 4L);

		List<Long> b = Arrays.asList(1L, 2L, 3L, 5L);

		Set<Long> inDB = new HashSet<Long>(a);

		Set<Long> incoming = new HashSet<Long>(b);

		Map<Long, Integer> map = new HashMap<Long, Integer>();

		for (Long id : inDB) {
			map.put(id, 1);
		}

		for (Long id : incoming) {
			if (map.containsKey(id)) {
				map.put(id, map.get(id) + 1);
			} else {
				map.put(id, 1);
			}
		}

		List<Long> collect = map.entrySet().stream().filter(aa -> aa.getValue() == 1).map(aa -> aa.getKey())
				.collect(Collectors.toList());

	}
}
