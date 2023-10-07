package six;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		while (true) {
			System.out.println("\n1. Add colours\n2. Copy color to array\n3. Reverse List\n4. Get Sublist\n5. Sort\n6. Clone\n7. exit");
			System.out.println("Enter your choice: ");
			int ch = scan.nextInt();
			if(ch == 7) {
				System.out.println("Exited ");
				break;
			}
			switch(ch) {
				case 1:
					list.add("Black");
					list.add("White");
					list.add("Blue");
					list.add("Green");
					list.add("Yellow");
					System.out.println("Inserted List");
					for(String color : list) {
						System.out.print(color+ "  ");
					}
					break;
				case 2:
					String[] st = new String[list.size()];
					list.toArray(st);
					System.out.println("Copied Array");
					for(String color : st) {
						System.out.print(color+ "  ");
					}
					break;
				case 3:
					Collections.reverse(list);
					System.out.println("Reversed List");
					for(String color : list) {
						System.out.print(color+ "  ");
					}
					break;
				case 4:
					ArrayList<String> list4 = new ArrayList<>(list.subList(2, 4));
					System.out.println("Sublist List");
					for(String color : list4) {
						System.out.print(color+ "  ");
					}
					break;
				case 5:
					Collections.sort(list);
					System.out.println("Sorted List");
					for(String color : list) {
						System.out.print(color+ "  ");
					}
					break;
				case 6:
					ArrayList<String> list6 = (ArrayList<String>)list.clone();
					System.out.println("Cloned List");
					for(String color : list6) {
						System.out.print(color+ "  ");
					}
					break;
			}
			
		}
	}

}
