import java.util.ArrayList;

public class E13_3 {
	
	public static void main(String[] args) {
		//  arrayList
		ArrayList<Number> list = new ArrayList<>();

		//  number list
		list.add(6);
		list.add(8.89);
		list.add(2.83);
		list.add(7.43);
		list.add(3.89);
		list.add(6.246);
		list.add(2.22);
		list.add(1.234);

		System.out.println(list.toString());

		// Sort
		sort(list);

		// Display 
		System.out.println(list.toString());
	}

	public static void sort(ArrayList<Number> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			//mimimum
			Number min = list.get(i);
			int minIndex = i;

			for (int j = i + 1; j < list.size(); j++) {
				if (min.doubleValue() > list.get(j).doubleValue()) {
					min = list.get(j);
					minIndex = j;
				}
			}

			// Swap lists
			if (minIndex != i) {
				list.set(minIndex, list.get(i));
				list.set(i, min);
			} 
		}
	}
}