package Unit_8;

import java.util.ArrayList;

public class ShuffleArrayList {

	static ArrayList<Integer> shuffleList = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		shuffleList.add(1);
		shuffleList.add(2);
		shuffleList.add(3);
		shuffleList.add(4);
		shuffleList.add(5);
		
		shuffle(shuffleList);

		for (int i = 0; i < shuffleList.size(); i++) 
			
			System.out.print(shuffleList.get(i) + " ");
	}

	public static <E> void shuffle( ArrayList<E> shuffleList) {
		
		for (int i = 0; i < shuffleList.size() - 1; i++) {
			
			int numbers = (int)(Math.random() * shuffleList.size());
			
			E shuffler = shuffleList.get(i);
			shuffleList.set(i, shuffleList.get(numbers));
			shuffleList.set(numbers, shuffler);
		}
	}
}
