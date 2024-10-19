import java.util.ArrayList;
import java.util.List;

public class DupsOwnTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inp = { 1, 1, 2, 2, 3, 6, 6 };

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < inp.length; i++) {
			for (int j = i + 1; j < inp.length; j++) {
				if (inp[i] == inp[j]) {
					if (!list.contains(inp[i])) {
						list.add(inp[i]);
					}
				}
			}
		}
		System.out.println(list);

	}
}