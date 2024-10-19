import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindingOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inp = { 1, 2, 2, 1, 3 };
		// int[] inp = {1,2,3,4};

		Map<Integer, Integer> result = new HashMap<Integer, Integer>();

		for (int i = 0; i < inp.length; i++) {
			if (result.containsKey(inp[i])) {
				Integer CurVal = result.get(inp[i]);
				result.put(inp[i], CurVal + 1);

			} else {
				result.put(inp[i], 1);
			}

		}

		System.out.println(result);
		Collection<Integer> values = result.values();
		// System.out.println(values);
		Set<Integer> set = new HashSet<>(values);
		System.out.println(set);
		if (set.contains(2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		// if(values.size()==set.size())
		// {
		// System.out.println(true);
		// }
		// else
		// {
		// System.out.println(false);
		// }

	}

}
